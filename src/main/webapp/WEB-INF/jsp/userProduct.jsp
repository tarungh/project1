<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Products List Page</title>
</head>
<body>
<%@include file="userHeader.jsp" %>
<div>
<table class="table table-bordered table-hover table-striped">
<tr><th>Product Id</th>
<th>Product Name</th>
<th> Product Description</th>
<th> Product Price</th>
<th>Supplier Id</th>
<th>Category Id</th>
<th>Stock</th>
<th>Image</th>
</tr> 
<core:forEach items="${proData}" var="pro">
<tr class="success" >
                 <td>${pro.productId}</td> 
                 <td>${pro.productName}</td>
                 <td>${pro.productDescription}</td>
                 <td> ${pro.productPrice}</td>
                <td>${pro.supId}</td>
                <td> ${pro.catId}</td>
                <td>${pro.stock}</td>
                <td><a href="singlepid?spid=${pro.productId}"><img src="./resources/images/${pro.productId}.jpg" height="50px" width="50px"/></a></td> 
</tr>
</core:forEach>
</table>
</div>	
<%@ include file="userFooter.jsp" %>
</body>
</html>