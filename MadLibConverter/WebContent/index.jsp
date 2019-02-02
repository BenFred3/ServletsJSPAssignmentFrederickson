<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to the MadLibs Converter!</title>
</head>
<body>
<p> To get started please fill out this form. You will fill out two forms and get two different MadLibs! </p>
<form action="getMadLibServlet" method="post">
Enter a Color:
<input type="text" name="userColor" size="10">
<br>
Enter a Superlative (Ending is "est"):
<input type="text" name="userSuperlative" size="10">
<br>
Enter a First Adjective:
<input type="text" name="userFirstAdj" size="10">
<br>
Enter a Plural Body Part:
<input type="text" name="userPluralBodyPart" size="10">
<br>
Enter Another Body Part:
<input type="text" name="userBodyPart" size="10">
<br>
Enter a Noun:
<input type="text" name="userNoun" size="10">
<br>
Enter a Plural Animal:
<input type="text" name="userPluralAnimal" size="10">
<br>
Enter a Second Adjective:
<input type="text" name="userSecondAdj" size="10">
<br>
Enter a Third Adjective:
<input type="text" name="userThirdAdj" size="10">
<br>
Enter a Fourth and Final Adjective:
<input type="text" name="userFourthAdj" size="10">
<br>
<input type="submit" value="Create MadLib" />
</form>
</body>
</html>