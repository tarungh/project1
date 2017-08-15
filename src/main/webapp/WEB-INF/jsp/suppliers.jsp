<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Supplier Page</title>
</head>
<body>
<%@ include file="administration.jsp" %>
<form:form class="form-horizontal" method="post" action="supplier"	commandName="SupplierDetails" >
<center>
<h1>Supplier Form</h1>
</center>
<center><fieldset>
               <!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="requestName">Supplier Id
					</label>
					<div class="col-md-4">
						<form:input class="form-control input-md" path="sId" ></form:input>
	                </div>
				   </div>
	           <!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="comments">Supplier Name
						</label>
					<div class="col-md-4">
						<form:input class="form-control" path="sName" />
					</div>
				</div>
                  <div class="form-group">
					<label class="col-md-4 control-label" for="comments">Supplier Description
						</label>
					<div class="col-md-4">
						<form:textarea class="form-control" path="sDis" />
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
 <tr><th>Supplier Id</th>
<th>Supplier Name</th>
<th>Supplier Description</th>
<th>Edit</th>
<th>Delete</th>
</tr> 
<core:forEach items="${supData}" var="supp">
<tr class="success" >

                <td>${supp.sId}</a></td> 
                 <td>${supp.sName}</td>
                    <td> ${supp.sDis}</td>
                     <td><a href="updatesup?usup=${supp.sId}">Edit</a></td>
                <td><a href="deletesup?dsid=${supp.sId}">Delete</a></td>
                

</tr>
</core:forEach>

</table>

</body>
</html>