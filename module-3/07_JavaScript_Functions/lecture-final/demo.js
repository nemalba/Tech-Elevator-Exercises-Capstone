// var let and const -- also global variables

function varVSLet() {
    x = 4;
    console.log(x);

    var x;
    // hoisting says we can declare a variable after we have used it

    // y = 7;
    // console.log(y); -- commented out so we don't get error

    let y;
    // let causes the variable to act like a normal (java) variable

    var firstName = "Minnie";
    console.log(firstName + " " + lastName);
    var lastName = "Mouse";

    // Good JS programming say to use let to declare variables!
}

function constDemo(variable) {
    const CONSTANT = 6;

    console.log(CONSTANT + variable);
}
// default and optional parameters - 
// default values must be the last params declared in the function 
function addNumbers(number1, number2 = 5, number3 = 16) {
    return number1 + number2 + number3;
}

function longestString() {
    // if we don't know how many params are being passed in
    // we can use arguments as the parameter
    let longest = '';
    for (let i = 0; i < arguments.length; i++) {
        // compare variable longest.length to arguments[i].length
        if (longest.length < arguments[i].length) {
            longest = arguments[i];
        }
    }
    return longest;
}

function sumAll() {
    let sum = 0;
    for (let i = 0; i < arguments.length; i++) {
        sum += arguments[i];
    }
    return sum;
}