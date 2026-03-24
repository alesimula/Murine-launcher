package android.hardware.radio.voice;

public class CallForwardInfo implements android.os.Parcelable {
    public int status;
    public int reason;
    public int serviceClass;
    public int toa;
    public java.lang.String number;
    public int timeSeconds;
    public static final android.os.Parcelable.Creator<android.hardware.radio.voice.CallForwardInfo> CREATOR = null;
    public static final int STATUS_DISABLE = 0;
    public static final int STATUS_ENABLE = 1;
    public static final int STATUS_INTERROGATE = 2;
    public static final int STATUS_REGISTRATION = 3;
    public static final int STATUS_ERASURE = 4;
    public CallForwardInfo() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
