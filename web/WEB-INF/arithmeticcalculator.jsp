<%-- 
    Document   : arithmeticcalculator
    Created on : 22-Jan-2023, 7:55:05 PM
    Author     : Anmolpreet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action="arithmetic" method="post">
            First: <input type="text" name="first" value=${first}><br>
            Second: <input type="text" name="second" value=${second}><br>
       <input type="submit" name="cal" value="+">
       <input type="submit" name="cal" value="-">
       <input type="submit" name="cal" value="*">
       <input type="submit" name="cal" value="%">
       </form>
        <p>Result: ${result}</p>
          <a href="age">Age calculator</a>
    </body>
</html>
