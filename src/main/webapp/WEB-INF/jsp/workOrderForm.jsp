<%--
  Created by IntelliJ IDEA.
  User: ducivmar
  Date: 08.09.2017
  Time: 12:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title><spring:message code="workorder.createNew"/></title>
    <style> .error {
        color: #ff0000;
        font-weight: bold;
    }</style>
</head>
<body>

<form:form method="post" modelAttribute="WorkOrder">
    <%--<form:errors path="*" cssClass="error"/>--%>
    <table>

        <tr>
            <td><spring:message code="workorder.description"/></td>
            <td><form:input path="description"/></td>
            <td><form:errors path="description" cssClass="error"/></td>
        </tr>
        <tr>
            <td><spring:message code="person.name"/></td>
            <td><form:input path="customer.name"/></td>
            <td><form:errors path="customer.name" cssClass="error"/></td>
        </tr>
        <tr>
            <td><spring:message code="person.surName"/></td>
            <td><form:input path="customer.surname"/></td>
            <td><form:errors path="customer.surname" cssClass="error"/></td>
        </tr>

        <tr>
            <td><spring:message code="workorder.dateEntry"/></td>
            <td><form:input path="enterDate"/></td>
            <td><form:errors path="enterDate" cssClass="error"/></td>
        </tr>

        <tr>
            <td colspan="3"><input type="submit" value="<spring:message code="common.save"/> "/>
        </tr>

    </table>

</form:form>

</body>
</html>
