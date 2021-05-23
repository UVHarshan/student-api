package com.example.studentapi;

import org.springframework.web.bind.annotation.*;


@RestController
public class StudentController {

    StudentRepository repository = new InMemoryStudentRepository();

    // REST ENDPOINTS

    // Create a student
    @PostMapping("/student")
    public void createStudent(@RequestBody Student student) {

        repository.save(student);
    }

    // Get a student
    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable String id) {
        return repository.get(id);
    }

    // Delete a student
    @DeleteMapping("/student/{id}")
    public void deleteStudent(@PathVariable String id) {
        repository.delete(id);
    }

    @PutMapping("/student")
    public void updateStudent(@RequestBody Student student) {
        repository.update(student);
    }







}
