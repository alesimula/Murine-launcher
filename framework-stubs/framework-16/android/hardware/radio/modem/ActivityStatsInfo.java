package android.hardware.radio.modem;

public class ActivityStatsInfo implements android.os.Parcelable {
    public int sleepModeTimeMs;
    public int idleModeTimeMs;
    public android.hardware.radio.modem.ActivityStatsTechSpecificInfo[] techSpecificInfo;
    public static final android.os.Parcelable.Creator<android.hardware.radio.modem.ActivityStatsInfo> CREATOR = null;
    public ActivityStatsInfo() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
