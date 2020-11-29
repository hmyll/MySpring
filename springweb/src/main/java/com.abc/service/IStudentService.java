package com.abc.service;

import com.abc.beans.Student;

import java.util.List;

public interface IStudentService {
    void saveStudent(Student student);
    void removeStudentById(int id);
    void modifyStudent(Student student);
    Student findStudentById(int id);
    List<Student> findAllStudents();
}
