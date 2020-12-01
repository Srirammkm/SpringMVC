<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<h1>Employees List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Employee Id</th><th>First Name</th><th>Last Name</th><th>Edit</th><th>Delete</th></tr>  
   <c:forEach var="ss" items="${list}">   
   <tr>  
   <td>${ss.idd}</td>  
   <td>${ss.ffname}</td>  
   <td>${ss.llname}</td>  
   <td><a href="editemp/${ss.idd}">Edit</a></td>  
   <td><a href="deleteemp/${ss.idd}">Delete</a></td>  
  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
  