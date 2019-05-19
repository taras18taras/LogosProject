<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
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
			<a href="/registerList" 	class="w3-bar-item w3-button"><spring:message code="sidebar.applicant_list" /></a> 
			<a href="/studentsList"     class="w3-bar-item w3-button"><spring:message code="sidebar.student_list" /></a>

		</div>

<div style="margin-left: 15%">
			
			<div class="w3-container w3-teal"
				style="background-color: #616161 !important">
 					<h2> 
 						<spring:message code="register.create" /> 
 						<div style="float: right">
							<c:if test="${pageContext.request.userPrincipal.name != null}">
								<form id="logoutForm" method="POST"
									action="${contextPath}/logout">
									<input type="hidden" name="${_csrf.parameterName}"
										value="${_csrf.token}" />
								</form>
								<h4 style="float: right">  <a 
								onclick="document.forms['logoutForm'].submit()"><spring:message
									code="sidebar.logout" /></a></h4>
							</c:if>
						</div>
 					</h2> 
			</div>
			<div class="w3-container">
				<form:form method="POST" action="${contextPath}/create-register" modelAttribute="register" enctype="multipart/form-data">
				
					<table>
						<tr>
							<td><form:label path="student_id"><spring:message code="register.student_id" /></form:label></td>
							<td><form:input path="student_id" /></td>
						</tr>
						
						
	 						<tr> 
								<td><form:label path="english_score"><spring:message code="register.english_score" /></form:label></td>
								<td><form:input path="english_score" /></td>
	 						</tr> 
	 						<tr> 
								<td><form:label path="math_score"><spring:message code="register.math_score" /></form:label></td>
								<td><form:input path="math_score" /></td>
	 						</tr> 
	 						<tr> 
								<td><form:label path="history_score"><spring:message code="register.history_score" /></form:label></td>
								<td><form:input path="history_score" /></td>
							</tr> 
					
						<tr>
							<td><input type="submit" value="<spring:message code="applicant.submit" />" /></td>
						</tr>
					</table>
					<input type="hidden" name="${_csrf.parameterName}"
						value="${_csrf.token}" />
				</form:form>


			</div>

		</div>
</body>
</html>