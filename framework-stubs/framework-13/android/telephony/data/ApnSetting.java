package android.telephony.data;

public class ApnSetting implements android.os.Parcelable {
    public static final int UNSET_MTU = 0;
    public static final int TYPE_NONE = 0;
    public static final int TYPE_ALL = 255;
    public static final int TYPE_DEFAULT = 17;
    public static final int TYPE_MMS = 2;
    public static final int TYPE_SUPL = 4;
    public static final int TYPE_DUN = 8;
    public static final int TYPE_HIPRI = 16;
    public static final int TYPE_FOTA = 32;
    public static final int TYPE_IMS = 64;
    public static final int TYPE_CBS = 128;
    public static final int TYPE_IA = 256;
    public static final int TYPE_EMERGENCY = 512;
    public static final int TYPE_MCX = 1024;
    public static final int TYPE_XCAP = 2048;
    public static final int TYPE_VSIM = 4096;
    public static final int TYPE_BIP = 8192;
    public static final int TYPE_ENTERPRISE = 16384;
    public static final int AUTH_TYPE_UNKNOWN = -1;
    public static final int AUTH_TYPE_NONE = 0;
    public static final int AUTH_TYPE_PAP = 1;
    public static final int AUTH_TYPE_CHAP = 2;
    public static final int AUTH_TYPE_PAP_OR_CHAP = 3;
    @android.annotation.SystemApi
    public static final java.lang.String TYPE_ALL_STRING = "*";
    @android.annotation.SystemApi
    public static final java.lang.String TYPE_DEFAULT_STRING = "default";
    @android.annotation.SystemApi
    public static final java.lang.String TYPE_MMS_STRING = "mms";
    @android.annotation.SystemApi
    public static final java.lang.String TYPE_SUPL_STRING = "supl";
    @android.annotation.SystemApi
    public static final java.lang.String TYPE_DUN_STRING = "dun";
    @android.annotation.SystemApi
    public static final java.lang.String TYPE_HIPRI_STRING = "hipri";
    @android.annotation.SystemApi
    public static final java.lang.String TYPE_FOTA_STRING = "fota";
    @android.annotation.SystemApi
    public static final java.lang.String TYPE_IMS_STRING = "ims";
    @android.annotation.SystemApi
    public static final java.lang.String TYPE_CBS_STRING = "cbs";
    @android.annotation.SystemApi
    public static final java.lang.String TYPE_IA_STRING = "ia";
    @android.annotation.SystemApi
    public static final java.lang.String TYPE_EMERGENCY_STRING = "emergency";
    @android.annotation.SystemApi
    public static final java.lang.String TYPE_MCX_STRING = "mcx";
    @android.annotation.SystemApi
    public static final java.lang.String TYPE_XCAP_STRING = "xcap";
    @android.annotation.SystemApi
    public static final java.lang.String TYPE_VSIM_STRING = "vsim";
    @android.annotation.SystemApi
    public static final java.lang.String TYPE_BIP_STRING = "bip";
    @android.annotation.SystemApi
    public static final java.lang.String TYPE_ENTERPRISE_STRING = "enterprise";
    public static final int PROTOCOL_UNKNOWN = -1;
    public static final int PROTOCOL_IP = 0;
    public static final int PROTOCOL_IPV6 = 1;
    public static final int PROTOCOL_IPV4V6 = 2;
    public static final int PROTOCOL_PPP = 3;
    public static final int PROTOCOL_NON_IP = 4;
    public static final int PROTOCOL_UNSTRUCTURED = 5;
    public static final int MVNO_TYPE_SPN = 0;
    public static final int MVNO_TYPE_IMSI = 1;
    public static final int MVNO_TYPE_GID = 2;
    public static final int MVNO_TYPE_ICCID = 3;
    public static final android.os.Parcelable.Creator<android.telephony.data.ApnSetting> CREATOR = null;
    public int getMtuV4() { return 0; }
    public int getMtuV6() { return 0; }
    public int getProfileId() { return 0; }
    public boolean isPersistent() { return false; }
    public int getMaxConns() { return 0; }
    public int getWaitTime() { return 0; }
    public int getMaxConnsTime() { return 0; }
    public java.lang.String getMvnoMatchData() { return null; }
    public int getApnSetId() { return 0; }
    public boolean getPermanentFailed() { return false; }
    public void setPermanentFailed(boolean p0) {}
    public java.lang.String getEntryName() { return null; }
    public java.lang.String getApnName() { return null; }
    @java.lang.Deprecated
    public java.net.InetAddress getProxyAddress() { return null; }
    public java.lang.String getProxyAddressAsString() { return null; }
    public int getProxyPort() { return 0; }
    public android.net.Uri getMmsc() { return null; }
    @java.lang.Deprecated
    public java.net.InetAddress getMmsProxyAddress() { return null; }
    public java.lang.String getMmsProxyAddressAsString() { return null; }
    public int getMmsProxyPort() { return 0; }
    public java.lang.String getUser() { return null; }
    public java.lang.String getPassword() { return null; }
    public int getAuthType() { return 0; }
    public int getApnTypeBitmask() { return 0; }
    public int getId() { return 0; }
    public java.lang.String getOperatorNumeric() { return null; }
    public int getProtocol() { return 0; }
    public int getRoamingProtocol() { return 0; }
    public boolean isEnabled() { return false; }
    public int getNetworkTypeBitmask() { return 0; }
    public long getLingeringNetworkTypeBitmask() { return 0L; }
    public int getMvnoType() { return 0; }
    public int getCarrierId() { return 0; }
    public int getSkip464Xlat() { return 0; }
    public boolean isAlwaysOn() { return false; }
    public static android.telephony.data.ApnSetting makeApnSetting(android.database.Cursor p0) { return null; }
    public static android.telephony.data.ApnSetting makeApnSetting(android.telephony.data.ApnSetting p0) { return null; }
    public java.lang.String toString() { return null; }
    public boolean hasMvnoParams() { return false; }
    public boolean isEmergencyApn() { return false; }
    public boolean canHandleType(int p0) { return false; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public boolean equals(java.lang.Object p0, boolean p1) { return false; }
    public boolean similar(android.telephony.data.ApnSetting p0) { return false; }
    public android.content.ContentValues toContentValues() { return null; }
    public java.util.List<java.lang.Integer> getApnTypes() { return null; }
    public static java.lang.String getApnTypesStringFromBitmask(int p0) { return null; }
    public static int[] getApnTypesFromBitmask(int p0) { return null; }
    @android.annotation.SystemApi
    public static java.lang.String getApnTypeString(int p0) { return null; }
    @android.annotation.SystemApi
    public static int getApnTypeInt(java.lang.String p0) { return 0; }
    public static int getApnTypesBitmaskFromString(java.lang.String p0) { return 0; }
    public static int getMvnoTypeIntFromString(java.lang.String p0) { return 0; }
    public static java.lang.String getMvnoTypeStringFromInt(int p0) { return null; }
    public static int getProtocolIntFromString(java.lang.String p0) { return 0; }
    public static java.lang.String getProtocolStringFromInt(int p0) { return null; }
    public static java.net.InetAddress inetAddressFromString(java.lang.String p0) { return null; }
    public static java.lang.String inetAddressToString(java.net.InetAddress p0) { return null; }
    public boolean canSupportNetworkType(int p0) { return false; }
    public boolean canSupportLingeringNetworkType(int p0) { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ApnType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ApnTypeString {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AuthType {
    }

    public static class Builder {
        public Builder() {}
        public android.telephony.data.ApnSetting.Builder setId(int p0) { return null; }
        public android.telephony.data.ApnSetting.Builder setMtuV4(int p0) { return null; }
        public android.telephony.data.ApnSetting.Builder setMtuV6(int p0) { return null; }
        public android.telephony.data.ApnSetting.Builder setProfileId(int p0) { return null; }
        public android.telephony.data.ApnSetting.Builder setPersistent(boolean p0) { return null; }
        public android.telephony.data.ApnSetting.Builder setModemCognitive(boolean p0) { return null; }
        public android.telephony.data.ApnSetting.Builder setMaxConns(int p0) { return null; }
        public android.telephony.data.ApnSetting.Builder setWaitTime(int p0) { return null; }
        public android.telephony.data.ApnSetting.Builder setMaxConnsTime(int p0) { return null; }
        public android.telephony.data.ApnSetting.Builder setMvnoMatchData(java.lang.String p0) { return null; }
        public android.telephony.data.ApnSetting.Builder setApnSetId(int p0) { return null; }
        public android.telephony.data.ApnSetting.Builder setEntryName(java.lang.String p0) { return null; }
        public android.telephony.data.ApnSetting.Builder setApnName(java.lang.String p0) { return null; }
        @java.lang.Deprecated
        public android.telephony.data.ApnSetting.Builder setProxyAddress(java.net.InetAddress p0) { return null; }
        public android.telephony.data.ApnSetting.Builder setProxyAddress(java.lang.String p0) { return null; }
        public android.telephony.data.ApnSetting.Builder setProxyPort(int p0) { return null; }
        public android.telephony.data.ApnSetting.Builder setMmsc(android.net.Uri p0) { return null; }
        @java.lang.Deprecated
        public android.telephony.data.ApnSetting.Builder setMmsProxyAddress(java.net.InetAddress p0) { return null; }
        public android.telephony.data.ApnSetting.Builder setMmsProxyAddress(java.lang.String p0) { return null; }
        public android.telephony.data.ApnSetting.Builder setMmsProxyPort(int p0) { return null; }
        public android.telephony.data.ApnSetting.Builder setUser(java.lang.String p0) { return null; }
        public android.telephony.data.ApnSetting.Builder setPassword(java.lang.String p0) { return null; }
        public android.telephony.data.ApnSetting.Builder setAuthType(int p0) { return null; }
        public android.telephony.data.ApnSetting.Builder setApnTypeBitmask(int p0) { return null; }
        public android.telephony.data.ApnSetting.Builder setOperatorNumeric(java.lang.String p0) { return null; }
        public android.telephony.data.ApnSetting.Builder setProtocol(int p0) { return null; }
        public android.telephony.data.ApnSetting.Builder setRoamingProtocol(int p0) { return null; }
        public android.telephony.data.ApnSetting.Builder setCarrierEnabled(boolean p0) { return null; }
        public android.telephony.data.ApnSetting.Builder setNetworkTypeBitmask(int p0) { return null; }
        public android.telephony.data.ApnSetting.Builder setLingeringNetworkTypeBitmask(long p0) { return null; }
        public android.telephony.data.ApnSetting.Builder setMvnoType(int p0) { return null; }
        public android.telephony.data.ApnSetting.Builder setCarrierId(int p0) { return null; }
        public android.telephony.data.ApnSetting.Builder setSkip464Xlat(int p0) { return null; }
        public android.telephony.data.ApnSetting.Builder setAlwaysOn(boolean p0) { return null; }
        public android.telephony.data.ApnSetting build() { return null; }
        public android.telephony.data.ApnSetting buildWithoutCheck() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MvnoType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ProtocolType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Skip464XlatStatus {
    }
}
