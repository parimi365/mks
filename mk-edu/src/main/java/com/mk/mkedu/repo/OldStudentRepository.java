package com.mk.mkedu.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mk.mkedu.model.OldStudent;

@Repository
public interface OldStudentRepository extends JpaRepository<OldStudent, Long>

{
    /* (non-Javadoc)
     * @see org.springframework.data.repository.CrudRepository#save(S)
     */
    @Override
    public OldStudent save(OldStudent student);
    
    
    
 
}