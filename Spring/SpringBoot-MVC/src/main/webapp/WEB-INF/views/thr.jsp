<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to thr.jsp file</h1>
	<h1>Hello dear ${uname}</h1>

<h1>Test</h1>
<c:forEach  items="${myCities}" var="cityName">
	<h2> ${cityName }</h2>
</c:forEach>

<c:forEach var="i" begin="1" end="5" step="1">
	<h2>9 X ${i} = ${9*i}</h2>
</c:forEach>

<%

  for(int i=1;i<=10;i++){
	  out.println("<h2> 5 X "+i+"= "+(5*i)+"</h2>");
  }
%>
	<table border=1>
		<tr>
			<th>Product Id</th>
			<th>Name</th>
			<th>Price</th>
			<th>Descriptin</th>
		</tr>

		<tr>
			<td>${product.id }</td>
			<td>${product.name }</td>
			<td>${product.price}</td>
			<td>${product.description }</td>
		</tr>

	</table>


</body>









</html>