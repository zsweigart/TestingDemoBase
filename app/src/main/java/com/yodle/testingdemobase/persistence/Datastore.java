package com.yodle.testingdemobase.persistence;

import com.yodle.testingdemobase.model.Student;

import java.util.Set;

public interface Datastore {
    void persistStudent(Student student);
    Set<Student> getStudents();
}
