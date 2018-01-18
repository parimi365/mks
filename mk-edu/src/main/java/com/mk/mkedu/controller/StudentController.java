package com.mk.mkedu.controller;

import java.util.Iterator;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mk.mkedu.bean.OldStudentBean;
import com.mk.mkedu.model.OldStudent;
import com.mk.mkedu.model.Student;
import com.mk.mkedu.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentservice;
	
	
	@RequestMapping(value = "/student")
	private ModelAndView storeStudent() {
		System.out.println("student page display");
		return new ModelAndView("student");
	}

	@RequestMapping(value = "/studentinfo")
	private String studentinfo(@ModelAttribute("student") Student student, ModelMap model) throws Exception {
		System.out.println("studetn object====" + student);
		model.addAttribute("student", student);
		studentservice.save(student);
		return "student";

	}

	/**
	 * it is used to display the page fo old Student PAge
	 * 
	 * @return
	 */
	@RequestMapping(value = "/oldstudent")
	private ModelAndView oldstudent(@RequestParam("hiddenId") String id,ModelMap model) {
                 System.out.println(id);
		System.out.println("old student object is called");
		model.put("studentId", id);
		return new ModelAndView("oldStudent");
	}
	
	/**
	 * save the oldStudent Details in java 
	 * @param oldStudent
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/saveOldStudent", method = RequestMethod.GET)
	private String oldStudentsave(@ModelAttribute("oldStudent") OldStudentBean oldStudent, @RequestParam("studentId") String studentId, ModelMap model)
			throws Exception {
	    Set<OldStudent> oldStudetn = studentservice.convertToModelObject(oldStudent,studentId);
	    for (Iterator iterator = oldStudetn.iterator(); iterator.hasNext();)
            {
                OldStudent oldStudent2 = (OldStudent) iterator.next();
                studentservice.oldStudentSave(oldStudent2); 
            }
		return "oldStudent";

	}
}
