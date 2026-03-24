package android.graphics;

public class PointF implements android.os.Parcelable {
    public float x;
    public float y;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.graphics.PointF> CREATOR = null;
    public PointF() {}
    public PointF(float p0, float p1) {}
    public PointF(android.graphics.Point p0) {}
    public PointF(android.graphics.PointF p0) {}
    public final void set(float p0, float p1) {}
    public final void set(android.graphics.PointF p0) {}
    public final void negate() {}
    public final void offset(float p0, float p1) {}
    public final boolean equals(float p0, float p1) { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public final float length() { return 0.0f; }
    public static float length(float p0, float p1) { return 0.0f; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
}
