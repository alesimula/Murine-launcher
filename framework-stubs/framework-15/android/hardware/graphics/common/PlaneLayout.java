package android.hardware.graphics.common;

public class PlaneLayout implements android.os.Parcelable {
    public android.hardware.graphics.common.PlaneLayoutComponent[] components;
    public long offsetInBytes;
    public long sampleIncrementInBits;
    public long strideInBytes;
    public long widthInSamples;
    public long heightInSamples;
    public long totalSizeInBytes;
    public long horizontalSubsampling;
    public long verticalSubsampling;
    public static final android.os.Parcelable.Creator<android.hardware.graphics.common.PlaneLayout> CREATOR = null;
    public PlaneLayout() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
