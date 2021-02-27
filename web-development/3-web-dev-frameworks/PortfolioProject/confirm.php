<?php
include("includes/head.html");

include('includes/navbar.php');

?>
    <title>Thank You</title>
</head>

<body>
<!-- Jumbotron Header -->
<div class="jumbotron bg-white hero-img">
    <p class="display-4 text-white">Guestbook Form</p>
</div>

<?php

//error reporting
//ini_set('display_errors', 1);
//error_reporting(E_ALL);


//connect to database data
require ('/home/jantonio/public_html/305/connect.php');

//information variables
$fname = $_POST['fname']; //first
$lname = $_POST['lname']; //last
$jtitle = $_POST['jtitle']; //job
$company = $_POST['company']; //company
$linkedin = $_POST['linkedin']; //linkedin
$email = $_POST['email']; //email
$metmethod = $_POST['method']; //metmethod
$other = $_POST['other']; //other
$message = $_POST['message']; //message
$format = $_POST['format']; //mailformat 0-none 1-html 2-text
//var_dump($_POST['format']);

//array of form variables
/*$formArray = [
        0 => "$fname",
    1 => "$lname",
    2 => "$jtitle",
    3 => "$company",
    4 => "$linkedin",
    5 => "$email",
    6 => "$metmethod",
    7 => "$other",
    8 => "$message",
    9 => "$format"

];*/

//adds escape characters to the values before being queried; Attempts
/*foreach ($formArray as $value) {
    if (str_contains($value, "'")) {
        $pos = stripos($value,"'");


    }
}*/
/*for ($i=0; $i < count($formArray); $i=$i+1) {
    if (stripos($formArray[$i], "'")){
        $pos = stripos($formArray[$i], "'");
        $formArray[$i] = substr_replace($formArray[$i], "\' ", $pos, 0);
    }
}
foreach ($formArray as $value) {
    echo "$value\n";
}*/



$cnxn = connect();

//define query
//Unfortunately we cannot use quotes, and the like as is because it affect the sql statement.
$sql = "INSERT INTO guestlist (first, last, job, company, linkedin, email, metmethod, mailformat, other, message) 
VALUES ('$fname', '$lname', '$jtitle', '$company', '$linkedin', '$email', '$metmethod', '$format', '$other', '$message');";

//send query
$success = mysqli_query($cnxn, $sql);
//debug
/*echo "$sql";

if ($success) {
    echo "<h2>Success!</h2>";
}
else {
    echo "SQL failed";

}*/
?>


<div class="container">
    <div class="row">
        <div class="col-xl border shadow">
            <div class="h1">
                Thank you! The form has been submitted!~
            </div>
        </div>
    </div>

</div>


</body>
</html>