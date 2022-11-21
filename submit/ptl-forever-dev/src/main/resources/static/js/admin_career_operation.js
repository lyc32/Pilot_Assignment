function show_Current_Time()
{
	var today = new Date();
	var year = today.getFullYear();
 	var month = today.getMonth()+1;
 	var day = today.getDate();
 	var hours = today.getHours();
 	var minutes = today.getMinutes();
 	var seconds = today.getSeconds();
 	month  = month<10  ? "0"+month : month;
 	day  = day <10  ? "0"+day : day;
 	hours  = hours<10  ? "0"+hours : hours;
 	minutes = minutes<10 ? "0"+minutes : minutes;
 	seconds = seconds<10 ? "0"+seconds : seconds;
 	var str = year+"-"+month+"-"+day+" "+hours+":"+minutes+":"+seconds; 
 	var obj = document.getElementById("show_Current_Time");
 	obj.innerHTML = str;
 	window.setTimeout("show_Current_Time()",1000);
}

function create_Job() 
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

function edit_Job(jobId)
{
	window.location.href="/admin/jobview?jobId=" + jobId;
}
		
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
}