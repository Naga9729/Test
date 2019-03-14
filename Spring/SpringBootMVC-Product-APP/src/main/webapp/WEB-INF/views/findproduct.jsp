<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<jsp:include page="menu.jsp" />
	<hr width="50%" />

	<form action="findById" method="post" cellpadding="5" cellspacing="5" method="post">
		<table align="center">

			<tr>
				<td>Id</td>
				<td><input type="text" name="id"></td>
			</tr>

			<tr>
				<th colspan="2">${msg }</th>
			</tr>

			<tr>
				<th colspan="2"><input type="submit" value="Find"></th>
			</tr>



		</table>



	</form>

	<hr width="50%" />

</body>
</html>