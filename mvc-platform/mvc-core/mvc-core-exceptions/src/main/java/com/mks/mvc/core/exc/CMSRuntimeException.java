/*******************************************************************************
 * © 2017 CGI Nederland B.V., All rights are reserved.
 ******************************************************************************/
/**
 *
 */
package com.mks.mvc.core.exc;

import java.util.ArrayList;
import java.util.List;

/**
 * @author videsh.singh
 *
 */
public class CMSRuntimeException extends RuntimeException
{

    /**
     *
     */
    private static final long serialVersionUID = -1626443708494467663L;

    /* Attributes */
    protected final String code;
    protected final String message;
    protected final String component;
    protected final String technicalDetails;
    protected final long timestamp;
    protected final ArrayList<Rejection> rejections; // internally explicitly
                                                     // define it as an
                                                     // ArrayList as this
                                                     // implementation is
                                                     // serializable whereas the
                                                     // List is not

    /**
     * General error, error code is GCMF-999 with description "Undefined GCMF
     * Exception"
     */
    public CMSRuntimeException()
    {
        this("GCMF-999", "Undefined Runtime Exception", "n/a");
    }

    /**
     * Constructor for CMSRuntimeException
     *
     * @param code
     *            the error code
     * @param message
     *            the error message
     * @param rejection
     *            the rejection to add to the exception
     */
    public CMSRuntimeException(final String code, final String message, final Rejection rejection)
    {
        super(message);
        this.code = code;
        this.message = message;
        rejections = new ArrayList<>();
        rejections.add(rejection);
        timestamp = System.currentTimeMillis();
        component = "n/a";
        technicalDetails = null;
    }

    /**
     * Constructor for CMSRuntimeException
     *
     * @param code
     *            the error code
     * @param message
     *            the error message
     * @param rejections
     *            the list of rejections to add to the exception
     */
    public CMSRuntimeException(final String code, final String message, final List<Rejection> rejections)
    {
        this.code = code;
        this.message = message;
        this.rejections = rejections != null ? new ArrayList<>(rejections) : new ArrayList<>();
        timestamp = System.currentTimeMillis();
        component = "n/a";
        technicalDetails = null;
    }

    /**
     * Constructor for CMSRuntimeException
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
    public CMSRuntimeException(final String code, final String message, final String component,
            final List<Rejection> rejections, final String technicalDetails)
    {
        this.code = code;
        this.message = message;
        this.rejections = rejections != null ? new ArrayList<>(rejections) : new ArrayList<>();
        this.technicalDetails = technicalDetails;
        this.component = component;
        timestamp = System.currentTimeMillis();
    }

    /**
     * Constructor for CMSRuntimeException
     *
     * @param message
     *            the error message
     * @param component
     *            the component the exception was thrown from
     * @param technicalDetails
     *            the technical details of the exception
     */
    public CMSRuntimeException(final String code, final String message, final String component,
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
    public CMSRuntimeException(final String code, final String message, final String component,
            final Exception exception)
    {
        super(exception);
        this.code = code;
        this.message = message;
        this.component = component;
        timestamp = System.currentTimeMillis();
        rejections = null;
        technicalDetails = null;
    }

    public CMSRuntimeException(final String code, final String message, final String component)

    {
        this.code = code;
        this.message = message;
        this.component = component;
        timestamp = System.currentTimeMillis();
        rejections = null;
        technicalDetails = null;
    }

    /* Methods */
    @Override
    public String toString()
    {
        String s = "GeneralCMFException [";
        if (code != null)
        {
            s += "code=" + code;
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
            s += ", component=" + component;
        }
        if (technicalDetails != null)
        {
            s += ", technicalDetails=" + technicalDetails;
        }
        if (timestamp > 0)
        {
            s += ", timestamp=" + timestamp;
        }
        if (rejections != null)
        {
            s += ", rejections=" + rejections;
        }
        s += "]";

        return s;
    }

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
     * @return the time stamp
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
