package android.telephony;

@android.annotation.SystemApi
public final class DataSpecificRegistrationInfo implements android.os.Parcelable {
    public final int maxDataCalls = 0;
    public final boolean isDcNrRestricted = false;
    public final boolean isNrAvailable = false;
    public final boolean isEnDcAvailable = false;
    private final android.telephony.LteVopsSupportInfo mLteVopsSupportInfo = null;
    public boolean mIsUsingCarrierAggregation;
    public static final android.os.Parcelable.Creator<android.telephony.DataSpecificRegistrationInfo> CREATOR = null;
    DataSpecificRegistrationInfo(int p0, boolean p1, boolean p2, boolean p3, android.telephony.LteVopsSupportInfo p4, boolean p5) {}
    DataSpecificRegistrationInfo(android.telephony.DataSpecificRegistrationInfo p0) {}
    private DataSpecificRegistrationInfo(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.telephony.LteVopsSupportInfo getLteVopsSupportInfo() { return null; }
    public void setIsUsingCarrierAggregation(boolean p0) {}
    public boolean isUsingCarrierAggregation() { return false; }
}
