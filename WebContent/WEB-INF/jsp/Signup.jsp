<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration</title>
</head>
<body>
        <form:form action="signup" method="post" commandName="signupForm">
        User Name:<form:input path="username" /><br>
        Password:<form:password path="password" /><br>
        E-mail:<form:input path="email" /><br>
        Birthday (mm/dd/yyyy):<form:input path="birthDate" /><br>
        Profession:<form:select path="role" items="${roleList}" /><br>
		<input type="submit" value="Signup" />            
        </form:form>
    </div>
</body>
</html>