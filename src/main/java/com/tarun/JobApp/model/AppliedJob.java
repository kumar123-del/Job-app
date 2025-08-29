package com.tarun.JobApp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "applied_jobs")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppliedJob {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment primary key
    private int id;

    private int jobId;  // FK reference to JobPost (optional: can make it @ManyToOne later)

    private String candidateName;

    private String candidateEmail;

    @Override
    public String toString() {
        return "AppliedJob{" +
                "id=" + id +
                ", jobId=" + jobId +
                ", candidateName='" + candidateName + '\'' +
                ", candidateEmail='" + candidateEmail + '\'' +
                '}';
    }
}
