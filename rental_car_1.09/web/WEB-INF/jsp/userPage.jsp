<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="template/header.jsp"%>

<fmt:message key="user.role" var="user_role"/>
<fmt:message key="user.rating" var="user_rating"/>
<fmt:message key="user.orders.title" var="orders_title"/>
<fmt:message key="user.passport_data.title" var="passport_data_title"/>
<fmt:message key="user.cards.title" var="cards_title"/>
<c:set var="user_data" value="${pageContext.request.getParameter(\"user_data\")}"/>

<c:if test="${empty user_data}">
    <c:set var="user_data" value="orders"/>
</c:if>

<%--START MAIN-CONTENT--%>
<div id="content" class="clear">
    <div class="container main-content">

        <c:if test="${empty sessionScope.user}">
            <c:redirect url="mainController?command=go_to_main_page"/>
        </c:if>

        <c:if test="${not empty sessionScope.user}">


                    <div id="user-logo" class="rowing-left">
                        <p>${sessionScope.user.login.charAt(0)}</p>
                    </div>
                    <h3>${hello} ${sessionScope.user.login}</h3>
                    <p>${user_role}: ${sessionScope.user.role}  •  ${user_rating}: ${sessionScope.user.rating}</p>

                <div class="user-data">
                    <div id="user-menu" class="clear">
                        <div class="user-menu-tab rowing-left <c:if test="${user_data eq 'orders'}">selected-user-tab</c:if>">
                            <a href="mainController?command=go_to_user_page&user_data=orders">${orders_title}</a>
                        </div>
                        <div class="user-menu-tab rowing-left <c:if test="${user_data eq 'passport'}">selected-user-tab</c:if>">
                            <a href="mainController?command=go_to_user_page&user_data=passport">${passport_data_title}</a>
                        </div>
                        <div class="user-menu-tab rowing-left <c:if test="${user_data eq 'cards'}">selected-user-tab</c:if>">
                            <a href="mainController?command=go_to_user_page&user_data=cards">${cards_title}</a>
                        </div>
                    </div>
                    <div id="user-menu-content">
                        <c:choose>
                            <c:when test="${user_data eq 'orders'}">
                                <%@include file="orders.jsp"%>
                            </c:when>
                            <c:when test="${user_data eq 'passport'}">
                                <%@include file="passport.jsp"%>
                            </c:when>
                        </c:choose>
                    </div>
                </div>
        </c:if>

    </div>
</div>
<%--END MAIN-CONTENT--%>

<%@include file="template/footer.jsp"%>