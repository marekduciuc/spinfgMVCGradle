<%@taglib prefix="joda" uri="http://www.joda.org/joda/time/tags" %>

<html>
<head>
    <title>Welcome</title>
</head>

<body>
<h2>Welcome Strachota CRM System</h2>
Today is <joda:format value="${today}" pattern="yyyy-MM-dd" ></joda:format>.
</body>
</html>