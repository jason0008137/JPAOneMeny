<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
    <html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="canonical" href="https://getbootstrap.com/docs/4.6/examples/sign-in/">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <link href="signin.css" rel="stylesheet">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="js/bootpag.min.js"></script>        
    </head>
    <body class="text-center">
        <form class="form-signin" onsubmit="return check();">
          <h1 class="h3 mb-3 font-weight-normal">Please sign in</h1>

          <label for="username" class="sr-only">user name</label>
          <input type="text" id="username" class="form-control" placeholder="User name" required autofocus value="123" />

          <label for="pw" class="sr-only">Password</label>
          <input type="password" id="pw" class="form-control" placeholder="Password" required value="123"/>

          <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
        </form>

		<script type="text/javascript">

        function check()
        {
            $.ajax(
            {
                url: "loginCheck", 
                data:{"username":$("#username").val(),"pw":$("#pw").val()},
                cache:false ,
                type: "GET",
                dataType: 'text',
                success: function (msg)
                {
                    alert(msg);
                    parent.document.location.href = "shop"
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
