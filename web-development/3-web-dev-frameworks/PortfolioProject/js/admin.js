
//check login
//document.getElementById("sendlogin").onclick = validate;

//checks if empty then prompts
function validate() {
    //Create a flag variable
    let isValid = true;


    // clear all error messages
    let errors = document.getElementsByClassName("err");
    for (let i = 0; i < errors.length; i++) {
        errors[i].style.display = "none";
    }

    let user = document.getElementById("username");
    let pass = document.getElementById("password");


    if (user.value == "" || pass.value == "") {
        let errLogin = document.getElementById("err-login");
        errLogin.style.display = "inline";
        isValid = false;

    }

    if (isValid) {
        let signinbox = document.getElementById('signinbox');
        let guestbook = document.getElementById('GuestBook')
        let guestcontainer = document.getElementById("guestcontainer");
        signinbox.style.display = 'none';
        guestcontainer.style.display = 'inline';
        guestbook.style.display = 'inline';

    }

    return isValid;
}

// enables jquery datatables from  doesnt work
/*$(document).ready(function() {
    $('#GuestBook').DataTable( {
        "processing": true,
        "serverSide": true,
        "ajax": "/305/PortfolioProject/server-scripts/callscript.php"
    } );
} );*/

// enables jquery datatables from class and orders date in desc order
$('#GuestBook').DataTable(
    {
        'order': [[9, "desc"]]
    }
);
