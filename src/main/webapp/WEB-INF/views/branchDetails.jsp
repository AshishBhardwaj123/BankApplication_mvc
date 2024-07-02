<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Branch Details</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        .details-section {
            margin-top: 20px;
        }
        .details-section h2 {
            margin-bottom: 20px;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="text-center details-section">
        <h2>Branch Details</h2>
        <a href="${pageContext.request.contextPath}/branches/showaddbranch" class="btn btn-success mb-3">Add Branch</a>
        <table class="table table-bordered table-striped">
            <thead class="thead-dark">
                <tr>
                    <th>Branch Id</th>
                    <th>Name</th>
                    <th>Address</th>
                    <th>Bank Id</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${branches}" var="branch">
                    <tr>
                        <td>${branch.id}</td>
                        <td>${branch.name}</td>
                        <td>${branch.address}</td>
                        <td>${branch.bankId}</td>
                        <td>
                            <a href="${pageContext.request.contextPath}/branches/updatebranch?branchId=${branch.id}" class="btn btn-warning">Edit</a>
                            <a href="${pageContext.request.contextPath}/branches/delete?branchId=${branch.id}" class="btn btn-danger">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>
