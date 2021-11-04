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
        <button type="button" class="btn btn-primary btn-sm" data-toggle="modal" data-target="#myModal">
          Login
        </button>
        <div class="modal fade" id="myModal">
          <div class="modal-dialog">
            <div class="modal-content">

              <div class="modal-header">
                <h1 class="h3 mb-3 font-weight-normal">登入輸入表單</h1>
                <button type="button" class="close" data-dismiss="modal">&times;</button>
              </div>

              <div class="modal-body">
                <form class="form-signin" onsubmit="return check();">                     
                  <label for="userName" class="sr-only">Email address</label>
                  <input type="text" id="userName" class="form-control" 
                  placeholder="User Name" required autofocus><br/>
                  <label for="password" class="sr-only">Password</label>
                  <input type="password" id="password" class="form-control" 
                  placeholder="Password" required><br/>
                  <div class="checkbox">
                    <label>
                      <input type="checkbox" value="remember-me"> 記住我的登入
                    </label>
                  </div>
                  <button class="btn  btn-primary btn-block" type="submit">登入</button>  
                </form>             
              </div>

              <div class="modal-footer">

              </div>

            </div>
          </div>
        </div>
      </li>
    </ul>
  </div>
  <div class="row">
    <div class="col-md-4"> 

      <div class="card" style="width:360px;margin-left: 20px;">
        <img class="card-img-top" src="images/img_avatar1.png"  id="img1"  alt="Product Image 1" style="width:90%">
        <div class="card-body">
          <h4 class="card-title"  id="t1">John Doe</h4>
          <p class="card-text" id="d1">Some example text some example text. John Doe is an architect and engineer</p>
          <a href="#" class="btn btn-primary">See Profile</a>
        </div>
      </div>

    </div>
    <div class="col-md-4">   

      <div class="card" style="width:360px;margin-left: 5px; margin-right:5px">
        <img class="card-img-top" src="images/img_avatar1.png" id="img2"  alt="Product Image 2" style="width:90%">
        <div class="card-body">
          <h4 class="card-title"  id="t2">John Doe</h4>
          <p class="card-text"  id="d2">Some example text some example text. John Doe is an architect and engineer</p>
          <a href="#" class="btn btn-primary">See Profile</a>
        </div>
      </div>
    </div>
    <div class="col-md-4">      

      <div class="card" style="width:360px; margin-right:20px">
        <img class="card-img-top" src="images/img_avatar1.png" id="img3"  alt="Product Image 3" style="width:90%">
        <div class="card-body">
          <h4 class="card-title"  id="t3">John Doe</h4>
          <p class="card-text"  id="d3">Some example text some example text. John Doe is an architect and engineer</p>
          <a href="#" class="btn btn-primary">See Profile</a>
        </div>
      </div>
    </div>
  </div>
  <script  type="text/javascript">
    function check()
    {
      $.ajax(
      {
        url: "check", 
        data:{"userName":$("#userName").val(),"password":$("#password").val()},                        
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

    function show(arry){
      $("#img1").attr("src", arry[0].path);
      $("#t1").text(arry[0].productName);
      $("#d1").text(arry[0].description);
      $("#img2").attr("src", arry[1].path);
      $("#t2").text(arry[1].productName);
      $("#d2").text(arry[1].description);
      $("#img3").attr("src", arry[2].path);
      $("#t3").text(arry[2].productName);
      $("#d3").text(arry[2].description);
    }

    function start()
    {
      $.ajax(
      {
        url: "pic",                         
        cache:false ,
        type: "GET",
        dataType: 'json',
        success: function (objArry)
        {
          show(objArry);
        },
        error: function (xhr, ajaxOptions, thrownError)
        {
          alert(xhr.status);
          alert(thrownError);
        }
      });
    }

    $(document).ready(start);
  </script>
</body>
</html>