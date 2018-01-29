package com.mk.mkedu.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mk.mkedu.model.RawItems;
import com.mk.mkedu.service.OrganicDosaHubService;

@Controller
public class OrganicDosaHubController
{

    private static final Logger logger = LogManager.getLogger(OrganicDosaHubController.class);

    @Autowired
    private OrganicDosaHubService organicDosaHubService;

    @RequestMapping(value = "/rawItems")
    private ModelAndView rawItemsDiplay()
    {
        System.out.println("raw Items page display");
        return new ModelAndView("rawItems");
    }

    @RequestMapping(value = "/rawItemSave")
    private String saveRawItems(@ModelAttribute("rawItems") RawItems rawItems, ModelMap model) throws Exception
    {

        model.addAttribute("rawItems", rawItems);
        logger.info("raw Item Name:-" + rawItems.getRawItemsName());
        organicDosaHubService.saveAll(rawItems);
        return "rawItems";

    }

    /*
     * 
     * @RequestMapping(value = "/studentinfo") private String
     * studentinfo(@ModelAttribute("student") Student student, ModelMap model)
     * throws Exception { System.out.println("studetn object====" + student);
     * model.addAttribute("student", student); studentservice.save(student);
     * return "student";
     * 
     * }
     * 
     *//**
       * it is used to display the page fo old Student PAge
       * 
       * @return
       */
    /*
     * @RequestMapping(value = "/oldstudent") private ModelAndView
     * oldstudent(@RequestParam("hiddenId") String id,ModelMap model) {
     * System.out.println(id);
     * System.out.println("old student object is called");
     * model.put("studentId", id); return new ModelAndView("oldStudent"); }
     * 
     *//**
       * save the oldStudent Details in java
       * 
       * @param oldStudent
       * @param model
       * @return
       * @throws Exception
       *//*
         * @RequestMapping(value = "/saveOldStudent", method =
         * RequestMethod.GET) private String
         * oldStudentsave(@ModelAttribute("oldStudent") OldStudentBean
         * oldStudent, @RequestParam("studentId") String studentId, ModelMap
         * model) throws Exception { Set<OldStudent> oldStudetn =
         * studentservice.convertToModelObject(oldStudent,studentId); for
         * (Iterator iterator = oldStudetn.iterator(); iterator.hasNext();) {
         * OldStudent oldStudent2 = (OldStudent) iterator.next();
         * studentservice.oldStudentSave(oldStudent2); } return "oldStudent";
         * 
         * }
         */
}
