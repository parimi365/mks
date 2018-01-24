/**
 * 
 */
package com.mk.mkedu.model;

/**
 * @author karthik.muthyam
 *
 */

public class RawItemsBean
{

    /**
     * 
     */
    public RawItemsBean()
    {
        
    }
   
    private String [] rawItemsId;
    
  
    private String rawItemsName[];

  
    private String rawItemUnit[];
    
   
    private String rawItemPrice[];


    public String[] getRawItemsId()
    {
        return rawItemsId;
    }


    public void setRawItemsId(String[] rawItemsId)
    {
        this.rawItemsId = rawItemsId;
    }


    public String[] getRawItemsName()
    {
        return rawItemsName;
    }


    public void setRawItemsName(String[] rawItemsName)
    {
        this.rawItemsName = rawItemsName;
    }


    public String[] getRawItemUnit()
    {
        return rawItemUnit;
    }


    public void setRawItemUnit(String[] rawItemUnit)
    {
        this.rawItemUnit = rawItemUnit;
    }


    public String[] getRawItemPrice()
    {
        return rawItemPrice;
    }


    public void setRawItemPrice(String[] rawItemPrice)
    {
        this.rawItemPrice = rawItemPrice;
    }

  
   

}
