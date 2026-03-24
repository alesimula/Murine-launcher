package android.media;

public final class MediaRoute2Info implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.MediaRoute2Info> CREATOR = null;
    public static final int CONNECTION_STATE_DISCONNECTED = 0;
    public static final int CONNECTION_STATE_CONNECTING = 1;
    public static final int CONNECTION_STATE_CONNECTED = 2;
    public static final int PLAYBACK_VOLUME_FIXED = 0;
    public static final int PLAYBACK_VOLUME_VARIABLE = 1;
    public static final int TYPE_UNKNOWN = 0;
    public static final int TYPE_BUILTIN_SPEAKER = 2;
    public static final int TYPE_WIRED_HEADSET = 3;
    public static final int TYPE_WIRED_HEADPHONES = 4;
    public static final int TYPE_BLUETOOTH_A2DP = 8;
    public static final int TYPE_HDMI = 9;
    public static final int TYPE_USB_DEVICE = 11;
    public static final int TYPE_USB_ACCESSORY = 12;
    public static final int TYPE_DOCK = 13;
    public static final int TYPE_USB_HEADSET = 22;
    public static final int TYPE_HEARING_AID = 23;
    public static final int TYPE_REMOTE_TV = 1001;
    public static final int TYPE_REMOTE_SPEAKER = 1002;
    public static final int TYPE_GROUP = 2000;
    public static final java.lang.String FEATURE_LIVE_AUDIO = "android.media.route.feature.LIVE_AUDIO";
    public static final java.lang.String FEATURE_LIVE_VIDEO = "android.media.route.feature.LIVE_VIDEO";
    public static final java.lang.String FEATURE_LOCAL_PLAYBACK = "android.media.route.feature.LOCAL_PLAYBACK";
    public static final java.lang.String FEATURE_REMOTE_PLAYBACK = "android.media.route.feature.REMOTE_PLAYBACK";
    public static final java.lang.String FEATURE_REMOTE_AUDIO_PLAYBACK = "android.media.route.feature.REMOTE_AUDIO_PLAYBACK";
    public static final java.lang.String FEATURE_REMOTE_VIDEO_PLAYBACK = "android.media.route.feature.REMOTE_VIDEO_PLAYBACK";
    public static final java.lang.String FEATURE_REMOTE_GROUP_PLAYBACK = "android.media.route.feature.REMOTE_GROUP_PLAYBACK";
    final java.lang.String mId = null;
    final java.lang.CharSequence mName = null;
    final java.util.List<java.lang.String> mFeatures = null;
    final int mType = 0;
    final boolean mIsSystem = false;
    final android.net.Uri mIconUri = null;
    final java.lang.CharSequence mDescription = null;
    final int mConnectionState = 0;
    final java.lang.String mClientPackageName = null;
    final int mVolumeHandling = 0;
    final int mVolumeMax = 0;
    final int mVolume = 0;
    final java.lang.String mAddress = null;
    final android.os.Bundle mExtras = null;
    final java.lang.String mProviderId = null;
    MediaRoute2Info(android.media.MediaRoute2Info.Builder p0) {}
    MediaRoute2Info(android.os.Parcel p0) {}
    public java.lang.String getId() { return null; }
    public java.lang.CharSequence getName() { return null; }
    public java.util.List<java.lang.String> getFeatures() { return null; }
    public int getType() { return 0; }
    public boolean isSystemRoute() { return false; }
    public android.net.Uri getIconUri() { return null; }
    public java.lang.CharSequence getDescription() { return null; }
    public int getConnectionState() { return 0; }
    public java.lang.String getClientPackageName() { return null; }
    public int getVolumeHandling() { return 0; }
    public int getVolumeMax() { return 0; }
    public int getVolume() { return 0; }
    public java.lang.String getAddress() { return null; }
    public android.os.Bundle getExtras() { return null; }
    public java.lang.String getOriginalId() { return null; }
    public java.lang.String getProviderId() { return null; }
    public boolean hasAnyFeatures(java.util.Collection<java.lang.String> p0) { return false; }
    public boolean isValid() { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        final java.lang.String mId = null;
        final java.lang.CharSequence mName = null;
        final java.util.List<java.lang.String> mFeatures = null;
        int mType;
        boolean mIsSystem;
        android.net.Uri mIconUri;
        java.lang.CharSequence mDescription;
        int mConnectionState;
        java.lang.String mClientPackageName;
        int mVolumeHandling;
        int mVolumeMax;
        int mVolume;
        java.lang.String mAddress;
        android.os.Bundle mExtras;
        java.lang.String mProviderId;
        public Builder(java.lang.String p0, java.lang.CharSequence p1) {}
        public Builder(android.media.MediaRoute2Info p0) {}
        public Builder(java.lang.String p0, android.media.MediaRoute2Info p1) {}
        public android.media.MediaRoute2Info.Builder addFeature(java.lang.String p0) { return null; }
        public android.media.MediaRoute2Info.Builder addFeatures(java.util.Collection<java.lang.String> p0) { return null; }
        public android.media.MediaRoute2Info.Builder clearFeatures() { return null; }
        public android.media.MediaRoute2Info.Builder setType(int p0) { return null; }
        public android.media.MediaRoute2Info.Builder setSystemRoute(boolean p0) { return null; }
        public android.media.MediaRoute2Info.Builder setIconUri(android.net.Uri p0) { return null; }
        public android.media.MediaRoute2Info.Builder setDescription(java.lang.CharSequence p0) { return null; }
        public android.media.MediaRoute2Info.Builder setConnectionState(int p0) { return null; }
        public android.media.MediaRoute2Info.Builder setClientPackageName(java.lang.String p0) { return null; }
        public android.media.MediaRoute2Info.Builder setVolumeHandling(int p0) { return null; }
        public android.media.MediaRoute2Info.Builder setVolumeMax(int p0) { return null; }
        public android.media.MediaRoute2Info.Builder setVolume(int p0) { return null; }
        public android.media.MediaRoute2Info.Builder setAddress(java.lang.String p0) { return null; }
        public android.media.MediaRoute2Info.Builder setExtras(android.os.Bundle p0) { return null; }
        public android.media.MediaRoute2Info.Builder setProviderId(java.lang.String p0) { return null; }
        public android.media.MediaRoute2Info build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ConnectionState {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PlaybackVolume {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Type {
    }
}
