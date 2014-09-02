<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="textToInteger.*"%>
<%@ page import="java.text.NumberFormat"%>
<%@ page import="java.util.Locale"%>

<%
String incomingText = request.getParameter("textToConvert");
%>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-type" content="text/html; charset=utf-8">
    <title>HasOffers Engineering Test</title>
    <link rel="stylesheet" href="styles/styles.css" type="text/css" media="screen">
</head>
<body>
    <div id="content" class="container">
        <div class="section grid grid5">
            <h2>Integer Result</h2>
            <ul>
            <%
            long Result = TextToNumber.Convert(incomingText);
            if (Result < 0) 
            	out.println("Your text contained an unrecognized integer string. Try again.");
           	else
            	out.println(NumberFormat.getNumberInstance(Locale.US).format(Result));	
            	%>
            </ul>
        </div>   
    </div>
</body>
</html>