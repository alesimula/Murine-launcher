package com.android.internal.telephony.uicc;

public class ReceivedPhonebookRecords {
    public static final int RS_OK = 1;
    public static final int RS_ERROR = 2;
    public static final int RS_ABORT = 3;
    public static final int RS_FINAL = 4;
    public ReceivedPhonebookRecords(int p0, java.util.List<com.android.internal.telephony.uicc.SimPhonebookRecord> p1) {}
    public boolean isCompleted() { return false; }
    public boolean isRetryNeeded() { return false; }
    public boolean isOk() { return false; }
    public java.util.List<com.android.internal.telephony.uicc.SimPhonebookRecord> getPhonebookRecords() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PhonebookReceivedState {
    }
}
