package android.telephony.euicc;

public final class DownloadableSubscription implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.euicc.DownloadableSubscription> CREATOR = null;
    @java.lang.Deprecated
    public final java.lang.String encodedActivationCode = null;
    private java.lang.String confirmationCode;
    private java.lang.String carrierName;
    private java.util.List<android.telephony.UiccAccessRule> accessRules;
    public java.lang.String getEncodedActivationCode() { return null; }
    private DownloadableSubscription(java.lang.String p0) {}
    private DownloadableSubscription(android.os.Parcel p0) {}
    private DownloadableSubscription(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.util.List<android.telephony.UiccAccessRule> p3) {}
    public static android.telephony.euicc.DownloadableSubscription forActivationCode(java.lang.String p0) { return null; }
    @java.lang.Deprecated
    public void setConfirmationCode(java.lang.String p0) {}
    public java.lang.String getConfirmationCode() { return null; }
    @java.lang.Deprecated
    public void setCarrierName(java.lang.String p0) {}
    @android.annotation.SystemApi
    public java.lang.String getCarrierName() { return null; }
    @android.annotation.SystemApi
    public java.util.List<android.telephony.UiccAccessRule> getAccessRules() { return null; }
    @java.lang.Deprecated
    public void setAccessRules(java.util.List<android.telephony.UiccAccessRule> p0) {}
    @java.lang.Deprecated
    public void setAccessRules(android.telephony.UiccAccessRule[] p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }

    @android.annotation.SystemApi
    public static final class Builder {
        private java.lang.String encodedActivationCode;
        private java.lang.String confirmationCode;
        private java.lang.String carrierName;
        java.util.List<android.telephony.UiccAccessRule> accessRules;
        public Builder() {}
        public Builder(android.telephony.euicc.DownloadableSubscription p0) {}
        public android.telephony.euicc.DownloadableSubscription build() { return null; }
        public android.telephony.euicc.DownloadableSubscription.Builder setEncodedActivationCode(java.lang.String p0) { return null; }
        public android.telephony.euicc.DownloadableSubscription.Builder setConfirmationCode(java.lang.String p0) { return null; }
        public android.telephony.euicc.DownloadableSubscription.Builder setCarrierName(java.lang.String p0) { return null; }
        public android.telephony.euicc.DownloadableSubscription.Builder setAccessRules(java.util.List<android.telephony.UiccAccessRule> p0) { return null; }
    }
}
