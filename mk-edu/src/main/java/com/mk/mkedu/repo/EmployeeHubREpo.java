package com.mk.mkedu.repo;

import java.io.Serializable;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mk.mkedu.model.Employee;

@Repository
@Transactional
@Component
public class EmployeeHubREpo
{
    private HibernateTemplate hibernateTemplate;
    
  public EmployeeHubREpo(){
  }
  
  
   public EmployeeHubREpo(HibernateTemplate hibernateTemplate){
        this.hibernateTemplate = hibernateTemplate;
    }
   
    
    public Serializable save(Employee employee){
        return hibernateTemplate.save(employee);
        
    }
}
