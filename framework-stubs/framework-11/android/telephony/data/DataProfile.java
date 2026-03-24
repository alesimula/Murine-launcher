package android.telephony.data;

@android.annotation.SystemApi
public final class DataProfile implements android.os.Parcelable {
    public static final int TYPE_COMMON = 0;
    public static final int TYPE_3GPP = 1;
    public static final int TYPE_3GPP2 = 2;
    private final int mProfileId = 0;
    private final java.lang.String mApn = null;
    private final int mProtocolType = 0;
    private final int mAuthType = 0;
    private final java.lang.String mUserName = null;
    private final java.lang.String mPassword = null;
    private final int mType = 0;
    private final int mMaxConnectionsTime = 0;
    private final int mMaxConnections = 0;
    private final int mWaitTime = 0;
    private final boolean mEnabled = false;
    private final int mSupportedApnTypesBitmask = 0;
    private final int mRoamingProtocolType = 0;
    private final int mBearerBitmask = 0;
    private final int mMtuV4 = 0;
    private final int mMtuV6 = 0;
    private final boolean mPersistent = false;
    private final boolean mPreferred = false;
    public static final android.os.Parcelable.Creator<android.telephony.data.DataProfile> CREATOR = null;
    private DataProfile(int p0, java.lang.String p1, int p2, int p3, java.lang.String p4, java.lang.String p5, int p6, int p7, int p8, int p9, boolean p10, int p11, int p12, int p13, int p14, int p15, boolean p16, boolean p17) {}
    private DataProfile(android.os.Parcel p0) {}
    public int getProfileId() { return 0; }
    public java.lang.String getApn() { return null; }
    public int getProtocolType() { return 0; }
    public int getAuthType() { return 0; }
    public java.lang.String getUserName() { return null; }
    public java.lang.String getPassword() { return null; }
    public int getType() { return 0; }
    public int getMaxConnectionsTime() { return 0; }
    public int getMaxConnections() { return 0; }
    public int getWaitTime() { return 0; }
    public boolean isEnabled() { return false; }
    public int getSupportedApnTypesBitmask() { return 0; }
    public int getRoamingProtocolType() { return 0; }
    public int getBearerBitmask() { return 0; }
    @java.lang.Deprecated
    public int getMtu() { return 0; }
    public int getMtuV4() { return 0; }
    public int getMtuV6() { return 0; }
    public boolean isPersistent() { return false; }
    public boolean isPreferred() { return false; }
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class Builder {
        private int mProfileId;
        private java.lang.String mApn;
        private int mProtocolType;
        private int mAuthType;
        private java.lang.String mUserName;
        private java.lang.String mPassword;
        private int mType;
        private int mMaxConnectionsTime;
        private int mMaxConnections;
        private int mWaitTime;
        private boolean mEnabled;
        private int mSupportedApnTypesBitmask;
        private int mRoamingProtocolType;
        private int mBearerBitmask;
        private int mMtuV4;
        private int mMtuV6;
        private boolean mPersistent;
        private boolean mPreferred;
        public Builder() {}
        public android.telephony.data.DataProfile.Builder setProfileId(int p0) { return null; }
        public android.telephony.data.DataProfile.Builder setApn(java.lang.String p0) { return null; }
        public android.telephony.data.DataProfile.Builder setProtocolType(int p0) { return null; }
        public android.telephony.data.DataProfile.Builder setAuthType(int p0) { return null; }
        public android.telephony.data.DataProfile.Builder setUserName(java.lang.String p0) { return null; }
        public android.telephony.data.DataProfile.Builder setPassword(java.lang.String p0) { return null; }
        public android.telephony.data.DataProfile.Builder setType(int p0) { return null; }
        public android.telephony.data.DataProfile.Builder setMaxConnectionsTime(int p0) { return null; }
        public android.telephony.data.DataProfile.Builder setMaxConnections(int p0) { return null; }
        public android.telephony.data.DataProfile.Builder setWaitTime(int p0) { return null; }
        public android.telephony.data.DataProfile.Builder enable(boolean p0) { return null; }
        public android.telephony.data.DataProfile.Builder setSupportedApnTypesBitmask(int p0) { return null; }
        public android.telephony.data.DataProfile.Builder setRoamingProtocolType(int p0) { return null; }
        public android.telephony.data.DataProfile.Builder setBearerBitmask(int p0) { return null; }
        public android.telephony.data.DataProfile.Builder setMtu(int p0) { return null; }
        public android.telephony.data.DataProfile.Builder setMtuV4(int p0) { return null; }
        public android.telephony.data.DataProfile.Builder setMtuV6(int p0) { return null; }
        public android.telephony.data.DataProfile.Builder setPreferred(boolean p0) { return null; }
        public android.telephony.data.DataProfile.Builder setPersistent(boolean p0) { return null; }
        public android.telephony.data.DataProfile build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Type {
    }
}
