/*    
    Jean-Kenneth Antonio
    February 21, 2020

    A game of frogger

    - Added 2 cars at different speeds in opposite directions
    - Added a Try Again? button after getting ran over or reaching the house
    - Added a winning condition with an option to try again
    - Added counters for wins, losses, and a ratio of the two
    - Added an option to change the speed of the cars to either direction

    Version 2.0 update
    March 16, 2020
    
    Summary: Mostly tweaking cosmetic additions and underlying machinations.

    - Moved functions into a seperate js file
    - Used constructors for frogs and cars and made dedicated js file
    - Make frog turn in direction moved
    - Used image constructors rather than place in html
    - Animated the cars (switches between 2 very similar images)
    - Centered Canvas with help of bootstrap 4
    - Timer and best time in seconds
    - Added tree constructors into classes js file
    - Added and animated trees

*/

//variables
const h3Tag = document.querySelector('h3');
const currentTime = document.getElementById("currentTime");
const bestTime = document.getElementById("bestTime");
const winCount = document.getElementById('winCount');
const lossCount = document.getElementById('lossCount');
const winRatio = document.getElementById('winRatio');
const btnTry = document.getElementById('btn2');
const btnStart = document.getElementById('btn3');
const btnChange = document.getElementById('btn');
const userSpeed1 = document.getElementById('carSpeed1');
const userSpeed2 = document.getElementById('carSpeed2');
let scale = 1.5;
let frogJump = 10;

//counter variables
let time = 0;
let topTime = "";
let wins = 0;
let losses = 0;
let won = false;


//canvas variables
const canvas = document.querySelector("canvas");
const pen = canvas.getContext("2d");

//frog and car variables
const frogs = [];
const cars = [];

for (let i = 0; i < 4; i++) 
{
    frogs[i] = 'images/frogsmall' + (i + 1) + '.png';
    cars[i] = 'images/greencar' + (i + 1) + '.png';
}

//create image objects in html

let frogImg = new Image(canvas.width/20,canvas.width/20);
frogImg.src = frogs[0];

let car1Img = new Image(115/scale,70/scale);
let car1Img1 = new Image(115/scale,70/scale); 
car1Img.src = cars[2];
car1Img1.src = cars[3];

let car2Img = new Image(115/scale,70/scale);
let car2Img1 = new Image(115/scale,70/scale);
car2Img.src = cars[0];
car2Img1.src = cars[1];

let treeImg = new Image(32,32);
treeImg.src = 'images/tree.png';

let treeImg1 = new Image(32,32);
treeImg1.src = 'images/tree1.png';

//New Objects
tree1 = new Tree(treeImg, canvas.width/5, canvas.height/1.3);
tree2 = new Tree(treeImg1, canvas.width/1.4, canvas.height/1.8);
tree3 = new Tree(treeImg, canvas.width/5, canvas.height/12);

frog = new Frog(frogImg, canvas.width/2, canvas.height/1.1);
car1 = new Car(car1Img,0,canvas.height / 3, 2);
car2 = new Car(car2Img,canvas.width,canvas.height / 1.8, -1);

//house variables
let houseImg = document.getElementById("house1");

let houseX = canvas.width/2.5;
let houseY = canvas.width/30;


//event listeners
btnTry.addEventListener('click', resetGame); // restarts the game after pressing button Again?
btnStart.addEventListener('click', resetGame); //starts the game after pressing button Start?
btnChange.addEventListener('click', changeSpeed);



// //call the initial functions
updateCount(); // initial counter update
draw(); //initial draw
