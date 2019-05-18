<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Applicant</title>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body>
<h1>Hello</h1>

<div style="margin-left: 10%">
			<div class="w3-container w3-teal">
				<h1>Create new Applicant</h1>
			</div>
			<div class="w3-container">
				<form:form method="POST" action="${contextPath}/create-applicant" modelAttribute="applicant">
					<table>
						<tr>
							<td><form:label path="first_name">first_name</form:label></td>
							<td><form:input path="first_name" /></td>
						</tr>
						<tr>
							<td><form:label path="second_name">second_name</form:label></td>
							<td><form:input path="second_name" /></td>
						</tr>
						<tr>
							<td><form:label path="last_name">last_name</form:label></td>
							<td><form:input path="last_name" /></td>
						</tr>
						<tr>
							<td><form:label path="english_score">english_score</form:label></td>
							<td><form:input path="english_score" /></td>
						</tr>
						<tr>
							<td><form:label path="math_score">math_score</form:label></td>
							<td><form:input path="math_score" /></td>
						</tr>
						<tr>
							<td><form:label path="history_score">history_score</form:label></td>
							<td><form:input path="history_score" /></td>
						</tr>
						<tr>
							<td><input type="submit" value="Submit" /></td>
						</tr>
					</table>
					<input type="hidden" name="${_csrf.parameterName}"
						value="${_csrf.token}" />
				</form:form>


			</div>

		</div>
</body>
</html>