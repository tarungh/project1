<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Category Page</title>
</head>
<body>
<%@include file="administration.jsp" %>
<form:form class="form-horizontal" method="post" action="category"	commandName="CategoryDetails" >
<center>
<h1>Category Form</h1>
</center>
<center><fieldset>
               <!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="requestName">Category Id
					</label>
					<div class="col-md-4">
						<form:input class="form-control input-md" path="cId" ></form:input>
	                 </div>
				   </div>
	           <!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="comments">Category Name
						</label>
					<div class="col-md-4">
						<form:input class="form-control" path="cName" />
					</div>
				</div>

				<div class="form-group">
					<label class="col-md-4 control-label" for="comments">Category Description
						</label>
					<div class="col-md-4">
						<form:textarea class="form-control" path="cDis" />
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
</form:form>
            <table class="table table-bordered table-hover table-striped">
 <tr><th>Category Id</th>
<th>Category Name</th>
<th>Category Description</th>
<th>Edit</th>
<th>Delete</th>
</tr> 
<core:forEach items="${catData}" var="cate">
<tr class="success" >

                <td>${cate.cId}</td> 
                 <td>${cate.cName}</td>
                    <td> ${cate.cDis}</td>
                     <td><a href="updatecat?ucat=${cate.cId}">Edit</a></td>
                <td><a href="deletecat?dcid=${cate.cId}">Delete</a></td>
                

</tr>
</core:forEach>

</table>

</body>
</html>