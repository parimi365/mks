package com.mk.mkedu.bean;

public class OldStudentBean
{

    private String[] oldStudentSchool;
    private String[] oldStudentClass;
    private String[] percentage;
    private String[] year;
    private String studentId;
    /**
     * @return the oldStudentSchool
     */
    public String[] getOldStudentSchool()
    {
        return oldStudentSchool;
    }
    /**
     * @param oldStudentSchool the oldStudentSchool to set
     */
    public void setOldStudentSchool(String[] oldStudentSchool)
    {
        this.oldStudentSchool = oldStudentSchool;
    }
    /**
     * @return the oldStudentClass
     */
    public String[] getOldStudentClass()
    {
        return oldStudentClass;
    }
    /**
     * @param oldStudentClass the oldStudentClass to set
     */
    public void setOldStudentClass(String[] oldStudentClass)
    {
        this.oldStudentClass = oldStudentClass;
    }
    /**
     * @return the percentage
     */
    public String[] getPercentage()
    {
        return percentage;
    }
    /**
     * @param percentage the percentage to set
     */
    public void setPercentage(String[] percentage)
    {
        this.percentage = percentage;
    }
    /**
     * @return the year
     */
    public String[] getYear()
    {
        return year;
    }
    /**
     * @param year the year to set
     */
    public void setYear(String[] year)
    {
        this.year = year;
    }
    /**
     * @return the studentId
     */
    public String getStudentId()
    {
        return studentId;
    }
    /**
     * @param studentId the studentId to set
     */
    public void setStudentId(String studentId)
    {
        this.studentId = studentId;
    }

}
