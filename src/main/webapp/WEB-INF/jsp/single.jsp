<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Single Product Page</title>
</head>
<body>
<%@include file="userHeader.jsp" %>
<div>
<table class="table table-bordered table-hover table-striped">

<tr><th>Product Id</th>
<th>Product Name</th>
<th> Product Description</th>
<th> Product Price</th>
<th>Stock</th>
<th>Image</th>
<th>Cart</th>
</tr> 
<core:forEach items="${proData}" var="pro">
<tr class="success" >
<form action="addtocart" method="post">
                 <td>${pro.productId}</td> 
                 <td>${pro.productName}</td>
                 <td>${pro.productDescription}</td>
                 <td> ${pro.productPrice}</td>
                <td>${pro.stock}</td>
                 <td><img src="./resources/images/${pro.productId}.jpg" height="200px" width="150px"/></td> 
                <td><input type="text" readonly="readonly"  name="cpid" value="${pro.productId}"/>
                  <input type="text" name="quantity"/>
                  <input type="submit" value="addtocart"/></td>
              
</tr>
                 
 </core:forEach>
</table>
</div>	
<%@ include file="userFooter.jsp" %>
</body>
</html>