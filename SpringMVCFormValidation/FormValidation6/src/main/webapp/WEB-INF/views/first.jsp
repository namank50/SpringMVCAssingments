<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Simple Interest</title>
</head>
<body>
<form action="/registeration" method="post">
 <p> Username : <input name="username" type="text" /> </p>
 <p>Password : <input name="password" type="password" /></p>
 <p> Email :<input name="email" type="text"></p>
 <p>Contact:<input name="contact" type="text"/></p>
 <p>City:<select name="city" multiple>
 <option value="Pune">Pune</option>
  <option value="Banglore">Banglore</option>
  <option value="Delhi">Delhi</option>
  <option value="Mumbai">Mumbai</option>
 </select></p>
 <p>Zip Code:<input name="zipCode" type="number"/></p>
 
<input type="submit" value="Register" />


</form>

</body>
</html>