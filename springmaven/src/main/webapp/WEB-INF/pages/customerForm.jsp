<%-- 
    Document   : customerForm
    Created on : Nov 20, 2016, 7:26:56 AM
    Author     : Prithivi Raj
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="author" content="Ranga Reddy">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Customer Information</title>
    <!-- Bootstrap CSS -->
    <%-- <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet"> --%>    
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <style type="text/css">
        .myrow-container{
            margin: 20px;
        }
    </style>
</head>
<body class=".container-fluid">
    <div class="container myrow-container">
        <div class="panel panel-success">
            <div class="panel-heading">
                <h3 class="panel-title">
                    Customer Details
                </h3>
            </div>
            <div class="panel-body">
                <form:form id="customerRegisterForm" cssClass="form-horizontal" modelAttribute="customer" method="post" action="saveCustomer">
    
                    <div class="form-group">
                        <div class="control-label col-xs-3"> <form:label path="username" >UserName</form:label> </div>
                        <div class="col-xs-6">
                            <form:input cssClass="form-control" path="username" value="${customerObject.username}"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="control-label col-xs-3"><form:label path="name">Name</form:label></div>
                        <div class="col-xs-6">
                            <form:input cssClass="form-control" path="Name" value="${customerObject.name}"/>
                        </div>
                    </div>
    
                    <div class="form-group">
                        <form:label path="address" cssClass="control-label col-xs-3">Address</form:label>
                        <div class="col-xs-6">
                            <form:input cssClass="form-control" path="address" value="${customerObject.address}"/>
                        </div>
                    </div>
    
                    <div class="form-group">
                        <div class="control-label col-xs-3"><form:label path="phone_no">Phone Number</form:label></div>
                        <div class="col-xs-6">
                            <form:input cssClass="form-control" path="phone_no" value="${customerObject.phone_no}"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="control-label col-xs-3"><form:label path="email">Email</form:label></div>
                        <div class="col-xs-6">
                            <form:input cssClass="form-control" path="email" value="${customerObject.email}"/>
                        </div>
                    </div>
    
                    <div class="form-group">
                        <div class="row">
                            <div class="col-xs-4">
                            </div>
                            <div class="col-xs-4">
                                <input type="submit" id="saveCustomer" class="btn btn-primary" value="Save" onclick="true"/>
                            </div>
                            <div class="col-xs-4">
                            </div>
                        </div>
                    </div>
    
                </form:form>
            </div>
        </div>
    </div>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    
    </script>
</body>
</html>