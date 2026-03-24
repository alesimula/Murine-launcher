package android.telephony.data;

public class ApnSetting implements android.os.Parcelable {
    private static final java.lang.String LOG_TAG = "ApnSetting";
    private static final boolean VDBG = false;
    private static final java.lang.String V2_FORMAT_REGEX = "^\\[ApnSettingV2\\]\\s*";
    private static final java.lang.String V3_FORMAT_REGEX = "^\\[ApnSettingV3\\]\\s*";
    private static final java.lang.String V4_FORMAT_REGEX = "^\\[ApnSettingV4\\]\\s*";
    private static final java.lang.String V5_FORMAT_REGEX = "^\\[ApnSettingV5\\]\\s*";
    private static final java.lang.String V6_FORMAT_REGEX = "^\\[ApnSettingV6\\]\\s*";
    private static final java.lang.String V7_FORMAT_REGEX = "^\\[ApnSettingV7\\]\\s*";
    public static final int UNSET_MTU = 0;
    private static final int UNSPECIFIED_INT = -1;
    private static final java.lang.String UNSPECIFIED_STRING = "";
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
    public static final java.lang.String TYPE_ENTERPRISE_STRING = "enterprise";
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
    private static final java.util.Map<java.lang.String, java.lang.Integer> APN_TYPE_STRING_MAP = null;
    private static final java.util.Map<java.lang.Integer, java.lang.String> APN_TYPE_INT_MAP = null;
    private static final java.util.Map<java.lang.String, java.lang.Integer> PROTOCOL_STRING_MAP = null;
    private static final java.util.Map<java.lang.Integer, java.lang.String> PROTOCOL_INT_MAP = null;
    private static final java.util.Map<java.lang.String, java.lang.Integer> MVNO_TYPE_STRING_MAP = null;
    private static final java.util.Map<java.lang.Integer, java.lang.String> MVNO_TYPE_INT_MAP = null;
    private final java.lang.String mEntryName = null;
    private final java.lang.String mApnName = null;
    private final java.lang.String mProxyAddress = null;
    private final int mProxyPort = 0;
    private final android.net.Uri mMmsc = null;
    private final java.lang.String mMmsProxyAddress = null;
    private final int mMmsProxyPort = 0;
    private final java.lang.String mUser = null;
    private final java.lang.String mPassword = null;
    private final int mAuthType = 0;
    private final int mApnTypeBitmask = 0;
    private final int mId = 0;
    private final java.lang.String mOperatorNumeric = null;
    private final int mProtocol = 0;
    private final int mRoamingProtocol = 0;
    private final int mMtu = 0;
    private final boolean mCarrierEnabled = false;
    private final int mNetworkTypeBitmask = 0;
    private final int mProfileId = 0;
    private final boolean mPersistent = false;
    private final int mMaxConns = 0;
    private final int mWaitTime = 0;
    private final int mMaxConnsTime = 0;
    private final int mMvnoType = 0;
    private final java.lang.String mMvnoMatchData = null;
    private final int mApnSetId = 0;
    private boolean mPermanentFailed;
    private final int mCarrierId = 0;
    private final int mSkip464Xlat = 0;
    public static final android.os.Parcelable.Creator<android.telephony.data.ApnSetting> CREATOR = null;
    public int getMtu() { return 0; }
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
    public int getMvnoType() { return 0; }
    public int getCarrierId() { return 0; }
    public int getSkip464Xlat() { return 0; }
    private ApnSetting(android.telephony.data.ApnSetting.Builder p0) {}
    public static android.telephony.data.ApnSetting makeApnSetting(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, int p5, android.net.Uri p6, java.lang.String p7, int p8, java.lang.String p9, java.lang.String p10, int p11, int p12, int p13, int p14, boolean p15, int p16, int p17, boolean p18, int p19, int p20, int p21, int p22, int p23, java.lang.String p24, int p25, int p26, int p27) { return null; }
    public static android.telephony.data.ApnSetting makeApnSetting(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, int p5, android.net.Uri p6, java.lang.String p7, int p8, java.lang.String p9, java.lang.String p10, int p11, int p12, int p13, int p14, boolean p15, int p16, int p17, boolean p18, int p19, int p20, int p21, int p22, int p23, java.lang.String p24) { return null; }
    public static android.telephony.data.ApnSetting makeApnSetting(android.database.Cursor p0) { return null; }
    public static android.telephony.data.ApnSetting makeApnSetting(android.telephony.data.ApnSetting p0) { return null; }
    public static android.telephony.data.ApnSetting fromString(java.lang.String p0) { return null; }
    public static java.util.List<android.telephony.data.ApnSetting> arrayFromString(java.lang.String p0) { return null; }
    public java.lang.String toString() { return null; }
    public boolean hasMvnoParams() { return false; }
    private boolean hasApnType(int p0) { return false; }
    public boolean isEmergencyApn() { return false; }
    public boolean canHandleType(int p0) { return false; }
    private boolean typeSameAny(android.telephony.data.ApnSetting p0, android.telephony.data.ApnSetting p1) { return false; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public boolean equals(java.lang.Object p0, boolean p1) { return false; }
    public boolean similar(android.telephony.data.ApnSetting p0) { return false; }
    private boolean xorEquals(java.lang.Object p0, java.lang.Object p1) { return false; }
    private boolean xorEqualsString(java.lang.String p0, java.lang.String p1) { return false; }
    private boolean xorEqualsInt(int p0, int p1) { return false; }
    private java.lang.String nullToEmpty(java.lang.String p0) { return null; }
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
    private static android.net.Uri UriFromString(java.lang.String p0) { return null; }
    private static java.lang.String UriToString(android.net.Uri p0) { return null; }
    public static java.net.InetAddress inetAddressFromString(java.lang.String p0) { return null; }
    public static java.lang.String inetAddressToString(java.net.InetAddress p0) { return null; }
    private static int portFromString(java.lang.String p0) { return 0; }
    private static java.lang.String portToString(int p0) { return null; }
    public boolean canSupportNetworkType(int p0) { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private static android.telephony.data.ApnSetting readFromParcel(android.os.Parcel p0) { return null; }

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
        private java.lang.String mEntryName;
        private java.lang.String mApnName;
        private java.lang.String mProxyAddress;
        private int mProxyPort;
        private android.net.Uri mMmsc;
        private java.lang.String mMmsProxyAddress;
        private int mMmsProxyPort;
        private java.lang.String mUser;
        private java.lang.String mPassword;
        private int mAuthType;
        private int mApnTypeBitmask;
        private int mId;
        private java.lang.String mOperatorNumeric;
        private int mProtocol;
        private int mRoamingProtocol;
        private int mMtu;
        private int mNetworkTypeBitmask;
        private boolean mCarrierEnabled;
        private int mProfileId;
        private boolean mModemCognitive;
        private int mMaxConns;
        private int mWaitTime;
        private int mMaxConnsTime;
        private int mMvnoType;
        private java.lang.String mMvnoMatchData;
        private int mApnSetId;
        private int mCarrierId;
        private int mSkip464Xlat;
        public Builder() {}
        private android.telephony.data.ApnSetting.Builder setId(int p0) { return null; }
        public android.telephony.data.ApnSetting.Builder setMtu(int p0) { return null; }
        public android.telephony.data.ApnSetting.Builder setProfileId(int p0) { return null; }
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
        public android.telephony.data.ApnSetting.Builder setMvnoType(int p0) { return null; }
        public android.telephony.data.ApnSetting.Builder setCarrierId(int p0) { return null; }
        public android.telephony.data.ApnSetting.Builder setSkip464Xlat(int p0) { return null; }
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
