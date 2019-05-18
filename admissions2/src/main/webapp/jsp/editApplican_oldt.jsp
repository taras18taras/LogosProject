<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Applicant</title>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body>
	<div style="margin-left: 10%">
		<div class="w3-container w3-teal">
			<h1>Update new Applicant</h1>
		</div>
		<div class="w3-container">
			<form:form method="POST" action="${contextPath}/update-applicant"
				modelAttribute="applicant" var="applicant" items="${currentApplicant}" enctype="multipart/form-data">

				<table>
					<tr>
						<td><form:label path="id">id</form:label></td>
						<td><form:input path="id" />${currentApplicants.id}</td>
					</tr>
					<tr>
						<td><form:label path="first_name">first_name</form:label></td>
						<td><form:input path="first_name" />${currentApplicants.first_name}</td>
					</tr>
					<tr>
						<td><form:label path="second_name">second_name</form:label></td>
						<td><form:input path="second_name" />${currentApplicants.second_name}</td>
					</tr>
					<tr>
						<td><form:label path="last_name">last_name</form:label></td>
						<td><form:input path="last_name" />${currentApplicants.last_name}</td>
					</tr>
					<tr>
						<td><form:label path="english_score">english_score</form:label></td>
						<td><form:input path="english_score" />${currentApplicants.english_score}</td>
					</tr>
					<tr>
						<td><form:label path="math_score">math_score</form:label></td>
						<td><form:input path="math_score" />${currentApplicants.math_score}</td>
					</tr>
					<tr>
						<td><form:label path="history_score">history_score</form:label></td>
						<td><form:input path="history_score" />${currentApplicants.history_score}</td>
					</tr>

					<tr>
						<td>Select an image to upload</td>
						<td><input type="file" name="image" /></td>
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