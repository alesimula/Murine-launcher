package com.android.internal.telephony.phonenumbers;

public class NumberParseException extends java.lang.Exception {
    public NumberParseException(com.android.internal.telephony.phonenumbers.NumberParseException.ErrorType p0, java.lang.String p1) { super(); }
    public com.android.internal.telephony.phonenumbers.NumberParseException.ErrorType getErrorType() { return null; }
    public java.lang.String toString() { return null; }

    public static enum ErrorType {
        INVALID_COUNTRY_CODE,
        NOT_A_NUMBER,
        TOO_SHORT_AFTER_IDD,
        TOO_SHORT_NSN,
        TOO_LONG;
    }
}
