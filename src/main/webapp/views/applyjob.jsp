<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Apply for a Job</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-5">
    <div class="card shadow-lg p-4 rounded-3">
        <h2 class="text-center text-primary mb-4">Apply for a Job</h2>

        <form action="applyjob" method="post">
            <div class="mb-3">
                <label class="form-label">Job ID</label>
                <input type="number" class="form-control" name="jobId" placeholder="Enter Job ID" required>
            </div>

            <div class="mb-3">
                <label class="form-label">Candidate Name</label>
                <input type="text" class="form-control" name="candidateName" placeholder="Enter your name" required>
            </div>

            <div class="mb-3">
                <label class="form-label">Candidate Email</label>
                <input type="email" class="form-control" name="candidateEmail" placeholder="Enter your email" required>
            </div>

            <button type="submit" class="btn btn-success w-100">Apply</button>
        </form>
    </div>
</div>

</body>
</html>
