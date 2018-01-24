package com.java.datastrcture.cutstomImpl;

import java.util.Arrays;

/*this is the class of custom implemntation of arrayList*/

public class CustomArrayList<E>
{
private static final int INITIAL_CAPACITY = 10;
private Object elementData[] = {};
private int size = 0;

    /*
     * when we create the object of arrayList it is 
     * it is going to crate the intial cpacity
     * */
    public CustomArrayList(){
        elementData = new Object[INITIAL_CAPACITY];
    }
    public void add(E e){
        if(size<=elementData.length){
            ensureCapacity();  
        }
        elementData[size++] = e;
    }
    
    /**
     * method increases capacity of list by making it double.
     */
    private void ensureCapacity() {
      int newIncreasedCapacity = elementData.length * 2;
      elementData = Arrays.copyOf(elementData, newIncreasedCapacity);
    }
    
    public E get(int index){
        
        if(size<index || index>=size){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }
        return (E)elementData[index];
        
    }
    
    
    }
