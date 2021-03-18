<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">

<title>AddCollege</title>
<script>
var subjectObject = {
  "Engineering": {
    "B.E cs": [" "],
    "B.E ECE": [" "],
    "B.E Mech": [" "] ,
    "B.E Civil":[" " ]
  },
  "Arts": {
    "B.sc comp": [" "],
    "B.sc Maths": [" "],
    "B.sc chem" :[" " ]
  },
  "Medical": {
    "MBBS": [" "],
    "BDS": [" "],
    "BHMS" :[" " ],
    "BPT":[" "]
  }
}
window.onload = function() {
  var subjectSel = document.getElementById("category");
  var topicSel = document.getElementById("course");
  for (var x in subjectObject) {
    subjectSel.options[subjectSel.options.length] = new Option(x, x);
  }
  subjectSel.onchange = function() {
    topicSel.length = 1;
    for (var y in subjectObject[this.value]) {
      topicSel.options[topicSel.options.length] = new Option(y, y);
    }
  }
}
</script>
</head>
<body style="background-color:lightblue;">


<div class="container">
<div class="d-flex justify-content-center">
	<form action="storecollege" >
	<h2>Add College</h2><br>
	<table>
	<tr>
		<td>Id: </td>
		<td><input type="text" name="id" />
	</tr>
	<tr>
		<td>Name: </td>
		<td><input type="text" name="name" />
	</tr>
	<tr>
		<td>category: </td>
		<td><select name="category" id="category">
    <option value="" selected="selected">Select category</option>
  </select></td>
	</tr>
	<tr>
		<td>course: </td>
		<td> <select multiple name="course" id="course">
    <option value="" selected="selected">Select course</option>
  </select></td>
	</tr>
	<tr>
		<td>location: </td>
		<td><input type="text" name="location" /></td>
	</tr>
	<tr>
		<td>Ratings: </td>
		<td><input type="text" name="rating" />
	</tr>
	<tr>
		<td colspan="2"><button type="submit" name="submit" class="btn btn-primary">Add</button>
		</td>
	</tr>
	</table>
	<br><br>
	<a href="/">Click here to return  Home</a>
	
	</form>
</div>


</div>
</body>
</html>