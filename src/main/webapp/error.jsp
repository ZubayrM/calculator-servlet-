<%--
  Created by IntelliJ IDEA.
  User: zubayr
  Date: 01.09.2020
  Time: 21:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Error</title>
    <style>
        .error_title{
            font-size: 40px;
            color: white;
        }
        b {
            font-size: 30px;
            color: white;
        }
        span{
            color: white;
            font-size: 35px;
            font-family: "Arial Black", serif;
        }
        div{
            position: absolute;
            top: 40px;  left: 40px; right: 40px;

            text-align: center;
            /*width: 600px;*/
            height: 120px;
            background: red;
            padding: 30px;
        }
        i{
            font-size: 15px;
            color: white;
        }

    </style>
</head>
<body>
   <div>
       <b class="error_title"> ТАК ПРИМЕРЫ НЕ РЕШАЮТСЯ </b>
       <br>
       <b> пример: <span> 2 + 2 = </span> </b>
       <a href="calculator.jsp">я больше так не буду</a>
   </div>


</body>
</html>
