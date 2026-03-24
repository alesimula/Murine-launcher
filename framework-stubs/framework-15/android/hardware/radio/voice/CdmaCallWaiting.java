package android.hardware.radio.voice;

public class CdmaCallWaiting implements android.os.Parcelable {
    public java.lang.String number;
    public int numberPresentation;
    public java.lang.String name;
    public android.hardware.radio.voice.CdmaSignalInfoRecord signalInfoRecord;
    public int numberType;
    public int numberPlan;
    public static final android.os.Parcelable.Creator<android.hardware.radio.voice.CdmaCallWaiting> CREATOR = null;
    public static final int NUMBER_PLAN_UNKNOWN = 0;
    public static final int NUMBER_PLAN_ISDN = 1;
    public static final int NUMBER_PLAN_DATA = 3;
    public static final int NUMBER_PLAN_TELEX = 4;
    public static final int NUMBER_PLAN_NATIONAL = 8;
    public static final int NUMBER_PLAN_PRIVATE = 9;
    public static final int NUMBER_PRESENTATION_ALLOWED = 0;
    public static final int NUMBER_PRESENTATION_RESTRICTED = 1;
    public static final int NUMBER_PRESENTATION_UNKNOWN = 2;
    public static final int NUMBER_TYPE_UNKNOWN = 0;
    public static final int NUMBER_TYPE_INTERNATIONAL = 1;
    public static final int NUMBER_TYPE_NATIONAL = 2;
    public static final int NUMBER_TYPE_NETWORK_SPECIFIC = 3;
    public static final int NUMBER_TYPE_SUBSCRIBER = 4;
    public CdmaCallWaiting() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
