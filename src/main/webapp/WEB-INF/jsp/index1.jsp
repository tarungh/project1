<!DOCTYPE html>
<html lang="en">
<head>
<body>
<%@ include file="userHeader.jsp" %>
<div class="container">

  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    

    <!-- Wrapper for slides -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol><div class="carousel-inner">
      <div class="item active">
        <img src="resources/1.jpg" alt="Apple" style="width:100%;">
      </div>

      <div class="item">
        <img src="resources/2.jpg" alt="Tzaro" style="width:100%;">
      </div>
    
      <div class="item">
        <img src="resources/3.jpg" alt="Bigbrands" style="width:100%;">
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>
<%@ include file="userFooter.jsp" %>
</body>
</html>
