package android.telephony.euicc;

public final class DownloadableSubscription implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.euicc.DownloadableSubscription> CREATOR = null;
    @java.lang.Deprecated
    @android.annotation.Nullable
    public final java.lang.String encodedActivationCode = null;
    @android.annotation.Nullable
    public java.lang.String getEncodedActivationCode() { return null; }
    public static android.telephony.euicc.DownloadableSubscription forActivationCode(java.lang.String p0) { return null; }
    @java.lang.Deprecated
    public void setConfirmationCode(java.lang.String p0) {}
    @android.annotation.Nullable
    public java.lang.String getConfirmationCode() { return null; }
    @java.lang.Deprecated
    public void setCarrierName(java.lang.String p0) {}
    @android.annotation.SystemApi
    @android.annotation.Nullable
    public java.lang.String getCarrierName() { return null; }
    @android.annotation.SystemApi
    public java.util.List<android.telephony.UiccAccessRule> getAccessRules() { return null; }
    @java.lang.Deprecated
    public void setAccessRules(java.util.List<android.telephony.UiccAccessRule> p0) {}
    @java.lang.Deprecated
    public void setAccessRules(android.telephony.UiccAccessRule[] p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }

    public static final class Builder {
        java.util.List<android.telephony.UiccAccessRule> accessRules;
        @android.annotation.SystemApi
        public Builder() {}
        public Builder(android.telephony.euicc.DownloadableSubscription p0) {}
        public Builder(java.lang.String p0) {}
        @android.annotation.NonNull
        public android.telephony.euicc.DownloadableSubscription build() { return null; }
        @android.annotation.NonNull
        public android.telephony.euicc.DownloadableSubscription.Builder setEncodedActivationCode(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.euicc.DownloadableSubscription.Builder setConfirmationCode(java.lang.String p0) { return null; }
        @android.annotation.SystemApi
        @android.annotation.NonNull
        public android.telephony.euicc.DownloadableSubscription.Builder setCarrierName(java.lang.String p0) { return null; }
        @android.annotation.SystemApi
        @android.annotation.NonNull
        public android.telephony.euicc.DownloadableSubscription.Builder setAccessRules(java.util.List<android.telephony.UiccAccessRule> p0) { return null; }
    }
}
