<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
        <h1>Add New Employee</h1>  
       <form:form method="post" action="save">    
        <table >    
         <tr>    
          <td>Id : </td>   
          <td><form:input path="idd"  /></td>  
         </tr>    
         <tr>    
          <td>First Name :</td>    
          <td><form:input path="ffname" /></td>  
         </tr>    
         <tr>    
          <td>Last Name :</td>    
          <td><form:input path="llname" /></td>  
         </tr>   
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Save" /></td>    
         </tr>    
        </table>    
       </form:form>    