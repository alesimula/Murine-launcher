package com.android.internal.telephony.cdma;

public class CdmaCallWaitingNotification {
    static final java.lang.String LOG_TAG = "CdmaCallWaitingNotification";
    public java.lang.String number;
    public int numberPresentation;
    public java.lang.String name;
    public int namePresentation;
    public int numberType;
    public int numberPlan;
    public int isPresent;
    public int signalType;
    public int alertPitch;
    public int signal;
    public CdmaCallWaitingNotification() {}
    public java.lang.String toString() { return null; }
    public static int presentationFromCLIP(int p0) { return 0; }
}
