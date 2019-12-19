<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

   <form action="Dados.jsp" method="post">
   Usuario: <br/><input type="text" name="usuario" /><br/>
   Senha: <br/><input type="password" name="senha" /><br/>
   <input type= "submit" value="Logar" />
   
   </form>
   <%
   		String usuario = request.getParameter("usuario");
   		String senha = request.getParameter("senha");
   		
   		if(usuario!=null && senha!=null && !usuario.isEmpty() && !senha.isEmpty() )
   			session.setAttribute("usuario", usuario);
   			response.sendRedirect("Dados.jsp");
   
   %>
</body>
</html>