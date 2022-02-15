<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<c:if test="${not empty successMsg }">

<div class="alert alert-success">
  <strong>Success!</strong> ${successMsg}
</div>

</c:if>


<c:if test="${not empty errorMsg }">

<div class="alert alert-danger">
  <strong>Danger!</strong> ${errorMsg}
</div>

</c:if>