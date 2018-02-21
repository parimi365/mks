/**
 * 
 */
package com.mk.mkedu.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author karthik.muthyam this is the employee table to store is details and it
 *         is main class to all emloyee related things
 */
@Entity
@Table(name = "mks_employee")
public class Employee implements Serializable
{

    /**
     * default constructor
     */
    public Employee(){
        
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "mks_employee_id")
    private int employeeId;

    @Column(name = "mks_employee_name")
    private String employeeName;

    @Column(name = "mks_employee_phone_number")
    private String employeePhoneNumber;

    @Column(name = "mks_employee_salary")
    private String employeeSalary;

    @Column(name = "mks_employee_aadhar")
    private String aadharCard;

    @Column(name = "mks_employee_joining_date")
    private String employee_joiningDate;

    @Column(name = "mks_employee_position")
    private String position;
    
    @Column(name = "mks_employee_discrption")
    private String description;
   
  /*  @OneToOne( fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL, mappedBy = "mks_employee")
    private EmployeeAttendance attendance;
    
    
    public EmployeeAttendance getAttendance()
    {
        return attendance;
    }

    public void setAttendance(EmployeeAttendance attendance)
    {
        this.attendance = attendance;
    }*/

    /**
     * @return the position
     */
    public String getPosition()
    {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(String position)
    {
        this.position = position;
    }

    /**
     * @return the description
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description)
    {
        this.description = description;
    }

    /**
     * @return the employeeId
     */
    public int getEmployeeId()
    {
        return employeeId;
    }

    /**
     * @param employeeId
     *            the employeeId to set
     */
    public void setEmployeeId(int employeeId)
    {
        this.employeeId = employeeId;
    }

    /**
     * @return the employeeName
     */
    public String getEmployeeName()
    {
        return employeeName;
    }

    /**
     * @param employeeName
     *            the employeeName to set
     */
    public void setEmployeeName(String employeeName)
    {
        this.employeeName = employeeName;
    }

    /**
     * @return the employeePhoneNumber
     */
    public String getEmployeePhoneNumber()
    {
        return employeePhoneNumber;
    }

    /**
     * @param employeePhoneNumber
     *            the employeePhoneNumber to set
     */
    public void setEmployeePhoneNumber(String employeePhoneNumber)
    {
        this.employeePhoneNumber = employeePhoneNumber;
    }

    /**
     * @return the employeeSalary
     */
    public String getEmployeeSalary()
    {
        return employeeSalary;
    }

    /**
     * @param employeeSalary
     *            the employeeSalary to set
     */
    public void setEmployeeSalary(String employeeSalary)
    {
        this.employeeSalary = employeeSalary;
    }

    /**
     * @return the aadharCard
     */
    public String getAadharCard()
    {
        return aadharCard;
    }

    /**
     * @param aadharCard
     *            the aadharCard to set
     */
    public void setAadharCard(String aadharCard)
    {
        this.aadharCard = aadharCard;
    }

    /**
     * @return the employee_joiningDate
     */
    public String getEmployee_joiningDate()
    {
        return employee_joiningDate;
    }

    /**
     * @param employee_joiningDate
     *            the employee_joiningDate to set
     */
    public void setEmployee_joiningDate(String employee_joiningDate)
    {
        this.employee_joiningDate = employee_joiningDate;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeePhoneNumber="
                + employeePhoneNumber + ", employeeSalary=" + employeeSalary + ", aadharCard=" + aadharCard
                + ", employee_joiningDate=" + employee_joiningDate + "]";
    }

    

}
