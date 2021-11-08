<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<ul class="nav nav-pills justify-content-end">
			<li class="nav-item">
				<a class="p-2 text-dark" href="#">Features</a>
			</li>
			<li class="nav-item">
				<a class="p-2 text-dark" href="#">Enterprise</a>
			</li>
			<li class="nav-item">
				<a class="p-2 text-dark" href="#">Support</a>
			</li>
			<li class="nav-item">
				<a class="p-2 text-dark" href="#">Pricing</a>  
			</li>
			<li class="nav-item">
				<a class="btn btn-outline-primary btn-sm" href="#">Sign up</a>
			</li>
		</ul>
	</div>

	<div class="row">


		<div class="col-md-4">
			<h2>Card Image</h2>

			<div class="card" style="width:360px;margin-left: 20px;">
				<img class="card-img-top" src="images/img_avatar1.png" id="img1" alt="Card image" style="width:90%">
				<div class="card-body">
					<h4 class="card-title" id="t1">John Doe</h4>
					<p class="card-text" id="d1">Some example text some example text. John Doe is an architect and engineer</p>
					<a href="#" class="btn btn-primary">See Profile</a>
				</div>
			</div>
		</div>


		<div class="col-md-4">
			<h2>Card Image</h2>

			<div class="card" style="width:360px;margin-left: 5px; margin-right:5px">
				<img class="card-img-top" src="images/img_avatar1.png" id="img2" alt="Card image" style="width:90%">
				<div class="card-body">
					<h4 class="card-title" id="t2">John Doe</h4>
					<p class="card-text" id="d2">Some example text some example text. John Doe is an architect and engineer</p>
					<a href="#" class="btn btn-primary">See Profile</a>
				</div>
			</div>
		</div>


		<div class="col-md-4">
			<h2>Card Image</h2>

			<div class="card" style="width:360px; margin-right:20px">
				<img class="card-img-top" src="images/img_avatar1.png" id="img3" alt="Card image" style="width:90%">
				<div class="card-body">
					<h4 class="card-title" id="t3">John Doe</h4>
					<p class="card-text" id="d3">Some example text some example text. John Doe is an architect and engineer</p>
					<a href="#" class="btn btn-primary">See Profile</a>
				</div>
			</div>
		</div>


	</div>


	<script type="text/javascript">
		$(document).ready(start);

		function start()
		{
			alert("AAAAYYY");
			$.ajax(
			{
				url: "pic",
				cache: false,
				type: "GET",
				dataType: 'json',
				success: function (objArray)
				{
					alert("AAAAYYY");
					show(objArray);
				},
				error: function (xhr, ajaxOptions, thrownError)
				{
					alert(xhr.status);
					alert(thrownError);
				}
			});
		}

		function show(array)
		{
			$("#img1").attr("src",array[0].path);
			$("#img2").attr("src",array[1].path);
			$("#img3").attr("src",array[2].path);
			$("#t1").text(array[0].name);
			$("#t2").text(array[1].name);
			$("#t3").text(array[2].name);
			$("#d1").text(array[0].des);
			$("#d2").text(array[1].des);
			$("#d3").text(array[2].des);
		}
	</script>


	<!-- <script type="text/javascript">
		$(document).ready(start);

		function start()
		{
			alert("AAAA");
			$.ajax(
			{
				url: "pic",                         
				cache:false ,
				type: "GET",
				dataType: 'json',
				success: function (objArry)
				{
					alert("AAAA");
					show(objArry);
				},
				error: function (xhr, ajaxOptions, thrownError)
				{
					alert(xhr.status);
					alert(thrownError);
				}
			});
		}

		function show(arry)
		{
			$("#img1").attr("src",arry[0].path);
			$("#img2").attr("src",arry[1].path);
			$("#img3").attr("src",arry[2].path);
			$("#t1").text(arry[0].name);
			$("#t2").text(arry[1].name);
			$("#t3").text(arry[2].name);
			$("#d1").text(arry[0].des);
			$("#d2").text(arry[1].des);
			$("#d3").text(arry[2].des);
		}

		// function check()
		// {
		// 	$.ajax(
		// 	{
		// 		url: "check", 
		// 		data:{"userName":$("#userName").val(),"password":$("#password").val()},                        
		// 		cache:false ,
		// 		type: "GET",
		// 		dataType: 'text',
		// 		success: function (msg)
		// 		{
		// 			alert(msg);
		// 			$('#myModal').modal('hide');
		// 		},
		// 		error: function (xhr, ajaxOptions, thrownError)
		// 		{
		// 			alert(xhr.status);
		// 			alert(thrownError);
		// 		}
		// 	});
		// 	return false;
		// }
	</script> -->
</body>
</html>