package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/faculties")
public class FacultyController {

    @Autowired
    private FacultyRepository facultyRepository;

    @PostMapping
    public Faculty createFaculty(@RequestBody Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    @GetMapping("/{id}")
    public Faculty getFaculty(@PathVariable Long id) {
        return facultyRepository.findById(id).orElse(null);
    }

    @GetMapping
    public Iterable<Faculty> getAllFaculties() {
        return facultyRepository.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteFaculty(@PathVariable Long id) {
        facultyRepository.deleteById(id);
    }
}