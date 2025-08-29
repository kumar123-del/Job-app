package com.tarun.JobApp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "job_posts")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment ID
    private int postId;

    private String postProfile;

    @Column(length = 2000) // allows bigger descriptions
    private String postDesc;

    private Integer reqExperience;

    @ElementCollection(fetch = FetchType.EAGER) // store list of tech stack
    @CollectionTable(
            name = "job_tech_stack",
            joinColumns = @JoinColumn(name = "job_id")
    )
    @Column(name = "tech")
    private List<String> postTechStack;
}
