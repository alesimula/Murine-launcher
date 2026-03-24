package android.hardware.input;

public class TouchCalibration implements android.os.Parcelable {
    public static final android.hardware.input.TouchCalibration IDENTITY = null;
    public static final android.os.Parcelable.Creator<android.hardware.input.TouchCalibration> CREATOR = null;
    private final float mXScale = 0.0f;
    private final float mXYMix = 0.0f;
    private final float mXOffset = 0.0f;
    private final float mYXMix = 0.0f;
    private final float mYScale = 0.0f;
    private final float mYOffset = 0.0f;
    public TouchCalibration() {}
    public TouchCalibration(float p0, float p1, float p2, float p3, float p4, float p5) {}
    public TouchCalibration(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public float[] getAffineTransform() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
}
