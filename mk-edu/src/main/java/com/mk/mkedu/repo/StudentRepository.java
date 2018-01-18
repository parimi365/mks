package com.mk.mkedu.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mk.mkedu.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long>
{
    /* (non-Javadoc)
     * @see org.springframework.data.repository.CrudRepository#save(S)
     */
    @Override
    public Student save(Student student);
    
 
}