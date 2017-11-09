/*******************************************************************************
 * © 2017 CGI Nederland B.V., All rights are reserved.
 ******************************************************************************/
package com.cgi.cms.cpf.utl.exc;

import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class CMSRuntimeExceptionTest
{
    private CMSRuntimeException sut;

    @Test(expected = Test.None.class /* no exception expected */)
    public void toStringMethodFunctionality()
    {
        sut = new CMSRuntimeException("code", "message", "component", "techDetails");
        final String completeException = sut.toString();
        assertNotNull(completeException);
    }

    @Test(expected = Test.None.class /* no exception expected */)
    public void toStringMethodFunctionalityWhenRunTimeExceptionIsUsed()
    {
        final Throwable runTimeException = new NullPointerException();
        sut = new CMSRuntimeException("code", null, "component", new RuntimeException(runTimeException));
        final String completeException = sut.toString();
        assertNotNull(completeException);
    }

    @Test(expected = Test.None.class /* no exception expected */)
    public void toStringMethodFunctionalityWhenListOfRejectionsAreUsed()
    {

        final List<Rejection> rejections = Arrays
                .asList(new Rejection("rejectionCode", "rejectionReason01", "rejectionReason02", "rejectionReason03"));
        sut = new CMSRuntimeException("code", "message", rejections);
        final String completeException = sut.toString();
        assertNotNull(completeException);
    }

    @Test(expected = Test.None.class /* no exception expected */)
    public void toStringMethodFunctionalityWhenCodeISNull()
    {
        sut = new CMSRuntimeException(null, "message", null, "techDetails");
        final String completeException = sut.toString();
        assertNotNull(completeException);
    }

    @Test(expected = Test.None.class /* no exception expected */)
    public void toStringMethodFunctionalityWhenRunTimeExceptionIsUsedd()
    {
        final RuntimeException runTimeException = null;
        sut = new CMSRuntimeException("code", null, "component", runTimeException);
        final String completeException = sut.toString();
        assertNotNull(completeException);
    }

    @Test(expected = Test.None.class /* no exception expected */)
    public void getCode()
    {
        sut = new CMSRuntimeException("code", "message", "component", "techDetails");
        sut.getCode();
    }

    @Test(expected = Test.None.class /* no exception expected */)
    public void getMessage()
    {
        sut = new CMSRuntimeException("code", "message", "component", "techDetails");
        sut.getMessage();
    }

    @Test(expected = Test.None.class /* no exception expected */)
    public void getComponent()
    {
        sut = new CMSRuntimeException("code", "message", "component", "techDetails");
        sut.getComponent();
    }

    @Test(expected = Test.None.class /* no exception expected */)
    public void getTechnicalDetails()
    {
        sut = new CMSRuntimeException("code", "message", "component", "techDetails");
        sut.getTechnicalDetails();
    }

    @Test(expected = Test.None.class /* no exception expected */)
    public void getTimestamp()
    {
        sut = new CMSRuntimeException("code", "message", "component", "techDetails");
        sut.getTimestamp();
    }

    @Test(expected = Test.None.class /* no exception expected */)
    public void getRejections()
    {
        sut = new CMSRuntimeException("code", "message", "component", "techDetails");
        sut.getRejections();
    }

    @Test(expected = Test.None.class /* no exception expected */)
    public void CMSRuntimeException()
    {
        new CMSRuntimeException();
    }

    @Test(expected = Test.None.class /* no exception expected */)
    public void CMSRuntimeExceptionWithThreeParameters()
    {
        new CMSRuntimeException("code", "message", "component");
    }

    @Test(expected = Test.None.class /* no exception expected */)
    public void CMSRuntimeExceptionWithRejections()
    {
        final List<Rejection> rejections = Arrays
                .asList(new Rejection("rejectionCode", "rejectionReason01", "rejectionReason02", "rejectionReason03"));
        new CMSRuntimeException("code", "message", "component", rejections, "techDetails");
    }

    @Test(expected = Test.None.class /* no exception expected */)
    public void CMSRuntimeExceptionWithRejection()
    {
        new CMSRuntimeException("code", "message",
                new Rejection("rejectionCode", "rejectionReason01", "rejectionReason02", "rejectionReason03"));
    }
}
