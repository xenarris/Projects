
<?php
include('includes/head.html');

include('includes/navbar.php');

?>
    <title>Guest Form</title>
</head>


<body>
<!-- Jumbotron Header -->
<div class="jumbotron bg-white hero-img">
    <p class="display-4 text-white">Guestbook Form</p>
</div>

<div class="container " id="main">


    <!-- Guestbook -->
    <form action="confirm.php" method="POST" class="border p-5 bg-form-color rounded" id="guestform">

        <!-- Contact info -->
        <fieldset class="form-group border p-2 bg-white rounded">

            <div class="h4">
                Contact Info
            </div>

            <div class="row">

                <div class="form-group col-xl-6">
                    <label for="fname">First Name:</label>
                    <input type="text" class="form-control" id="fname" placeholder="Enter first name" name="fname">

                    <span class="err" id="err-fname">
                        * First Name Required
                    </span>
                </div>

                <div class="form-group col-xl-6">
                    <label for="lname">Last Name:</label>
                    <input type="text" class="form-control" id="lname" placeholder="Enter first name" name="lname">

                    <span class="err" id="err-lname">
                        * Last Name Required
                    </span>
                </div>

            </div>

            <div class="row">
                <div class="form-group col-xl-6">
                    <label for="jtitle">Job Title:</label>
                    <input type="text" class="form-control" id="jtitle" placeholder="Enter job title" name="jtitle">
                </div>

                <div class="form-group col-xl-6">
                    <label for="company">Company:</label>
                    <input type="text" class="form-control" id="company" placeholder="Enter company" name="company">
                </div>
            </div>

            <div class="form-group">
                <label for="linkedin">LinkedIn URL:</label>
                <input type="url" class="form-control" id="linkedin" placeholder="Enter LinkedIn URL" name="linkedin">


                <span class="err" id="err-url">
                    * Valid link Required
                </span>

            </div>

            <div class="form-group">
                <label for="email">Email:</label>
                <input type="text" class="form-control" id="email" placeholder="Enter email" name="email">

                <span class="err" id="err-email">
                    * Valid Email Required
                </span>
            </div>



            <br>
            <hr>
            <br>

            <!-- How we met -->
            <div class="h4">
                How we met?
            </div>

            <div class="row">

                <div class="form-group col-xl-6">
                    <label for="method">Select how we met: </label> <br>
                    <select class="btn border" id="method" name="method">
                        <option value="000">Select a choice:</option>
                    </select>
                    <br>
                    <span class="err" id="err-method">
                        * How we met Required
                    </span>

                    <br>
                </div>

            </div>

            <div class="row">
                <div class="form-group col-xl-6" id="otherContainer">
                    <label for="other">Other (please specify):</label>
                    <input type="text" class="form-control" id="other" placeholder="Enter how we met" name="other">
                </div>

            </div>

            <div class="row">

                <div class="form-group col-xl-6">
                    <label for="message">Message:</label>
                    <textarea class="form-control" rows="4" id="message" placeholder="Any messages for me?" name="message"></textarea>
                </div>

            </div>

            <br>
            <hr>
            <br>

            <!-- Mailing Choice -->
            <div class="h4">
                Mailing list
            </div>


            <div class="form-check" id="mailList">
                <input type="checkbox"  class="form-check-input" id="addme" name="addme">
                <label class="form-check-label" for="addme">Please add me to your mailing list!</label>
            </div>

            <br>

            <div id="emailFormat">
                <p>Please choose an email format:</p>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" name="format" value="html" id="html">
                    <label class="form-check-label" for="html">
                        HTML
                    </label>
                </div>

                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" name="format" value="text" id="text">
                    <label class="form-check-label" for="text">
                        Text
                    </label>
                </div>
            </div>

        </fieldset>

        <div class="text-center">
            <button type="submit" class="btn btn-primary btn-default bg-white text-dark">Submit</button>
        </div>

    </form>
</div>

<script src="js/guestform.js"></script>

</body>
</html>