<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script>
var req;
function A()
{
var category=document.f1.category.value;
var url="DisplayDetails?category="+category;
if(window.XMLHttpRequest) req=new XMLHttpRequest();
else if(window.ActiveXObject) req=new ActiveXObject("Microsoft.XMLHTTP");
try
{
req.onreadystatechange=function()
{
if(req.readyState==4)
{
var val=req.responseText;
document.getElementById("id1").innerHTML=val;
}
}
req.open("POST",url,true);
req.send(null);
}
catch(e) {	alert("Unable to connect Server");}
}
</script>
</head>
<body style="background-color: #ccc;">
<form name="f1" style="text-align: center;">
<br>Enter Category:<br>
<br><select name="category">
<option value="Food">Food</option>
<option value="Clothing">Clothing</option>
<option value="Sports">Sports</option>
<option value="Study">Study</option>
<option value="Electronics">Electronics</option>
</select><br>
<br><input type="button" onclick="A()" value="Submit">
<input type="reset" value="Reset">
</form>
<span id="id1"></span>

<br><a href="f4.html"><button>HOME PAGE</button></a>
</body>
</html>