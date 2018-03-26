package com.mk.mkedu.businessLogic;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.mk.mkedu.bean.EmployeeBean;
import com.mk.mkedu.model.Employee;
import com.mk.mkedu.model.EmployeeAttendance;

@Component
public class DosaHubBusinessLogic
{

    /**
     * @param employeeBean
     * @return employee
     * @throws IOException
     */
    public Employee convertToBL(EmployeeBean employeeBean) throws IOException
    {
        Employee employee = new Employee();
       String fileName = getAdharCardfile(employeeBean.getAadharCard());
        String joningDate = getJoiningDate();
        employee.setAadharCard(fileName);
        employee.setDescription(employeeBean.getDescription());
        employee.setEmployee_joiningDate(joningDate);
        employee.setEmployeeName(employeeBean.getEmployeeName());
        employee.setEmployeePhoneNumber(employeeBean.getEmployeePhoneNumber());
        employee.setEmployeeSalary(employeeBean.getEmployeeSalary());
        employee.setPosition(employeeBean.getPosition());
        
        return employee;

    }

    private String getJoiningDate()
    {
        // TODO need to get the joining Date Date from Page Level For nextLevel
        return new Date().toString();
    }

    private String getAdharCardfile(MultipartFile multipartFile) throws IOException
    {
        // TODO Auto-generated method stub
        InputStream  inputStream = multipartFile.getInputStream();
        String newFileLocation = "C:\\folderB\\"+multipartFile.getOriginalFilename();
        File newFile = new File(newFileLocation);

      
        FileOutputStream outStream = new FileOutputStream(newFile);

        byte[] buffer = new byte[1024];

        int length;
        // copy the file content in bytes
        while ((length = inputStream.read(buffer)) > 0)
        {

            outStream.write(buffer, 0, length);

        }

        inputStream.close();
        outStream.close();

        // delete the original file
        return newFileLocation;
    }

    public List<EmployeeAttendance> convertTOEmplAttendace(EmployeeAttendance employeeAttendance, List<Employee> listOfemp)
    {
        List<EmployeeAttendance> employeeAttendances = new ArrayList<>();
        String[] empName = employeeAttendance.getEmployeeAttName().split(",");
        String[] isAttend = employeeAttendance.getIsAttend().split(",");
        EmployeeAttendance employeeAttendances1 = null;
        for (int i = 0; i < empName.length; i++)
        {
            employeeAttendances1 = new EmployeeAttendance();
            employeeAttendances1.setEmployeeAttName(empName[i]);
            employeeAttendances1.setIsAttend(isAttend[i]);
            employeeAttendances1.setAttandaceDate(getJoiningDate());
            employeeAttendances1.setEmployee_id_fk(listOfemp.get(i).getEmployeeId());
            employeeAttendances.add(employeeAttendances1);
            
        }
        
        return employeeAttendances;
        // TODO Auto-generated method stub
        
    }
}
