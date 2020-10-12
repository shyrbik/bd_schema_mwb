<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<fmt:message key="help_title" var="help_title"/>
<fmt:message key="about_rent_title" var="about_rent_title"/>
<fmt:message key="information_title" var="information_title"/>
<fmt:message key="copyright" var="copyright"/>

<!-- START FOOTER -->
        <footer>
            <div class="container">

                <div class="footer-info clear">
                    <div class="footer-block rowing-left">
                        <h3>${help_title}</h3>
                        <ul>
                            <li><a href="someLink">Some link №1</a></li>
                            <li><a href="someLink">Some link №2</a></li>
                            <li><a href="someLink">Some link №3</a></li>
                            <li><a href="someLink">Some link №4</a></li>
                            <li><a href="someLink">Some link №5</a></li>
                        </ul>
                    </div>

                    <div class="footer-block rowing-left">
                        <h3>${about_rent_title}</h3>
                        <ul>
                            <li><a href="mainController?command=go_to_contact_page">${contacts_title}</a></li>
                            <li><a href="mainController?command=go_to_news">${news_title}</a></li>
                            <li><a href="mainController?command=go_to_rules">${rules_title}</a></li>
                            <li><a href="mainController?command=go_to_stocks">${stocks_title}</a></li>
                        </ul>
                    </div>

                    <div class="footer-block rowing-left">
                        <h3>${information_title}</h3>
                        <ul>
                            <li><a href="someLink">Some info №1</a></li>
                            <li><a href="someLink">Some info №2</a></li>
                            <li><a href="someLink">Some info №3</a></li>
                        </ul>
                    </div>

                    <div class="cards rowing-right">
                        <a href="someLink" target="_blank"><img alt="" src="${pageContext.request.contextPath}/img/cards.png"></a>
                    </div>
                </div>

                <div id="footer-add" class="clear">
                    <div id="social-media" class="rowing-left">
                        <a href="http://facebook.com/" target="_blank"><img alt="" src="${pageContext.request.contextPath}/img/icon-footer-facebook.png"></a>
                        <a href="http://youtube.com/" target="_blank"><img alt="" src="${pageContext.request.contextPath}/img/icon-footer-youtube.png"></a>
                        <a href="http://twitter.com/" target="_blank"><img alt="" src="${pageContext.request.contextPath}/img/icon-footer-twitter.png"></a>
                    </div>
                    <div id="copyright" class="rowing-right">
                        <p>${copyright}: Tsalko Igor +375(33)357-76-60</p>
                    </div>
                </div>

            </div>
        </footer>
    <%--END FOOTER--%>
    </body>
</html>