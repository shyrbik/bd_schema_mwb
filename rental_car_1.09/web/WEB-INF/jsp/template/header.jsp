<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Было бы неплохо предусмотреть свой тайтл и дескрипшен для каждой страницы</title>
    <link rel="stylesheet" media="all" type="text/css" href="${pageContext.request.contextPath}/css/main.css">
    <link href="${pageContext.request.contextPath}/img/favicon.png" rel="icon">

	<meta name="keywords" content="прокат авто в минске, аренда авто в минске" />
	<meta name="description" content="Недорогой прокат автомобилей в Минске. Аренда с водителем и без. Авто всех классов &gt; Качественный сервис &gt; Звоните ☎ +375 (29) 636-17-23" />

    <c:if test="${not empty sessionScope.local}">
        <fmt:setLocale value="${sessionScope.local}"/>
    </c:if>

    <fmt:setBundle basename="appLocalization.app"/>

    <fmt:message key="header.button.ru" var="button_ru"/>
    <fmt:message key="header.button.en" var="button_en"/>

    <fmt:message key="hello" var="hello"/>
    <fmt:message key="log_in_title" var="log_in"/>
    <fmt:message key="log_out_title" var="log_out"/>
    <fmt:message key="registration_title" var="registration"/>

    <fmt:message key="contacts_title" var="contacts_title"/>
    <fmt:message key="catalog_title" var="catalog_title"/>
    <fmt:message key="stocks_title" var="stocks_title"/>
    <fmt:message key="rules_title" var="term_of_rent_h1"/>
    <fmt:message key="news_title" var="news_title"/>
</head>
<body>

<header class="header">
    <div class="container">
        <div class="menu clear">
            <a class="logo rowing-left" href="${pageContext.request.contextPath}">
                <img src="${pageContext.request.contextPath}/img/logo.png" alt="Logo">
            </a>
            <a class="header-menu rowing-right" href="mainController?command=go_to_contact_page">${contacts_title}</a>
            <a class="header-menu rowing-right" href="mainController?command=go_to_carspage">${carspage_title}</a>
            <a class="header-menu rowing-right" href="mainController?command=go_to_rules">${term_of_rent_h1}</a>
        </div>
    </div>
</header>
<%--END HEADER--%>