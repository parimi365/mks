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

import java.util.ArrayList;
import java.util.List;

/**
 * A generic exception for use in the implementation
 *
 * @author Bas Ameschot
 *
 */
public class GeneralCMFException extends Exception
{
    /**
     * serial version id
     */
    private static final long serialVersionUID = -1328676870299302881L;
    /* Attributes */
    protected final String code;
    protected final String message;
    protected final String component;
    protected final String technicalDetails;
    protected final long timestamp;
    protected final ArrayList<Rejection> rejections;
    // internally explicitly
    // define it as an
    // ArrayList as this
    // implementation is
    // serializable whereas the
    // List is not

    /* Constructor */
    /**
     * General error, error code is GCMF-999 with description "Undefined GCMF
     * Exception"
     */
    public GeneralCMFException()
    {
        this("GCMF-999", "Undefined GCMF Exception", "n/a");
    }

    public GeneralCMFException(final Exception exception, final String technicalDetails)
    {
        super(exception);
        code = null;
        rejections = null;
        message = null;
        timestamp = System.currentTimeMillis();
        component = "n/a";
        this.technicalDetails = technicalDetails;

    }

    /**
     * Constructor for GeneralCMFException
     *
     * @param code
     *            the error code
     * @param message
     *            the error message
     * @param rejection
     *            the rejection to add to the exception
     */
    public GeneralCMFException(final String code, final String message, final Rejection rejection)
    {
        this.code = code;
        this.message = message;
        rejections = new ArrayList<>();
        rejections.add(rejection);
        timestamp = System.currentTimeMillis();
        component = "n/a";
        technicalDetails = null;
    }

    /**
     * Constructor for GeneralCMFException
     *
     * @param code
     *            the error code
     * @param message
     *            the error message
     * @param rejections
     *            the list of rejections to add to the exception
     */
    public GeneralCMFException(final String code, final String message, final List<Rejection> rejections)
    {
        this(code, message, "n/a", rejections, (Exception) null);
    }

    /**
     * Constructor for GeneralCMFException
     *
     * @param code
     *            the error code
     * @param message
     *            the error message
     * @param component
     *            the component the exception was thrown from
     * @param rejection
     *            the list of rejections to add to the exception
     * @param technicalDetails
     *            the technical details of the exceptions
     */
    public GeneralCMFException(final String code, final String message, final String component,
            final List<Rejection> rejections, final String technicalDetails)
    {
        this.code = code;
        this.message = message;
        this.rejections = new ArrayList<>(rejections);
        this.technicalDetails = technicalDetails;
        this.component = component;
        timestamp = System.currentTimeMillis();
    }

    /**
     * Constructor for GeneralCMFException
     *
     * @param code
     *            the error code
     * @param message
     *            the error message
     * @param component
     *            the component the exception was thrown from
     * @param rejection
     *            the list of rejections to add to the exception
     * @param exception
     *            the exception that is the cause, this will be wrapped in the
     *            GeneralCMFException
     */
    public GeneralCMFException(final String code, final String message, final String component,
            final List<Rejection> rejections, final Exception exception)
    {
        super(exception);
        this.code = code;
        this.message = message;
        this.rejections = rejections != null ? new ArrayList<>(rejections) : new ArrayList<>();

        this.component = component;
        technicalDetails = null;
        timestamp = System.currentTimeMillis();
    }

    public GeneralCMFException(final String code, final String message, final String component,
            final List<Rejection> rejections, final Exception exception, final String technicalDetails)
    {
        super(exception);
        this.code = code;
        this.message = message;
        this.rejections = rejections != null ? new ArrayList<>(rejections) : new ArrayList<>();
        this.component = component;
        this.technicalDetails = technicalDetails;
        timestamp = System.currentTimeMillis();
    }

    /**
     * Constructor for GeneralCMFException
     *
     * @param message
     *            the error message
     * @param component
     *            the component the exception was thrown from
     * @param technicalDetails
     *            the technical details of the exception
     */
    public GeneralCMFException(final String code, final String message, final String component,
            final String technicalDetails)
    {
        this.code = code;
        this.message = message;
        this.technicalDetails = technicalDetails;
        this.component = component;
        timestamp = System.currentTimeMillis();
        rejections = null;

    }

    /**
     * Constructor for GeneralCMFException
     *
     * @param code
     *            the error code
     * @param message
     *            a short descriptive message about the location and cause of
     *            the exception
     * @param component
     *            the component the exception was thrown from
     * @param exception
     *            the exception that is the cause, this will be wrapped in the
     *            GeneralCMFException
     */
    public GeneralCMFException(final String code, final String message, final String component,
            final Exception exception)
    {
        this(code, message, component, null, exception);
    }

    public GeneralCMFException(final String code, final String message, final String component,
            final Exception exception, final String technicalDetails)
    {
        this(code, message, component, null, exception, technicalDetails);
    }

    public GeneralCMFException(final String code, final String message, final String component)
    {
        this.code = code;
        this.message = message;
        this.component = component;
        timestamp = System.currentTimeMillis();
        technicalDetails = null;
        rejections = null;
    }

    /* Methods */
    @Override
    public String toString()
    {
        String s = "GeneralCMFException [";
        if (code != null)
        {
            s += "code= " + code;
        }
        if (message != null)
        {
            s += ", message= " + message;
        }
        else if (super.getCause() != null)
        {
            s += ", message = " + super.getCause().getMessage();
        }
        if (component != null)
        {
            s += ", component= " + component;
        }
        if (technicalDetails != null)
        {
            s += ", technicalDetails= " + technicalDetails;
        }
        if (timestamp > 0)
        {
            s += ", timestamp= " + timestamp;
        }
        if (rejections != null)
        {
            s += ", rejections= " + rejections;
        }

        s += "]";

        return s;
    }

    /* Getters/Setters */

    /**
     * @return the code
     */
    public String getCode()
    {
        return code;
    }

    /**
     * @return the message
     */
    @Override
    public String getMessage()
    {
        return message;
    }

    /**
     * @return the component
     */
    public String getComponent()
    {
        return component;
    }

    /**
     * @return the technicalDetails
     */
    public String getTechnicalDetails()
    {
        return technicalDetails;
    }

    /**
     * @return the timestamp
     */
    public long getTimestamp()
    {
        return timestamp;
    }

    /**
     * @return the rejections
     */
    public List<Rejection> getRejections()
    {
        return rejections;
    }

}
