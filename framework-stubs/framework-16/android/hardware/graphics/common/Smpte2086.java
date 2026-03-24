package android.hardware.graphics.common;

public class Smpte2086 implements android.os.Parcelable {
    public android.hardware.graphics.common.XyColor primaryRed;
    public android.hardware.graphics.common.XyColor primaryGreen;
    public android.hardware.graphics.common.XyColor primaryBlue;
    public android.hardware.graphics.common.XyColor whitePoint;
    public float maxLuminance;
    public float minLuminance;
    public static final android.os.Parcelable.Creator<android.hardware.graphics.common.Smpte2086> CREATOR = null;
    public Smpte2086() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
