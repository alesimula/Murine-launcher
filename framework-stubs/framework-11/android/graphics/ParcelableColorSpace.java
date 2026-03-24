package android.graphics;

public final class ParcelableColorSpace extends android.graphics.ColorSpace implements android.os.Parcelable {
    private final android.graphics.ColorSpace mColorSpace = null;
    public static final android.os.Parcelable.Creator<android.graphics.ParcelableColorSpace> CREATOR = null;
    public static boolean isParcelable(android.graphics.ColorSpace p0) { return false; }
    public ParcelableColorSpace(android.graphics.ColorSpace p0) { super(null, null, 0); }
    public android.graphics.ColorSpace getColorSpace() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean isWideGamut() { return false; }
    public float getMinValue(int p0) { return 0.0f; }
    public float getMaxValue(int p0) { return 0.0f; }
    public float[] toXyz(float[] p0) { return null; }
    public float[] fromXyz(float[] p0) { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    long getNativeInstance() { return 0L; }
}
