<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-15
  Time: 오전 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>FileUpload</title>
</head>
<body>


    <h1>과제 제출 3</h1>

    <%--    method="POST" enctype="multipart/form-data" <- 필수로 넣어줘야함. 안그럼 파일업로드 안됨--%>
    <form action="/report/submit3" method="POST" enctype="multipart/form-data">

        학번 : <input type="text" name="snum"><br>
        이름 : <input type="text" name="sname"><br>
        파일 : <input type="file" name="report"><br>
        <input type="submit">

    </form>

    <hr>




    <h1>과제 제출 2</h1>

    <%--    method="POST" enctype="multipart/form-data" <- 필수로 넣어줘야함. 안그럼 파일업로드 안됨--%>
    <form action="/report/submit2" method="POST" enctype="multipart/form-data">

        학번 : <input type="text" name="snum"><br>
        이름 : <input type="text" name="sname"><br>
        파일 : <input type="file" name="report"><br>
        <input type="submit">

    </form>

<hr>

    <h1>과제 제출 1</h1>

    <%--    method="POST" enctype="multipart/form-data" <- 필수로 넣어줘야함. 안그럼 파일업로드 안됨--%>
    <form action="/report/submit1" method="POST" enctype="multipart/form-data">

        학번 : <input type="text" name="snum"><br>
        이름 : <input type="text" name="sname"><br>
        파일 : <input type="file" name="report"><br>
        <input type="submit">


    </form>



</body>
</html>
