<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">KGS TECH</a>
    </div>
    <ul class="nav navbar-nav">
      <c:forEach items="${sessionScope.departmentDtoList}" var="row">
      <li class="dropdown active"><a class="dropdown-toggle" data-toggle="dropdown" href="#">${row.departmentName} <span class="caret"></span></a>
        <ul class="dropdown-menu">
        	<c:forEach items="${row.menuDtoList}" var="menuRow">
          		<li><a href="${menuRow.menuUrl}">${menuRow.menuName}</a></li>
          	</c:forEach>
        </ul>
      </li>
      </c:forEach>
    </ul>
  </div>
</nav>
