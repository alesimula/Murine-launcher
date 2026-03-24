package android.telephony.ims;

@android.annotation.SystemApi
public final class RcsContactUceCapability implements android.os.Parcelable {
    public static final int CAPABILITY_MECHANISM_PRESENCE = 1;
    public static final int CAPABILITY_MECHANISM_OPTIONS = 2;
    public static final int SOURCE_TYPE_NETWORK = 0;
    public static final int SOURCE_TYPE_CACHED = 1;
    public static final int REQUEST_RESULT_UNKNOWN = 0;
    public static final int REQUEST_RESULT_NOT_ONLINE = 1;
    public static final int REQUEST_RESULT_NOT_FOUND = 2;
    public static final int REQUEST_RESULT_FOUND = 3;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.ims.RcsContactUceCapability> CREATOR = null;
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public int getCapabilityMechanism() { return 0; }
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getFeatureTags() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.telephony.ims.RcsContactPresenceTuple> getCapabilityTuples() { return null; }
    @android.annotation.Nullable
    public android.telephony.ims.RcsContactPresenceTuple getCapabilityTuple(java.lang.String p0) { return null; }
    public int getSourceType() { return 0; }
    public int getRequestResult() { return 0; }
    @android.annotation.NonNull
    public android.net.Uri getContactUri() { return null; }
    @android.annotation.Nullable
    public android.net.Uri getEntityUri() { return null; }
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CapabilityMechanism {
    }

    public static final class OptionsBuilder {
        public OptionsBuilder(android.net.Uri p0) {}
        public OptionsBuilder(android.net.Uri p0, int p1) {}
        @android.annotation.NonNull
        public android.telephony.ims.RcsContactUceCapability.OptionsBuilder setRequestResult(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.ims.RcsContactUceCapability.OptionsBuilder addFeatureTag(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.ims.RcsContactUceCapability.OptionsBuilder addFeatureTags(java.util.Set<java.lang.String> p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.ims.RcsContactUceCapability build() { return null; }
    }

    public static final class PresenceBuilder {
        public PresenceBuilder(android.net.Uri p0, int p1, int p2) {}
        @android.annotation.NonNull
        public android.telephony.ims.RcsContactUceCapability.PresenceBuilder addCapabilityTuple(android.telephony.ims.RcsContactPresenceTuple p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.ims.RcsContactUceCapability.PresenceBuilder addCapabilityTuples(java.util.List<android.telephony.ims.RcsContactPresenceTuple> p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.ims.RcsContactUceCapability.PresenceBuilder setEntityUri(android.net.Uri p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.ims.RcsContactUceCapability build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RequestResult {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SourceType {
    }
}
