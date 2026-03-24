package android.os.connectivity;

public final class GpsBatteryStats implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.os.connectivity.GpsBatteryStats> CREATOR = null;
    public GpsBatteryStats() {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public long getLoggingDurationMs() { return 0L; }
    public long getEnergyConsumedMaMs() { return 0L; }
    public long[] getTimeInGpsSignalQualityLevel() { return null; }
    public void setLoggingDurationMs(long p0) {}
    public void setEnergyConsumedMaMs(long p0) {}
    public void setTimeInGpsSignalQualityLevel(long[] p0) {}
    public int describeContents() { return 0; }
}
