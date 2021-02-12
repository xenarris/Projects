
function validate(e)
{
    let name = document.getElementById('bearname');

    //validate
    let validName = validateInputField('bearname', 'error-name');
    let validColor = validateSelectList('color', 'error-color');
    let validSize = validateRadioButtons('size', 'error-size');
    //let validAddons = validateCheckBox('addons', 'error-addons');


    let validInput = validName && validColor && validSize;

    //stop form submission
    if(validInput === false)
    {
        e.preventDefault();
    }


}


function validateInputField(id, errorId)
{
    //get the value in the field and error field span
    let txtField = document.getElementById(id).value;
    let errField = document.getElementById(errorId);

    //validate text field
    if(txtField === "")
    {
        errField.className = 'error';
        return false;
    }

    errField.className = 'hidden';
    return true;
}

function validateCheckBox(id, errorId)
{
    let checkBox = document.getElementById(id).checked;
    let errField = document.getElementById(errorId);

    if(checkBox === false)
    {
        errField.className = 'error';
        return false;
    }

    errField.className = 'hidden';
    return true;
}

function validateSelectList(id, errorId)
{
    let index = document.getElementById(id).selectedIndex;
    let errField = document.getElementById(errorId);
    
    if (index === 0)
    {
        errField.className = 'error';
        return false;
    }

    errField.className = 'hidden';
    return true;
}

function validateRadioButtons(name, errorId)
{
    //get all the radio buttons and the error field
    let buttons = document.getElementsByName(name);
    let errField = document.getElementById(errorId);
    //loop through the array
    let count = 0;
    for(let i = 0; i < buttons.length; i++)
    {
        if(buttons[i].checked === true)
        {
            errField.className = 'hidden';
            count++;
        }
    }

    //if count is zero, no buttons were checked
    if(count === 0)
    {
        errField.className = 'error';
        return false;
    }
    return true;
}