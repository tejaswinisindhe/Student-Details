<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Details</title>
   <style>
    body
    {
     
      text-align: left;
      color: black;
    } 
    button
    {
        color: pink;
        border: 2px solid black;
    }
   </style>
</head>

<body>
    <h1>Student Application Form</h1>
    <form action="addStud">
       <input type="text" name="id" placeholder="Student Id"> 
       <input type="text" name="sname"   placeholder="Student Name"> 
       <input type="text" name="marks" placeholder="Student Marks"> 
       <input type="text" name="email" placeholder="Student Email"> 
       <button>SUBMIT</button>
    </form>
    <br><br><br>
    
    <h1>Find Student Details By Marks</h1>
       <form action="findStdByMarks">
       <input type="text" name="marks" placeholder="Student marks">
       <button>SUBMIT</button>
    </form>
</body>
</html>