<!doctype html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">
  <link href="https://getbootstrap.com/docs/5.2/assets/css/docs.css" rel="stylesheet">
  <%@ page contentType="text/html;charset=UTF-8" language="java" %>
  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
  <title>Search Page</title>
  <style>
  header h1 {
    font-size: 70px;
    font-weight: 600;
    background-image: linear-gradient(to bottom right, #553c9a, #b393d3);
    color: transparent;
    background-clip: text;
    -webkit-background-clip: text;
  }
  .button {
  background-color: white;
  border: 2px solid rgb(10, 10, 62);
  color: black;
  padding: 8px 26px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 3px 1px;
  cursor: pointer;
  -webkit-transition-duration: 0.4s; /* Safari */
  transition-duration: 0.4s;
}
.button:hover {
  background-color: rgb(10, 10, 62);
  color: white;
  box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24),0 17px 50px 0 rgba(0,0,0,0.19);
}
  </style>  
  
</head>

<body class="p-3 m-0 border-0 bd-example">

  <header>
    <h1>Search Patient Details</h1>
</header>

  <form name="search" method="POST" action="/search">
  <div class="input-group mb-3">
    
    <select  name="choice" class="input-group-text" id="inputGroup-sizing-default">
      <option><a class="dropdown-item" value="patient_id" >PATIENT ID</a></option>
      <option><a class="dropdown-item" value="firstname">FIRST NAME</a></option>
      <option><a class="dropdown-item" value="lastname">LAST NAME</a></option>
    </select>
    <input name="pk" type="text" class="form-control" aria-label="Sizing example input"
      aria-describedby="inputGroup-sizing-default" pattern="^[A-Za-z0-9\s\.]{1,100}$" >
    <button class="btn btn-outline-success"  type="submit">Search</button>  
  </div>
</form>
<div class="user_box error" style="text-align:center;border:0px;color:red;">
  ${error}
</div>
<div class="user_box error" style="text-align:center;display:'${ error_display_patient_id }';border:0px;color:red;">
  ${ error_patient_id }
</div>

<div class="user_box error" style="text-align:center;display:'${ error_display_firstname }';border:0px;color:red;">
  ${ error_firstname }
</div>
<div class="user_box error" style="text-align:center;display:'${ error_display_lastname }';border:0px;color:red;">
  ${ error_lastname }
</div> 
<hr>
<form name="alldata" action="/alldata" method="post">
    <button class="button" type="submit" >Show All Data</button>
    <button class="button" onclick="location.href='/hidedata'" type="button" >Hide All Data</button>
</form>
<hr>
<table class="table">
  <thead class="table-dark">
    <tr>
      <th scope="col">Patient ID</th>
      <th scope="col">First Name</th>
      <th scope="col">Last Name</th>
      <th scope="col">Gender</th>
      <th scope="col">Aadhaar UID</th>
      <th scope="col">Contact No.</th>
      <th scope="col">D.O.B.</th>
      <th scope="col">Pincode</th>
      <th scope="col">Score</th>
      <th scope="col">Screening</th>
    </tr>
  </thead>
  <tbody>
  
    <c:forEach items="${records}" var="row">
    <tr>
      
      <td scope="col">${ row.getPatient_id() }</td>
      <td scope="col">${ row.getFirstname() }</td>
      <td scope="col">${ row.getLastname() }</td>
      <td scope="col">${ row.getGender() }</td>
      <td scope="col">${ row.getAadhaar() }</td>
      <td scope="col">${ row.getPhone() }</td>
      <td scope="col">${ row.getBirthday() }</td>
      <td scope="col">${ row.getPincode() }</td>
      <td scope="col">${ row.getScore() }</td>
      <td scope="col">${ row.getScreening() }</td>

    </tr>
    </c:forEach>
  </tbody>
</table>
  
<button class="btn btn-outline-success" onclick="location.href='/index'">Home</button>


</body>

</html>