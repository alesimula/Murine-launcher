package android.telephony;

@android.annotation.SystemApi
public final class NrVopsSupportInfo extends android.telephony.VopsSupportInfo {
    public static final int NR_STATUS_VOPS_NOT_SUPPORTED = 0;
    public static final int NR_STATUS_VOPS_3GPP_SUPPORTED = 1;
    public static final int NR_STATUS_VOPS_NON_3GPP_SUPPORTED = 2;
    public static final int NR_STATUS_EMC_NOT_SUPPORTED = 0;
    public static final int NR_STATUS_EMC_5GCN_ONLY = 1;
    public static final int NR_STATUS_EMC_EUTRA_5GCN_ONLY = 2;
    public static final int NR_STATUS_EMC_NR_EUTRA_5GCN = 3;
    public static final int NR_STATUS_EMF_NOT_SUPPORTED = 0;
    public static final int NR_STATUS_EMF_5GCN_ONLY = 1;
    public static final int NR_STATUS_EMF_EUTRA_5GCN_ONLY = 2;
    public static final int NR_STATUS_EMF_NR_EUTRA_5GCN = 3;
    private final int mVopsSupport = 0;
    private final int mEmcSupport = 0;
    private final int mEmfSupport = 0;
    public static final android.os.Parcelable.Creator<android.telephony.NrVopsSupportInfo> CREATOR = null;
    public NrVopsSupportInfo(int p0, int p1, int p2) { super(); }
    public int getVopsSupport() { return 0; }
    public int getEmcSupport() { return 0; }
    public int getEmfSupport() { return 0; }
    public boolean isVopsSupported() { return false; }
    public boolean isEmergencyServiceSupported() { return false; }
    public boolean isEmergencyServiceFallbackSupported() { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    protected static android.telephony.NrVopsSupportInfo createFromParcelBody(android.os.Parcel p0) { return null; }
    private NrVopsSupportInfo(android.os.Parcel p0) { super(); }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface NrEmcStatus {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface NrEmfStatus {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface NrVopsStatus {
    }
}
