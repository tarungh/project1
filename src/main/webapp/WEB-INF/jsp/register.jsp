<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="script"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>

</head>
<body>
<%@ include file="userHeader.jsp" %>
<form:form class="form-horizontal" method="post" action="register"	commandName="UserDetails" >
<center>
<h1>Registration Form</h1>
</center>
<center><fieldset>


				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="requestName">UserId
					</label>
					<div class="col-md-4">
						<form:input class="form-control input-md" path="userId" ></form:input>

					</div>
					<form:errors path="userId" style="color:red;"></form:errors>
				</div>

				<!-- Text input-->
				

				<div class="form-group">
					<label class="col-md-4 control-label" for="comments">UserName
						</label>
					<div class="col-md-4">
						<form:input class="form-control" path="username" />
					</div>
				</div>

				<div class="form-group">
					<label class="col-md-4 control-label" for="comments">Password
						</label>
					<div class="col-md-4">
						<form:password class="form-control" path="password" />
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-md-4 control-label" for="comments">FullName
						</label>
					<div class="col-md-4">
						<form:input class="form-control" path="name" />
					</div>
				</div>


  <div class="form-group">
					<label class="col-md-4 control-label" for="comments">Mobile number
						</label>
					<div class="col-md-4">
						<form:input class="form-control" path="mobile" />
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-md-4 control-label" for="comments">Email
						</label>
					<div class="col-md-4">
						<form:input class="form-control" path="email" />
					</div>
				</div>
				
				
			
					<!-- Button -->
				<div class="form-group">
					<label class="col-md-4 control-label" for="submit"></label>
					<div class="col-md-4">

						<input type="submit" class="btn btn-lg btn-info" value="REGISTER"></input>
					</div>
				</div>

			</fieldset></center>
		</form:form>
<%@ include file="userFooter.jsp" %>
</body>
</html>