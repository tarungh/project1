<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form class="form-horizontal" method="get" action="order"	commandName="OrderDetails" >
<center>
<h1>Product Form</h1>
</center>
<div>
                  <center><fieldset>
              <!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="requestName">Cart User
					</label>
					<div class="col-md-4">
						<form:input class="form-control input-md" path="cartUser" ></form:input>
	               </div>
				</div>
		        <!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="comments">Total Price
						</label>
					<div class="col-md-4">
						<form:input class="form-control" path="totalPrice" />
					</div>
				</div>
                 <div class="form-group">
					<label class="col-md-4 control-label" for="comments">Shipping Address
						</label>
					<div class="col-md-4">
						<form:textarea class="form-control" path="shippingAddress" />
					</div>
				</div>
				  
				<!-- Button -->
                   <div class="form-group">
					<label class="col-md-4 control-label" for="submit"></label>
					<div class="col-md-4">

						<input type="submit" class="btn btn-lg btn-info" value="billing"></input>
					</div>
				</div>
            </fieldset></center>
            </div>
	      </form:form>		
</body>
</html>