<%--
  Created by IntelliJ IDEA.
  User: ducivmar
  Date: 08.09.2017
  Time: 7:46
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="joda" uri="http://www.joda.org/joda/time/tags" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><spring:message code="workorder.query.tytle"/></title>
</head>
<body>
<form method="post">
    <spring:message code="person.name"/>:
    <input type="text" name="customerName" value="${customerName}"/>
    <input type="submit" value="Query"/>
</form>

<%--private String description;--%>
<%--private Person customer;--%>
<%--private OrderType orderType;--%>
<%--private DateTime enterDate;--%>
<%--private DateTime finishDate;--%>


<table border="1">
    <tr>
        <th><spring:message code="workorder.description"/></th>
        <th><spring:message code="person.name"/></th>
        <th><spring:message code="person.surName"/></th>
        <th><spring:message code="workorder.orderType"/></th>
        <th><spring:message code="workorder.dateEntry"/></th>
    </tr>
    <c:forEach items="${workorders}" var="workOrder">
        <tr>
            <td>${workOrder.description}</td>
            <td>${workOrder.customer.name}</td>
            <td>${workOrder.customer.surname}</td>
            <td>${workOrder.orderType.name}</td>
            <td><joda:format value="${workOrder.enterDate}" pattern="yyyy-MM-dd"></joda:format></td>
        </tr>
    </c:forEach>
</table>


</body>
</html>
