/*******************************************************************************
 * © 2017 CGI Nederland B.V., All rights are reserved.
 ******************************************************************************/
package com.mks.mvc.core.exc;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class RejectionTest
{
    private Rejection sut;

    @Test(expected = Test.None.class /* no exception expected */)
    public void toStringFunctionality()
    {
        sut = new Rejection("rejectionCode", "rejectionReason01", "rejectionReason02", "rejectionReason03");
        final String rejectionMessage = sut.toString();
        assertNotNull(rejectionMessage);
    }

    @Test(expected = Test.None.class /* no exception expected */)
    public void getRejectionCode()
    {
        sut = new Rejection("rejectionCode", "rejectionReason01", "rejectionReason02", "rejectionReason03");
        sut.getRejectionCode();
    }

    @Test(expected = Test.None.class /* no exception expected */)
    public void getRejectionReason01()
    {
        sut = new Rejection("rejectionCode", "rejectionReason01", "rejectionReason02", "rejectionReason03");
        sut.getRejectionReason01();
    }

    @Test(expected = Test.None.class /* no exception expected */)
    public void getRejectionReason02()
    {
        sut = new Rejection("rejectionCode", "rejectionReason01", "rejectionReason02", "rejectionReason03");
        sut.getRejectionReason02();
    }

    @Test(expected = Test.None.class /* no exception expected */)
    public void getRejectionReason03()
    {
        sut = new Rejection("rejectionCode", "rejectionReason01", "rejectionReason02", "rejectionReason03");
        sut.getRejectionReason03();
    }

}
