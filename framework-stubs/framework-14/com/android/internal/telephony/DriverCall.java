package com.android.internal.telephony;

public class DriverCall implements java.lang.Comparable<com.android.internal.telephony.DriverCall> {
    static final java.lang.String LOG_TAG = "DriverCall";
    public static final int AUDIO_QUALITY_UNSPECIFIED = 0;
    public static final int AUDIO_QUALITY_AMR = 1;
    public static final int AUDIO_QUALITY_AMR_WB = 2;
    public static final int AUDIO_QUALITY_GSM_EFR = 3;
    public static final int AUDIO_QUALITY_GSM_FR = 4;
    public static final int AUDIO_QUALITY_GSM_HR = 5;
    public static final int AUDIO_QUALITY_EVRC = 6;
    public static final int AUDIO_QUALITY_EVRC_B = 7;
    public static final int AUDIO_QUALITY_EVRC_WB = 8;
    public static final int AUDIO_QUALITY_EVRC_NW = 9;
    public int index;
    public boolean isMT;
    public com.android.internal.telephony.DriverCall.State state;
    public boolean isMpty;
    public java.lang.String number;
    public java.lang.String forwardedNumber;
    public int TOA;
    public boolean isVoice;
    public boolean isVoicePrivacy;
    public int als;
    public int numberPresentation;
    public java.lang.String name;
    public int namePresentation;
    public com.android.internal.telephony.UUSInfo uusInfo;
    public int audioQuality;
    static com.android.internal.telephony.DriverCall fromCLCCLine(java.lang.String p0) { return null; }
    public DriverCall() {}
    public java.lang.String toString() { return null; }
    public static com.android.internal.telephony.DriverCall.State stateFromCLCC(int p0) throws com.android.internal.telephony.ATParseEx { return null; }
    public static int presentationFromCLIP(int p0) throws com.android.internal.telephony.ATParseEx { return 0; }
    public int compareTo(com.android.internal.telephony.DriverCall p0) { return 0; }

    public static enum State {
        ACTIVE,
        HOLDING,
        DIALING,
        ALERTING,
        INCOMING,
        WAITING;
    }
}
