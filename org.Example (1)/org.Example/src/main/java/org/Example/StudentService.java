package org.Example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private  StudentRepository studrepo;

    public StudentService(StudentRepository studrepo)
    {
         this.studrepo=studrepo;

    }

    public List<Students> getAllStudents()
    {
        return studrepo.findAll();
    }
    public Students getStudentById(Long  stud_id)
    {
        return studrepo.findById(stud_id).orElse(null);
    }

    public  void addStudent(Students stud)
    {
        studrepo.save(stud);
    }
    public void updateStudent(Students stud)
    {
        studrepo.save(stud);
    }
    public  void deleteStudent(Long id)
    {
        studrepo.deleteById(id);
    }


}

