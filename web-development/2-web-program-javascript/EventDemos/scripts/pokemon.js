
const imgTag = document.getElementById("pokemon");

// add mouseout event to the image
imgTag.addEventListener('mouseout', removeBorder);

// add mouseover event to the image
imgTag.addEventListener('mouseover', addBorder);

//add mouse click event to the image
//call change image function
imgTag.addEventListener('click', function(e){changeImage(e,"pichu");});
imgTag.addEventListener('dblclick', function(e){changeImage(e,"pikachu");});



function removeBorder()
{
    this.className = 'noborder';
}

function addBorder()
{
    this.className = 'border';
}

function changeImage(e, text)
{
    console.log(this);
    console.log(e);
    console.log(typeof this);
    imgTag.src = "images/" + text + ".jpg";
    imgTag.alt = text;
}
