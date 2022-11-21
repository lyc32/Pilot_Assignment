/*
function create() 
{
	var date = new Date();
	var jobId = "JD-"+date.getFullYear()+date.getMonth()
	var title = $("#title").val();
	var location = $("#location").val();
	var field  = $("#field").val();
	var postStartDate = $("#postStartDate").val();
	var postEndDate = $("#postEndDate").val();
	var status = $("#status").val();
	var description = $("#description").val();
	var qualifications = $("#qualifications").val();
	var requirements = $("#requirements").val().split(';');
	
		$.ajax({
			type : 'POST',
			contentType : 'application/json; charset=utf-8',
			datatype : 'text',
			url : '/admin/create_job',
			data :  JSON.stringify({'jobId':jobId, 'title':title, 'location': location, 'field': field, 'postStartDate': postStartDate, 'postEndDate':postEndDate, 'status':status, 'description':description, 'qualifications':qualifications, 'requirements':requirements}),
			success: function(result) 
			{
				if(result == 0)
				{
					alert("successful post a new job");
					window.location.href="/admin/career";
				}
				else
				{
					alert("error code: " + result);
				}
			},
			error: function(errMsg) 
			{
				alert("Http Request Error");
			}
		});
}

function update_Job() 
{
	var jobId = $("#jobId").val();
	var title = $("#title").val();
	var location = $("#location").val();
	var field  = $("#field").val();
	var postStartDate = $("#postStartDate").val();
	var postEndDate = $("#postEndDate").val();
	var status = $("#status").val();
	var description = $("#description").val();
	var qualifications = $("#qualifications").val();
	var requirements = $("#requirements").val().split(';');
	var author = "admin";
	
		$.ajax({
			type : 'POST',
			contentType : 'application/json; charset=utf-8',
			datatype : 'text',
			url : '/admin/update_job',
			data :  JSON.stringify({'jobId':jobId,'title':title, 'location': location, 'field': field, 'postStartDate': postStartDate, 'postEndDate':postEndDate, 'status':status, 'description':description, 'qualifications':qualifications, 'requirements':requirements, 'author': author}),
			success: function(result) 
			{
				if(result == 0)
				{
					alert("successful post a new job");
					window.location.href="/admin/career";
				}
				else
				{
					alert("error code: " + result);
				}
			},
			error: function(errMsg) 
			{
				alert("Http Request Error");
			}
		});
}
*/
function objectView(url, id)
{
	window.location.href= url + id;
}
/*		
function delete_Job(jobId) 
{
	var author = "admin";
	$.ajax({
		 type: "POST",
		 contentType : 'application/json; charset=utf-8',
		 dataType : 'html',
		 url: "/admin/delete_job",
		 data: JSON.stringify({'author':author,'jobId':jobId}),
		 success: function(result) 
		 {
			if(result == 0)
			{
				alert("successful delete");
				window.location.href="/admin/career";
				
			}
			else
			{
				alert("error code: " + result);
			}
		 },
		 error: function(errMsg) 
		 {
			alert("Http Request Error");
		 }
	});
}*/