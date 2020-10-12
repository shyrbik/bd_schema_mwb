<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="template/header.jsp"%>

<fmt:message key="form.login" var="form_login"/>
<fmt:message key="form.password" var="form_password"/>
<fmt:message key="login.wrong_data" var="wrong_data"/>
<fmt:message key="incorrect_data" var="incorrect_data"/>
<fmt:message key="login.error" var="login_error"/>
<fmt:message key="login_info" var="registration_info"/>
<fmt:message key="login.registration_link" var="registration_link"/>

<%--START MAIN-CONTENT--%>
<div id="content">
    <div class="container main-content">

        <div class="login-block">
            <h1>${log_in}</h1>
            <div class="login-form">
                <form action="mainController" method="post">
                    <input type="hidden" name="command" value="authorization">
                    <input type="text" pattern="^[a-zA-Z0-9_-]{3,25}$" name="login" placeholder="${form_login}" required>
                    <input type="password" pattern="^[^\s]{6,18}$" name="password" placeholder="${form_password}" required>
                    <button type="submit">${log_in}</button>
                </form>
                <c:if test="${not empty pageContext.request.getParameter(\"message\")}">
                    <c:choose>
                        <c:when test="${pageContext.request.getParameter(\"message\") eq 'wrong_data'}">
                            <p class="error-message">${wrong_data}</p>
                        </c:when>
                        <c:when test="${pageContext.request.getParameter(\"message\") eq 'incorrect_data'}">
                            <p class="error-message">${incorrect_data}</p>
                        </c:when>
                        <c:when test="${pageContext.request.getParameter(\"message\") eq 'login_error'}">
                            <p class="error-message">${login_error}</p>
                        </c:when>
                    </c:choose>
                </c:if>
            </div>
            <div class="info-login-block">
                <p>
                    ${registration_info} <a href="mainController?command=go_to_registration_page">
                    ${registration_link}</a>
                </p>
            </div>
        </div>

    </div>
</div>
<%--END MAIN-CONTENT--%>

<%@include file="template/footer.jsp"%>