package android.telephony.ims;

public final class RcsContactUceCapability implements android.os.Parcelable {
    public static final int CAPABILITY_CHAT_STANDALONE = 1;
    public static final int CAPABILITY_CHAT_SESSION = 2;
    public static final int CAPABILITY_CHAT_SESSION_STORE_FORWARD = 4;
    public static final int CAPABILITY_FILE_TRANSFER = 8;
    public static final int CAPABILITY_FILE_TRANSFER_THUMBNAIL = 16;
    public static final int CAPABILITY_FILE_TRANSFER_STORE_FORWARD = 32;
    public static final int CAPABILITY_FILE_TRANSFER_HTTP = 64;
    public static final int CAPABILITY_FILE_TRANSFER_SMS = 128;
    public static final int CAPABILITY_IMAGE_SHARE = 256;
    public static final int CAPABILITY_VIDEO_SHARE_DURING_CS_CALL = 512;
    public static final int CAPABILITY_VIDEO_SHARE = 1024;
    public static final int CAPABILITY_SOCIAL_PRESENCE = 2048;
    public static final int CAPABILITY_DISCOVERY_VIA_PRESENCE = 4096;
    public static final int CAPABILITY_IP_VOICE_CALL = 8192;
    public static final int CAPABILITY_IP_VIDEO_CALL = 16384;
    public static final int CAPABILITY_GEOLOCATION_PUSH = 32768;
    public static final int CAPABILITY_GEOLOCATION_PUSH_SMS = 65536;
    public static final int CAPABILITY_GEOLOCATION_PULL = 131072;
    public static final int CAPABILITY_GEOLOCATION_PULL_FILE_TRANSFER = 262144;
    public static final int CAPABILITY_RCS_VOICE_CALL = 524288;
    public static final int CAPABILITY_RCS_VIDEO_CALL = 1048576;
    public static final int CAPABILITY_RCS_VIDEO_ONLY_CALL = 2097152;
    public static final int CAPABILITY_CALL_COMPOSER = 4194304;
    public static final int CAPABILITY_POST_CALL = 8388608;
    public static final int CAPABILITY_SHARED_MAP = 16777216;
    public static final int CAPABILITY_SHARED_SKETCH = 33554432;
    public static final int CAPABILITY_CHAT_BOT = 67108864;
    public static final int CAPABILITY_CHAT_BOT_ROLE = 134217728;
    public static final int CAPABILITY_PLUG_IN = 268435456;
    public static final int CAPABILITY_STANDALONE_CHAT_BOT = 536870912;
    public static final int CAPABILITY_MMTEL_CALL_COMPOSER = 1073741824;
    private final android.net.Uri mContactUri = null;
    private long mCapabilities;
    private java.util.List<java.lang.String> mExtensionTags;
    private java.util.Map<java.lang.Long, android.net.Uri> mServiceMap;
    public static final android.os.Parcelable.Creator<android.telephony.ims.RcsContactUceCapability> CREATOR = null;
    RcsContactUceCapability(android.net.Uri p0) {}
    private RcsContactUceCapability(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public boolean isCapable(long p0) { return false; }
    public boolean isCapable(java.lang.String p0) { return false; }
    public java.util.List<java.lang.String> getCapableExtensionTags() { return null; }
    public android.net.Uri getServiceUri(long p0) { return null; }
    public android.net.Uri getContactUri() { return null; }

    public static class Builder {
        private final android.telephony.ims.RcsContactUceCapability mCapabilities = null;
        public Builder(android.net.Uri p0) {}
        public android.telephony.ims.RcsContactUceCapability.Builder add(long p0, android.net.Uri p1) { return null; }
        public android.telephony.ims.RcsContactUceCapability.Builder add(long p0) { return null; }
        public android.telephony.ims.RcsContactUceCapability.Builder add(java.lang.String p0) { return null; }
        public android.telephony.ims.RcsContactUceCapability build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CapabilityFlag {
    }
}
