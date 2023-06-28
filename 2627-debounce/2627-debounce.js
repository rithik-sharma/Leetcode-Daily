/**
 * @param {Function} fn
 * @param {number} t milliseconds
 * @return {Function}
 */
var debounce = function(fn, t) {
    let timeoutId; // To keep track of the timeout ID

    return function(...args) {
        clearTimeout(timeoutId); // Clear any pending timeouts

        timeoutId = setTimeout(() => {
            fn.apply(this, args); // Execute the function after the specified delay
        }, t);
    };
};


/**
 * const log = debounce(console.log, 100);
 * log('Hello'); // cancelled
 * log('Hello'); // cancelled
 * log('Hello'); // Logged at t=100ms
 */