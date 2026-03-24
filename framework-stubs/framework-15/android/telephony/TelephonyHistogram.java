package android.telephony;

@android.annotation.SystemApi
public final class TelephonyHistogram implements android.os.Parcelable {
    public static final int TELEPHONY_CATEGORY_RIL = 1;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.TelephonyHistogram> CREATOR = null;
    public TelephonyHistogram(int p0, int p1, int p2) {}
    public TelephonyHistogram(android.telephony.TelephonyHistogram p0) {}
    public int getCategory() { return 0; }
    public int getId() { return 0; }
    public int getMinTime() { return 0; }
    public int getMaxTime() { return 0; }
    public int getAverageTime() { return 0; }
    public int getSampleCount() { return 0; }
    public int getBucketCount() { return 0; }
    public int[] getBucketEndPoints() { return null; }
    public int[] getBucketCounters() { return null; }
    public void addTimeTaken(int p0) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public TelephonyHistogram(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
}
