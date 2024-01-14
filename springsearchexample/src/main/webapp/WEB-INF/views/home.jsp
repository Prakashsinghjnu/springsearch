<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
    body {
      display: flex;
      align-items: center;
      justify-content: center;
      height: 100vh;
      margin: 0;
    }

    .container {
      text-align: center;
    }
  </style>
</head>
<body>
<form action="userform">
<div class="container">
<input type="text" name="name" placeholder="Enter Your Name">
<button btn btn-ouline-success  name="btn"> Submit</button>
</div>
</form>


</body>
</html>