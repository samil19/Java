<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link href="css/style.css" rel='stylesheet' type='text/css' />
          <link href='http://fonts.googleapis.com/css?family=Open+Sans:600italic,400,300,600,700' rel='stylesheet' type='text/css'>
 </head> 
 <body>
 
    
     <div class="main">
		<div class="login-form">
			<h1>Administrador</h1>
					<div class="head">
						<img src="images/user.png" alt=""/>
			</div>
		<form method="post" action="doLogin">
<input type="text"  class="validate" placeholder="Username" name="userName" value="${user.userName}"  required />
<input type="password"  class="validate" placeholder="Password" name="password" value="${user.password}"  name = "pwd" required />
                   <spam>Remember me</spam>
             <td><input type="checkbox" name="rememberMe" value= "Y" /> 
        <div class="submit">
			<input type="submit"   value="ENTRAR"/>
							
					</div>	
					<p style="color:#f44336;
					font-weight:bold;">${errorString}<br/><a href="#">Olvidó su contraseña ?</a></p>
				</form>
			</div>
			<!--//End-login-form-->
		
		</div>
 

 
 </body>
</html>