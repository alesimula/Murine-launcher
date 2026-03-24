package android.hardware.tv.tuner;

public class FrontendIsdbs3Settings implements android.os.Parcelable {
    public long frequency;
    public long endFrequency;
    public int streamId;
    public int streamIdType;
    public int modulation;
    public int coderate;
    public int symbolRate;
    public int rolloff;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.FrontendIsdbs3Settings> CREATOR = null;
    public FrontendIsdbs3Settings() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
