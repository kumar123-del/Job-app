package com.tarun.JobApp.repo;

import com.tarun.JobApp.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobPostRepo extends JpaRepository<JobPost, Integer> {
    // Spring Data JPA will generate CRUD methods automatically
}
