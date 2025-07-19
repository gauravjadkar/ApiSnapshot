package org.Example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentRestController {
    @Autowired
     private final StudentService studentservice;

    public StudentRestController(StudentService studentservice)
    {
        this.studentservice=studentservice;
    }

    @GetMapping
    public List<Students> listStudent()
    {
        return studentservice.getAllStudents();
    }

    @PostMapping("/register")
    public Students saveStudent(@RequestBody Students student) {
        studentservice.addStudent(student);
        return student;
    }

    @GetMapping("/{student_id}")
    public Students  getStudentById(@PathVariable("student_id") Long id ) {
        Students student=studentservice.getStudentById(id);
        if(student!=null) {
            System.out.println("Student : "+student);
            return student;
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Student not Found");
    }

    @PutMapping("/update/{student_id}")
    public Students updateEmp(@PathVariable("student_id") Long student_id,@RequestBody Students student) {
        Students studentexist=studentservice.getStudentById(student_id);
        if(studentexist!=null) {
            studentexist.setFirst_name(student.getFirst_name());
            studentexist.setLast_name(student.getLast_name());
            studentexist.setAddress(student.getAddress());
            studentexist.setCity(student.getCity());
            studentexist.setCourse(student.getCourse());
            studentexist.setEmail(student.getEmail());
            studentexist.setDate_of_birth(student.getDate_of_birth());
            studentexist.setEnrollment_date(student.getEnrollment_date());
            studentexist.setGender(student.getGender());
            studentexist.setPhone(student.getPhone());
            studentexist.setState(student.getState());
            studentexist.setPincode(student.getPincode());


            studentservice.updateStudent(studentexist);
            return studentexist;
        }
        return null;
    }


    @DeleteMapping("/delete/{student_id}")
    public String deletestudent(@PathVariable("student_id") Long id) {
        studentservice.deleteStudent(id);
        return id+" Student Deleted Sucessfully";
    }



}
