package android.hardware.vibrator;

public final class PrimitivePwle implements android.os.Parcelable {
    public static final int active = 0;
    public static final int braking = 1;
    public static final android.os.Parcelable.Creator<android.hardware.vibrator.PrimitivePwle> CREATOR = null;
    public PrimitivePwle() {}
    public int getTag() { return 0; }
    public static android.hardware.vibrator.PrimitivePwle active(android.hardware.vibrator.ActivePwle p0) { return null; }
    public android.hardware.vibrator.ActivePwle getActive() { return null; }
    public void setActive(android.hardware.vibrator.ActivePwle p0) {}
    public static android.hardware.vibrator.PrimitivePwle braking(android.hardware.vibrator.BrakingPwle p0) { return null; }
    public android.hardware.vibrator.BrakingPwle getBraking() { return null; }
    public void setBraking(android.hardware.vibrator.BrakingPwle p0) {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }

    public static @interface Tag {
        public static final int active = 0;
        public static final int braking = 1;
    }
}
