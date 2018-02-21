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
@Table(name = "mks_employee_attendance")
public class EmployeeAttendance implements Serializable
{

    /**
     * default constructor
     */
    public EmployeeAttendance(){
        
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "employee_attendance_id")
    private int employwwAttendanceId;

    @Column(name = "employee_name")
    private String employeeAttName;
    
    @Column(name = "employee_attendance")
    private String isAttend;
    
    @Column(name = "mks_employee_attendance_date")
    private String attandaceDate;
    
    @Column(name = "mks_employee_id_fk")
   private int employee_id_fk;
   
    /*@OneToOne
    @JoinColumn(name = "mks_employee_id")
    private Employee employee;
    *//**
     * @return the employee
     *//*
    public Employee getEmployee()
    {
        return employee;
    }

    *//**
     * @param employee the employee to set
     *//*
    public void setEmployee(Employee employee)
    {
        this.employee = employee;
    }
*/
    /**
     * @return the employee_id_fk
     */
    public int getEmployee_id_fk()
    {
        return employee_id_fk;
    }

    /**
     * @param employee_id_fk the employee_id_fk to set
     */
    public void setEmployee_id_fk(int employee_id_fk)
    {
        this.employee_id_fk = employee_id_fk;
    }

    public String getAttandaceDate()
    {
        return attandaceDate;
    }

    public void setAttandaceDate(String attandaceDate)
    {
        this.attandaceDate = attandaceDate;
    }

   

    public int getEmploywwAttendanceId()
    {
        return employwwAttendanceId;
    }

    public void setEmploywwAttendanceId(int employwwAttendanceId)
    {
        this.employwwAttendanceId = employwwAttendanceId;
    }

   
    public String getEmployeeAttName()
    {
        return employeeAttName;
    }

    public void setEmployeeAttName(String employeeAttName)
    {
        this.employeeAttName = employeeAttName;
    }

    public String getIsAttend()
    {
        return isAttend;
    }

    public void setIsAttend(String isAttend)
    {
        this.isAttend = isAttend;
    }

   
}
