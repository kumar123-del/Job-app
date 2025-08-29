package com.tarun.JobApp.repo;

import com.tarun.JobApp.model.AppliedJob;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppliedJobRepo extends JpaRepository<AppliedJob, Integer> {
    // Example: find all applications for a given jobId
    // List<AppliedJob> findByJobId(int jobId);
}
