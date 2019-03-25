<%@ taglib prefix="springform" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>  
        <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <title>Registration</title>
        </head>
        <body>
            <springform:form id="formreg"  modelAttribute="user" action="registerProcess" method="post">
                <table>
                    <tr>
                        <td>
                            <springform:label path="adminID">adminID</springform:label> 
                        
                        <td>
                               <springform:input path="adminID" name="adminID" id="adminID" />
                    </tr>
                    <tr>
                        <td>
                            <springform:label path="firstname">firstname</springform:label>
                        
                        <td>
                            <springform:password path="firstname" name="firstname" id="firstname" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <springform:label path="lastname">lastname</springform:label>
                        
                        <td>
                            <springform:input path="lastname" name="lastname" id="lastname" />
                        
                    </tr>
                    <tr>
                        <td>
                            <springform:label path="age">age</springform:label>
                        
                        <td>
                            <springform:input path="age" name="age" id="age" />
                        
                    </tr>
                    <tr>
                        <td>
                            <springform:label path="DoB">DoB</springform:label>
                        
                        <td>
                            <springform:input path="DoB" name="DoB" id="DoB" />
                        
                    </tr>
                    <tr>
                        <td>
                            <springform:label path="contact">contact</springform:label>
                        
                        <td>
                            <springform:input path="contact" name="contact" id="contact" />
                        
                    </tr>
                    <tr>
                        <td>
                            <springform:label path="altcontact">altcontact</springform:label>
                        
                        <td>
                            <springform:input path="altcontact" name="altcontact" id="altcontact" />
                        
                    </tr>
                    
                    <tr>
                        <td>
                            <springform:label path="emailID">emailID</springform:label>
                        
                        <td>
                            <springform:input path="emailID" name="emailID" id="emailID" />
                        
                    </tr>
                    
                    
                    
                    <tr>
                        
                        <td>
                            <td colspan="2"><input type="submit" value="Register" /></td>
                        
                    </tr>
                    
                    <tr>
                        
                        <td><a href="home.jsp">Home</a>
                        
                    </tr>
                </table>
            </springform:form>
        </body>
        </html>
