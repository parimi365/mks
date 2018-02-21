package com.java.interview.java8;
@FunctionalInterface
public interface LambdaExperssionInteface
{

    public String name(String firstName,String secondName);
    
    public default int number(){
        return 0;
        
    }
    /*
     * if we add the other abstract method into the @FunctionalInterface 
     * it wont work . it mot have only one abstract method and either ,can be have default method
     *  */
   /* public String name1();*/
}
