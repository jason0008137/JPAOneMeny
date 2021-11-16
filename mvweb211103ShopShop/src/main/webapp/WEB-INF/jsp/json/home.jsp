<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
	<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

	<meta charset="UTF-8">
	<title>Product Use Json</title>
</head>
<body>
	
	<div class="container">
		<div class="row justify-content-center">
			<div class="col-md-6 text-center mb-5">
				<h2 class="heading-section">Product Form</h2>
			</div>
		</div>
		<div class="row justify-content-center">
			<div class="col-md-7 col-lg-5 border">
				<form onsubmit="return false;">
					<div class="form-row">
						<div class="form-group col-md-6">
							<label for="inputId">ID</label> 
							<input type="text" 	class="form-control" id="inputId" placeholder="Id">
						</div>
						<div class="form-group col-md-6">
							<label for="inputName">Product Name</label> <input
							type="text" class="form-control" id="inputName" 	placeholder="Product Name">
						</div>
					</div>
					<div class="form-group">
						<label for="inputPrice">Price</label>
						<input type="text" 	class="form-control" id="inputPrice" placeholder="0.0">
					</div>
					<div class="form-group">
						<label for="inputPhoto">Photo</label> <input type="text"
						class="form-control" id="inputPhoto"
						placeholder="images/p1.jpg">
					</div>
					
					<button type="submit" class="btn btn-info"  onclick="add()" >Add</button>
					<button type="submit" class="btn btn-primary"  onclick="send()">Send</button>
				</form>
			</div>
		</div>
	</div>
	<script>
		var pts=[ ];
		function add(){
			var obj=new Object();
			obj.id=$("#inputId").val();
			obj.name=$("#inputName").val();
			obj.photo=$("#inputPhoto").val();
			obj.price=$("#inputPrice").val();
			pts.push(obj);
			var str=JSON.stringify(obj);
			alert(str);
		}
		function send(){
			var str=JSON.stringify(pts);
			$.ajax({
				url: "pts",                         
				cache:false ,
				contentType:"application/json",
				data: JSON.stringify(pts),
				type: "POST",
				dataType: 'html',
				success: function (msg) {
					alert(msg);
				},
				error: function (xhr, ajaxOptions, thrownError) {
					alert(xhr.status);
					alert(thrownError);
				}
			});
		}
		function start(){
                   //alert('jQuery start');
               }
               $(document).ready(start);
           </script>
       </body>
       </html>