<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>

<jsp:include page="common.jsp"></jsp:include>

<script src="js/recruitment/recruitmentList.js"></script>







<style type="text/css">

	.panel {
		margin: 25px;
	}


</style>



<meta charset="ISO-8859-1">
<title>KGS Tech</title>
</head>
<body>

<jsp:include page="menu.jsp"></jsp:include>
  

<form:form action="recruitment" method="post" id="recruitmentDto" name="recruitmentDto" modelAttribute="recruitmentDto" data-toggle="validator">
  		<form:hidden path="id" id="id"/>
<div class="panel panel-primary">
  <div class="panel-heading">Candidate List</div>
  <div class="panel-body">
  		<div style="margin: 10px;"><a href="#" onclick="addNewCandidate()">Add New</a></div>
  			
			  		<table id="recruitmentList" class="table table-striped table-bordered" style="width:100%">
				        <thead>
				            <tr>
				                <th>Name</th>
				                <th>Email</th>
				                <th>Phone</th>
				                <th>Pay Type</th>
				                <th>Current Location</th>
				                <th>Candidate Status</th>
				                <th>Action</th>
				            </tr>
				        </thead>
				        <tbody>
				        	<c:forEach items="${recruitmentDtos}" var="row">
				        	<tr>
				        		<td>${row.name}</td>
				                <td>${row.email}</td>
				                <td>${row.phoneNo}</td>
				                <td>${row.payType}</td>
				                <td>${row.currentLocation}</td>
				                <td>${row.candidateStatus}</td>
				                <th><a href="#" onclick="editCandidate(${row.id})">View Details</a></th>
				        	</tr>
				        	</c:forEach>
				        </tbody>
				        <tfoot>
				            <tr>
				                <th>Name</th>
				                <th>Email</th>
				                <th>Phone</th>
				                <th>Pay Type</th>
				                <th>Current Location</th>
				                <th>Candidate Status</th>
				                <th>Action</th>
				            </tr>
				        </tfoot>
				 	</table>
		<div style="margin: 10px;"><a href="#" onclick="addNewCandidate()">Add New</a></div>
  		
			  	
		
  </div>
</div>


</form:form>





</body>
</html>