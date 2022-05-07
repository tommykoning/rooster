package org.acme.schooltimetabling.persistence;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import org.acme.schooltimetabling.domain.Teacher;

public interface TeacherRepository extends PagingAndSortingRepository<Teacher, Long> {

    @Override
    List<Teacher> findAll();

}
