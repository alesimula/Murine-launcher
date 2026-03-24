package android.hardware.gnss;

public class CorrelationVector implements android.os.Parcelable {
    public double frequencyOffsetMps;
    public double samplingWidthM;
    public double samplingStartM;
    public int[] magnitude;
    public static final android.os.Parcelable.Creator<android.hardware.gnss.CorrelationVector> CREATOR = null;
    public CorrelationVector() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
