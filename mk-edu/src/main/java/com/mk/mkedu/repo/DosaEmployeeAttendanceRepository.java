package com.mk.mkedu.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mk.mkedu.model.EmployeeAttendance;

@Repository
@Transactional
public interface DosaEmployeeAttendanceRepository<T> extends CrudRepository<EmployeeAttendance, Long>
{
    
    /* (non-Javadoc)
     * @see org.springframework.data.repository.CrudRepository#save(S)
     */
   /* @Override
    public Employee save(Employee employee);
    
    default <S extends Employee> Iterable<S> saveAll(Iterable<S> entities)
    {
        // TODO Auto-generated method stub
        return this.save(entities);
    }
    
    *//**
     * Returns all instances of the type.
     * 
     * @return all entities
     *//*
    @Override
    public Iterable<Employee> findAll();*/
  
}