/*
    Example of a multi-line comment just like in C#/Java
*/

// Single line comment

/**
 * Functions start with the word function.
 * They don't have a return type and the naming convention is camel-case.
 */
function variables() {
  // Declares a variable where the value cannot be changed
  const daysPerWeek = 7;
  console.log(daysPerWeek);
  console.log('There are ' + daysPerWeek + ' days in ' +
    'the week');
  // daysPerWeek = 9;
  console.log(daysPerWeek);
  // Declares a variable those value can be changed
  let daysPerMonth = 31;
  // ` is called a template literal and makes it so we don't
  // have to use the concatentation + 
  console.log(`There are ${daysPerMonth} days in January`);
  // Declares a variable that will always be an array
  const weekdays = [
    'Monday',
    'Tuesday',
    'Wednesday',
    'Thursday',
    'Friday',
    'Saturday',
    'Sunday'
  ];
  //  arrays are declared using [] -- objects can be declared using {}
  console.log(weekdays);
  console.table(weekdays);
  // return 'Done!';
  let answer = 6;
  answer += (++answer);
  // answer++;
  console.log(answer);
  console.log(answer.toString(2));
  console.log(answer.toString(16));
  console.log(Number.parseInt('14ad'));

  let myArray = [];
  console.log(myArray.length);
  myArray.push(12);
  myArray.push(4);  // adds to end of the array
  myArray.unshift(56); // add to fronf of array
  console.log(myArray);
  console.log(myArray.pop());  // remove the last element of the array
  console.log(myArray.shift()); // remove the first element of array
  console.log(myArray);

}

/**
 * Functions can also accept parameters.
 * Notice the parameters do not have types.
 * @param {Number} param1 The first number to display
 * @param {Number} param2 The second number to display
 */
function printParameters(param1, param2) {
  console.log(`The value of param1 is ${param1}!`);
  console.log(`The value of param2 is ${param2}`);
}

/**
 * Compares two values x and y.
 * == is loose equality
 * === is strict equality
 * @param {Object} x
 * @param {Object} y
 */
function equality(x, y) {
  console.log(`x is ${typeof x}`);
  console.log(`y is ${typeof y}`);

  console.log(`x == y : ${x == y}`); // true
  console.log(`x === y : ${x === y}`); // false
}

/**
 * Each value is inherently truthy or falsy.
 * false, 0, '', null, undefined, and NaN are always falsy
 * everything else is always truthy
 * @param {Object} x The object to check for truthy or falsy,
 */
function falsy(x) {
  if (x) {
    console.log(`${x} is truthy`);
  } else {
    console.log(`${x} is falsy`);
  }
}

/**
 *  Objects are simple key-value pairs
    - values can be primitive data types
    - values can be arrays
    - or they can be functions
*/
function objects() {
  const person = {
    firstName: "Bill",
    lastName: "Lumbergh",
    age: 42,
    employees: [
      "Peter Gibbons",
      "Milton Waddams",
      "Samir Nagheenanajar",
      "Michael Bolton"
    ]
  };

  // Log the object
  console.log(person);
  // Log the first and last name
  console.log(person.firstName + ' ' + person.lastName);

  console.log(`${person.firstName} ${person.lastName}`);
  // Log each employee
  // the array is person.employees -- length gives length of array
  for (let i = 0; i < person.employees.length; i++) {
    console.log(person.employees[i]);
  }
}

/*
########################
Function Overloading
########################

Function Overloading is not available in Javascript. If you declare a
function with the same name, more than one time in a script file, the
earlier ones are overwritten and the most recent one will be used.
*/

function add(num1, num2) { // this function is ignored because it is first
  return num1 + num2;
}

function add(num1, num2, num3) {
  return num1 + num2 + num3;
}

/*
########################
Math Library
########################

A built-in `Math` object has properties and methods for mathematical constants and functions.
*/

function mathFunctions() {
  console.log("Math.PI : " + Math.PI);
  console.log("Math.LOG10E : " + Math.LOG10E);
  console.log("Math.abs(-10) : " + Math.abs(-10));
  console.log("Math.floor(1.99) : " + Math.floor(1.99));
  console.log("Math.ceil(1.01) : " + Math.ceil(1.01));
  console.log("Math.random() : " + Math.random());
}

/*
########################
String Methods
########################

The string data type has a lot of properties and methods similar to strings in Java/C#
*/

function stringFunctions(value) {
  console.log(`.length -  ${value.length}`);
  console.log(`.endsWith('World') - ${value.endsWith("World")}`);
  console.log(`.startsWith('Hello') - ${value.startsWith("Hello")}`);
  console.log(`.indexOf('Hello') - ${value.indexOf("Hello")}`);

  /*
    Other Methods
        - split(string)
        - substr(number, number)
        - substring(number, number)
        - toLowerCase()
        - trim()
        - https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String
    */
}
