<%-- 
    Document   : customerList
    Created on : Nov 20, 2016, 7:17:44 AM
    Author     : Prithivi Raj
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Customers List</title>
    <!-- Bootstrap CSS -->
    <%-- <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet"> --%>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <style type="text/css">
        .myrow-container {
            margin: 20px;
        }
    </style>
</head>
<body class=".container-fluid">
<div class="container myrow-container">
    <div class="panel panel-success">
        <div class="panel-heading">
            <h3 class="panel-title">
                <div align="left"><b>Customers List</b> </div>
                <div align="right"><a href="createCustomers">Add New Customers</a></div>
            </h3>
        </div>
        <div class="panel-body">
            <c:if test="${empty customerList}">
                There are no Customers
            </c:if>
            <c:if test="${not empty customerList}">   
            
                <form action="searchCustomer">
                    <div class="row">
                      <div class="col-md-6"><div class="col-md-6">Search Customers:</div><div class="col-md-6"> <input type="text" name="searchName" id="searchName"> </div></div>
                      <div class="col-md-4"><input class="btn btn-success" type='submit' value='Search'/></div>
                    </div>
                </form>             
                                
                <table class="table table-hover table-bordered">
                    <thead style="background-color: #3D7EAA;">
                    <tr>
                        
                        <th>Name</th>
                        <th>Address</th>
                        <th>Phone Number</th>
                        <th>Email</th>
                        <th>Username</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${customerList}" var="c">
                        <tr>
                            <th><c:out value="${c.name}"/></th>
                            <th><c:out value="${c.address}"/></th>
                            <th><c:out value="${c.phone_no}"/></th> 
                            <th><c:out value="${c.email}"/></th>
                            <th><c:out value="${c.username}"/></th>
                            <th><a href="editCustomer?username=<c:out value='${c.username}'/>">Edit</a></th>                         
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </c:if>
        </div>
    </div>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>    
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    
    <%-- <script src="<c:url value="/resources/js/jquery-2.1.3.js"/>"></script>
    <script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
     --%>

</body>
</html>