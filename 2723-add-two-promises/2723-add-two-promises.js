/**
 * @param {Promise} promise1
 * @param {Promise} promise2
 * @return {Promise}
 */
// ---------> Explanation <-----------
// Inside the function, Promise.all([promise1, promise2]) is used to wait for both promises to resolve.
// "Promise.all" returns a new promise that resolves to an array of the resolved values of the input promises.
// The "await" keyword is used to wait for this array to be resolved.
// The reduce method is used to iterate over the array and accumulate the values.
// In this case, it sums up all the values in the array.
// The result of the reduce operation is then wrapped in a promise using Promise.resolve and returned from the   addTwoPromises function.



var addTwoPromises = async function(promise1, promise2) {
    return Promise.resolve((await Promise.all([promise1, promise2])).reduce((acc, val) => acc + val))
};

/**
 * addTwoPromises(Promise.resolve(2), Promise.resolve(2))
 *   .then(console.log); // 4
 */