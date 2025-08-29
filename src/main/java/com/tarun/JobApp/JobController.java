package com.tarun.JobApp;

import com.tarun.JobApp.model.JobPost;
import com.tarun.JobApp.model.AppliedJob;
import com.tarun.JobApp.service.JobService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;
import java.util.List;

@Controller
public class JobController {

    private static final Logger logger = LoggerFactory.getLogger(JobController.class);

    @Autowired
    private JobService service;

    // Home page mapping
    @GetMapping({"/", "/home"})
    public String home() {
        return "home";
    }

    // Show add job form
    @GetMapping("/addjob")
    public String addJob() {
        return "addjob";
    }

    // Handle submitted job form
    @PostMapping("/handleForm")
    public String handleForm(@ModelAttribute JobPost jobpost) {
        if (service == null) {
            logger.error("JobService is null! Cannot add job.");
            return "error"; // You should have an error.jsp page
        }

        logger.info("Adding job post: {}", jobpost);
        service.addJob(jobpost);
        return "success"; // You should have a success.jsp page
    }

    // View all job posts
    @GetMapping("/viewalljobs")
    public String viewJobs(Model m) {
        if (service == null) {
            logger.error("JobService is null! Cannot fetch jobs.");
            m.addAttribute("jobPosts", Collections.emptyList());
            return "viewalljobs";
        }

        List<JobPost> jobs = service.getAllJobs();

        if (jobs == null) {
            logger.warn("getAllJobs() returned null. Setting empty list.");
            jobs = Collections.emptyList();
        }

        logger.info("Fetched {} job posts", jobs.size());
        m.addAttribute("jobPosts", jobs);
        return "viewalljobs";
    }

    // Show all applied jobs
    @GetMapping("/viewappliedjobs")
    public String viewAppliedJobs(Model m) {
        if (service == null) {
            logger.error("JobService is null! Cannot fetch applied jobs.");
            m.addAttribute("appliedJobs", Collections.emptyList());
            return "viewappliedjobs";
        }

        List<AppliedJob> appliedJobs = service.getAllAppliedJobs();

        if (appliedJobs == null) {
            logger.warn("getAllAppliedJobs() returned null. Setting empty list.");
            appliedJobs = Collections.emptyList();
        }

        logger.info("Fetched {} applied jobs", appliedJobs.size());
        m.addAttribute("appliedJobs", appliedJobs);
        return "viewappliedjobs";
    }

    // Show apply job form (GET)
    @GetMapping("/applyjob")
    public String showApplyJobForm() {
        return "applyjob"; // loads applyjob.jsp
    }

    // Handle submitted apply job form (POST)
    @PostMapping("/applyjob")
    public String applyJob(@ModelAttribute AppliedJob application) {
        if (service == null) {
            logger.error("JobService is null! Cannot apply job.");
            return "error";
        }

        logger.info("Applying for job: {}", application);
        service.applyJob(application);
        return "success"; // redirect to success.jsp
    }
}
