$(document).ready(function() {
	$('#recruitmentList').DataTable();
});


function addNewCandidate(){
	document.recruitmentDto.action = "recruitment?add";
	document.recruitmentDto.target = "_self";
	document.recruitmentDto.submit();
}


function editCandidate(id){
	$('#id').val(id);
	
	document.recruitmentDto.action = "recruitment?add";
	document.recruitmentDto.target = "_self";
	document.recruitmentDto.submit();
}


