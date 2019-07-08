

//-------------------------------------
// imperative style

// declarative style  with function

        //=> compact & concise code

//-------------------------------------

let nums = [1, 3, 5, 7, 9, 2, 4, 6, 8, 10]

//  // imperative style  ==> what + How

let evenNums = [];
for (let i = 0; i < nums.length; i++) {
    let n = nums[i];
    if (n % 2 === 0) evenNums.push(n)
}
console.log(evenNums);

//-------------------------------------

//  // declerative style / Functional programmin  ==> what  

evenNums = nums.filter(n => n % 2 === 0)

//-------------------------------------