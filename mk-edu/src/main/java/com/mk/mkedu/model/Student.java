/**
 * MK-EDU-17
 */
package com.mk.mkedu.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * class name :-Student. this is used to act as model object of Student Table in
 * DB.
 * 
 * @author karthik.muthyam
 *
 */
@Entity
@Table(name = "mks_stundent")
public class Student
{

    public Student()
    {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "stundent_id")
    private int studentID;

    @Column(name = "student_first_name")
    private String firstname;

    @Column(name = "student_last_name")
    private String lastname;

    @Column(name = "student_father_name")
    private String fathername;

    @Column(name = "student_mother_name")
    private String mothername;

    @Column(name = "student_date_of_birth")
    private String dateOfBirth;

    @Column(name = "student_address")
    private String address;

    @Column(name = "student_age")
    private String age;

    @Column(name = "student_area")
    private String area;

    @Column(name = "student_city")
    private String city;

    @Column(name = "student_postal_code")
    private String postalCode;

    @Column(name = "stundent_mobileNumber")
    private String mobileNumber;

    @Column(name = "student_joining_Date")
    private String joiningDate;

    @Column(name = "student_about_me")
    private String aboutMe;

    @Column(name = "student_profile_photo")
    private String photoLocation;

    @Column(name = "user_name")
    private String userName;

    @OneToMany(mappedBy = "studentId" )
    private Set<OldStudent> oldStudentList;

    /**
     * @return the oldStudent
     */

    public Set<OldStudent> getOldStudent()
    {
        return oldStudentList;
    }

    /**
     * @param oldStudent
     *            the oldStudent to set
     */
    public void setOldStudent(Set<OldStudent> oldStudentList)
    {
        this.oldStudentList = oldStudentList;
    }

    /**
     * @return the studentID
     */
    public int getStudentID()
    {
        return studentID;
    }

    /**
     * @param studentID
     *            the studentID to set
     */
    public void setStudentID(int studentID)
    {
        this.studentID = studentID;
    }

    /**
     * @return the firstname
     */
    public String getFirstname()
    {
        return firstname;
    }

    /**
     * @param firstname
     *            the firstname to set
     */
    public void setFirstname(String firstname)
    {
        this.firstname = firstname;
    }

    /**
     * @return the lastname
     */
    public String getLastname()
    {
        return lastname;
    }

    /**
     * @param lastname
     *            the lastname to set
     */
    public void setLastname(String lastname)
    {
        this.lastname = lastname;
    }

    /**
     * @return the fathername
     */
    public String getFathername()
    {
        return fathername;
    }

    /**
     * @param fathername
     *            the fathername to set
     */
    public void setFathername(String fathername)
    {
        this.fathername = fathername;
    }

    /**
     * @return the mothername
     */
    public String getMothername()
    {
        return mothername;
    }

    /**
     * @param mothername
     *            the mothername to set
     */
    public void setMothername(String mothername)
    {
        this.mothername = mothername;
    }

    /**
     * @return the dateOfBirth
     */
    public String getDateOfBirth()
    {
        return dateOfBirth;
    }

    /**
     * @param dateOfBirth
     *            the dateOfBirth to set
     */
    public void setDateOfBirth(String dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * @return the address
     */
    public String getAddress()
    {
        return address;
    }

    /**
     * @param address
     *            the address to set
     */
    public void setAddress(String address)
    {
        this.address = address;
    }

    /**
     * @return the area
     */
    public String getArea()
    {
        return area;
    }

    /**
     * @param area
     *            the area to set
     */
    public void setArea(String area)
    {
        this.area = area;
    }

    /**
     * @return the city
     */
    public String getCity()
    {
        return city;
    }

    /**
     * @param city
     *            the city to set
     */
    public void setCity(String city)
    {
        this.city = city;
    }

    /**
     * @return the postalCode
     */
    public String getPostalCode()

    {
        return postalCode;
    }

    /**
     * @param postalCode
     *            the postalCode to set
     */
    public void setPostalCode(String postalCode)
    {
        this.postalCode = postalCode;
    }

    /**
     * @return the mobileNumber
     */
    public String getMobileNumber()
    {
        return mobileNumber;
    }

    /**
     * @param mobileNumber
     *            the mobileNumber to set
     */
    public void setMobileNumber(String mobileNumber)
    {
        this.mobileNumber = mobileNumber;
    }

    /**
     * @return the joiningDate
     */
    public String getJoiningDate()
    {
        return joiningDate;
    }

    /**
     * @param joiningDate
     *            the joiningDate to set
     */
    public void setJoiningDate(String joiningDate)
    {
        this.joiningDate = joiningDate;
    }

    /**
     * @return the aboutMe
     */
    public String getAboutMe()
    {
        return aboutMe;
    }

    /**
     * @param aboutMe
     *            the aboutMe to set
     */
    public void setAboutMe(String aboutMe)
    {
        this.aboutMe = aboutMe;
    }

    /**
     * @return the userName
     */
    public String getUserName()
    {
        return userName;
    }

    /**
     * @param userName
     *            the userName to set
     */
    public void setUserName(String userName)
    {
        this.userName = userName;
    }

}
