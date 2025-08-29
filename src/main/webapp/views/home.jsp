<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Tarun Job Portal</title>

    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
            crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="style.css">
    <link rel="stylesheet" type="text/css" href="style1.css">
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light bg-warning">
    <div class="container">
        <a class="navbar-brand fs-1 fw-medium" href="#">Tarun Job Portal Web App</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item">
                    <a class="nav-link" href="home">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="viewalljobs">All Jobs</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="applyjob">Apply Job</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="viewappliedjobs">Applied Jobs</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="https://tarun.com/">Contact</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<div class="container mt-5">
    <div class="row g-4">
        <!-- Card 1 -->
        <div class="col-md-6">
            <div class="card shadow">
                <div class="card-body text-center">
                    <a href="/viewalljobs" class="btn btn-primary w-100">View All Jobs</a>
                </div>
            </div>
        </div>

        <!-- Card 2 -->
        <div class="col-md-6">
            <div class="card shadow">
                <div class="card-body text-center">
                    <a href="/addjob" class="btn btn-success w-100">Add Job</a>
                </div>
            </div>
        </div>

        <!-- Card 3 -->
        <div class="col-md-6">
            <div class="card shadow">
                <div class="card-body text-center">
                    <a href="/applyjob" class="btn btn-warning w-100">Apply for a Job</a>
                </div>
            </div>
        </div>

        <!-- Card 4 -->
        <div class="col-md-6">
            <div class="card shadow">
                <div class="card-body text-center">
                    <a href="/viewappliedjobs" class="btn btn-info w-100">View Applied Jobs</a>
                </div>
            </div>
        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
        crossorigin="anonymous"></script>
</body>
</html>
