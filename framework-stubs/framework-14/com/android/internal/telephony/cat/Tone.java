package com.android.internal.telephony.cat;

public enum Tone implements android.os.Parcelable {
    DIAL,
    BUSY,
    CONGESTION,
    RADIO_PATH_ACK,
    RADIO_PATH_NOT_AVAILABLE,
    ERROR_SPECIAL_INFO,
    CALL_WAITING,
    RINGING,
    GENERAL_BEEP,
    POSITIVE_ACK,
    NEGATIVE_ACK,
    INCOMING_SPEECH_CALL,
    INCOMING_SMS,
    CRITICAL_ALERT,
    VIBRATE_ONLY,
    HAPPY,
    SAD,
    URGENT,
    QUESTION,
    MESSAGE_RECEIVED,
    MELODY_1,
    MELODY_2,
    MELODY_3,
    MELODY_4,
    MELODY_5,
    MELODY_6,
    MELODY_7,
    MELODY_8;
    public static final android.os.Parcelable.Creator<com.android.internal.telephony.cat.Tone> CREATOR = null;
    public static com.android.internal.telephony.cat.Tone fromInt(int p0) { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
}
