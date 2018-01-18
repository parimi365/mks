package com.mk.mkedu.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mk.mkedu.model.RawItems;

@Repository
public interface OrgnaicDosaHubRepository extends CrudRepository<RawItems, Long>
{
    /* (non-Javadoc)
     * @see org.springframework.data.repository.CrudRepository#save(S)
     */
    @Override
    public RawItems save(RawItems student);
    
 
}