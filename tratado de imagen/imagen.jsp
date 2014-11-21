<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.io.OutputStream;"%>
    <%@page import="java.sql.Blob;"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!----><%
Blob image = null;
byte[] imgData = null;
image = (Blob)session.getAttribute("IMAGEN");
imgData = image.getBytes(1, (int) image.length());
response.setContentType("image/gif");
OutputStream o = response.getOutputStream();
o.write(imageData);

%>
<script>
var reader = new FileReader();
reader.onloadend = function() {
    var string = reader.result;
    var buffer = Base64.encode(string);
    var data = "data:image/png;base64,"+buffer;

    var image = document.getElementById('image');
    image.src = data;
    return data;
}
</script>
<img title="" src="
<%=o.wite(imageData)%>" />

</body>
</html>