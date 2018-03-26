/**
 * 
 */
package com.mk.mkedu.bean;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author karthik.muthyam this is the employee table to store is details and it
 *         is main class to all emloyee related things
 */
public class EmployeeBean
{
    private int employeeId;
    private String employeeName;
    private String employeePhoneNumber;
    private String employeeSalary;
    private MultipartFile aadharCard;
    private String employee_joiningDate;
    private String position;
    private String description;

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
    public MultipartFile getAadharCard()
    {
        return aadharCard;
    }

    /**
     * @param aadharCard
     *            the aadharCard to set
     */
    public void setAadharCard(MultipartFile aadharCard)
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
