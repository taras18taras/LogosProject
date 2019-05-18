<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<style>
img {
	border-radius: 50%;
}
  TABLE {
    width: 900px; /* Ширина таблицы */
    border: 1px solid black; /* Рамка вокруг таблицы */
   }
   TD, TH {
    padding: 3px; /* Поля вокруг содержимого ячеек */
   }
   TH {
    text-align: left; /* Выравнивание по левому краю */
    background: black; /* Цвет фона */
    color: white; /* Цвет текста */
   }
</style>

<title><spring:message code="sidebar.home" /></title>
<link href="${contextPath}/resources/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body>
	<div class="container">


		<!-- Sidebar -->
		<div class="w3-sidebar w3-light-grey w3-bar-block" style="width: 10%">
			<h3 class="w3-bar-item"><spring:message code="sidebar.menu" /></h3>
			<a href="/home" class="w3-bar-item w3-button"><spring:message code="sidebar.home" /></a> <a
				href="/create-applicant" class="w3-bar-item w3-button"><spring:message code="sidebar.create_applicant" /></a>
			<a	href="/update-applicant" class="w3-bar-item w3-button"><spring:message code="sidebar.update_applicant" /></a>
			<a	href="/create-register" class="w3-bar-item w3-button"><spring:message code="sidebar.register" /></a>

		</div>


		<!-- Page Content -->
		<div style="margin-left: 10%">

			<div class="w3-container w3-teal">
				<h1><spring:message code="sidebar.applicants" /></h1>
			</div>
			<a onclick="document.forms['logoutForm'].submit()"><spring:message code="sidebar.logout" /></a>

			<div class="w3-container">

				<c:if test="${pageContext.request.userPrincipal.name != null}">
					<form id="logoutForm" method="POST" action="${contextPath}/logout">
						<input type="hidden" name="${_csrf.parameterName}"
							value="${_csrf.token}" />
					</form>
					<h2>Welcome ${pageContext.request.userPrincipal.name} |</h2>
				</c:if>

				<div class="w3-container">
					

				<table class="table table-striped">
					<thead>
						<tr>
							<th><spring:message code="register.student_id" /></th>
							<th><spring:message code="register.english_score" /></th>
							<th><spring:message code="register.math_score" /></th>
							<th><spring:message code="register.history_score" /></th>
							<th>Edit</th>
							<th>Delete</th>
						</tr>
					</thead>
					<tbody>
						<c:if test="${not empty register}">
						<c:forEach items="${register}" var="currentRegister">
							<tr>
								<td>${currentRegister.student_id}</td>
								<td>${currentRegister.english_score}</td>
								<td>${currentRegister.math_score}</td>
								<td>${currentRegister.history_score}</td>
								<td><a href="update?id= ${currentRegister.id}">edit</a></td>
								<td><a href="delete?id= ${currentRegister.id}">delete</a></td>
							</tr>
						</c:forEach>
						</c:if>
					</tbody>
				</table>

<!-- 							<div class="w3-card-4 w3-dark-grey" -->
<!-- 								style="width: 300px; margin: 2%"> -->

<!-- 								<div class="w3-container w3-center"> -->
<%-- 									<h3><spring:message code="register.student_id" /> ${currentRegister.student_id}</h3> --%>
<%-- 									<h3><spring:message code="register.english_score" />: ${currentRegister.english_score}</h3> --%>
<%-- 									<h3><spring:message code="register.math_score" />: ${currentRegister.math_score}</h3> --%>
<%-- 									<h3><spring:message code="register.history_score" />: ${currentRegister.history_score}</h3> --%>
									
<%-- 									<security:authorize access="hasRole('ROLE_ADMIN')"> --%>
<!-- 										<div class="w3-section"> -->
<%-- 										 <a href="/update-applicant" class="w3-bar-item w3-button"><spring:message code="applicant.edit" /></a> --%>
<!-- <!-- 											<button href="/update-applicant" class="w3-button w3-green">Edit</button> --> 
<!-- 										</div> -->
<%-- 									</security:authorize> --%>

<!-- 								</div> -->

<!-- 							</div> -->
<%-- 						</c:forEach> --%>
<%-- 					</c:if> --%>


				</div>
				


			</div>

		</div>


	</div>
	<!-- /container -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>