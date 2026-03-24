package android.hardware.radio.voice;

public class CdmaNumberInfoRecord implements android.os.Parcelable {
    public java.lang.String number;
    public byte numberType;
    public byte numberPlan;
    public byte pi;
    public byte si;
    public static final android.os.Parcelable.Creator<android.hardware.radio.voice.CdmaNumberInfoRecord> CREATOR = null;
    public static final int CDMA_NUMBER_INFO_BUFFER_LENGTH = 81;
    public CdmaNumberInfoRecord() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
