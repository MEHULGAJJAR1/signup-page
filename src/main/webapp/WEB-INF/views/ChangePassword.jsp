<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

  <h1>Change password</h1>
	<form action="updatepassword" method="post">
	
		Email: <input type ="text" name="email"/><br><br>
		
			OTP: <input type ="text" name="otp"/><br><br>
			
			New Password:<input type="password" name="password"/><br><br>
			Conform Password: <input type="submit" value="conformPassword"/><br><br>
			
			<input type="submit" value="update Password"/>
	</form>

</body>
</html>