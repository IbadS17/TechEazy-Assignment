package com.TechEazy.repo;

import com.TechEazy.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepo extends JpaRepository<Subject, Integer> {


    Subject findByName(String name);
}
