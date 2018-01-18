/**
 * 
 */
package com.mk.mkedu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author karthik.muthyam
 *
 */
@Entity
@Table(name = "mks_old_student")
public class OldStudent
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "old_student_id")
    private String oldStudentId;

    @Column(name = "old_student_school")
    private String oldStudentSchool;

    @Column(name = "old_student_class")
    private String oldStudentClass;

    @Column(name = "old_student_percentage")
    private String percentage;

    @Column(name = "old_student_year")
    private String year;

    @Column(name = "student_id")
    private String studentId;
    
    @ManyToOne
    @JoinColumn(name = "stundent_id")
    private Student student;


    /**
     * @return the studentId
     */
    public String getStudentId()
    {
        return studentId;
    }

    /**
     * @param studentId
     *            the studentId to set
     */
    public void setStudentId(String studentId)
    {
        this.studentId = studentId;
    }
   
    /**
     * @return the student
     */
   
    public Student getStudent()
    {
        return student;
    }

    /**
     * @param student
     *            the student to set
     */
    public void setStudent(Student student)
    {
        this.student = student;
    }

    /**
     * @return the oldStudentId
     */

    public String getOldStudentId()
    {
        return oldStudentId;
    }

    /**
     * @param oldStudentId
     *            the oldStudentId to set
     */
    public void setOldStudentId(String oldStudentId)
    {
        this.oldStudentId = oldStudentId;
    }

    /**
     * @return the oldStudentSchool
     */
    public String getOldStudentSchool()
    {
        return oldStudentSchool;
    }

    /**
     * @param oldStudentSchool
     *            the oldStudentSchool to set
     */
    public void setOldStudentSchool(String oldStudentSchool)
    {
        this.oldStudentSchool = oldStudentSchool;
    }

    /**
     * @return the oldStudentClass
     */
    public String getOldStudentClass()
    {
        return oldStudentClass;
    }

    /**
     * @param oldStudentClass
     *            the oldStudentClass to set
     */
    public void setOldStudentClass(String oldStudentClass)
    {
        this.oldStudentClass = oldStudentClass;
    }

    /**
     * @return the percentage
     */
    public String getPercentage()
    {
        return percentage;
    }

    /**
     * @param percentage
     *            the percentage to set
     */
    public void setPercentage(String percentage)
    {
        this.percentage = percentage;
    }

    /**
     * @return the year
     */
    public String getYear()
    {
        return year;
    }

    /**
     * @param year
     *            the year to set
     */
    public void setYear(String year)
    {
        this.year = year;
    }

}
