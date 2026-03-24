package android.telephony.ims;

@android.annotation.SystemApi
public final class RcsContactPresenceTuple implements android.os.Parcelable {
    public static final java.lang.String SERVICE_ID_PRESENCE = "org.3gpp.urn:urn-7:3gpp-application.ims.iari.rcse.dp";
    public static final java.lang.String SERVICE_ID_MMTEL = "org.3gpp.urn:urn-7:3gpp-service.ims.icsi.mmtel";
    public static final java.lang.String SERVICE_ID_CHAT_V1 = "org.openmobilealliance:IM-session";
    public static final java.lang.String SERVICE_ID_CHAT_V2 = "org.openmobilealliance:ChatSession";
    public static final java.lang.String SERVICE_ID_FT = "org.openmobilealliance:File-Transfer-HTTP";
    public static final java.lang.String SERVICE_ID_FT_OVER_SMS = "org.3gpp.urn:urn-7:3gpp-application.ims.iari.rcs.ftsms";
    public static final java.lang.String SERVICE_ID_GEO_PUSH = "org.3gpp.urn:urn-7:3gpp-application.ims.iari.rcs.geopush";
    public static final java.lang.String SERVICE_ID_GEO_PUSH_VIA_SMS = "org.3gpp.urn:urn-7:3gpp-application.ims.iari.rcs.geosms";
    public static final java.lang.String SERVICE_ID_CALL_COMPOSER = "org.3gpp.urn:urn-7:3gpp-service.ims.icsi.gsma.callcomposer";
    public static final java.lang.String SERVICE_ID_POST_CALL = "org.3gpp.urn:urn-7:3gpp-service.ims.icsi.gsma.callunanswered";
    public static final java.lang.String SERVICE_ID_SHARED_MAP = "org.3gpp.urn:urn-7:3gpp-service.ims.icsi.gsma.sharedmap";
    public static final java.lang.String SERVICE_ID_SHARED_SKETCH = "org.3gpp.urn:urn-7:3gpp-service.ims.icsi.gsma.sharedsketch";
    public static final java.lang.String SERVICE_ID_CHATBOT = "org.3gpp.urn:urn-7:3gpp-application.ims.iari.rcs.chatbot";
    public static final java.lang.String SERVICE_ID_CHATBOT_STANDALONE = " org.3gpp.urn:urn-7:3gpp-application.ims.iari.rcs.chatbot.sa";
    public static final java.lang.String SERVICE_ID_CHATBOT_ROLE = "org.gsma.rcs.isbot";
    public static final java.lang.String TUPLE_BASIC_STATUS_OPEN = "open";
    public static final java.lang.String TUPLE_BASIC_STATUS_CLOSED = "closed";
    public static final android.os.Parcelable.Creator<android.telephony.ims.RcsContactPresenceTuple> CREATOR = null;
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public java.lang.String getStatus() { return null; }
    public java.lang.String getServiceId() { return null; }
    public java.lang.String getServiceVersion() { return null; }
    public android.net.Uri getContactUri() { return null; }
    public java.time.Instant getTime() { return null; }
    public java.lang.String getServiceDescription() { return null; }
    public android.telephony.ims.RcsContactPresenceTuple.ServiceCapabilities getServiceCapabilities() { return null; }
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BasicStatus {
    }

    public static final class Builder {
        public Builder(java.lang.String p0, java.lang.String p1, java.lang.String p2) {}
        public android.telephony.ims.RcsContactPresenceTuple.Builder setContactUri(android.net.Uri p0) { return null; }
        public android.telephony.ims.RcsContactPresenceTuple.Builder setTime(java.time.Instant p0) { return null; }
        public android.telephony.ims.RcsContactPresenceTuple.Builder setServiceDescription(java.lang.String p0) { return null; }
        public android.telephony.ims.RcsContactPresenceTuple.Builder setServiceCapabilities(android.telephony.ims.RcsContactPresenceTuple.ServiceCapabilities p0) { return null; }
        public android.telephony.ims.RcsContactPresenceTuple build() { return null; }
    }

    public static final class ServiceCapabilities implements android.os.Parcelable {
        public static final java.lang.String DUPLEX_MODE_FULL = "full";
        public static final java.lang.String DUPLEX_MODE_HALF = "half";
        public static final java.lang.String DUPLEX_MODE_RECEIVE_ONLY = "receive-only";
        public static final java.lang.String DUPLEX_MODE_SEND_ONLY = "send-only";
        public static final android.os.Parcelable.Creator<android.telephony.ims.RcsContactPresenceTuple.ServiceCapabilities> CREATOR = null;
        ServiceCapabilities(boolean p0, boolean p1) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int describeContents() { return 0; }
        public boolean isAudioCapable() { return false; }
        public boolean isVideoCapable() { return false; }
        public java.util.List<java.lang.String> getSupportedDuplexModes() { return null; }
        public java.util.List<java.lang.String> getUnsupportedDuplexModes() { return null; }
        public java.lang.String toString() { return null; }

        public static final class Builder {
            public Builder(boolean p0, boolean p1) {}
            public android.telephony.ims.RcsContactPresenceTuple.ServiceCapabilities.Builder addSupportedDuplexMode(java.lang.String p0) { return null; }
            public android.telephony.ims.RcsContactPresenceTuple.ServiceCapabilities.Builder addUnsupportedDuplexMode(java.lang.String p0) { return null; }
            public android.telephony.ims.RcsContactPresenceTuple.ServiceCapabilities build() { return null; }
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface DuplexMode {
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ServiceId {
    }
}
