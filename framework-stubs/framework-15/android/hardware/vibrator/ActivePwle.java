package android.hardware.vibrator;

public class ActivePwle implements android.os.Parcelable {
    public float startAmplitude;
    public float startFrequency;
    public float endAmplitude;
    public float endFrequency;
    public int duration;
    public static final android.os.Parcelable.Creator<android.hardware.vibrator.ActivePwle> CREATOR = null;
    public ActivePwle() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
