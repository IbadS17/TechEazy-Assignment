package com.TechEazy.service.impl;

import com.TechEazy.model.Student;
import com.TechEazy.model.Subject;
import com.TechEazy.repo.StudentRepo;
import com.TechEazy.repo.SubjectRepo;
import com.TechEazy.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private SubjectRepo subjectRepo;
    @Autowired
    private StudentRepo studentRepo;

    @Override
    public Subject addSubjecttoStudent(String name) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (!(authentication instanceof AnonymousAuthenticationToken)) {
            Student s = studentRepo.findByEmail(authentication.getName());
           Optional<Subject> ss= subjectRepo.findByName(name);
           if(ss.isPresent()){

               s.getSubjects().add(ss.get());
               ss.get().getStudents().add(s);
               studentRepo.save(s);

               return ss.get();
           }

        }
        return null;

    }

    @Override
    public Subject addSubject(Subject subject) {
        Optional<Subject> subject1 = subjectRepo.findByName(subject.getName());
        if(subject1.isPresent()) {
            return null;
        }
        return subjectRepo.save(subject);
    }
}
