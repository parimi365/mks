/*******************************************************************************
* mks @2017 Warangal ,All rights are rederved.Copyright 2017 karthik.muthyam
* mks @2017 Warangal ,All rights are rederved.
* mks @2017 Warangal ,All rights are rederved.Licensed under the Apache License, Version 2.0 (the "License"); you may not
* mks @2017 Warangal ,All rights are rederved.use this file except in compliance with the License.  You may obtain a copy
* mks @2017 Warangal ,All rights are rederved.of the License at
* mks @2017 Warangal ,All rights are rederved.
* mks @2017 Warangal ,All rights are rederved.  http://www.apache.org/licenses/LICENSE-2.0
* mks @2017 Warangal ,All rights are rederved.
* mks @2017 Warangal ,All rights are rederved.Unless required by applicable law or agreed to in writing, software
* mks @2017 Warangal ,All rights are rederved.distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
* mks @2017 Warangal ,All rights are rederved.WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
* mks @2017 Warangal ,All rights are rederved.License for the specific language governing permissions and limitations under
* mks @2017 Warangal ,All rights are rederved.the License.
 ******************************************************************************/
package com.mks.mvc.core.exc;

import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class GeneralCMFExceptionTest
{
    private GeneralCMFException sut;

    @Test(expected = Test.None.class /* no exception expected */)
    public void toStringFunctionality()
    {
        sut = new GeneralCMFException("code", "message", "component");
        final String completeException = sut.toString();
        assertNotNull(completeException);
    }

    @Test(expected = Test.None.class /* no exception expected */)
    public void toStringFunctionalityWhenCodeAndMessageIsNull()
    {
        sut = new GeneralCMFException(null, null, "component");
        final String completeException = sut.toString();
        assertNotNull(completeException);
    }

    @Test(expected = Test.None.class /* no exception expected */)
    public void toStringFunctionalityWhenCauseIsNotNull()
    {
        final Throwable throwable = new NullPointerException();
        sut = new GeneralCMFException(null, null, null, new RuntimeException(throwable));
        final String completeException = sut.toString();
        assertNotNull(completeException);
    }

    @Test(expected = Test.None.class /* no exception expected */)
    public void toStringFunctionalityWhenTechnicalDetailsNotNull()
    {
        sut = new GeneralCMFException("code", "message", "component", new Exception(), "techDetails");
        final String completeException = sut.toString();
        assertNotNull(completeException);
    }

    @Test(expected = Test.None.class /* no exception expected */)
    public void GeneralCMFExceptionWithRejectionsAsParameter()
    {

        new GeneralCMFException("code", "message", "component", new Exception());

    }

    @Test(expected = Test.None.class /* no exception expected */)
    public void GeneralCMFExceptionWithRejectionsAsParameterWithException()
    {

        new GeneralCMFException("code", "message", "component", new Exception(), "techDetails");
    }

    @Test(expected = Test.None.class /* no exception expected */)
    public void GeneralCMFExceptionWithNormalParameters()
    {

        new GeneralCMFException("code", "message", "component", "techDetails");
    }

    @Test(expected = Test.None.class /* no exception expected */)
    public void GeneralCMFExceptionWithFourParameters()
    {

        new GeneralCMFException("code", "message", "component", new Exception());
    }

    @Test(expected = Test.None.class /* no exception expected */)
    public void getCode()
    {
        sut = new GeneralCMFException("code", "message", "component", new Exception());
        sut.getCode();
    }

    @Test(expected = Test.None.class /* no exception expected */)
    public void getMessage()
    {
        sut = new GeneralCMFException("code", "message", "component", new Exception());
        sut.getMessage();
    }

    @Test(expected = Test.None.class /* no exception expected */)
    public void getComponent()
    {
        sut = new GeneralCMFException("code", "message", "component", new Exception());
        sut.getComponent();
    }

    @Test(expected = Test.None.class /* no exception expected */)
    public void getTechnicalDetails()
    {
        sut = new GeneralCMFException("code", "message", "component", new Exception(), "techDetails");
        sut.getTechnicalDetails();
    }

    @Test(expected = Test.None.class /* no exception expected */)
    public void getTimestamp()
    {
        sut = new GeneralCMFException("code", "message", "component", new Exception(), "techDetails");
        sut.getTimestamp();
    }

    @Test(expected = Test.None.class /* no exception expected */)
    public void getRejections()
    {
        final List<Rejection> rejections = Arrays
                .asList(new Rejection("rejectionCode", "regMess1", "regMsg2", "regMsg3"));
        sut = new GeneralCMFException("code", "message", "component", rejections, new Exception(), "techDetails");
        sut.getRejections();
    }

    @Test(expected = Test.None.class /* no exception expected */)
    public void GeneralCMFExceptionDefaultConstructor()
    {
        new GeneralCMFException();
    }

    @Test(expected = Test.None.class /* no exception expected */)
    public void GeneralCMFExceptionWithTwoParameters()
    {
        new GeneralCMFException(new Exception(), "techDetails");
    }

    @Test(expected = Test.None.class /* no exception expected */)
    public void GeneralCMFExceptionWithThreeParameters()
    {
        new GeneralCMFException("code", "message", new Rejection("rejMsg", "rm1", "rm2", "rm3"));
    }

    @Test(expected = Test.None.class /* no exception expected */)
    public void GeneralCMFExceptionWithRejections()
    {
        final List<Rejection> rejections = Arrays
                .asList(new Rejection("rejectionCode", "regMess1", "regMsg2", "regMsg3"));
        new GeneralCMFException("code", "message", rejections);
    }

    @Test(expected = Test.None.class /* no exception expected */)
    public void GeneralCMFExceptionWithRejectionsAndTechDetails()
    {
        final List<Rejection> rejections = Arrays
                .asList(new Rejection("rejectionCode", "regMess1", "regMsg2", "regMsg3"));
        new GeneralCMFException("code", "message", "component", rejections, "techDetails");
    }

}
