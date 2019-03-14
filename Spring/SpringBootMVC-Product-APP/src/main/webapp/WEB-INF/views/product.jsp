<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	
	<jsp:include page="menu.jsp"/> <hr/>
	<table border=1  align="center">
		<tr>
			<th>Product Id</th>
			<th>Name</th>
			<th>Price</th>
			<th>Description</th>
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