<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Data</title>
</head>
<body>
    <h1>Student Data</h1>
    <table border="1">
        <tr>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Email</th>
            <th>Mobile</th>
            <th>Gender</th>
            <th>Password</th>
        </tr>
        <tr>
            <td>${fname}</td>
            <td>${lname}</td>
            <td>${email}</td>
            <td>${mobile}</td>
            <td>${gender}</td>
            <td>${password}</td>
        </tr>
    </table>
</body>
</html>
