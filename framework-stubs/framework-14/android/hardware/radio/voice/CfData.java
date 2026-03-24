package android.hardware.radio.voice;

public class CfData implements android.os.Parcelable {
    public android.hardware.radio.voice.CallForwardInfo[] cfInfo;
    public static final android.os.Parcelable.Creator<android.hardware.radio.voice.CfData> CREATOR = null;
    public static final int NUM_SERVICE_CLASSES = 7;
    public CfData() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
