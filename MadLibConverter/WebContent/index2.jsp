<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>First Created MadLib and MORE?!</title>
</head>
<body>
<p>${createdMadLib.toString()} </p>
<p>Your chosen words for MadLib one:
<br>
Color: ${createdMadLib.getColor()}
<br>
Superlative: ${createdMadLib.getSuperlative()}
<br>
First Adjective: ${createdMadLib.getFirstAdj()}
<br>
Plural Body Part: ${createdMadLib.getPluralBodyPart()}
<br>
Body Part: ${createdMadLib.getBodyPart()}
<br>
Noun: ${createdMadLib.getNoun()}
<br>
Plural Animal: ${createdMadLib.getPluralAnimal()}
<br>
Second Adjective: ${createdMadLib.getSecondAdj()}
<br>
Third Adjective: ${createdMadLib.getThirdAdj()}
<br>
Fourth Adjective: ${createdMadLib.getFourthAdj()}
</p>
<br>
<p> Create one more MadLib!</p>
<form action="getMadLibServlet2" method="post">
Enter a Adjective:
<input type="text" name="userFifthAdj" size="10">
<br>
Enter a Noun:
<input type="text" name="userSecondNoun" size="10">
<br>
Enter a Animal:
<input type="text" name="userAnimal" size="10">
<br>
Enter a Noise:
<input type="text" name="userNoise" size="10">
<br>
<input type="submit" value="Create Second MadLib" />
</form>
</body>
</html>