package com.mk.mkedu.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mk.mkedu.bean.EmployeeBean;
import com.mk.mkedu.model.Employee;
import com.mk.mkedu.model.EmployeeAttendance;
import com.mk.mkedu.service.DosaHubEmployeeService;

@Controller
public class DosaHubEmployeeController
{

    private static final Logger logger = LogManager.getLogger(DosaHubEmployeeController.class);

    @Autowired
    private DosaHubEmployeeService dosaHubEmployeeService;

    /**
     * it is used to display the dosa employee page
     * 
     * @return
     */
    @RequestMapping(value = "/dosaemployee")
    private ModelAndView employeeDisplay()
    {
        logger.info("dosa employee are displayed");
        return new ModelAndView("dosaemployee");
    }
    
    
    /**
     * it is used to display the dosa employee page
     * 
     * @return
     */
    @RequestMapping(value = "/dosaemployeeAttendance")
    private ModelAndView employeeAttendanceDispaly()
    {
        logger.info("dosa employee attendance are displayed");
        List<Employee> listOfemp =  dosaHubEmployeeService.getAllEmployee();
        //model.addAttribute("listEmployee", listOfemp);
        return new ModelAndView("dosaemployeeattendace","listEmployee", listOfemp);
    }

    /**
     * this method is used to save the dosa employee
     * 
     * @param employee
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/dosaemployeeSave")
    private String saveEmployee(@ModelAttribute("employee") EmployeeBean employee, ModelMap model) throws Exception
    {
        List<Employee> employees = new ArrayList<>();
        logger.info("dosa employee name:-" + employee.getEmployeeId());
        System.out.println("aadhar card:-"+employee.getAadharCard().getInputStream());
        List<Employee> employee2 = dosaHubEmployeeService.saveEmployee(employee);
        model.addAttribute("listOfEmployee", employee2);
       
       logger.info("siz of employee list --"+ employee2.size());
        return "dosaemployee";

    }
    @RequestMapping(value = "/dosaemployeeAttandaceSave")
    private String saveEmpAttendace(@ModelAttribute("employeeAttendance") EmployeeAttendance employeeAttendance, ModelMap model) throws Exception{
        List<Employee> listOfemp =  dosaHubEmployeeService.getAllEmployee();
        dosaHubEmployeeService.saveEmployeeAttendance(employeeAttendance,listOfemp);
      
      // model.addAttribute("listEmployee", listOfemp);
        return "dosaemployeeattendace";
        
    }
    
}
