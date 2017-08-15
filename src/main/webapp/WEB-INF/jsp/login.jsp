
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<%@ include file="userHeader.jsp" %>
<form action="perform_login" method="post">





			

				<div class="form-group" >
				<div class="col-md-4" >
				<label class="col-md-4 control-label">UserName</label>
			    <input type="text" class="form-control" placeholder="Enter UserName" name="username" />
				</div>
				<br>
				<br>
				<br>
				<br>
					<div  class="col-md-4">	
					<label class="col-md-4 control-label">Password</label>
						<input type="password" class="form-control" placeholder="Enter Password" name="password" />
					</div>
				<br>
				<br>
				<br>
				<br>			
				<div class="col-md-4" >
					<label class="col-md-4 control-label" ></label>
				    <input type="submit" class="btn btn-lg btn-info" value="LOGIN"></input>
						<input type="checkbox" checked="checked"> Remember me
						
					</div>
			
				</div>

				
			
				
				
						
				
				
				
			
			

		
</form>
<%@ include file="userFooter.jsp" %>
</body>
</html>