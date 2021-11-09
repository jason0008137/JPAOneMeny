<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<!-- <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script> -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/bootpag.min.js"></script>
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
<!-- 				<a class="btn btn-outline-primary btn-sm" href="#">Sign up</a>
				<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal">
					Open modal
				</button>

				<a class="btn btn-outline-primary btn-sm" data-toggle="modal" data-target="#myModal" href="#">Sign up</a> -->
				<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal">
					Sign up
				</button>

				<div class="modal fade" id="myModal">
					<div class="modal-dialog">
						<div class="modal-content">

							<!-- Modal Header -->
							<div class="modal-header">
								<h4 class="modal-title">Sign up</h4>
								<button type="button" class="close" data-dismiss="modal">&times;</button>
							</div>

							<!-- Modal body -->
							<div class="modal-body">
								<form class="form-signin" onsubmit="return check();">
									<label for="inputEmail" class="sr-only">User name</label>
									<input type="text" id="name" class="form-control" placeholder="User name" required autofocus><br/>
									<label for="inputPassword" class="sr-only">Password</label>
									<input type="password" id="pw" class="form-control" placeholder="Password" required><br/>
									<div class="checkbox mb-3">
										<label>
											<input type="checkbox" value="remember-me"> Remember me
										</label>
									</div>
									<button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
								</form>
							</div>

						</div>
					</div>
				</div>
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

	<div id="content">Dynamic Content goes here</div>
	<div id="page-selection">Pagination goes here</div>

	<script type="text/javascript">
		$(document).ready(start);

		function start()
		{
			$.ajax(
			{
				url: "pic",
				cache: false,
				type: "GET",
				dataType: 'json',
				success: function (objArray)
				{
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
			var pageAmount = 0;
			if (array.length % 3 == 0)
				pageAmount = array.length / 3;
			else
				pageAmount = array.length / 3 + 1;

			$('#page-selection').bootpag(
			{
				maxVisible: 5,
				total: pageAmount
			}).on("page", function(event, pgAmount)
			{
				display(array, pgAmount);
			});
			display(array, 1);
		}

		function display(array, pgAmount)
		{
			var index = (pgAmount - 1) * 3;
			$("#img1").attr("src",array[index].path);
			$("#img2").attr("src",array[index + 1].path);
			$("#img3").attr("src",array[index + 2].path);
			$("#t1").text(array[index].name);
			$("#t2").text(array[index + 1].name);
			$("#t3").text(array[index + 2].name);
			$("#d1").text(array[index].des);
			$("#d2").text(array[index + 1].des);
			$("#d3").text(array[index + 2].des);
		}


		// //老師的code
		// function show(arry)
		// {   
		// 	var picPage = 0;
		// 	if(arry.length % 3 == 0)
		// 		picPage = arry.length / 3;
		// 	else
		// 		picPage = arry.length / 3 + 1;     
		// 	$('#page-selection').bootpag(
		// 	{
		// 		maxVisible: 5,
		// 		total: picPage
		// 	}).on("page", function(event, pgnum)
		// 	{
		// 		display(arry, pgnum);
		// 	});
		// 	display(arry,1);
		// }
		// function display(arry,num)
		// {
		// 	var index= (num - 1) * 3
		// 	$("#img1").attr("src", arry[index].path);
		// 	$("#img2").attr("src", arry[index + 1].path);
		// 	$("#img3").attr("src", arry[index + 2].path);
		// 	$("#t1").text(arry[index].productName);
		// 	$("#t2").text(arry[index + 1].productName);
		// 	$("#t3").text(arry[index + 2].productName);
		// 	$("#d1").text(arry[index].description);
		// 	$("#d2").text(arry[index + 1].description);
		// 	$("#d3").text(arry[index + 2].description);
		// }


		// function show(array)
		// {
		// 	$("#img1").attr("src",array[0].path);
		// 	$("#img2").attr("src",array[1].path);
		// 	$("#img3").attr("src",array[2].path);
		// 	$("#t1").text(array[0].name);
		// 	$("#t2").text(array[1].name);
		// 	$("#t3").text(array[2].name);
		// 	$("#d1").text(array[0].des);
		// 	$("#d2").text(array[1].des);
		// 	$("#d3").text(array[2].des);
		// }

		function check()
		{

			$.ajax(
			{
				url: "check", 
				data:{"name":$("#name").val(),"pw":$("#pw").val()},
				// data:{"name":"abc","pw":$("#pw").val()},
				cache:false ,
				type: "GET",
				dataType: 'text',
				success: function (msg)
				{
					alert(msg);
					$('#myModal').modal('hide');
				},
				error: function (xhr, ajaxOptions, thrownError)
				{
					alert(xhr.status);
					alert(thrownError);
				}
			});
			return false;
		}
	</script>

<!-- 	<script>
		$('#page-selection').bootpag(
		{
			total: 5
		})
		.on("page", function(event, /* page number here */ num)
		{
			$("#content").html("Insert content"); // some ajax content loading...
		});
	</script> -->
</body>
</html>