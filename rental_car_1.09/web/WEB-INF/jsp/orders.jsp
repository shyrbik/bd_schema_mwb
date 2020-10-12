<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<table>
    <tr>
        <th>Date</th>
        <th>Status</th>
        <th>Rental start</th>
        <th>Rental end</th>
        <th>Car</th>
        <th>Order price</th>
    </tr>

    <c:forEach items="${requestScope.userOrders}" var="order">
        <tr>
            <td>${order.orderDate}</td>
            <td>${order.orderStatus}</td>
            <td><fmt:formatDate pattern="dd-MM-yyyy HH:mm" value="${order.rentalStart}"/></td>
            <td><fmt:formatDate pattern="dd-MM-yyyy HH:mm" value="${order.rentalEnd}"/></td>
            <td>${order.carBrand} ${order.carModel}</td>
            <td>${order.carPricePerDay}</td>
        </tr>
    </c:forEach>
    
</table>
