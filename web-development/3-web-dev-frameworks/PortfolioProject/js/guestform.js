
//additional fields
let other = document.getElementById("otherContainer");
let format = document.getElementById("emailFormat");

//updatable fields / Linked to updateFields()
let method = document.getElementById("method").value;
let checked = document.getElementById("addme").checked;


//fill how we met? dropdown
document.getElementById("method").onload = populateMethod();

//hide optional fields
//document.getElementById("main").onload = hideOptions();
document.getElementById("main").onload = display();


//show optional fields
document.getElementById("mailList").onchange = display;
document.getElementById("method").onchange = display;

//testing
//document.getElementById("method").onclick = function() {console.log(method)};


// Error Checking
document.getElementById("guestform").onsubmit = validate;

//fill in how we met drop menu
function populateMethod() {
    let method1 = [
        {
            "ID": "Meetup",
            "Category": "Meetup"
        },
        {
            "ID": "Job Fair",
            "Category": "Job Fair"
        },
        {
            "ID": "We have not met yet",
            "Category": "We have not met yet"
        },
        {
            "ID": "Other",
            "Category": "Other"
        },
    ];

    let ele = document.getElementById('method');
    for (let i = 0; i < method1.length; i++) {
        ele.innerHTML = ele.innerHTML +
            '<option value="' + method1[i]['ID'] + '">' + method1[i]['Category'] + '</option>';
    }

}

//hides other text field and email format selections
function hideOptions() {
    if (method !== "Other") {
        other.style.display = "none";
    }
    if (checked !== true) {
        format.style.display = "none";
    }
    //console.log("hideOptions fired");

}

//display other text field and email format selections
function display() {
    updateFields();

    //console.log("display fired");
    // console.log("Method state: " + (method === "Other"));
    // console.log("Method: " + method);

    if (method === "Other") {
        other.style.display = "inline";
    }
    else {
        other.style.display = "none";
    }

    if (checked === true) {
        format.style.display = "inline";
    }
    else {
        format.style.display = "none";
    }
}

//display email format radios

//client side validation
function validate() {
    updateFields();
    //flag variable
    let isValid = true;

    // clear all error messages
    let errors = document.getElementsByClassName("err");
    for (let i = 0; i < errors.length; i++) {
        errors[i].style.display = "none";
    }

    // Check first name
    let first = document.getElementById("fname").value;
    if (first === "") {
        let errFirst = document.getElementById("err-fname");
        errFirst.style.display = "inline";
        isValid = false;
    }

    //check last name
    let last = document.getElementById("lname").value;
    if (last === "") {
        let errLast = document.getElementById("err-lname");
        errLast.style.display = "inline";
        isValid = false;
    }

    //check email
    let email = document.getElementById("email").value;
    if ((checked === true || email !== "") && (!email.includes('@') && !email.includes('.'))) {
        let errEmail = document.getElementById("err-email");
        errEmail.style.display = "inline";
        isValid = false;
    }

    // console.log("Checked : " + checked);
    // console.log("email : " + email);

    //check how we met? dropdown selection
    //console.log(method);
    if (method === "000") {
        let errMethod = document.getElementById("err-method");
        errMethod.style.display = "inline";
        isValid = false;
    }

    //check LinkedIn url
    let url = document.getElementById("linkedin").value;
    if (url !== "" && ((!url.includes("."))
        || (url.substring(0, 4) !== "http"
            && url.substring(url.length- 4) !== ".com"))) {
        let errUrl = document.getElementById("err-url");
        errUrl.style.display = "inline";
        isValid = false;
    }

    return isValid;
}

//update fields
function updateFields() {
    method = document.getElementById("method").value;
    checked = document.getElementById("addme").checked;
}