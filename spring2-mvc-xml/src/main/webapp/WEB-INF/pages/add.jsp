<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>Spring MVC Form Handling</title>
 </head>
 <body>
  <h2>Add Student Data</h2>
  <form:form method="POST" action="/sdnext/save.html">
      <table>
       <tr>
           <td><form:label path="id">Student ID:</form:label></td>
           <td><form:input path="id" value="${student.studentId}" readonly="true"/></td>
       </tr>
       <tr>
           <td><form:label path="name">Student Name:</form:label></td>
           <td><form:input path="name" value="${student.studentName}"/></td>
       </tr>
       <tr>
           <td><form:label path="age">Course Enrolled:</form:label></td>
           <td><form:input path="age" value="${student.courseEnrolled}"/></td>
       </tr>
       <tr>
           <td><form:label path="salary">University:</form:label></td>
           <td><form:input path="salary" value="${student.university}"/></td>
       </tr>
       
       
          <tr>
         <td colspan="2"><input type="submit" value="Submit"/></td>
        </tr>
   </table> 
  </form:form>
  
  <c:if test="${!empty student}">
  <h2>List Student</h2>
 <table align="left" border="1">
  <tr>
   <th>Student ID</th>
   <th>Student Name</th>
   <th>Student Age</th>
   <th>Student Salary</th>
           <th>Actions on Row</th>
  </tr>

  <c:forEach items="${students}" var="student">
   <tr>
    <td><c:out value="${student.studentId}"/></td>
    <td><c:out value="${student.studentName}"/></td>
    <td><c:out value="${student.courseEnrolled}"/></td>
    <td><c:out value="${student.university}"/></td>
    <td align="center"><a href="edit.html?id=${student.id}">Edit</a> | <a href="delete.html?id=${student.id}">Delete</a></td>
   </tr>
  </c:forEach>
 </table>
</c:if>
 </body>
</html>