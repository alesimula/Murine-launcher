package android.hardware.power;

public class SupportInfo implements android.os.Parcelable {
    public boolean usesSessions;
    public long boosts;
    public long modes;
    public long sessionHints;
    public long sessionModes;
    public long sessionTags;
    public android.hardware.power.SupportInfo.CompositionDataSupportInfo compositionData;
    public android.hardware.power.SupportInfo.HeadroomSupportInfo headroom;
    public static final android.os.Parcelable.Creator<android.hardware.power.SupportInfo> CREATOR = null;
    public SupportInfo() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }

    public static class CompositionDataSupportInfo implements android.os.Parcelable {
        public boolean isSupported;
        public boolean disableGpuFences;
        public int maxBatchSize;
        public boolean alwaysBatch;
        public static final android.os.Parcelable.Creator<android.hardware.power.SupportInfo.CompositionDataSupportInfo> CREATOR = null;
        public CompositionDataSupportInfo() {}
        public final int getStability() { return 0; }
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
        public final void readFromParcel(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
    }

    public static class HeadroomSupportInfo implements android.os.Parcelable {
        public boolean isCpuSupported;
        public boolean isGpuSupported;
        public int cpuMinIntervalMillis;
        public int gpuMinIntervalMillis;
        public int cpuMinCalculationWindowMillis;
        public int cpuMaxCalculationWindowMillis;
        public int gpuMinCalculationWindowMillis;
        public int gpuMaxCalculationWindowMillis;
        public int cpuMaxTidCount;
        public static final android.os.Parcelable.Creator<android.hardware.power.SupportInfo.HeadroomSupportInfo> CREATOR = null;
        public HeadroomSupportInfo() {}
        public final int getStability() { return 0; }
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
        public final void readFromParcel(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
    }
}
