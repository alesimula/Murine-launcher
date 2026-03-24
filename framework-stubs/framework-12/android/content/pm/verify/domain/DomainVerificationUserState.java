package android.content.pm.verify.domain;

public final class DomainVerificationUserState implements android.os.Parcelable {
    public static final int DOMAIN_STATE_NONE = 0;
    public static final int DOMAIN_STATE_SELECTED = 1;
    public static final int DOMAIN_STATE_VERIFIED = 2;
    private final java.util.UUID mIdentifier = null;
    private final java.lang.String mPackageName = null;
    private final android.os.UserHandle mUser = null;
    private final boolean mLinkHandlingAllowed = false;
    private final java.util.Map<java.lang.String, java.lang.Integer> mHostToStateMap = null;
    static com.android.internal.util.Parcelling<java.util.UUID> sParcellingForIdentifier;
    public static final android.os.Parcelable.Creator<android.content.pm.verify.domain.DomainVerificationUserState> CREATOR = null;
    private void parcelHostToStateMap(android.os.Parcel p0, int p1) {}
    private java.util.Map<java.lang.String, java.lang.Integer> unparcelHostToStateMap(android.os.Parcel p0) { return null; }
    @android.annotation.SystemApi
    public java.util.UUID getIdentifier() { return null; }
    public static java.lang.String domainStateToString(int p0) { return null; }
    public DomainVerificationUserState(java.util.UUID p0, java.lang.String p1, android.os.UserHandle p2, boolean p3, java.util.Map<java.lang.String, java.lang.Integer> p4) {}
    public java.lang.String getPackageName() { return null; }
    public android.os.UserHandle getUser() { return null; }
    public boolean isLinkHandlingAllowed() { return false; }
    public java.util.Map<java.lang.String, java.lang.Integer> getHostToStateMap() { return null; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    DomainVerificationUserState(android.os.Parcel p0) {}
    @java.lang.Deprecated
    private void __metadata() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DomainState {
    }
}
