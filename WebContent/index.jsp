<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="myTravelog.*"%>


<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-type" content="text/html; charset=utf-8">
    <title>HasOffers Engineering Test</title>
    <link rel="stylesheet" href="styles/styles.css" type="text/css" media="screen">
</head>
<body>
    <div id="content" class="container">
        <div class="section grid grid10">
            <h2>Enter Text to Convert to an Integer:</h2>
            <br><br>
            <form name="frm" method="get" action="textInput.jsp" style="margin-left:30px;">
            <input type="text" name="textToConvert" style="width:400px;" value="Forty Four Billion Two Hundred Ninety Eight Million Three Hundred Fifty Two Thousand Seven Hundred Sixty Two"><br><br>
            <input type="submit" name="submit" value="Submit">
            </form>
            <ul>
            </ul>
        </div>   
    </div>
</body>
</html>