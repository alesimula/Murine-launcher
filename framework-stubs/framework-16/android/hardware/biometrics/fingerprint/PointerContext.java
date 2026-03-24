package android.hardware.biometrics.fingerprint;

public class PointerContext implements android.os.Parcelable {
    public int pointerId;
    public float x;
    public float y;
    public float minor;
    public float major;
    public float orientation;
    public boolean isAod;
    public long time;
    public long gestureStart;
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.fingerprint.PointerContext> CREATOR = null;
    public PointerContext() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
}
