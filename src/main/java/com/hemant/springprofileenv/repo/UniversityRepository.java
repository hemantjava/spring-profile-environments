package com.hemant.springprofileenv.repo;

import com.hemant.springprofileenv.entity.University;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversityRepository extends JpaRepository<University, Long> {
}