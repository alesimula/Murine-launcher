package android.hardware.vibrator;

public class CompositeEffect implements android.os.Parcelable {
    public int delayMs;
    public int primitive;
    public float scale;
    public static final android.os.Parcelable.Creator<android.hardware.vibrator.CompositeEffect> CREATOR = null;
    public CompositeEffect() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
