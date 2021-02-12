/*
    A small animal game fit for children and others

    Jean-Kenneth Antonio
    February 17, 2020
    IT 207
*/

//variables
let randomNum;
let hits = 0;
let misses = 0;
let missed = false;
const imgTag = document.getElementsByTagName("img");

for (let img of imgTag) 
{
    img.addEventListener('mouseout', function(e) { removeBorder(e);} );    
    img.addEventListener('mouseover', function(e) { addBorder(e);} );    
    img.addEventListener('click', function(e) { checkAnswer(e.target.alt);} );    
}

const animalArray = ["dog", "elephant", "fish", "frog", "lion", "rabbit", "tiger"];
const trueArray = ["You got it!", "Yes!", "Correct!", "Good!", "Precisely!", "Perfect!"];
const falseArray = ["Nope, try again.", "No, try again.", "Incorrect, try again", "You are mistaken, try again."];

//start the game process
setUp();

//reset counter button event
document.getElementById("reset").onclick = resetCounter;

//functions
function removeBorder(e)
{
    e.target.className = 'noborder';
}

function addBorder(e)
{
    e.target.className = 'border';
}

//sets up game by choosing a random animal and displying it
function setUp()
{
    randomNum = Math.floor(Math.random() * animalArray.length);
    document.getElementById("pick").textContent = animalArray[randomNum].toUpperCase();
    document.getElementById("pick").className = 'greenfont';
}

//check answer if correct
function checkAnswer(animal)
{
    let isCorrect = false;
    console.log(animal);
    for(i = 0; i < animalArray.length - 1; i++)
    {
        if(animal == animalArray[randomNum])
        {
            isCorrect = true;
        }
        else
        {
            isCorrect = false;
        }
    }

    getResult(isCorrect);
}

//gives the appropiate response
function getResult(isCorrect)
{
    if(isCorrect == true)
    {
        document.getElementById("result").textContent = trueArray[Math.floor(Math.random() * (trueArray.length - 1))];
        document.getElementById("result").className = 'greenfont';

        //adds to hits counter only on first try
        if (missed == false)
        {
            hits++;
        }
        
        missed = false;
        hitMissUpdate()
        
        //changes the animal to click on for next round
        setUp();
    }
    else if (isCorrect == false)
    {
        document.getElementById("result").textContent = falseArray[Math.floor(Math.random() * (falseArray.length - 1))];
        document.getElementById("result").className = 'redfont';
        misses++;
        missed = true;
        hitMissUpdate()
    }
}

//updates the hit and miss counter
function hitMissUpdate()
{
    document.getElementById("hits").textContent = "Number of first hits: " + hits;
    document.getElementById("misses").textContent = "Number of misses: " + misses;
}

//resets counter
function resetCounter()
{
    misses = 0;
    hits = 0;
    hitMissUpdate();
}