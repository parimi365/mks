package com.mk.mkedu.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MkEduDateAjax
{

    private static final Logger logger = LogManager.getLogger(MkEduDateAjax.class);

   
    /**
     * it is used to display the dosa employee page
     * 
     * @return
     */
    @RequestMapping(value = "/mkbu/{name}")
    @ResponseBody
    private void employeeDisplay(@PathVariable("name") String name)
    {
        System.out.println("ajazxxx");
    }
    
    
  
}
