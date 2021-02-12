
//functions

function draw()
{
    drawBg();
    drawCar();
    drawFrog();
    drawTrees();
}

//draw trees
function drawTrees()
{
    //draw tree
    pen.drawImage(tree1.img,tree1.treeX,tree1.treeY, 100, 100);
    pen.drawImage(tree2.img,tree2.treeX,tree2.treeY, 100, 100);
    pen.drawImage(tree3.img,tree3.treeX,tree3.treeY, 100, 100);
}

//draw the frog
function drawFrog()
{
    pen.drawImage(frog.img,frog.frogX,frog.frogY,canvas.width/20,canvas.height/20);
}

//draw the car
function drawCar()
{
    pen.drawImage(car1.img,car1.carX,car1.carY,115/scale,70/scale);
    pen.drawImage(car2.img,car2.carX,car2.carY,115/scale,70/scale);
    
}

//draw the house
function drawHouse()
{
    pen.drawImage(houseImg,houseX,houseY,100,100);
}

//draw background
function drawBg()
{
    //background color
    pen.beginPath();
    pen.fillStyle = "lightgreen";
    pen.fillRect(0,0,canvas.width,canvas.height);
    pen.stroke();

    drawHouse();

    //road asphalt
    pen.beginPath();
    pen.fillStyle = "#000000";
    pen.fillRect(0,canvas.height/3,canvas.width,canvas.height/3);
    pen.stroke();

    //road lane
    for(i = 0; i < 1000; i += 100)
    {
        pen.beginPath();
        pen.fillStyle = "#FFFFFF";
        pen.fillRect(0 + i,canvas.height/2.07,canvas.width/10,canvas.height/40);
        pen.stroke();
    }
}

//move the frog
function moveFrog(e)
{
    pen.clearRect(0,0,canvas.width,canvas.height);
    //console.log(e); // take a look at all the KeyEvent info
    if (e.code == "KeyW")
    {
        frog.frogY -= frogJump;
        frogImg.src = frogs[0];
    }
    else if (e.code == "KeyS")
    {
        frog.frogY += frogJump;
        frogImg.src = frogs[1];
    }
    else if (e.code == "KeyA")
    {
        frog.frogX -= frogJump;
        frogImg.src = frogs[2];
    }
    else if (e.code == "KeyD")
    {
        frog.frogX += frogJump;
        frogImg.src = frogs[3];
    }
    draw();
}

//change speed of the car
function changeSpeed()
{
    car1.carSpeed = userSpeed1.value / 60;
    car2.carSpeed = -userSpeed2.value / 60;
}

//move the car
function moveCar()
{
    //change car variable
    car1.carX += car1.carSpeed;
    car2.carX += car2.carSpeed;

    if(car1.carX > canvas.width)
    {
        car1.carX = -50;
    }
    else if (car1.carX < 0 - car1.img.width - 20)
    {
        car1.carX = canvas.width; // if the user decides to move the car the other direction
    }

    if(car2.carX < -100)
    {
        car2.carX = canvas.width;
    }
    else if (car2.carX > canvas.width)
    {
        car2.carX = 0;  // if the user decides to move the car the other direction
    }
    draw();
}

//animate cars
function psudoanimate() 
{
    //first car
    if (car1.img == car1Img)
    {
        car1.img = car1Img1;
    }
    else if (car1.img == car1Img1)
    {
        car1.img = car1Img;
    }
    //second car
    if (car2.img == car2Img)
    {
        car2.img = car2Img1;
    }
    else if (car2.img == car2Img1)
    {
        car2.img = car2Img;
    }

}

//animate tree
function psudoanimateTree()
{
        //first tree
        if (tree1.img == treeImg)
        {
            tree1.img = treeImg1;
        }
        else if (tree1.img == treeImg1)
        {
            tree1.img = treeImg;
        }
        //second tree
        if (tree2.img == treeImg)
        {
            tree2.img = treeImg1;
        }
        else if (tree2.img == treeImg1)
        {
            tree2.img = treeImg;
        }
        //third tree
        if (tree3.img == treeImg)
        {
            tree3.img = treeImg1;
        }
        else if (tree3.img == treeImg1)
        {
            tree3.img = treeImg;
        }
}

function checkForCollision()
{
    if((car1.carX <= frog.frogX + frog.img.width &&
        frog.frogX <= car1.carX + car1.img.width &&
        car1.carY <= frog.frogY + frog.img.height &&
        frog.frogY <= car1.carY + car1.img.height) ||
        (car2.carX <= frog.frogX + frog.img.width &&
        frog.frogX <= car2.carX + car2.img.width && 
        car2.carY <= frog.frogY + frog.img.height &&
        frog.frogY <= car2.carY + car2.img.height))
        {
            //when losing the game
            losses++; // add to loss counter
            h3Tag.style.color = "red";
            h3Tag.textContent = "The frog got Ran Over";
            console.log("run over");
            btnTry.className = ""; //  reveals try again button
            looseends();
        }
    else if (houseX <= frog.frogX + frog.img.width - 25 &&
        frog.frogX <= houseX + houseImg.width  - 20 &&
        houseY <= frog.frogY + frog.img.height &&
        frog.frogY <= houseY + houseImg.height )
    {
        //when winning the game by touching house
        wins++; // add to win counter
        won = true; // win flag for looseends
        h3Tag.style.color = "green";
        h3Tag.textContent = "The frog is safely across!";
        btnTry.className = ""; // reveals try again button
        looseends();
    }
}

//endgame cleanup and pause game
function looseends()
{
    updateCount(); // update the counters
    clearInterval(timer);
    clearInterval(timer2);
    clearInterval(timer3);
    clearInterval(timer4);
    //if user won and has best time - update best time
    if((topTime > time || topTime == '') && won == true)
    {
        topTime = time;
    }
    document.removeEventListener("keydown",moveFrog);
    updateCount();
}

//updates counters
function updateCount()
{
    currentTime.textContent = "Current Time: " + time;
    bestTime.textContent = "Best Time: " + topTime;
    winCount.textContent = "# of Safe Crossings: " + wins;
    lossCount.textContent = "# of Disasterous Crossings: " + losses;
    winRatio.textContent = "Safe/Runover Ratio: " + wins + "/" + losses;
}

//ticking time
function timeTick() 
{
    time++;
    updateCount();
}

//resets the game
function resetGame()
{
    btnTry.className = "noshow"; // hides button again
    // permentanly hide start button and label
    btnStart.className = "noshow"; 
    document.getElementById("btn3label").className = "noshow"; 
    
    //reset locations of frog and cars
    frog.frogX = canvas.width/2;
    frog.frogY = canvas.width/1.1;

    car1.carX = 0;
    car1.carY = canvas.height / 3;

    car2.carX = canvas.width;
    car2.carY = canvas.height / 1.8;

    document.addEventListener('keydown', moveFrog); // readds the movefrog listener
    timer = setInterval(function(){moveCar(); checkForCollision();}, 10); // sets the intervals again for the cars
    timer2 = setInterval(psudoanimate, 750); // sets the animation intervals again
    timer4 = setInterval(psudoanimateTree, 1750); // sets the animation intervals again
    h3Tag.style.color = "transparent"; // hides the game result
    timer3 = setInterval(timeTick,1000); // starts time ticker
    time = 0; //start timer over
    won = false; //reset win flag
    draw();
}
