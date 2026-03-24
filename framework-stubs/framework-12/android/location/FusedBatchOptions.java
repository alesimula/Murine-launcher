package android.location;

public class FusedBatchOptions implements android.os.Parcelable {
    private volatile long mPeriodInNS;
    private volatile int mSourcesToUse;
    private volatile int mFlags;
    private volatile double mMaxPowerAllocationInMW;
    private volatile float mSmallestDisplacementMeters;
    public static final android.os.Parcelable.Creator<android.location.FusedBatchOptions> CREATOR = null;
    public FusedBatchOptions() {}
    public void setMaxPowerAllocationInMW(double p0) {}
    public double getMaxPowerAllocationInMW() { return 0.0; }
    public void setPeriodInNS(long p0) {}
    public long getPeriodInNS() { return 0L; }
    public void setSmallestDisplacementMeters(float p0) {}
    public float getSmallestDisplacementMeters() { return 0.0f; }
    public void setSourceToUse(int p0) {}
    public void resetSourceToUse(int p0) {}
    public boolean isSourceToUseSet(int p0) { return false; }
    public int getSourcesToUse() { return 0; }
    public void setFlag(int p0) {}
    public void resetFlag(int p0) {}
    public boolean isFlagSet(int p0) { return false; }
    public int getFlags() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class BatchFlags {
        public static int WAKEUP_ON_FIFO_FULL;
        public static int CALLBACK_ON_LOCATION_FIX;
        public BatchFlags() {}
    }

    public static final class SourceTechnologies {
        public static int GNSS;
        public static int WIFI;
        public static int SENSORS;
        public static int CELL;
        public static int BLUETOOTH;
        public SourceTechnologies() {}
    }
}
