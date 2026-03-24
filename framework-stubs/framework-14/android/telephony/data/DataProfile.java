package android.telephony.data;

@android.annotation.SystemApi
public final class DataProfile implements android.os.Parcelable {
    public static final int TYPE_COMMON = 0;
    public static final int TYPE_3GPP = 1;
    public static final int TYPE_3GPP2 = 2;
    public static final android.os.Parcelable.Creator<android.telephony.data.DataProfile> CREATOR = null;
    @java.lang.Deprecated
    public int getProfileId() { return 0; }
    @java.lang.Deprecated
    public java.lang.String getApn() { return null; }
    @java.lang.Deprecated
    public int getProtocolType() { return 0; }
    @java.lang.Deprecated
    public int getAuthType() { return 0; }
    @java.lang.Deprecated
    public java.lang.String getUserName() { return null; }
    @java.lang.Deprecated
    public java.lang.String getPassword() { return null; }
    public int getType() { return 0; }
    public int getMaxConnectionsTime() { return 0; }
    public int getMaxConnections() { return 0; }
    public int getWaitTime() { return 0; }
    public boolean isEnabled() { return false; }
    @java.lang.Deprecated
    public int getSupportedApnTypesBitmask() { return 0; }
    @java.lang.Deprecated
    public int getRoamingProtocolType() { return 0; }
    @java.lang.Deprecated
    public int getBearerBitmask() { return 0; }
    @java.lang.Deprecated
    public int getMtu() { return 0; }
    @java.lang.Deprecated
    public int getMtuV4() { return 0; }
    @java.lang.Deprecated
    public int getMtuV6() { return 0; }
    @java.lang.Deprecated
    public boolean isPersistent() { return false; }
    public void setPreferred(boolean p0) {}
    public boolean isPreferred() { return false; }
    public android.telephony.data.ApnSetting getApnSetting() { return null; }
    public android.telephony.data.TrafficDescriptor getTrafficDescriptor() { return null; }
    public boolean canSatisfy(int[] p0) { return false; }
    public boolean canSatisfy(int p0) { return false; }
    public void setLastSetupTimestamp(long p0) {}
    public long getLastSetupTimestamp() { return 0L; }
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class Builder {
        public Builder() {}
        @java.lang.Deprecated
        public android.telephony.data.DataProfile.Builder setProfileId(int p0) { return null; }
        @java.lang.Deprecated
        public android.telephony.data.DataProfile.Builder setApn(java.lang.String p0) { return null; }
        @java.lang.Deprecated
        public android.telephony.data.DataProfile.Builder setProtocolType(int p0) { return null; }
        @java.lang.Deprecated
        public android.telephony.data.DataProfile.Builder setAuthType(int p0) { return null; }
        @java.lang.Deprecated
        public android.telephony.data.DataProfile.Builder setUserName(java.lang.String p0) { return null; }
        @java.lang.Deprecated
        public android.telephony.data.DataProfile.Builder setPassword(java.lang.String p0) { return null; }
        public android.telephony.data.DataProfile.Builder setType(int p0) { return null; }
        public android.telephony.data.DataProfile.Builder enable(boolean p0) { return null; }
        @java.lang.Deprecated
        public android.telephony.data.DataProfile.Builder setSupportedApnTypesBitmask(int p0) { return null; }
        @java.lang.Deprecated
        public android.telephony.data.DataProfile.Builder setRoamingProtocolType(int p0) { return null; }
        @java.lang.Deprecated
        public android.telephony.data.DataProfile.Builder setBearerBitmask(int p0) { return null; }
        @java.lang.Deprecated
        public android.telephony.data.DataProfile.Builder setMtu(int p0) { return null; }
        @java.lang.Deprecated
        public android.telephony.data.DataProfile.Builder setMtuV4(int p0) { return null; }
        @java.lang.Deprecated
        public android.telephony.data.DataProfile.Builder setMtuV6(int p0) { return null; }
        public android.telephony.data.DataProfile.Builder setPreferred(boolean p0) { return null; }
        @java.lang.Deprecated
        public android.telephony.data.DataProfile.Builder setPersistent(boolean p0) { return null; }
        public android.telephony.data.DataProfile.Builder setApnSetting(android.telephony.data.ApnSetting p0) { return null; }
        public android.telephony.data.DataProfile.Builder setTrafficDescriptor(android.telephony.data.TrafficDescriptor p0) { return null; }
        public android.telephony.data.DataProfile build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Type {
    }
}
