<%-- 
    Document   : psignin
    Created on : 21 Mar, 2018, 12:50:07 AM
    Author     : Asif
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@include file="header.jsp" %>
<style>
    body{
background-image: url("img/");
   background-color: #cccccc;    }
    .Signinbox{
        width:300px;
        height:420px;
        background:#000;
        color:#fff;
        top:55%;
        left:50%;
        bottom:50%;
        position:absolute;
        transform: translate(-50% , -50%);
        box-sizing: border-box;
        padding: 70px 30px;
    }
    .docavtar{
        width:100px;
        height:100px;
        border-radius: 50%;
        position: absolute;
        top: -50px;
        left: calc(50% - 50px);
    }
    h1{
        margin: 0;
        padding: 0 0 20px;
        text-align: center;
        font-size: 22px;
         font-family: "Times New Roman", Times, serif;
    }
    .Signinbox p{
        margin: 0;
        padding: 0;
        font-weight: bold;
    }
    .Signinbox input{
        width: 100%;
        margin-bottom: 20px;
    }
    .Signinbox input[type="text"],input[type="password"]{
        border-bottom: 1px solid #fff;
        background: transparent;
        outline: none;
        height: 30px;
        color: #fff;
        font-size: 15px;
    }
    .Signinbox input[type="button"]
    {
        border: none;
        outline:none;
        height:40px;
        background: grey;
        color: #fff;
        font-size: 20px;
        border-radius: 20px;
    }
    
</style>
<div class="Signinbox">
    <img src="img/docavtar.png" class="docavtar">
<h1>Login Here</h1>
<form>
<p>Name</p>
<input type="text" name="" placeholder="Enter username">
<p>Password:</p>
<input type="password" name="" placeholder="Password">
</br>
</br>
<input type="button" name="" value="Login">
</br>
<center>OR</center>
<center><a href="psignup.jsp">Create New Login</a</center>
</form>
</div>
</br>
<bottom><%@include file="footer.jsp" %></bottom>
