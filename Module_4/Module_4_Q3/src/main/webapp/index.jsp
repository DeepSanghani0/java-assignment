<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Information Form</title>
</head>
<body>
   
    <h1>Student Information Form</h1>
    
    <form action="StudentServlet" method="post">
        
        <p>First Name: <input type="text" name="fname"></p>
        <p>Last Name: <input type="text" name="lname"></p>
        <p>Email: <input type="email" name="email"></p>
        <p>Mobile: <input type="tel" name="mobile"></p>
        <p>Gender: <input type="radio" name="gender" value="Male"> Male
            <input type="radio" name="gender" value="Female"> Female</p>
        <p>Password: <input type="password" name="password"></p>
        <p><input type="submit" value="Submit"></p>
    
    </form>
    
</body>
</html>
