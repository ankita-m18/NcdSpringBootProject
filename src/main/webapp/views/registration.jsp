<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <title>Patient Registration </title>
    <style>
        body {
            /*font-family: Calibri, Helvetica, sans-serif;*/
            background-color: lightpink;
        }

        .container {
            padding: 50px;
            background-color: white;
        }

        .heading {
            background-color: rgb(52, 173, 52);
        }

        input[type=text],
        input[type=password],
        textarea {
            width: 100%;
            padding: 15px;
            margin: 5px 0 22px 0;
            display: inline-block;
            border: none;
            background: #f1f1f1;
        }

        input[type=text]:focus,
        input[type=password]:focus {
            background-color: lightblue;
            outline: none;
        }

        div {
            padding: 10px 0;
        }

        hr {
            border: 1px solid #f1f1f1;
            margin-bottom: 25px;
        }

        .registerbtn {
            background-color: #4CAF50;
            color: white;
            padding: 16px 20px;
            margin: 8px 0;
            border: none;
            cursor: pointer;
            width: 100%;
            opacity: 0.9;
            font-size: large;
        }

        .registerbtn:hover {
            opacity: 1;
        }
    </style>
</head>

<body>
    <form name="register" method="POST" action="/register">
        <div class="container">
            <div class="heading">
             
                <h1 style="text-align:center">Patient Registration</h1>
                    
            </div>
            <div class="user_box error" style="text-align:center;display:'{{ error_display_head }}';color:red;">
                ${ error_head }
            </div>
            <hr>

            <label> Firstname </label>
            <input type="text" name="firstname" placeholder="Firstname" title="Enter First Name, only alphabets and starts with Capital letter."
                pattern="^[A-Za-z\s\.]{1,100}$" required />
            <div class="user_box error"
                style="text-align:center;display:'${error_display_firstname }';border:0px;color:red;">
                ${ error_firstname }
            </div>

            <label> Lastname: </label>
            <input type="text" name="lastname" placeholder="Lastname" title="Enter Last Name, only alphabets and starts with Capital letter."
                pattern="^[A-Za-z\s\.]{1,100}$" required />
            <div class="user_box error"
                style="text-align:center;display:'${ error_display_lastname }';border:0px;color:red;">
                ${ error_lastname }
            </div>

            <div>
                <label> Gender : </label><br> <input type="radio" value="Male" name="gender" required> Male <input
                    type="radio" value="Female" name="gender"> Female <input type="radio" value="Other" name="gender">
                Other
                <div class="user_box error"
                    style="text-align:center;display:'${ error_display_gender }';border:0px;color:red;">
                    ${ error_gender }
                </div>
            </div>

            <!--  <div>
                <label>
                    Aadhaar UID :
                </label>

                <br>
                <p style="color:red;">
                    ${ error }
                </p>

                <input type="text" name="aadhaar" placeholder="Aadhar UID" size="12" pattern="[2-9]{1}[0-9]{11}"
                    title="12 digit Aadhaar No.,starting digit should be 2-9." required>
                <div class="user_box error"
                    style="text-align:center;display:'${ error_display_aadhaar }';border:0px;color:red;">
                    ${ error_aadhaar }
                </div>

            </div>-->

            <div>
                <label>
                    Phone :
                </label>
                <input type="text" name="country code" placeholder="Country Code" value="+91" size="2">
                <input type="text" name="phone" placeholder="phone no." size="10" pattern="[1-9]{1}[0-9]{9}"
                    title="Ten digit phone number" required>
                <div class="user_box error"
                    style="text-align:center;display:'${ error_display_phone }';border:0px;color:red;">
                    ${ error_phone }
                </div>

            </div>
            <div>
                <label> Date of Birth : </label> <input type="date" placeholder="mm-dd-yyyy" id="birthday"
                    name="birthday" min="1900-01-01" max="1992-12-31" onfocus="this.max='1992-12-31'" required>
                <div class="user_box error"
                    style="text-align:center;display:'${ error_display_dob }';border:0px;color:red;">
                    ${ error_dob }
                </div>
            </div>
            <div>
                <label> Pincode : </label> <input type="text" id="pincode" name="pincode" pattern="[1-9]{1}[0-9]{5}"
                    title="Six digit pincode" required>
                <div class="user_box error"
                    style="text-align:center;display:'${ error_display_pincode }';border:0px;color:red;">
                    ${ error_pincode }
                </div>
            </div>

            <button type="submit" class="registerbtn">Register</button>
            <button class="btn btn-outline-success" onclick="location.href='/index'"
                style="text-align:center">Home</button>
        </div>
    </form>
</body>

</html>