package android.content.pm.verify.domain;

@android.annotation.SystemApi
public final class DomainVerificationInfo implements android.os.Parcelable {
    public static final int STATE_NO_RESPONSE = 0;
    public static final int STATE_SUCCESS = 1;
    public static final int STATE_UNMODIFIABLE = 2;
    public static final int STATE_MODIFIABLE_UNVERIFIED = 3;
    public static final int STATE_MODIFIABLE_VERIFIED = 4;
    public static final int STATE_FIRST_VERIFIER_DEFINED = 1024;
    static com.android.internal.util.Parcelling<java.util.UUID> sParcellingForIdentifier;
    public static final android.os.Parcelable.Creator<android.content.pm.verify.domain.DomainVerificationInfo> CREATOR = null;
    public static java.lang.String stateToString(int p0) { return null; }
    public DomainVerificationInfo(java.util.UUID p0, java.lang.String p1, java.util.Map<java.lang.String, java.lang.Integer> p2) {}
    public java.util.UUID getIdentifier() { return null; }
    public java.lang.String getPackageName() { return null; }
    public java.util.Map<java.lang.String, java.lang.Integer> getHostToStateMap() { return null; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    DomainVerificationInfo(android.os.Parcel p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface State {
    }
}
