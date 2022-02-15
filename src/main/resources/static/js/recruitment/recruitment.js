$(document).ready(function() {
	 $('#skills').multiselect();
	 $('#visaStatus').multiselect();
	 
	 $('#visaStartDate').datepicker({
		    format: "dd/mm/yyyy"
	 });
	 
	 $('#visaEndDate').datepicker({
		    format: "dd/mm/yyyy"
	 });
	 
	 $('#graduationDate').datepicker({
		    format: "dd/mm/yyyy"
	 });
	 
	 $('#followupDate').datepicker({
		    format: "dd/mm/yyyy"
	 });
	 
	 
	 
	 
});




function backToRecruitment(){
	document.recruitmentDto.action = "recruitment?back";
	document.recruitmentDto.target = "_self";
	document.recruitmentDto.submit();
}

function populateModal(indx){
	$("#nameDiv").val($("#name"+indx).val());
}