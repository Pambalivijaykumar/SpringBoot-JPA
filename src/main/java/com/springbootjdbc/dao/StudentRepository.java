package com.springbootjdbc.dao;

import org.springframework.stereotype.Repository;

import com.springbootjdbc.model.Student;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
