package com.mk.mkedu.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.mk.mkedu.model.RawItems;
import com.mk.mkedu.repo.OrgnaicDosaHubRepository;

@Service("organicDosaHubService")
@ComponentScan(basePackages = "com.mk.mkedu")
public class OrganicDosaHubService
{

    @Autowired
    private  OrgnaicDosaHubRepository orgnaicDosaHubRepository;
    

    public OrganicDosaHubService()
    {
    }

    /* *//**
     * @param studentRepository
     */
    public OrganicDosaHubService(OrgnaicDosaHubRepository orgnaicDosaHubRepository)
    {
        this.orgnaicDosaHubRepository = orgnaicDosaHubRepository;
    }

    public RawItems save(RawItems rawItems) throws Exception
    {
        RawItems items = orgnaicDosaHubRepository.save(rawItems);
        if (items == null)
            throw new Exception("No user present with username: ");

        return items;
    }
    
    
    public List<RawItems> saveAll(RawItems rawItems) throws Exception
    {
        List<RawItems> items = new ArrayList<>();
        String[] itemPrice = rawItems.getRawItemPrice().split(",");
        String[] itemName = rawItems.getRawItemsName().split(",");
        String[] itemUnit = rawItems.getRawItemUnit().split(",");
        RawItems items2 = null;
        for (int i = 0; i < itemUnit.length; i++)
        {
             items2 = new RawItems();
            items2.setRawItemPrice(itemPrice[i]);
            items2.setRawItemsName(itemName[i]);
            items2.setRawItemUnit(itemUnit[i]);
            items.add(items2);
            
        }
        System.out.println(items.get(0).getRawItemsName());
        System.out.println(items.get(1).getRawItemsName());
        
      orgnaicDosaHubRepository.saveAll(items);
        if (items == null)
            throw new Exception("No user present with username: ");

        
        return items;
    }
    
    
    /*
     * public Student save(Student student) throws Exception {
     * 
     * Student student1 = studentRepository.save(student); if (student1 == null)
     * { throw new Exception("No user present with username: "); } return
     * student1; }
     * 
     * 
     * 
     *//**
       * is is used to save the deatls in every record
       * 
       * @param oldStudent
       * @return
       * @throws Exception
       */
    /*
     * public OldStudent oldStudentSave(OldStudent oldStudent) throws Exception
     * { OldStudent oldStudent1 = oldStudentRepository.save(oldStudent); if
     * (oldStudent1 == null) { throw new
     * Exception("no details are found from the given user Id "); } return
     * oldStudent1; }
     * 
     * 
     *//**
       * it is used to convert the bean object to model object data.
       * 
       * @param oldStudentBean
       * @return
       *//*
         * public Set<OldStudent> convertToModelObject(OldStudentBean
         * oldStudentBean,String Studentid) { Set<OldStudent> oldStudentSet =
         * new HashSet<>(); String[] studentClass =
         * oldStudentBean.getOldStudentClass(); String[] studentSchool =
         * oldStudentBean.getOldStudentSchool(); String[] studetPercentage =
         * oldStudentBean.getPercentage(); String[] studentYear =
         * oldStudentBean.getYear();
         * 
         * for (int i = 0; i < studentClass.length; i++) {
         * 
         * OldStudent oldStudent = new OldStudent();
         * oldStudent.setOldStudentClass(studentClass[i]);
         * oldStudent.setOldStudentSchool(studentSchool[i]);
         * oldStudent.setPercentage(studetPercentage[i]);
         * oldStudent.setYear(studentYear[i]);
         * oldStudent.setStudentId(Studentid); oldStudentSet.add(oldStudent);
         * 
         * 
         * 
         * }
         * 
         * 
         * return oldStudentSet; }
         */
}
