<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> <!-- ㄴ> "text/html; charset=UTF-8는 helloservlet에 들어가 있다. 그 이유는, ;  -->
<!DOCTYPE html>
<!-- 231227(wed) -->
<html>
<head>
<meta charset="UTF-8">
<title>Echo message</title>
</head>
<body>
	<h1>JSP forwarding</h1>
	<h1>method: ${requestScope.method}</h1>
	<h1>To: ${param.who}</h1>
	<h1>Message: ${param.message}</h1>

</body>
</html>