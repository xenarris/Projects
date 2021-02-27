<?php
include('includes/head.html');

include('includes/navbar.php');

?>
<title>Admin Page</title>
<link rel="stylesheet" href="css/guestform.css">
<link rel="stylesheet" href="//cdn.datatables.net/1.10.23/css/jquery.dataTables.min.css">
</head>

<body>
<!-- Jumbotron Header -->
<div class="jumbotron bg-white hero-img">
    <p class="display-4 text-white">Admin Page</p>
</div>

<!-- login box -->
<div class="container bg-form-color rounded" id="signinbox">
    <div class="row justify-content-center align-items-center" style="height:50vh">
        <div class="col-4">
            <div class="card">
                <div class="card-body">
                    <p class="lead">Sign in</p>
                    <p>Checks if empty only currently!</p>
                    <form action="" method="post" autocomplete="off">
                        <div class="form-group">
                            <input type="text" class="form-control" name="username" id="username">
                        </div>
                        <div class="form-group">
                            <input type="password" class="form-control" name="password" id="password">
                        </div>

                        <span class="err text-danger" id="err-login">
                        * Both Username and Password Required <br><br>
                        </span>

                        <div class="text-center">
                            <button type="button" id="sendlogin" class="btn btn-primary">Login</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

<div class="container">
<!-- The table-->
<div class="container hidden" id="guestcontainer">
    <br>
    <br>
<!--    class="display"-->
    <table id="GuestBook"  class="display" style="width: 100%">
        <thead>
        <tr>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Job Title</th>
            <th>Company</th>
            <th>LinkedIn</th>
            <th>Email</th>
            <th>How we met</th>
            <th>Mailing list</th>
            <th>Message</th>
            <th>Date Submitted</th>
        </tr>
        </thead>
        <tbody>
        <?php
        //error reporting
        ini_set('display_errors', 1);
        error_reporting(E_ALL);

        //connect to database data
        require ('/home/jantonio/public_html/305/connect.php');
        $cnxn = connect();



        //define query
        $sql = "Select * FROM guestlist";

        //send query to database
        $result = mysqli_query($cnxn, $sql);

        //process the result
        foreach ($result as $row) {
            $first = $row['first'];
            $last = $row['last'];
            $job = $row['job'];
            $company = $row['company'];
            $linkedin = $row['linkedin'];
            $email = $row['email'];
            $metmethod = $row['metmethod'];
            $mailformat = $row['mailformat'];
            $message = $row['message'];
            $datesubmitted = $row['datesubmitted'];

            echo "<tr>
                    <td>$first</td>
                    <td>$last</td>
                    <td>$job</td>
                    <td>$company</td>
                    <td>$linkedin</td>
                    <td>$email</td>
                    <td>$metmethod</td>
                    <td>$mailformat</td>
                    <td>$message</td>
                    <td>$datesubmitted</td>
                  </tr>";
        }
        ?>
        </tbody>
    </table>
</div>
</div>
<script src="//cdn.datatables.net/1.10.23/js/jquery.dataTables.min.js"></script>
<script src="js/admin.js"></script>

<!--Thanks to leandroruel @ https://bootsnipp.com/snippets/rl98z for login page-->
</body>

