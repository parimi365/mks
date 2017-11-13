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
