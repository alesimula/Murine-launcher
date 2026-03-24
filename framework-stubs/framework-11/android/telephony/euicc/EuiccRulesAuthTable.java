package android.telephony.euicc;

@android.annotation.SystemApi
public final class EuiccRulesAuthTable implements android.os.Parcelable {
    public static final int POLICY_RULE_FLAG_CONSENT_REQUIRED = 1;
    private final int[] mPolicyRules = null;
    private final android.service.carrier.CarrierIdentifier[][] mCarrierIds = null;
    private final int[] mPolicyRuleFlags = null;
    public static final android.os.Parcelable.Creator<android.telephony.euicc.EuiccRulesAuthTable> CREATOR = null;
    public static boolean match(java.lang.String p0, java.lang.String p1) { return false; }
    private EuiccRulesAuthTable(int[] p0, android.service.carrier.CarrierIdentifier[][] p1, int[] p2) {}
    public int findIndex(int p0, android.service.carrier.CarrierIdentifier p1) { return 0; }
    public boolean hasPolicyRuleFlag(int p0, int p1) { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    private EuiccRulesAuthTable(android.os.Parcel p0) {}

    public static final class Builder {
        private int[] mPolicyRules;
        private android.service.carrier.CarrierIdentifier[][] mCarrierIds;
        private int[] mPolicyRuleFlags;
        private int mPosition;
        public Builder(int p0) {}
        public android.telephony.euicc.EuiccRulesAuthTable build() { return null; }
        public android.telephony.euicc.EuiccRulesAuthTable.Builder add(int p0, java.util.List<android.service.carrier.CarrierIdentifier> p1, int p2) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PolicyRuleFlag {
    }
}
