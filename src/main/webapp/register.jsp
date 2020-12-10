<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Employee</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js" integrity="sha384-q2kxQ16AaE6UbzuKqyBE9/u/KzioAlnx2maXQHiDX9d4/zp8Ok3f+M7DPm+Ib6IU" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.min.js" integrity="sha384-pQQkAEnwaBkjpqZ8RU1fF1AKtTcHJwFl3pblpTlHXybJjHpMYo79HY3hIi4NKxyj" crossorigin="anonymous"></script>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Popper JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
<div class = "jumbotron">
<h1><i>Employee Registration:-</i></h1>
</div>
</div>
<div class="container">
<form action="EmployeeSaveController" method="post">
  <div class="mb-2">
    <label for="name" class="form-label">Employee Name</label>
    <input type="text" class="form-control" id="name" name="name" placeholder = "please enter employee name.............." autocomplete="off">
  </div>
    <div class="mb-2">
    <label for="lname" class="form-label">Employee Last Name</label>
    <input type="text" class="form-control" id="lname" name = "lname" autocomplete="off" placeholder = "please enter employee last name............">
  </div>
  <div class="mb-2">
    <label for="exampleInputEmail1" class="form-label">Email address</label>
    <input type="email" class="form-control" id="exampleInputEmail1" name = "email" autocomplete="off" aria-describedby="emailHelp" placeholder = "please enter employee email............">
  </div>
  <div class="mb-2">
    <label for="exampleInputPassword1" class="form-label" autocomplete="off">Password</label>
    <input type="password" class="form-control" name = "pass" id="exampleInputPassword1" placeholder = "please enter employee password............" autocomplete="off">
  </div>
  <h4>Select Employee city:-</h4>
  <select class="browser-default custom-select mb-2" name="city">
  <option value="Ahmedabad" name = "city">Ahmedabad</option>
  <option value="Mumbai" name = "city">Mumbai</option>
  <option value="Pune" name="city">Pune</option>
</select>
  <h3>Gender:</h3>
<div class="form-check">
  <label class="form-check-label">
    <input type="radio" class="form-check-input" name="gender" value="female">Female
  </label>
</div>
<div class="form-check mb-2">
  <label class="form-check-label">
    <input type="radio" class="form-check-input" name="gender" value="male">Male
  </label>
</div>
<div class = "container text-center">
  <button type="submit" class="btn btn-primary">Submit Employee</button>
  </div>
</form>
</div>
</body>
</html>