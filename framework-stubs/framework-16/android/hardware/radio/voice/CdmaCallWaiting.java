package android.hardware.radio.voice;

public class CdmaCallWaiting implements android.os.Parcelable {
    @java.lang.Deprecated
    public java.lang.String number;
    @java.lang.Deprecated
    public int numberPresentation;
    @java.lang.Deprecated
    public java.lang.String name;
    @java.lang.Deprecated
    public android.hardware.radio.voice.CdmaSignalInfoRecord signalInfoRecord;
    @java.lang.Deprecated
    public int numberType;
    @java.lang.Deprecated
    public int numberPlan;
    public static final android.os.Parcelable.Creator<android.hardware.radio.voice.CdmaCallWaiting> CREATOR = null;
    @java.lang.Deprecated
    public static final int NUMBER_PLAN_UNKNOWN = 0;
    @java.lang.Deprecated
    public static final int NUMBER_PLAN_ISDN = 1;
    @java.lang.Deprecated
    public static final int NUMBER_PLAN_DATA = 3;
    @java.lang.Deprecated
    public static final int NUMBER_PLAN_TELEX = 4;
    @java.lang.Deprecated
    public static final int NUMBER_PLAN_NATIONAL = 8;
    @java.lang.Deprecated
    public static final int NUMBER_PLAN_PRIVATE = 9;
    @java.lang.Deprecated
    public static final int NUMBER_PRESENTATION_ALLOWED = 0;
    @java.lang.Deprecated
    public static final int NUMBER_PRESENTATION_RESTRICTED = 1;
    @java.lang.Deprecated
    public static final int NUMBER_PRESENTATION_UNKNOWN = 2;
    @java.lang.Deprecated
    public static final int NUMBER_TYPE_UNKNOWN = 0;
    @java.lang.Deprecated
    public static final int NUMBER_TYPE_INTERNATIONAL = 1;
    @java.lang.Deprecated
    public static final int NUMBER_TYPE_NATIONAL = 2;
    @java.lang.Deprecated
    public static final int NUMBER_TYPE_NETWORK_SPECIFIC = 3;
    @java.lang.Deprecated
    public static final int NUMBER_TYPE_SUBSCRIBER = 4;
    public CdmaCallWaiting() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
