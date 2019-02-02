<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Your created MadLib!</title>
</head>
<body>
<p>${createdMadLib2.toString()}
<br>
<p>Your chosen words for MadLib two:
<br>
Adjective: ${createdMadLib2.getFifthAdj()}
<br>
Noun: ${createdMadLib2.getSecondNoun()}
<br>
Animal: ${createdMadLib2.getAnimal()}
<br>
Noise: ${createdMadLib2.getNoise()}
<br>
<a href="index2.jsp"> Redo this MadLib. (Warning previous page will not have the first MadLab filled out.)</a>
<br><br>
<a href="index.jsp">Use different words in the created MadLibs!</a>
</p>
</body>
</html>