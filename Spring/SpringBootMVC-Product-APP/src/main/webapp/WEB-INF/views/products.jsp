<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1 align="center">Products</h1>
	<hr />
	<jsp:include page="menu.jsp" />

	<table align="center" cellpadding="5" cellspacing="5" border=1>

		<tr>
			<th>Product ID</th>
			<th>Name</th>
			<th>Price</th>
			<th>Description</th>
			<th>Option1</th>
			<th>Option2</th>
		</tr>

		<c:forEach items="${myProds}" var="product">
			<tr>
				
				<td><a href="findById?id=${product.id}">${product.id}</a> </td>
				<td>${product.name}</td>
				<td>${product.price}</td>
				<td>${product.description}</td>
				<td><a href="loadUpdateForm?id=${product.id}">Edit</a>
				<td><a href="removeProduct?id=${product.id}">Remove</a>

			</tr>

		</c:forEach>





	</table>


</body>
</html>