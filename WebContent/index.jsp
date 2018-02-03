<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>WeatherApplication</title>
</head>
<body background="/WeatherApplication/WebContent/images/weather.jpg">
<h1 align="center">Welcome to the weather application page!</h1>
 <%@ page import="java.util.Date,java.text.*"%>
 
<%
  Date now = new Date();
  DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss SSS"); 
%>
 
<h4>Current Time:</h4>
<%=df.format(now)%>

 <div class="container footer-content">
        <hr />
        <p align="center">&copy; Copyright 2018 - KekeliDosArt</p>
 </div>
</body>
</html>