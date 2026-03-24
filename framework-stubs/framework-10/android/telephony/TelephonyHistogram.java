package android.telephony;

@android.annotation.SystemApi
public final class TelephonyHistogram implements android.os.Parcelable {
    private final int mCategory = 0;
    private final int mId = 0;
    private int mMinTimeMs;
    private int mMaxTimeMs;
    private int mAverageTimeMs;
    private int mSampleCount;
    private int[] mInitialTimings;
    private final int mBucketCount = 0;
    private final int[] mBucketEndPoints = null;
    private final int[] mBucketCounters = null;
    public static final int TELEPHONY_CATEGORY_RIL = 1;
    private static final int RANGE_CALCULATION_COUNT = 10;
    private static final int ABSENT = 0;
    private static final int PRESENT = 1;
    public static final android.os.Parcelable.Creator<android.telephony.TelephonyHistogram> CREATOR = null;
    public TelephonyHistogram(int p0, int p1, int p2) {}
    public TelephonyHistogram(android.telephony.TelephonyHistogram p0) {}
    public int getCategory() { return 0; }
    public int getId() { return 0; }
    public int getMinTime() { return 0; }
    public int getMaxTime() { return 0; }
    public int getAverageTime() { return 0; }
    public int getSampleCount() { return 0; }
    private int[] getInitialTimings() { return null; }
    public int getBucketCount() { return 0; }
    public int[] getBucketEndPoints() { return null; }
    public int[] getBucketCounters() { return null; }
    private int[] getDeepCopyOfArray(int[] p0) { return null; }
    private void addToBucketCounter(int[] p0, int[] p1, int p2) {}
    private void calculateBucketEndPoints(int[] p0) {}
    public void addTimeTaken(int p0) {}
    public java.lang.String toString() { return null; }
    public TelephonyHistogram(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
}
