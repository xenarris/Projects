/*
    Name: Jean-Kenneth Antonio
    Date: January 8, 2020
    Filename: useless-trivia.js
    Purpose: This script uses prompt dialog boxes to get 
    the user's name, age, and weight and displays pithy
    responses in alert dialog boxes
 */

// Prompts for name and stores in name variable
let name = prompt("Hi. What's your name, cowboy?", "Susan");

// Prompts for age and put in age variable
let age = prompt("How old are you?", 24);

// Prompts for weight and stores in weight variable
let weight = prompt("How many pounds do you weigh?", 147.5);

// ee cummings lowercase and uppercase
alert("If poet ee cummings were to email toy, he'd address you as " + 
    name.toLowerCase() + ". But if ee were mad, he'd call you " + 
    name.toUpperCase());

// calculate and print out user's age in seconds
ageInSeconds = age * 365 * 24 * 60 * 60;
alert("You're over " + ageInSeconds + " seconds old.");

//calculate user's weight on the moon and on the sun
moonWeight = (weight/6);
sunWeight = (weight * 27.1);

alert("Did you know that on the mood you would weigh only " + moonWeight + " pounds?");
alert("On the sun, you'd weigh " + sunWeight + " pounds. But not for long!");