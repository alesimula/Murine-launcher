package android.telephony;

@android.annotation.SystemApi
public final class LteVopsSupportInfo extends android.telephony.VopsSupportInfo {
    @java.lang.Deprecated
    public static final int LTE_STATUS_NOT_AVAILABLE = 1;
    public static final int LTE_STATUS_SUPPORTED = 2;
    public static final int LTE_STATUS_NOT_SUPPORTED = 3;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.LteVopsSupportInfo> CREATOR = null;
    public LteVopsSupportInfo(int p0, int p1) { super(); }
    public int getVopsSupport() { return 0; }
    public int getEmcBearerSupport() { return 0; }
    public boolean isVopsSupported() { return false; }
    public boolean isEmergencyServiceSupported() { return false; }
    public boolean isEmergencyServiceFallbackSupported() { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    protected static android.telephony.LteVopsSupportInfo createFromParcelBody(android.os.Parcel p0) { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LteVopsStatus {
    }
}
