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
		<!-- Sidebar -->
		<div class="w3-sidebar w3-light-grey w3-bar-block" style="width: 15%">
			<h3 class="w3-bar-item">
				<spring:message code="sidebar.menu" />
			</h3>
			<a href="/home" 			class="w3-bar-item w3-button"><spring:message code="sidebar.home" /></a> 
			<a href="/create-applicant"	class="w3-bar-item w3-button"><spring:message code="sidebar.create_applicant" /></a>
			<a href="/create-register"	class="w3-bar-item w3-button"><spring:message code="sidebar.register" /></a>
			<a href="/registerList" 	class="w3-bar-item w3-button">applicant LIST</a> 
			<a href="/studentsList"     class="w3-bar-item w3-button">Student LIST</a>

		</div>

	<div style="margin-left: 15%">
		<div class="w3-container w3-teal">
			<h1>Update new Applicant</h1>
		</div>
		<div class="w3-container">
			<form:form method="POST" action="${contextPath}/update-applicant"
				modelAttribute="applicant" var="applicant" items="${currentApplicant}" enctype="multipart/form-data">

				<table>
					<tr>
						<td><form:label path="id">id</form:label></td>
						<td><form:input path="id" />${currentApplicant.id}</td>
					</tr>
					<tr>
						<td><form:label path="first_name">first_name</form:label></td>
						<td><form:input path="first_name" />${currentApplicant.first_name}</td>
					</tr>
					<tr>
						<td><form:label path="second_name">second_name</form:label></td>
						<td><form:input path="second_name" />${currentApplicant.second_name}</td>
					</tr>
					<tr>
						<td><form:label path="last_name">last_name</form:label></td>
						<td><form:input path="last_name" />${currentApplicant.last_name}</td>
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