/*
    This script will popup an alert dialog box
*/

//ask the user for their name and store in a string

const name = prompt("Enter your name");
alert("Welcome " + name + "!");


let age = parseInt(prompt("Enter your age: "));
alert(name + ", you are " + age + " years old.");
console.log(typeof age); // age string

// add 20 years to age
age = age + 20;

//multipy age by 0.5
//age = age * 0.5;
//print alert "Wow <name> you look <0.5 * age> years old"
alert("Wow " + name + " you look " + age + " years old");
console.log(typeof age);

//PEMDAS
answer = 18 % 4;
console.log(answer);


//Enter a number with the prompt and store in number
//variable
let number = prompt("Enter a number");
//if number is even
if (number % 2 == 0)
{

};
