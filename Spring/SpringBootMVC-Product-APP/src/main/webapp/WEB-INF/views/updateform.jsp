<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>	
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<jsp:include page="menu.jsp" />
	<hr width="50%" />

	<form:form modelAttribute="product" action="updateProduct" method="post">
		<table align="center">

			<tr>
				<td>Id</td>
				<td><form:input path="id" readonly="true"/> </td>
			</tr>
			<tr>
				<td>Name</td>
				<td><form:input path="name"/> </td>
			</tr>

			<tr>
				<td>Price</td>
				<td><form:input path="price"/> </td>
			</tr>

			<tr>
				<td>Description</td>
				<td><form:input path="description"/> </td>
			</tr>

			<tr>
				<th colspan="2">${msg }</th>
			</tr>

			<tr>
				<th colspan="2"><input type="submit" value="Update"></th>
			</tr>



		</table>



	</form:form>

	<hr width="50%" />




</body>
</html>