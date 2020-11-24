<!DOCTYPE html> 
<html> 
<style> 
    /*set border to the form*/ 

    form { 
        border: 3px solid #f1f1f1; 
    } 
    /*assign full width inputs*/ 

    input[type=text], 
    input[type=password] { 
        width: 100%; 
        padding: 12px 20px; 
        margin: 8px 0; 
        display: inline-block; 
        border: 1px solid #ccc; 
        box-sizing: border-box; 
    } 
    /*set a style for the buttons*/ 

    button { 
        background-color: #4CAF50; 
        color: white; 
        padding: 14px 20px; 
        margin: 8px 0; 
        border: none; 
        cursor: pointer; 
        width: 100%; 
    } 
    /* set a hover effect for the button*/ 

    button:hover { 
        opacity: 0.8; 
    } 
    /*set extra style for the cancel button*/ 

    .cancelbtn { 
        width: auto; 
        padding: 10px 18px; 
        background-color: #f44336; 
    } 
    /*centre the display image inside the container*/ 

    .imgcontainer { 
        text-align: center; 
        margin: 24px 0 12px 0; 
    } 
    /*set padding to the container*/ 

    .container { 
        padding: 0px; 
    } 
    /*set the forgot password text*/ 

    span.psw { 
        float: right; 
        padding-top: 16px; 
    } 
    /*set styles for span and cancel button on small screens*/ 

    @media screen and (max-width: 300px) { 
        span.psw { 
            display: block; 
            float: none; 
        } 
        .cancelbtn { 
            width: 100%; 
        } 
    } 
</style> 

<body> 

    <h2 style="margin-bottom: 0;text-align: center;color:#800020;font-size:60px;">Login Form</h2> 
    <!--Step 1 : Adding HTML-->
    <form action="welcome" method="post"> 

        <div class="container" style="padding: 100px;"> 
            <label><b>Username</b></label> 
            <input type="text" placeholder="Enter Username" name="name" required> 

            <label><b>Password</b></label> 
            <input type="password" placeholder="Enter Password" name="pass" required> 

  			<button type="submit" style="width:30%;margin-left: 35%;background-color:#800020;font-size:30px;border-radius: 5px 25px;">Login</button> 
        </div> 
    </form> 
    <!--
    				***********Just clicking a link which redirects to another page**************
		<body>
			<br>
			<div style="text-align: center">
				<h2>
					Hey You..!! This is your 1st Spring MCV Tutorial..<br> <br>
				</h2>
				<h3>
					<a href="welcome.html">Click here to See Welcome Message... </a>(to
					check Spring MVC Controller... @RequestMapping("/welcome"))
				</h3>
			</div>
		</body> 
     -->

</body> 

</html> 