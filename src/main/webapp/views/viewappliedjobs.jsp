<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Applied Jobs</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-5">
    <h2 class="text-center text-primary mb-4">Applied Jobs</h2>

    <c:if test="${empty appliedJobs}">
        <div class="alert alert-warning text-center">
            No job applications found.
        </div>
    </c:if>

    <c:if test="${not empty appliedJobs}">
        <table class="table table-bordered table-striped shadow-sm">
            <thead class="table-dark">
                <tr>
                    <th>Job ID</th>
                    <th>Candidate Name</th>
                    <th>Candidate Email</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="app" items="${appliedJobs}">
                    <tr>
                        <td>${app.jobId}</td>
                        <td>${app.candidateName}</td>
                        <td>${app.candidateEmail}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </c:if>
</div>

</body>
</html>
