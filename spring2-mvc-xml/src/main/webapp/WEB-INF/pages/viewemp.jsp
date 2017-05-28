    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

	<h1>University List</h1>
	<table border="2" width="70%" cellpadding="2">
	<tr><th>Code</th><th>Country</th><th>Domain</th><th>Name</th><th>Web URL</th></tr>
    <c:forEach var="emp" items="${list}"> 
    <tr>
    <td>${emp.alpha_two_code}</td>
     <td>${emp.country}</td>
      <td>${emp.domain}</td>
       <td>${emp.name}</td>
        <td>${emp.web_page}</td>
    </tr>
    </c:forEach>
    </table>