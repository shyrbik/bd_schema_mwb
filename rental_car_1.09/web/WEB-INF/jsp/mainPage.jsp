<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="template/header.jsp"%>

<fmt:message key="form.search_title" var="search"/>
<fmt:message key="searching_form_title" var="form_title"/>
<fmt:message key="pick_up_date" var="pick_up_date"/>
<fmt:message key="pick_up_time" var="pick_up_time"/>
<fmt:message key="drop_off_date" var="drop_off_date"/>
<fmt:message key="drop_off_time" var="drop_off_time"/>

<%--START MAIN-CONTENT--%>
<div id="content">
    <div class="container main-content">

        <div class="main">

            <div class="searching-form boxShadow clear">
                <form class="" action="someAction" method="post">
                    <div class="field">
                        <p id="searching-form-title">${form_title}</p>
                    </div>
                    <div class="field rowing-left">
                        <p>${pick_up_date}</p>
                        <input type="date">
                    </div>
                    <div class="field rowing-right">
                        <p>${pick_up_time}</p>
                        <input type="time" value="11:00" min="08:00" max="22:00">
                    </div>
                    <div class="field rowing-left">
                        <p>${drop_off_date}</p>
                        <input type="date">
                    </div>
                    <div class="field rowing-right">
                        <p>${drop_off_time}</p>
                        <input type="time" value="11:00" min="08:00" max="22:00">
                    </div>
                    <div class="field rowing-right">
                        <button type="submit">${search}</button>
                    </div>
                </form>
            </div>

            <div class="main-text">
                <p>Крутой, рекламный текст!</p>
            </div>
            <div class="main-image">
                <img src="${pageContext.request.contextPath}/img/car_rental.jpg" alt="">
            </div>
        </div>

        <div class="features">
            <div class="feature">
                <div class="feature-title">
                    <h2>Аренда от одного дня</h2>
                </div>
                <div class="feature-info">
                    <p>Стоимость аренды от 45 руб/сутки. Нужен только паспорт и водительские права. Выдача авто в течении 15 минут!</p>
                </div>
                <a href="someLink">узнай больше..</a>
            </div>

            <div class="feature">
                <div class="feature-title">
                    <h2>Автокаско на все!</h2>
                </div>
                <div class="feature-info">
                    <p>Страховка все покроет! Полное автокаско на любые виды повреждений. С нами - вам не о чем беспокоиться!</p>
                </div>
                <a href="someLink">узнай больше..</a>
            </div>

            <div class="feature">
                <div class="feature-title">
                    <h2>Детское кресло - Бесплатно!</h2>
                </div>
                <div class="feature-info">
                    <p>Если вам нужно перевезти ребенка, мы выдадим вам автокресло абсолютно бессплатно!</p>
                </div>
                <a href="someLink">узнай больше..</a>
            </div>
        </div>
    </div>
</div>
<%--END MAIN-CONTENT--%>
<%@include file="template/footer.jsp"%>
