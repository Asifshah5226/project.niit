<%-- 
    Document   : homepage
    Created on : 14 Mar, 2018, 9:38:49 PM
    Author     : Asif
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title> Doctors Appointment </title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="style.css" type="text/css"/>
        <link href="css/basic-template.css" rel="stylesheet"/>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
   <style>
    /* Remove the navbar's default margin-bottom and rounded borders */ 
    .navbar {
      margin-bottom: 0;
      border-radius: 0;
    }
    
    /* Set height of the grid so .sidenav can be 100% (adjust as needed) */
    .row.content {height: 450px}
    
    /* Set gray background color and 100% height */
    .sidenav {
      padding-top: 20px;
      background-color:#f1f1f1;
      height: 100%;
    }
    img{
        width: 100px;
        height:50px;
        
    }
    h2{
        max-width:200%;
        max-height:200%;
    }
    
    /* Set black background color, white text and some padding */
    footer {
        position: fixed;
        left:0;
        bottom:0;
        width:100%;
        background-color: #555;
        color: white;
        padding: 4px;
    }
    
    /* On small screens, set height to 'auto' for sidenav and grid */
    @media screen and (max-width: 767px) {
      .sidenav {
        height: auto;
        padding: 15px;
      }
      .row.content {height:auto;} 
    }
    
  </style>
  <link rel="shortcut icon" type="image/jpg" href="img/favicon.jpg">
    </head>
    <body>
        <nav class="navbar navbar-inverse"> 
        <div class="container-fluid">
    <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
        </button>
        <a class="navbar-brand" href="#" ></a>
        <img src="img/logo.png">
    </div>
            <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Home</a></li>
        <li><a href="About Us.html">About Us</a></li>
        <li><a href="Branches.jsp">Branches</a></li>
        <li><a href="Contact Us.jsp">Contact Us</a></li>
        <li><a href="#">Patient's Registration</a></li>
      </ul>
                <ul class="nav navbar-nav navbar-right">
        <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Doctor's Login</a></li>
                </ul>
                 <ul class="nav navbar-nav navbar-right">
        <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Patient's Login</a></li>
                 </ul>
     </div>
  </div>
</nav>
<div class="container-fluid text-center">    
  <div class="row content">
    <div class="col-sm-2 sidenav">
        <h2> <img src="img/hospital.jpg"></h2>
      <p><b>Stay Healthy Hospital</b></p><br><p>One of the prominent names for hospitals all over India and we are growing and expanding all over the world.With best class machines and a team of well professional doctors let us <br><b>"STAY HEALTHY"</b><br>together...</p>
    </div>
      <div class="col-sm-8 text-left"> 
      <h1>STAY HEALTHY HOSPITALS</h1>
      <p><b><marquee> stay healthy </marquee> </b></p>
      <hr>
      <h3>Test</h3>
      <p>test</p>
    </div>
    <div class="col-sm-2 sidenav">
      <div class="well">
        <p>ADS</p>
      </div>
      <div class="well">
        <p>ADS</p>
      </div>
    </div>
  </div>
</div>

<footer class="container-fluid text-center">
  <p> @Copyright by DocApp 2018 </p>
</footer>

</body>
</html>
