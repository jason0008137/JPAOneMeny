<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/bootpag.min.js"></script>
</head>
<body>
	<div class="container">
		<ul class="nav nav-pills justify-content-end">
			<li class="nav-item">
				<a class="p-2 text-dark" href="cart">cart</a>
			</li>
			<li class="nav-item">
				<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal">
					Sign up
				</button>
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
					<p class="card-text" id="p1">price</p>
					<a href="${pageContext.request.contextPath }/cart/buy/${product.id}" class="btn btn-primary">See Profile</a>
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
					<p class="card-text" id="p2">price</p>
					<a href="${pageContext.request.contextPath }/cart/buy/${product.id}" class="btn btn-primary">See Profile</a>
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
					<p class="card-text" id="p3">price</p>
					<a href="${pageContext.request.contextPath }/cart/buy/${product.id}" class="btn btn-primary">See Profile</a>
				</div>
			</div>
		</div>
	</div>



	<div id="content">Dynamic Content goes here</div>
	<div id="page-selection">Pagination goes here</div>



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

	<script type="text/javascript">
		$(document).ready(start);

		function start()
		{
			// $.ajax(
			// {
			// 	url: "showPInfo",
			// 	cache: false,
			// 	type: "GET",
			// 	dataType: 'json',
			// 	success: function (objArray)
			// 	{
			// 		alert("OK");
			// 		show(objArray);
			// 	},
			// 	error: function (xhr, ajaxOptions, thrownError)
			// 	{
			// 		alert("shit.");
			// 		alert(xhr.status);
			// 		alert(thrownError);
			// 	}
			// });
			
			$.ajax(
			{
				url: "showPInfo",
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
			// $("#img1").attr("src",array[index].imagepath);
			// $("#img2").attr("src",array[index + 1].imagepath);
			// $("#img3").attr("src",array[index + 2].imagepath);
			$("#img1").attr("src",array[index].path);
			$("#img2").attr("src",array[index + 1].path);
			$("#img3").attr("src",array[index + 2].path);
			$("#t1").text(array[index].name);
			$("#t2").text(array[index + 1].name);
			$("#t3").text(array[index + 2].name);
			$("#d1").text(array[index].des);
			$("#d2").text(array[index + 1].des);
			$("#d3").text(array[index + 2].des);
			// $("#p1").text(array[index].price);
			// $("#p2").text(array[index + 1].price);
			// $("#p3").text(array[index + 2].price);
		}

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

</body>
</html>