package com.tarun.JobApp.repo;

import com.tarun.JobApp.model.JobPost;
import com.tarun.JobApp.model.AppliedJob;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {

    // ArrayList to store JobPost objects
    private List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
                    List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")),
            new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React", 3,
                    List.of("HTML", "CSS", "JavaScript", "React")),
            new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
                    List.of("Python", "Machine Learning", "Data Analysis")),
            new JobPost(4, "Network Engineer", "Design and implement computer networks for efficient data communication", 5,
                    List.of("Networking", "Cisco", "Routing", "Switching")),
            new JobPost(5, "Mobile App Developer", "Experience in mobile app development for iOS and Android", 3,
                    List.of("iOS Development", "Android Development", "Mobile App"))
    ));

    // New: ArrayList to store applied jobs
    private List<AppliedJob> appliedJobs = new ArrayList<>();

    // method to return all JobPosts
    public List<JobPost> getAllJobs() {
        return jobs;
    }

    // method to save a job post object
    public void addJob(JobPost job) {
        jobs.add(job);
    }

    // ✅ add new application
    public void addApplication(AppliedJob application) {
        appliedJobs.add(application);
    }

    // ✅ get all applications
    public List<AppliedJob> getAllApplications() {
        return appliedJobs;
    }
}
