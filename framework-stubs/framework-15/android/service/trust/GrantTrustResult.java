package android.service.trust;

@android.annotation.SystemApi
public final class GrantTrustResult implements android.os.Parcelable {
    public static final int STATUS_UNKNOWN = 0;
    public static final int STATUS_UNLOCKED_BY_GRANT = 1;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.service.trust.GrantTrustResult> CREATOR = null;
    @android.annotation.NonNull
    public static java.lang.String statusToString(int p0) { return null; }
    public GrantTrustResult(int p0) {}
    public int getStatus() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    GrantTrustResult(android.os.Parcel p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Status {
    }
}
