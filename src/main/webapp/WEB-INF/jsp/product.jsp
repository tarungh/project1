<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product Page</title>
</head>
<body>
<%@include file="administration.jsp" %>
<form:form class="form-horizontal" method="post" action="product"	commandName="ProductDetails" enctype="multipart/form-data">
<center>
<h1>Product Form</h1>
</center>
<div>
                  <center><fieldset>
              <!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="requestName">Product Id
					</label>
					<div class="col-md-4">
						<form:input class="form-control input-md" path="productId" ></form:input>
	               </div>
				</div>
		        <!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="comments">Product Name
						</label>
					<div class="col-md-4">
						<form:input class="form-control" path="productName" />
					</div>
				</div>
                 <div class="form-group">
					<label class="col-md-4 control-label" for="comments">Product Description
						</label>
					<div class="col-md-4">
						<form:textarea class="form-control" path="productDescription" />
					</div>
				</div>
				   <div class="form-group">
					<label class="col-md-4 control-label" for="requestName">Product Price
					</label>
					<div class="col-md-4">
						<form:input class="form-control input-md" path="productPrice" ></form:input>
	           </div>
				</div>
			<div class="form-group">
					<label class="col-md-4 control-label" for="comments">Category Name
						</label>
					<div class="col-md-4">
						<form:select class="form-control" path="catId" >
						<form:option value="-1">select Category Name</form:option>
						<core:forEach items="${catData}" var="cat">
                        <form:option value="${cat.cId}">${cat.cName}</form:option>
                        </core:forEach>
                        </form:select>
					</div>
				</div>
		   <div class="form-group">
					<label class="col-md-4 control-label" for="comments">Supplier Name
						</label>
					<div class="col-md-4">
						<form:select class="form-control" path="supId" >
						<form:option value="-1">select Supplier Name</form:option>
						 <core:forEach items="${supData}" var="sup">
                         <form:option value="${sup.sId}">${sup.sName}</form:option>
                         </core:forEach>
                         </form:select>
					</div>
				</div>
				</div>
				   <div class="form-group">
					<label class="col-md-4 control-label" for="requestName">Stock
					</label>
					<div class="col-md-4">
						<form:input class="form-control input-md" path="stock" ></form:input>
	           </div>
	           </div>
				<div class="form-group">
					<label class="col-md-4 control-label" for="comments">Upload Image
						</label>
					<div class="col-md-4">
						<form:input type="file" path="pImage" />
					</div>
				</div>
				<!-- Button -->
                   <div class="form-group">
					<label class="col-md-4 control-label" for="submit"></label>
					<div class="col-md-4">

						<input type="submit" class="btn btn-lg btn-info" value="${bname}"></input>
					</div>
				</div>
            </fieldset></center>
            </div>
	      </form:form>		
	  <div>
<table class="table table-bordered table-hover table-striped">
<tr><th>Product Id</th>
<th>Product Name</th>
<th> Product Description</th>
<th> Product Price</th>
<th>Supplier Id</th>
<th>Category Id</th>
<th>Stock</th>
<th>Edit</th>
<th>Delete</th>
<th>Image</th>
</tr> 
<core:forEach items="${proData}" var="pro">
<tr class="success" >
                 <td>${pro.productId}</a></td> 
                 <td>${pro.productName}</td>
                 <td>${pro.productDescription}</td>
                 <td>${pro.productPrice}</td>
                <td>${pro.supId}</td>
                <td>${pro.catId}</td>
                <td>${pro.stock}</td>
                <td><a href="updatepro?upro=${pro.productId}">Edit</a></td>
                <td><a href="deleteprod?dpid=${pro.productId}">Delete</a></td>
                <td><img src="./resources/images/${pro.productId}.jpg" height="50px" width="50px"/></td> 
</tr>
</core:forEach>
</table>
</div>	

</body>
</html> 