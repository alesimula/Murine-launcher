package android.service.euicc;

@android.annotation.SystemApi
public final class EuiccProfileInfo implements android.os.Parcelable {
    public static final int POLICY_RULE_DO_NOT_DISABLE = 1;
    public static final int POLICY_RULE_DO_NOT_DELETE = 2;
    public static final int POLICY_RULE_DELETE_AFTER_DISABLING = 4;
    public static final int PROFILE_CLASS_TESTING = 0;
    public static final int PROFILE_CLASS_PROVISIONING = 1;
    public static final int PROFILE_CLASS_OPERATIONAL = 2;
    public static final int PROFILE_CLASS_UNSET = -1;
    public static final int PROFILE_STATE_DISABLED = 0;
    public static final int PROFILE_STATE_ENABLED = 1;
    public static final int PROFILE_STATE_UNSET = -1;
    private final java.lang.String mIccid = null;
    private final java.lang.String mNickname = null;
    private final java.lang.String mServiceProviderName = null;
    private final java.lang.String mProfileName = null;
    private final int mProfileClass = 0;
    private final int mState = 0;
    private final android.service.carrier.CarrierIdentifier mCarrierIdentifier = null;
    private final int mPolicyRules = 0;
    private final android.telephony.UiccAccessRule[] mAccessRules = null;
    public static final android.os.Parcelable.Creator<android.service.euicc.EuiccProfileInfo> CREATOR = null;
    @java.lang.Deprecated
    public EuiccProfileInfo(java.lang.String p0, android.telephony.UiccAccessRule[] p1, java.lang.String p2) {}
    private EuiccProfileInfo(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    private EuiccProfileInfo(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, int p4, int p5, android.service.carrier.CarrierIdentifier p6, int p7, java.util.List<android.telephony.UiccAccessRule> p8) {}
    public java.lang.String getIccid() { return null; }
    public java.util.List<android.telephony.UiccAccessRule> getUiccAccessRules() { return null; }
    public java.lang.String getNickname() { return null; }
    public java.lang.String getServiceProviderName() { return null; }
    public java.lang.String getProfileName() { return null; }
    public int getProfileClass() { return 0; }
    public int getState() { return 0; }
    public android.service.carrier.CarrierIdentifier getCarrierIdentifier() { return null; }
    public int getPolicyRules() { return 0; }
    public boolean hasPolicyRules() { return false; }
    public boolean hasPolicyRule(int p0) { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        private java.lang.String mIccid;
        private java.util.List<android.telephony.UiccAccessRule> mAccessRules;
        private java.lang.String mNickname;
        private java.lang.String mServiceProviderName;
        private java.lang.String mProfileName;
        private int mProfileClass;
        private int mState;
        private android.service.carrier.CarrierIdentifier mCarrierIdentifier;
        private int mPolicyRules;
        public Builder(java.lang.String p0) {}
        public Builder(android.service.euicc.EuiccProfileInfo p0) {}
        public android.service.euicc.EuiccProfileInfo build() { return null; }
        public android.service.euicc.EuiccProfileInfo.Builder setIccid(java.lang.String p0) { return null; }
        public android.service.euicc.EuiccProfileInfo.Builder setNickname(java.lang.String p0) { return null; }
        public android.service.euicc.EuiccProfileInfo.Builder setServiceProviderName(java.lang.String p0) { return null; }
        public android.service.euicc.EuiccProfileInfo.Builder setProfileName(java.lang.String p0) { return null; }
        public android.service.euicc.EuiccProfileInfo.Builder setProfileClass(int p0) { return null; }
        public android.service.euicc.EuiccProfileInfo.Builder setState(int p0) { return null; }
        public android.service.euicc.EuiccProfileInfo.Builder setCarrierIdentifier(android.service.carrier.CarrierIdentifier p0) { return null; }
        public android.service.euicc.EuiccProfileInfo.Builder setPolicyRules(int p0) { return null; }
        public android.service.euicc.EuiccProfileInfo.Builder setUiccAccessRule(java.util.List<android.telephony.UiccAccessRule> p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PolicyRule {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ProfileClass {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ProfileState {
    }
}
