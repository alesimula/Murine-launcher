package android.hardware.radio.modem;

public class ActivityStatsTechSpecificInfo implements android.os.Parcelable {
    public int rat;
    public int frequencyRange;
    public int[] txmModetimeMs;
    public int rxModeTimeMs;
    public static final android.os.Parcelable.Creator<android.hardware.radio.modem.ActivityStatsTechSpecificInfo> CREATOR = null;
    public static final int FREQUENCY_RANGE_UNKNOWN = 0;
    public static final int FREQUENCY_RANGE_LOW = 1;
    public static final int FREQUENCY_RANGE_MID = 2;
    public static final int FREQUENCY_RANGE_HIGH = 3;
    public static final int FREQUENCY_RANGE_MMWAVE = 4;
    public ActivityStatsTechSpecificInfo() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
