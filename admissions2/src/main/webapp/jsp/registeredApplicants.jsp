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
</style>

<title><spring:message code="sidebar.home" /></title>
<link href="${contextPath}/resources/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body>
	<div class="container">


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


		<!-- Page Content -->
		<div style="margin-left: 15%">

			<div class="w3-container w3-teal">
				<h1><spring:message code="sidebar.applicants" /></h1>
			</div>
			<a onclick="document.forms['logoutForm'].submit()"><spring:message code="sidebar.logout" /></a>

			<div class="w3-container">

				<div class="w3-container w3-teal"
				style="background-color: #616161 !important">
 					<h2> 
 						<spring:message code="sidebar.applicant_list" /> 
 						<div style="float: right">
							<c:if test="${pageContext.request.userPrincipal.name != null}">
								<form id="logoutForm" method="POST"
									action="${contextPath}/logout">
									<input type="hidden" name="${_csrf.parameterName}"
										value="${_csrf.token}" />
								</form>
								<h4 style="float: right"> <a 
								onclick="document.forms['logoutForm'].submit()"><spring:message
									code="sidebar.logout" /></a></h4>
							</c:if>
						</div>
 					</h2> 
			</div>

				<div class="w3-container">
					<c:if test="${not empty applicants}">
						<c:forEach items="${applicants}" var="currentApplicants">

						<c:if test = "${{currentApplicants.english_score}+${currentApplicants.math_score}+${currentApplicants.history_score}>100}">
							<div class="w3-card-4 w3-dark-grey"
								style="width: 300px; margin: 2%">

								<div class="w3-container w3-center">
									<h3><spring:message code="applicant.applicant" /> ${currentApplicants.id}</h3>
									<img
										src="data:image/jpg;base64,${currentApplicants.encodedImage}"
										alt="Avatar" style="width: 150px" alt="Avatar"
										style="width:150px">
									<h3>${currentApplicants.first_name}
										${currentApplicants.second_name}
										${currentApplicants.last_name}</h3>
									<p><spring:message code="applicant.english_score" />: ${currentApplicants.english_score}</p>
									<p><spring:message code="applicant.math_score" />: ${currentApplicants.math_score}</p>
									<p><spring:message code="applicant.history_score" />: ${currentApplicants.history_score}</p>

									<security:authorize access="hasRole('ROLE_ADMIN')">
										<div class="w3-section">
										 <a href="/update-applicant" class="w3-bar-item w3-button"><spring:message code="applicant.edit" /></a>
<!-- 											<button href="/update-applicant" class="w3-button w3-green">Edit</button> -->
										</div>
									</security:authorize>

								</div>

							</div>
							</c:if>
						</c:forEach>
					</c:if>


				</div>
				<%-- 				<c:if test="${not empty periodicals}"> --%>
				<%-- 					<c:forEach items="${periodicals}" var="currentPeriodical"> --%>

				<!-- 						<div class="w3-card-4" style="width: 20%; margin:2%" > -->
				<!-- 							<img src="https://kaverisias.com/wp-content/uploads/2018/01/catalog-default-img.gif" alt="Norway" style="width: 100%"> -->
				<!-- 							<div class="w3-container w3-center"> -->
				<%-- 								<h3>${currentPeriodical.name}</h3> --%>
				<%-- 								<p>${currentPeriodical.description}</p> --%>
				<%-- 								<p>${currentPeriodical.price}</p> --%>
				<!-- 							</div> -->
				<!-- 							<button class="w3-button w3-block w3-dark-grey">+ add to bucket</button> -->
				<!-- 						</div> -->

				<%-- 					</c:forEach> --%>
				<%-- 				</c:if> --%>


			</div>

		</div>


	</div>
	<!-- /container -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>