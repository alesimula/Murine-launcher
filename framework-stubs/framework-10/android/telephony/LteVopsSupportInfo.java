package android.telephony;

@android.annotation.SystemApi
public final class LteVopsSupportInfo implements android.os.Parcelable {
    public static final int LTE_STATUS_NOT_AVAILABLE = 1;
    public static final int LTE_STATUS_SUPPORTED = 2;
    public static final int LTE_STATUS_NOT_SUPPORTED = 3;
    private final int mVopsSupport = 0;
    private final int mEmcBearerSupport = 0;
    public static final android.os.Parcelable.Creator<android.telephony.LteVopsSupportInfo> CREATOR = null;
    public LteVopsSupportInfo(int p0, int p1) {}
    public int getVopsSupport() { return 0; }
    public int getEmcBearerSupport() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    private LteVopsSupportInfo(android.os.Parcel p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LteVopsStatus {
    }
}
