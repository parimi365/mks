package com.mk.mkedu.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.mk.mkedu.bean.EmployeeBean;
import com.mk.mkedu.businessLogic.DosaHubBusinessLogic;
import com.mk.mkedu.model.Employee;
import com.mk.mkedu.model.EmployeeAttendance;
import com.mk.mkedu.repo.DosaEmployeeAttendanceRepository;
import com.mk.mkedu.repo.DosaEmployeeRepository;

@Service("dosaHubEmployeeService")
@ComponentScan(basePackages = "com.mk.mkedu")
public class DosaHubEmployeeService
{
    private static final Logger logger = LogManager.getLogger(DosaHubEmployeeService.class);

    @Autowired
    private DosaEmployeeRepository dosaEmployeeRepository;
   
    @Autowired
    private DosaEmployeeAttendanceRepository dosaEmployeeAttendanceRepository;

    @Autowired
    private DosaHubBusinessLogic businessLogic;

    public DosaHubEmployeeService()
    {
    }

    /* *//**
          * @param studentRepository
          */
    public DosaHubEmployeeService(DosaEmployeeRepository dosaEmployeeRepository, DosaHubBusinessLogic businessLogic,DosaEmployeeAttendanceRepository dosaEmployeeAttendanceRepository)
    {
        this.dosaEmployeeRepository = dosaEmployeeRepository;
        this.businessLogic = businessLogic;
        this.dosaEmployeeAttendanceRepository = dosaEmployeeAttendanceRepository;
    }

    /**
     * it is used to save the all new employee
     * 
     * @param employee
     * @return
     * @throws Exception
     */
    public List<Employee> saveEmployee(EmployeeBean employee) throws Exception
    {
        Employee employee2 = businessLogic.convertToBL(employee);
        List<Employee> employees = new ArrayList<>();
        employees.add(employee2);
        List<Employee> employee1 = (List<Employee>) dosaEmployeeRepository.save(employees);
        if (employee1 == null)
            throw new Exception("No user present with username: ");

        return employee1;
    }
    
    /**
     * it is used to save the all new employee
     * @param listOfemp 
     * 
     * @param employee
     * @return
     * @throws Exception
     */
    public List<EmployeeAttendance> saveEmployeeAttendance(EmployeeAttendance employeeAttendance, List<Employee> listOfemp) throws Exception
    {
       ArrayList<EmployeeAttendance> attendances =  (ArrayList<EmployeeAttendance>) businessLogic.convertTOEmplAttendace(employeeAttendance,listOfemp) ;  
       
        return (List<EmployeeAttendance>) dosaEmployeeAttendanceRepository.save(attendances);
       
    }
    
    /** get the alla the employees from the data base 
     * @return
     */
    public List<Employee> getAllEmployee(){
        logger.info("get the all employees in service");
        return (List<Employee>) dosaEmployeeRepository.findAll();
        
    }

}
