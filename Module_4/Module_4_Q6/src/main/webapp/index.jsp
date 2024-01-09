<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Information Form</title>
    
    <script type="text/javascript">
    function isAlphabet(elem, helperMsg)
	{
		var alphaExp = /^[a-zA-Z]+$/;
		if(elem.value.match(alphaExp)){
			return true;
		}else
		{
			alert(helperMsg);
		
			return false;
		}

	}
	//number velidation
	function isNumeric(elem, helperMsg)
	{
		var numericExpression = /^[0-9]+$/;
		if(elem.value.match(numericExpression)){
			return true;
		}else{
			alert(helperMsg);
			return false;
		}
	}
	
	function emailValidator(elem, helperMsg){
		var emailExp = /^[\w\-\.\+]+\@[a-zA-Z0-9\.\-]+\.[a-zA-z0-9]{2,4}$/;
		if(elem.value.match(emailExp)){
			return true;
		}else{
			alert(helperMsg);
			
			return false;
		}
	}
	
	function passwordvalidator(elem, helperMsg){
		var passexp = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$/;
		if(elem.value.match(passexp)){
			return true;
		}else{
			alert(helperMsg);
			
			return false;
		}
	}
	
	
	
	
    </script>
</head>
<body>
   
    <h1>Student Information Form</h1>
    
    <form action="StudentServlet" >
        
        <p>First Name: <input type="text" name="fname" id="fname" onblur="isAlphabet(document.getElementById('fname'), 'Letters Only Please')"></p>
        <p>Last Name: <input type="text" name="lname" id="lname" onblur="isAlphabet(document.getElementById('lname'), 'Letters Only Please')"></p>
        <p>Email: <input type="email" name="email" id="email" onblur="emailValidator(document.getElementById('email'), 'Not a Valid Email')"></p>
        <p>Mobile: <input type="tel" name="mobile" id="phone" onblur="isNumeric(document.getElementById('phone'), 'Numbers Only Please')"></p>
        <p>Gender: <input type="radio" name="gender" value="Male"> Male
            <input type="radio" name="gender" value="Female"> Female</p>
        <p>Password: <input type="password" name="password" id="password" placeholder="Test@123" onblur= "passwordvalidator(document.getElementById('password'), 'Not a Valid Password')"></p>
        <p><input type="submit" value="Submit"></p>
    
    </form>
    
</body>
</html>
