<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Index page</title>
    <jsp:include page="part_styles.jsp"/>
</head>
<body>
<jsp:include page="part_navigator.jsp"/>

<div class="container">
    Hello bootstrap world!
    <div class="row">
        <div class="col-6 ">
            Lewa
        </div>
        <div class="col-6">
            Prawa
        </div>
    </div>
</div>

<jsp:include page="part_footer.jsp"/>
</body>
</html>
