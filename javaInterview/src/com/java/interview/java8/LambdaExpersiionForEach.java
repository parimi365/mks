package com.java.interview.java8;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpersiionForEach
{
    static int i=0;
public static void main(String[] args)
{
    
    List<String> names = new ArrayList<String>();
    names.add("karthik");
    names.add("raju");
    names.forEach(name->getNames(name));
}

static String getNames(String name){
   
    System.out.println(i++);
    
    return name;
    
    
}
}
