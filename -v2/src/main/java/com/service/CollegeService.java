package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.College;
import com.repository.CollegeRepository;

@Service
public class CollegeService {
    @Autowired
    private CollegeRepository collegeRepository;

    public List<College> getAllColleges() {
        return collegeRepository.findAll();
    }

    public College saveCollege(College college) {
        return collegeRepository.save(college);
    }

    // Additional methods as needed
}
