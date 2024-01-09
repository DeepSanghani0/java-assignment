	<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
    //Establish a connection to the database
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
    //Create a statement object to execute queries
    Statement stmt = con.createStatement();
    //Get the parameters from the request
    String action = request.getParameter("action");
    String id = request.getParameter("id");
    String name = request.getParameter("name");
    String email = request.getParameter("email");
    String phone = request.getParameter("phone");
    //Perform different actions based on the parameter value
    if(action.equals("create")) {
        //Insert a new record into the table
        String sql = "insert into users values ('" + id + "', '" + name + "', '" + email + "', '" + phone + "')";
        stmt.executeUpdate(sql);
        out.println("User created successfully!");
    }
    else if(action.equals("read")) {
        //Retrieve all records from the table
        String sql = "select * from users";
        ResultSet rs = stmt.executeQuery(sql);
        out.println("<table border='1'>");
        out.println("<tr><th>ID</th><th>Name</th><th>Email</th><th>Phone</th></tr>");
        //Loop through the result set and display the data
        while(rs.next()) {
            out.println("<tr>");
            out.println("<td>" + rs.getString("id") + "</td>");
            out.println("<td>" + rs.getString("name") + "</td>");
            out.println("<td>" + rs.getString("email") + "</td>");
            out.println("<td>" + rs.getString("phone") + "</td>");
            out.println("</tr>");
        }
        out.println("</table>");
        rs.close();
    }
    else if(action.equals("update")) {
        //Update an existing record in the table
        String sql = "update users set name = '" + name + "', email = '" + email + "', phone = '" + phone + "' where id = '" + id + "'";
        stmt.executeUpdate(sql);
        out.println("User updated successfully!");
    }
    else if(action.equals("delete")) {
        //Delete a record from the table
        String sql = "delete from users where id = '" + id + "'";
        stmt.executeUpdate(sql);
        out.println("User deleted successfully!");
    }
    else {
        //Invalid action
        out.println("Invalid action!");
    }
    //Close the statement and connection objects
    stmt.close();
    con.close();
%>
	
</body>
</html>