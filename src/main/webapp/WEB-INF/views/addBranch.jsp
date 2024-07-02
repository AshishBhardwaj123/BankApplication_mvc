<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Add Branch</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        .form-section {
            margin-top: 20px;
        }
        .form-section h2 {
            margin-bottom: 20px;
        }
        .form-group {
            margin-bottom: 15px;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="text-center form-section">
        <h2>Add Branch</h2>
        <form action="${pageContext.request.contextPath}/branches/save" method="post">
            <div class="form-group">
                <label for="name">Branch Name</label>
                <input type="text" class="form-control" id="name" name="name" required>
            </div>
            <div class="form-group">
                <label for="address">Branch Address</label>
                <input type="text" class="form-control" id="address" name="address" required>
            </div>
            <div class="form-group">
                <label for="bankId">Bank ID</label>
                <input type="text" class="form-control" id="bankId" name="bankId" required>
            </div>
            <button type="submit" class="btn btn-primary">Add Branch</button>
        </form>
        <a href="${pageContext.request.contextPath}/branches/list" class="btn btn-secondary mt-3">Back to Branch List</a>
    </div>
</div>
</body>
</html>
