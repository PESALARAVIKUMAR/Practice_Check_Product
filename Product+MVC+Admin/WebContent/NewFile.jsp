<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script>

function myfun()
{
      window.location.href="NewFile.jsp";
      
      }


</script>
</head>
<body>
<form method="get" style="text-align: center;">
<b><i>
Product Id:<br><input type="text" name="id"><br>
Product Name:<br><input type="text" name="name"><br>
Category:<br>
<select name="category">
<option value="Food">Food</option>
<option value="Clothing">Clothing</option>
<option value="Sports">Sports</option>
<option value="Study">Study</option>
<option value="Electronics">Electronics</option>
</select><br>
Description:<br><input type="text" name="desc"><br>
Price:<br><input type="text" name="price"><br>
<br><input type="submit" onclick="A()" value="Submit">
</i></b>
</form><br><br>
<a href="f4.html"><button>HOME PAGE</button></a>
</body>

<% out.println(Integer.parseInt(request.getParameter("id")));%>
<% String str=request.getParameter("name");

out.println(str);
%>

</html>
