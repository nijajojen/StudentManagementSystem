<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>

<jsp:include page="common.jsp"></jsp:include>

<script src="js/recruitment/recruitment.js"></script>







<style type="text/css">

	.panel {
		margin: 25px;
	}

.modal-dialog {
  width: 100%;
  height: 80%;
  margin: 0;
  padding: 0;
}

.modal-content {
  height: auto;
  width:auto;
  min-height: 100%;
  border-radius: 0;
}

</style>



<meta charset="ISO-8859-1">
<title>KGS Tech</title>
</head>
<body>

<jsp:include page="menu.jsp"></jsp:include>

<jsp:include page="message.jsp"></jsp:include>
  

<div class="wrapper center-block">
	<div class="panel-group" id="accordion" role="tablist" aria-multiselectable="true">
		
		<div class="panel panel-primary active" role="tab" id="headingOne">
		  <div class="panel-heading">
			  <h4 class="panel-title">
		        <a role="button" data-toggle="collapse" data-parent="#accordion" href="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
		          Recruitment
		        </a>
		      </h4>
		  </div>
		  <div id="collapseOne" class="panel-collapse collapse in" role="tabpanel" aria-labelledby="headingOne">
		  <div class="panel-body">
		  		<form:form action="recruitment" method="post" id="recruitmentDto" name="recruitmentDto" modelAttribute="recruitmentDto" data-toggle="validator">
		  			<form:hidden path="id" id="id"/>
		  		<div class="container-fluid">
			  		<div class="row">
					  	<div class="col-sm-4">
							<div class="form-group">
					            <label for="name">Name</label>
					            <form:input path="name" id="name" cssClass="form-control input-normal" required="true"/>
					            <div class="help-block with-errors"></div>
					        </div>  
						</div>
					  	<div class="col-sm-4">
					  		<div class="form-group">
					            <label for="email">Email</label>
					            <input type="email" name="email" id="email" class="form-control input-normal" required="required" value="${recruitmentDto.email}"/>
					             <div class="help-block with-errors"></div>
					        </div>  
						</div>
					  	<div class="col-sm-4">
					  		<div class="form-group">
					            <label for="altEmail">Alternative Email</label>
					             <input type="email" name="altEmail" id="altEmail" class="form-control input-normal" value="${recruitmentDto.altEmail}"/>
					            <div class="help-block with-errors"></div>
					        </div>  
					  	</div>
					</div>
					
					<div class="row">
					  	<div class="col-sm-4">
							<div class="form-group">
					            <label for="phoneNo">Phone Number</label>
					            <input type="number" name="phoneNo" id="phoneNo" class="form-control input-normal" required="required" maxlength="15" value="${recruitmentDto.phoneNo}"/>
					            <div class="help-block with-errors"></div>
					        </div>  
						</div>
					  	<div class="col-sm-4">
					  		<div class="form-group">
					            <label for="altPhoneNo">Alternative Phno</label>
					            <input type="number" name="altPhoneNo" id="altPhoneNo" class="form-control input-normal" value="${recruitmentDto.altPhoneNo}"/>
					            <div class="help-block with-errors"></div>
					        </div>  
						</div>
					  	<div class="col-sm-4">
					  		<div class="form-group">
					            <label for="skills">Skills</label>
					            <form:select path="skills" id="skills" cssClass="form-control" multiple="true" required="true">
				                    <%-- <form:option value="">Select One</form:option> --%>
				                    <form:options items="${skillMstDtos}" itemLabel="skillName" itemValue="skillName"/>
				                </form:select>
					            <div class="help-block with-errors"></div>
					        </div>  
					  	</div>
					</div>
					
					<div class="row">
					  	<div class="col-sm-4">
							<div class="form-group">
					            <label for="visaStatus">Visa Status</label>
					            <form:select path="visaStatus" id="visaStatus" cssClass="form-control" multiple="true" required="true">
				                    <%-- <form:option value="">Select One</form:option> --%>
				                    <form:options items="${visaMstDtos}" itemLabel="visaName" itemValue="visaName"/>
				                </form:select>
					            <div class="help-block with-errors"></div>
					        </div>  
						</div>
					  	<div class="col-sm-4">
					  		<div class="form-group">
					            <label for="visaStartDate">Visa Start Date</label>
					            <form:input path="visaStartDate" id="visaStartDate" cssClass="form-control input-normal" required="true"/>
					            <div class="help-block with-errors"></div>
					        </div>  
						</div>
					  	<div class="col-sm-4">
					  		<div class="form-group">
					            <label for="visaEndDate">Visa End Date</label>
					            <form:input path="visaEndDate" id="visaEndDate" cssClass="form-control input-normal" required="true"/>
					            <div class="help-block with-errors"></div>
					        </div>  
					  	</div>
					</div>
					
					<div class="row">
					  	<div class="col-sm-4">
							<div class="form-group">
					            <label for="payType">Pay Type</label>
					            <form:select path="payType" id="payType" cssClass="form-control" required="true">
					            	<form:option value="">Select One </form:option>
				                    <form:option value="F">Fix Salary </form:option>
				                    <form:option value="P">Percentage</form:option>
				                </form:select>
					            <div class="help-block with-errors"></div>
					        </div>  
						</div>
					  	<div class="col-sm-4">
					  		<div class="form-group">
					            <label for="payRate">Pay Rate</label>
					            <input type="number" name="payRate" id="payRate" class="form-control input-normal" required="required" value="${recruitmentDto.payRate}"/>
					            
					            <div class="help-block with-errors"></div>
					        </div>  
						</div>
					  	<div class="col-sm-4">
					  		<div class="form-group">
					            <label for="university">University</label>
					            <form:input path="university" id="university" cssClass="form-control input-normal" maxlength="25"/>
					            <div class="help-block with-errors"></div>
					        </div>  
					  	</div>
					</div>
					
					<div class="row">
					  	<div class="col-sm-4">
							<div class="form-group">
					            <label for="graduationDate">Graduation Date</label>
					            <form:input path="graduationDate" id="graduationDate" cssClass="form-control input-normal" />
					            <div class="help-block with-errors"></div>
					        </div>  
						</div>
					  	<div class="col-sm-4">
					  		<div class="form-group">
					            <label for="currentLocation">Current Location</label>
					            <form:input path="currentLocation" id="currentLocation" cssClass="form-control input-normal" required="true"/>
					            <div class="help-block with-errors"></div>
					        </div>  
						</div>
					  	<div class="col-sm-4">
					  		<div class="form-group">
					            <label for="preferedLocation">Prefered Location</label>
					            <form:input path="preferedLocation" id="preferedLocation" cssClass="form-control" data-role="tagsinput" required="true"/>
					            <div class="help-block with-errors"></div>
					        </div>  
					  	</div>
					</div>
					
					<div class="row">
					  	<div class="col-sm-4">
							<div class="form-group">
					            <label for="fees">Fees</label>
					            <input type="number" name="fees" id="fees" class="form-control input-normal" value="${recruitmentDto.fees}"/>
					            <div class="help-block with-errors"></div>
					        </div>  
						</div>
					  	<div class="col-sm-4">
					  		<div class="form-group">
					            <label for="candidateStatus">Candidate Status</label>
					           <form:select path="candidateStatus" id="candidateStatus" cssClass="form-control" required="true">
				                    <form:option value="">Select One</form:option>
				                    <form:options items="${statusMstDtos}" itemLabel="statusName" itemValue="statusName"/>
				                </form:select>
					            <div class="help-block with-errors"></div>
					        </div>  
						</div>
					  	<div class="col-sm-4">
					  		<div class="form-group">
					            <label for="recruitingSource">Recruiting Source</label>
					            <form:select path="recruitingSource" id="recruitingSource" cssClass="form-control">
				                    <form:option value="">Select One</form:option>
				                    <form:options items="${sourceMstDtos}" itemLabel="sourceName" itemValue="sourceName"/>
				                </form:select>
					            <div class="help-block with-errors"></div>
					        </div>  
					  	</div>
					</div>
					
					<div class="row">
					  	<div class="col-sm-4">
							<div class="form-group">
					            <label for="followupRemarks">Followup Remarks</label>
					            <form:input path="followupRemarks" id="followupRemarks" cssClass="form-control input-normal" />
					            <p class="help-block"></p>
					        </div>  
						</div>
					  	<div class="col-sm-4">
					  		<div class="form-group">
					            <label for="followupDate">Followup Date</label>
					           <form:input path="followupDate" id="followupDate" cssClass="form-control input-normal" />
					            <p class="help-block"></p>
					        </div>  
						</div>
					  	<div class="col-sm-4">
					  		
					  	</div>
					</div>
					
					<div class="row">
					  	<div class="col-sm-4">
							<div class="form-group">
					            <input type="submit" name="save" value="Save Details" class="btn btn-primary" onclick="return validateForm()"/>
					            
					            <input type="button" name="back" value="back"  class="btn btn-primary" onclick="backToRecruitment()"/>
					        </div>  
						</div>
					  	
					</div>
				</div>
				</form:form>
		  
		  </div>
		  </div>
		</div>
		
		
		
		<div class="panel panel-primary">
			<div class="panel-heading" role="tab" id="headingTwo">
		      <h4 class="panel-title">
		        <a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion" href="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
		          Recruitment History
		        </a>
		      </h4>
		    </div>
		    <div id="collapseTwo" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingTwo">
		      <div class="panel-body">
		      	<table id="recruitmentList" class="table table-striped table-bordered" style="width:100%">
				        <thead>
				            <tr>
				                <th>Name</th>
				                <th>Email</th>
				                <th>Phone</th>
				                <th>Pay Type</th>
				                <th>Current Location</th>
				                <th>Candidate Status</th>
				                <th>View Details</th>
				                
				            </tr>
				        </thead>
				        <tbody>
				        	<c:forEach items="${recruitmentDto.recruitmentHistoryDtos}" var="row" varStatus="status">
				        	<tr>
				        		<td>${row.name}</td>
				                <td>${row.email}</td>
				                <td>${row.phoneNo}</td>
				                <td>${row.payType}</td>
				                <td>${row.currentLocation}</td>
				                <td>${row.candidateStatus}</td>
				                <td>
				                	<input type="hidden" id="name${status.index}" value="${row.name}" />
				                	<a href="#" data-toggle="modal" data-target="#myModal" onclick="populateModal(${status.index})">View Details</a>
				                </td>
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
				                <th>View Details</th>
				            </tr>
				        </tfoot>
				 	</table>
		      
		      	
		      </div>
		    </div>
		</div>
	
	
	</div>
</div>




<div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Recruitment History</h4>
        </div>
        <div class="modal-body">
          <div class="container-fluid">
			  		<div class="row">
					  	<div class="col-sm-4">
							<div class="form-group">
					            <label for="nameDiv">Name</label>
					            <input type="text" id="nameDiv" class="form-control input-normal" readonly="readonly"/>
					            
					        </div>  
						</div>
					  	<div class="col-sm-4">
					  		<div class="form-group">
					            <label for="emailDiv">Email</label>
					            <input type="email" id="emailDiv" class="form-control input-normal" readonly="readonly"/>
					            
					        </div>  
						</div>
					  	<div class="col-sm-4">
					  		<div class="form-group">
					            <label for="altEmailDiv">Alternative Email</label>
					             <input type="email" id="altEmailDiv" class="form-control input-normal" readonly="readonly"/>
					            
					        </div>  
					  	</div>
					</div>
					
					<div class="row">
					  	<div class="col-sm-4">
							<div class="form-group">
					            <label for="phoneNoDiv">Phone Number</label>
					            <input type="number" id="phoneNoDiv" class="form-control input-normal" readonly="readonly"/>
					        </div>  
						</div>
					  	<div class="col-sm-4">
					  		<div class="form-group">
					            <label for="altPhoneNoDiv">Alternative Phno</label>
					            <input type="number" id="altPhoneNoDiv" class="form-control input-normal" readonly="readonly"/>
					            <div class="help-block with-errors"></div>
					        </div>  
						</div>
					  	<div class="col-sm-4">
					  		<div class="form-group">
					            <label for="skillsDiv">Skills</label>
					            <select id="skillsDiv" class="form-control" multiple="multiple" >
				                    <%-- <form:options items="${skillMstDtos}" itemLabel="skillName" itemValue="skillName"/> --%>
				                </select>
					            <div class="help-block with-errors"></div>
					        </div>  
					  	</div>
					</div>
					
					<div class="row">
					  	<div class="col-sm-4">
							<div class="form-group">
					            <label for="visaStatusDiv">Visa Status</label>
					            <select id="visaStatusDiv" class="form-control" multiple="multiple" >
				                    <%-- <form:options items="${visaMstDtos}" itemLabel="visaName" itemValue="visaName"/> --%>
				                </select>
					            <div class="help-block with-errors"></div>
					        </div>  
						</div>
					  	<div class="col-sm-4">
					  		<div class="form-group">
					            <label for="visaStartDateDiv">Visa Start Date</label>
					            <input id="visaStartDateDiv" class="form-control input-normal" readonly="readonly"/>
					            <div class="help-block with-errors"></div>
					        </div>  
						</div>
					  	<div class="col-sm-4">
					  		<div class="form-group">
					            <label for="visaEndDateDiv">Visa End Date</label>
					            <input id="visaEndDateDiv" class="form-control input-normal" readonly="readonly"/>
					            <div class="help-block with-errors"></div>
					        </div>  
					  	</div>
					</div>
					
					<div class="row">
					  	<div class="col-sm-4">
							<div class="form-group">
					            <label for="payTypeDiv">Pay Type</label>
					            <select id="payTypeDiv" class="form-control">
					            	<option value="">Select One </option>
				                    <option value="F">Fix Salary </option>
				                    <option value="P">Percentage</option>
				                </select>
					            <div class="help-block with-errors"></div>
					        </div>  
						</div>
					  	<div class="col-sm-4">
					  		<div class="form-group">
					            <label for="payRateDiv">Pay Rate</label>
					            <input type="number" id="payRateDiv" class="form-control input-normal" readonly="readonly"/>
					            
					            <div class="help-block with-errors"></div>
					        </div>  
						</div>
					  	<div class="col-sm-4">
					  		<div class="form-group">
					            <label for="universityDiv">University</label>
					            <input id="universityDiv" class="form-control input-normal" maxlength="25" readonly="readonly"/>
					            <div class="help-block with-errors"></div>
					        </div>  
					  	</div>
					</div>
					
					<div class="row">
					  	<div class="col-sm-4">
							<div class="form-group">
					            <label for="graduationDateDiv">Graduation Date</label>
					            <input id="graduationDateDiv" class="form-control input-normal" readonly="readonly" />
					            <div class="help-block with-errors"></div>
					        </div>  
						</div>
					  	<div class="col-sm-4">
					  		<div class="form-group">
					            <label for="currentLocationDiv">Current Location</label>
					            <input id="currentLocationDiv" class="form-control input-normal" readonly="readonly"/>
					            <div class="help-block with-errors"></div>
					        </div>  
						</div>
					  	<div class="col-sm-4">
					  		<div class="form-group">
					            <label for="preferedLocationDiv">Prefered Location</label>
					            <input id="preferedLocationDiv" class="form-control" data-role="tagsinput" readonly="readonly"/>
					            <div class="help-block with-errors"></div>
					        </div>  
					  	</div>
					</div>
					
					<div class="row">
					  	<div class="col-sm-4">
							<div class="form-group">
					            <label for="feesDiv">Fees</label>
					            <input type="number" id="feesDiv" class="form-control input-normal" />
					            <div class="help-block with-errors"></div>
					        </div>  
						</div>
					  	<div class="col-sm-4">
					  		<div class="form-group">
					            <label for="candidateStatusDiv">Candidate Status</label>
					           <select id="candidateStatusDiv" class="form-control" >
				                    <option value="">Select One</option>
				                    <%-- <form:options items="${statusMstDtos}" itemLabel="statusName" itemValue="statusName"/> --%>
				                </select>
					            <div class="help-block with-errors"></div>
					        </div>  
						</div>
					  	<div class="col-sm-4">
					  		<div class="form-group">
					            <label for="recruitingSourceDiv">Recruiting Source</label>
					            <select id="recruitingSourceDiv" class="form-control">
				                    <option value="">Select One</option>
				                    <%-- <form:options items="${sourceMstDtos}" itemLabel="sourceName" itemValue="sourceName"/> --%>
				                </select>
					            <div class="help-block with-errors"></div>
					        </div>  
					  	</div>
					</div>
					
					<div class="row">
					  	<div class="col-sm-4">
							<div class="form-group">
					            <label for="followupRemarksDiv">Followup Remarks</label>
					            <input id="followupRemarksDiv" class="form-control input-normal" />
					            <p class="help-block"></p>
					        </div>  
						</div>
					  	<div class="col-sm-4">
					  		<div class="form-group">
					            <label for="followupDateDiv">Followup Date</label>
					           <input id="followupDateDiv" class="form-control input-normal" />
					            <p class="help-block"></p>
					        </div>  
						</div>
					  	<div class="col-sm-4">
					  		
					  	</div>
					</div>
					
					
				</div>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
 </div>



</body>
</html>