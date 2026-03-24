package android.hardware.graphics.common;

public class FRect implements android.os.Parcelable {
    public float left;
    public float top;
    public float right;
    public float bottom;
    public static final android.os.Parcelable.Creator<android.hardware.graphics.common.FRect> CREATOR = null;
    public FRect() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
