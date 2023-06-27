/**
 * @param {Function} fn
 */

// ---------> Approach <----------
// Create a cache object(dictionary).
// Generate a Key from the given input.
// Check the Key in cache object.
// If Key is present.
//      Return the respective value from the cache object.
// Else
//      Call the function, store the value in cache object, then return the calculated value.
function memoize(fn) {
    var cache = {};

    return function(...args) {
        let key = String(args);

        if(key in cache) return cache[key];
        return cache[key] = fn(...args);
    }
}


/** 
 * let callCount = 0;
 * const memoizedFn = memoize(function (a, b) {
 *	 callCount += 1;
 *   return a + b;
 * })
 * memoizedFn(2, 3) // 5
 * memoizedFn(2, 3) // 5
 * console.log(callCount) // 1 
 */