<%@ taglib prefix="joda" uri="http://www.joda.org/joda/time/tags" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title><spring:message code="wellcome.tytle"/></title>
</head>

<body>
<h2><spring:message code="wellcome.header"/></h2>
<spring:message code="wellcome.todayIs"/> <joda:format value="${today}" pattern="yyyy-MM-dd"></joda:format>.

<spring:message code="common.processingTime"/> ${handlingTime} ms.
</body>
</html>