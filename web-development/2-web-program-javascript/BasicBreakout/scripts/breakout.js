
//variables
let canvas = document.getElementById('theCanvas');
let pen = canvas.getContext('2d');

//set max width
let maxCanvasWidth = 1200;

canvas.width = (window.innerWidth <= maxCanvasWidth) ? window.innerWidth : maxCanvasWidth;
canvas.height = "600";

//drawing rectangles
pen.beginPath();
pen.rect(20, 40, 50, 50);
pen.fillStyle = "#FF0000";
pen.fill();
pen.closePath();

//drawing circles
pen.beginPath();
pen.arc(240, 160, 20, 0, Math.PI*2, false);
pen.fillStyle = "green";
pen.fill();
pen.closePath();

pen.beginPath();
pen.rect(160, 10, 100, 40);
pen.strokeStyle = "rgba(0, 0, 255, 0.5)";
pen.stroke();
pen.beginPath();
pen.rect(160, 10, 100, 40);
pen.strokeStyle = "rgba(0, 0, 255, 0.5)";
pen.stroke();

//ball
let x = canvas.width/2;
let y = canvas.height - 30;
let dx = 2;
let dy = -2;
let ballRadius = 10;

//paddle
let paddleHeight = 10;
let paddleWidth = 75;
let paddleX = (canvas.width- paddleWidth)/2;

//controls
let rightPressed = false;
let leftPressed = false;

//listeners
document.addEventListener("keydown", keyDownHandler, false);
document.addEventListener("keyup", keyUpHandler, false);

function keyDownHandler(e) {
    if(e.key == "Right" || e.key == "ArrowRight") {
        rightPressed = true;
    }
    else if(e.key == "Left" || e.key == "ArrowLeft") {
        leftPressed = true;
    }
}

function keyUpHandler(e) {
    if(e.key == "Right" || e.key == "ArrowRight") {
        rightPressed = false;
    }
    else if(e.key == "Left" || e.key == "ArrowLeft") {
        leftPressed = false;
    }
}



function drawPaddle() {
    pen.beginPath();
    pen.rect(paddleX, canvas.height-paddleHeight, paddleWidth, paddleHeight);
    pen.fillStyle = "#0095DD";
    pen.fill();
    pen.closePath();
}

function drawBall()
{
    pen.beginPath();
    pen.arc(x, y, ballRadius, 0, Math.PI*2);
    pen.fillStyle = "#0095DD";
    pen.fill();
    pen.closePath();
}

function draw()
{
    //drawing code
    pen.clearRect(0, 0, canvas.width, canvas.height);
    drawBall();
    drawPaddle();

    if(x + dx > canvas.width-ballRadius || x + dx < ballRadius) {
        dx = -dx;
    }
    if(y + dy < ballRadius) {
        dy = -dy;
    } else if(y + dy > canvas.height-ballRadius) {
        if(x > paddleX && x < paddleX + paddleWidth) {
            dy = -dy;
        }
        else {
            alert("GAME OVER");
            document.location.reload();
            clearInterval(interval);
        }
    }
    


    if(rightPressed) {
        paddleX += 7;
        if (paddleX + paddleWidth > canvas.width){
            paddleX = canvas.width - paddleWidth;
        }
    }
    else if(leftPressed) {
        paddleX -= 7;
        if (paddleX < 0){
            paddleX = 0;
        }
    }

    x += dx;
    y += dy;
}
let interval = setInterval(draw, 10);