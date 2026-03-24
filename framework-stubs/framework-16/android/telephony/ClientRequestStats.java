package android.telephony;

public final class ClientRequestStats implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.ClientRequestStats> CREATOR = null;
    public ClientRequestStats(android.os.Parcel p0) {}
    public ClientRequestStats() {}
    public ClientRequestStats(android.telephony.ClientRequestStats p0) {}
    public java.lang.String getCallingPackage() { return null; }
    public void setCallingPackage(java.lang.String p0) {}
    public long getCompletedRequestsWakelockTime() { return 0L; }
    public void addCompletedWakelockTime(long p0) {}
    public long getPendingRequestsWakelockTime() { return 0L; }
    public void setPendingRequestsWakelockTime(long p0) {}
    public long getCompletedRequestsCount() { return 0L; }
    public void incrementCompletedRequestsCount() {}
    public long getPendingRequestsCount() { return 0L; }
    public void setPendingRequestsCount(long p0) {}
    public java.util.List<android.telephony.TelephonyHistogram> getRequestHistograms() { return null; }
    public void updateRequestHistograms(int p0, int p1) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
