package android.hardware.radio;

public class RadioResponseInfoModem implements android.os.Parcelable {
    public int type;
    public int serial;
    public int error;
    public boolean isEnabled;
    public static final android.os.Parcelable.Creator<android.hardware.radio.RadioResponseInfoModem> CREATOR = null;
    public RadioResponseInfoModem() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
