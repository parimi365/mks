/**
 * 
 */
package com.mk.mkedu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author karthik.muthyam
 *
 */
@Entity
@Table(name = "mks_RAW_ITEMS")
public class RawItems
{

    /**
     * 
     */
    public RawItems()
    {
        
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "raw_items_id")
    private String rawItemsId;
    
    @Column(name = "raw_item_name")
    private String rawItemsName;

    @Column(name = "raw_item_unit")
    private String rawItemUnit;
    
    @Column(name = "raw_item_price")
    private String rawItemPrice;

    /**
     * @return the rawItemsId
     */
    public String getRawItemsId()
    {
        return rawItemsId;
    }

    /**
     * @param rawItemsId the rawItemsId to set
     */
    public void setRawItemsId(String rawItemsId)
    {
        this.rawItemsId = rawItemsId;
    }

    /**
     * @return the rawItemsName
     */
    public String getRawItemsName()
    {
        return rawItemsName;
    }

    /**
     * @param rawItemsName the rawItemsName to set
     */
    public void setRawItemsName(String rawItemsName)
    {
        this.rawItemsName = rawItemsName;
    }

    /**
     * @return the rawItemUnit
     */
    public String getRawItemUnit()
    {
        return rawItemUnit;
    }

    /**
     * @param rawItemUnit the rawItemUnit to set
     */
    public void setRawItemUnit(String rawItemUnit)
    {
        this.rawItemUnit = rawItemUnit;
    }

    /**
     * @return the rawItemPrice
     */
    public String getRawItemPrice()
    {
        return rawItemPrice;
    }

    /**
     * @param rawItemPrice the rawItemPrice to set
     */
    public void setRawItemPrice(String rawItemPrice)
    {
        this.rawItemPrice = rawItemPrice;
    }

   

}
