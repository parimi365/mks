package com.java.interview.java8;

public class LambdaExpersiion
{
public static void main(String[] args)
{
    String name;
    String name2;
    LambdaExperssionInteface names = (name11,nname) ->countWords(name11, nname);
    
    System.out.println(names.name("karthik", "karthikk"));
}

public static String countWords(String name1,String name2){
    return "rahju";
}
}
