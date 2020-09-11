<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

<%--    <link rel="stylesheet" type="text/css" href="style.css"/>--%>
    <style>
        <%@ include file="style.css" %>
    </style>

<%--    <h1>${count}</h1>--%>

    <title>calculator</title>
</head>
<body>
<p> <h1>${time}</h1> </p>
<form action="/calculator_war/" method="post">
    <table class="cal" border="0">
        <tr class="screen">
            <td colspan = "4"><input type="text" name="text" disabled="true" value="${myText}" style="height: 40px; font-size: 25px; width: 100%; text-align: right; background-color: #C6BDC2; " ></td>
        </tr>
        <tr class="button">
            <td>java</td>
            <td><button name="button" value="C">C</button></td>
            <td><button name="button" value="delete">&#9003;</button></td>
            <td><button name="button" value=" / ">&#247;</button></td>
        </tr>
        <tr class="button">
            <td class="number"><button name="button" value="7">7</button></td>
            <td class="number"><button name="button"  value="8">8</button></td>
            <td class="number"><button name="button" value="9">9</button></td>
            <td><button name="button" value=" * ">*</button></td>
        </tr>
        <tr class="button">
            <td class="number"><button name="button" value="4">4</button></td>
            <td class="number"><button name="button" value="5">5</button></td>
            <td class="number"><button name="button" value="6">6</button></td>
            <td><button name="button" value=" - ">-</button></td>
        </tr>
        <tr class="button">
            <td class="number"><button name="button" value="1">1</button></td>
            <td class="number"><button name="button" value="2">2</button></td>
            <td class="number"><button name="button" value="3">3</button></td>
            <td><button name="button" value=" + ">+</button></td>
        </tr>
        <tr class="button">
            <td><button name="button" value="+/-">+/-</button></td>
            <td class="number"><button name="button" value="0">0</button></td>
            <td><button name="button" value=",">,</button></td>
            <td><button name="button" value="=">=</button></td>
        </tr>

    </table>

</form>

</body>
</html>