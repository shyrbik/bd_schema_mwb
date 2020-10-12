<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="template/header.jsp"%>

<fmt:message key="form.email" var="email"/>
<fmt:message key="form.phone" var="phone"/>
<fmt:message key="form.login" var="form_login"/>
<fmt:message key="form.password" var="form_password"/>
<fmt:message key="form.register" var="form_register"/>
<fmt:message key="reg.successful" var="reg_successful"/>
<fmt:message key="reg.error" var="reg_error"/>
<fmt:message key="incorrect_data" var="incorrect_data"/>
<fmt:message key="reg_info.text.start" var="info_text_start"/>
<fmt:message key="reg_info.text.link" var="login_page"/>
<fmt:message key="reg_info.text.end" var="info_text_end"/>
<fmt:message key="reg_user_exists" var="reg_user_exists"/>
<fmt:message key="reg.agreement" var="reg_agreement"/>
<fmt:message key="reg.agreement.link" var="reg_agreement_link"/>

<%--START MAIN-CONTENT--%>
<div id="content">
    <div class="container main-content">

        <div class="registration-block">
            <h1>${registration}</h1>
            <div class="registration-form">
                <form action="mainController" method="post">
                    <input type="hidden" name="command" value="registration">
                    <input type="text" pattern="^[a-zA-Z0-9_-]{3,25}$" name="login" placeholder="* ${form_login}" required>
                    <input type="password" pattern="^[^\s]{6,18}$" name="password" placeholder="* ${form_password}" required>
                    <input type="tel" pattern="^[0-9\(\)-+\s]+$" name="phone" placeholder="* ${phone}" required>
                    <input type="email" pattern="^[\w.-_]+@[a-zA-Z_]+?\.[a-zA-Z]{2,6}$" name="email" placeholder="  ${email}">
                    <button type="submit">${form_register}</button>
                </form>
                <c:choose>
                    <c:when test="${pageContext.request.getParameter(\"message\") eq 'successful'}">
                        <h3>${reg_successful}</h3>
                        <p>${info_text_start}
                            <a href="mainController?command=go_to_login_page">${login_page}</a>
                                ${info_text_end}
                        </p>
                    </c:when>
                    <c:when test="${pageContext.request.getParameter(\"message\") eq 'user_already_exists'}">
                        <p class="error-message">${reg_user_exists}</p>
                    </c:when>
                    <c:when test="${pageContext.request.getParameter(\"message\") eq 'error'}">
                        <p class="error-message">${reg_error}</p>
                    </c:when>
                    <c:when test="${pageContext.request.getParameter(\"message\") eq 'incorrect_data'}">
                        <p class="error-message">${incorrect_data}</p>
                    </c:when>
                </c:choose>
            </div>
            <div class="info-registration-block">
                <p>${reg_agreement} <a href="#">${reg_agreement_link}</a></p>
            </div>
        </div>

    </div>
</div>
<%--END MAIN-CONTENT--%>

<%@include file="template/footer.jsp"%>
