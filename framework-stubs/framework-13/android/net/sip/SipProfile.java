package android.net.sip;

@java.lang.Deprecated
public class SipProfile implements android.os.Parcelable, java.io.Serializable, java.lang.Cloneable {
    @java.lang.Deprecated
    public static final android.os.Parcelable.Creator<android.net.sip.SipProfile> CREATOR = null;
    private SipProfile() {}
    @java.lang.Deprecated
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @java.lang.Deprecated
    public int describeContents() { return 0; }
    @java.lang.Deprecated
    public java.lang.String getUriString() { return null; }
    @java.lang.Deprecated
    public java.lang.String getDisplayName() { return null; }
    @java.lang.Deprecated
    public java.lang.String getUserName() { return null; }
    @java.lang.Deprecated
    public java.lang.String getAuthUserName() { return null; }
    @java.lang.Deprecated
    public java.lang.String getPassword() { return null; }
    @java.lang.Deprecated
    public java.lang.String getSipDomain() { return null; }
    @java.lang.Deprecated
    public int getPort() { return 0; }
    @java.lang.Deprecated
    public java.lang.String getProtocol() { return null; }
    @java.lang.Deprecated
    public java.lang.String getProxyAddress() { return null; }
    @java.lang.Deprecated
    public java.lang.String getProfileName() { return null; }
    @java.lang.Deprecated
    public boolean getSendKeepAlive() { return false; }
    @java.lang.Deprecated
    public boolean getAutoRegistration() { return false; }
    @java.lang.Deprecated
    public void setCallingUid(int p0) {}

    @java.lang.Deprecated
    public static class Builder {
        @java.lang.Deprecated
        public Builder(android.net.sip.SipProfile p0) {}
        @java.lang.Deprecated
        public Builder(java.lang.String p0) throws java.text.ParseException {}
        @java.lang.Deprecated
        public Builder(java.lang.String p0, java.lang.String p1) throws java.text.ParseException {}
        @java.lang.Deprecated
        public android.net.sip.SipProfile.Builder setAuthUserName(java.lang.String p0) { return null; }
        @java.lang.Deprecated
        public android.net.sip.SipProfile.Builder setProfileName(java.lang.String p0) { return null; }
        @java.lang.Deprecated
        public android.net.sip.SipProfile.Builder setPassword(java.lang.String p0) { return null; }
        @java.lang.Deprecated
        public android.net.sip.SipProfile.Builder setPort(int p0) throws java.lang.IllegalArgumentException { return null; }
        @java.lang.Deprecated
        public android.net.sip.SipProfile.Builder setProtocol(java.lang.String p0) throws java.lang.IllegalArgumentException { return null; }
        @java.lang.Deprecated
        public android.net.sip.SipProfile.Builder setOutboundProxy(java.lang.String p0) { return null; }
        @java.lang.Deprecated
        public android.net.sip.SipProfile.Builder setDisplayName(java.lang.String p0) { return null; }
        @java.lang.Deprecated
        public android.net.sip.SipProfile.Builder setSendKeepAlive(boolean p0) { return null; }
        @java.lang.Deprecated
        public android.net.sip.SipProfile.Builder setAutoRegistration(boolean p0) { return null; }
        @java.lang.Deprecated
        public android.net.sip.SipProfile build() { return null; }
    }
}
