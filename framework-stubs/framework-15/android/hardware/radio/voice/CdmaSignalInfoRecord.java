package android.hardware.radio.voice;

public class CdmaSignalInfoRecord implements android.os.Parcelable {
    public boolean isPresent;
    public byte signalType;
    public byte alertPitch;
    public byte signal;
    public static final android.os.Parcelable.Creator<android.hardware.radio.voice.CdmaSignalInfoRecord> CREATOR = null;
    public CdmaSignalInfoRecord() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
