package com.api_trabalhe_conosco.repository;

import java.util.UUID;

import com.api_trabalhe_conosco.model.JobModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<JobModel, UUID> {
}
