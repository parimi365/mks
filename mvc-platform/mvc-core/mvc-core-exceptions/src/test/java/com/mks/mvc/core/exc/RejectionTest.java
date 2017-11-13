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
