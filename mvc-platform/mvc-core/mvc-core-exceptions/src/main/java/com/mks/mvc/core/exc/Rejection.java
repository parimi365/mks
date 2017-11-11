/*******************************************************************************
 * © 2017 CGI Nederland B.V., All rights are reserved.
 ******************************************************************************/
package com.mks.mvc.core.exc;

import java.io.Serializable;

/**
 * Generic rejection class
 *
 * @author Bas Ameschot
 *
 */
public class Rejection implements Serializable
{
    private static final long serialVersionUID = 7269110211840824109L;
    /* Atttributes */
    private final String rejectionCode;
    private final String rejectionReason01;
    private final String rejectionReason02;
    private final String rejectionReason03;

    /* Constructor */
    /**
     * The constructor for Rejection
     *
     * @param rejectionCode
     *            the code for the rejection
     * @param rejectionReason01
     *            rejection reason 1
     * @param rejectionReason02
     *            rejection reason 2
     * @param rejectionReason03
     *            rejection reason 3
     */
    public Rejection(final String rejectionCode, final String rejectionReason01, final String rejectionReason02,
            final String rejectionReason03)
    {
        this.rejectionCode = rejectionCode;
        this.rejectionReason01 = rejectionReason01;
        this.rejectionReason02 = rejectionReason02;
        this.rejectionReason03 = rejectionReason03;
    }

    /* Methods */

    @Override
    public String toString()
    {
        return "Rejection [rejectionCode=" + rejectionCode + ", rejectionReason01=" + rejectionReason01
                + ", rejectionReason02=" + rejectionReason02 + ", rejectionReason03=" + rejectionReason03 + "]";
    }

    /**
     * @return the rejectionCode
     */
    public String getRejectionCode()
    {
        return rejectionCode;
    }

    /**
     * @return the rejectionReason01
     */
    public String getRejectionReason01()
    {
        return rejectionReason01;
    }

    /**
     * @return the rejectionReason02
     */
    public String getRejectionReason02()
    {
        return rejectionReason02;
    }

    /**
     * @return the rejectionReason03
     */
    public String getRejectionReason03()
    {
        return rejectionReason03;
    }

}
