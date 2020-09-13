<%--
  Created by IntelliJ IDEA.
  User: amen
  Date: 9/12/20
  Time: 2:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Car form</title>
    <jsp:include page="part_styles.jsp"/>
</head>
<body>
<jsp:include page="part_navigator.jsp"/>

<div class="container">
    <h2>Car form</h2>
    <form action="${pageContext.request.contextPath}/car/form" method="post">
        <div class="row col-12 form-check">
            <input type="text" name="nameValue" id="nameField">
            <label class="form-check-label" for="nameField">Car name:</label>
        </div>
        <div class="row col-12 form-check">
            <input type="text" name="registrationValue" id="registrationField">
            <label class="form-check-label" for="registrationField">Registration number:</label>
        </div>
        <div class="row col-12 form-check">
            <input type="number" step="100" name="mileageValue" id="mileageField">
            <label class="form-check-label" for="mileageField">Mileage:</label>
        </div>
        <div class="row col-12 form-check">
            <input type="number" step="0.1" name="capacityValue" id="capacityField">
            <label class="form-check-label" for="capacityField">Engine capacity:</label>
        </div>
        <div class="row col-12 form-check">
            <input type="text" name="vinValue" id="vinField">
            <label class="form-check-label" for="vinField">Vin:</label>
        </div>
        <div class="row form-check">
            <label class="col-4" for="engineTypeField">Engine type:</label>
            <select class="col-8" id="engineTypeField" name="engineTypeValue">
                <c:forEach items="${requestScope.engine_types}" var="enType">
                    <option value="${enType}">${enType}</option>
                </c:forEach>
            </select>
        </div>
        <button class="form-control btn btn-danger colored-red" type="submit">Submit form</button>
    </form>
</div>

<jsp:include page="part_footer.jsp"/>
</body>
</html>
