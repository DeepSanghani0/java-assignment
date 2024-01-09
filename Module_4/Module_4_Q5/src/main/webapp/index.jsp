<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<sql:setDataSource var="ds" driver="com.mysql.jdbc.Driver" 
                         url="jdbc:mysql://localhost:3306/jspcrud"
                         user="root" password=""/>
                         
<sql:query dataSource="${ds}" var="rs"> 
         SELECT * FROM details; 
         </sql:query>
        <table border="1" width="50%"> 
         <tr>
         	<th>Id</th>
         	<th>name</th>
         	<th>email</th>
         	<th>address</th>
         	<th>phone</th>
         </tr>
         <c:forEach var="item" items="${rs.rows}"> 
         <tr>         
         		
         		<td>${item.id}</td>
         		<td> ${item.name}</td> 
         		<td>${item.email}</td>
         		<td> ${item.address}</td>
         		<td> ${item.phone}</td>
         		
         
         </tr>
          
      </c:forEach>
      
      </table>
</body>
</html>