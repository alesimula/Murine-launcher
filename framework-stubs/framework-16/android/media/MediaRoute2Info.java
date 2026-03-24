package android.media;

public final class MediaRoute2Info implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.media.MediaRoute2Info> CREATOR = null;
    public static final java.lang.String ROUTE_ID_DEVICE = "DEVICE_ROUTE";
    public static final java.lang.String ROUTE_ID_DEFAULT = "DEFAULT_ROUTE";
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
    @android.annotation.FlaggedApi("com.android.media.flags.enable_audio_policies_device_and_bluetooth_controller")
    public static final int TYPE_HDMI_ARC = 10;
    @android.annotation.FlaggedApi("com.android.media.flags.enable_audio_policies_device_and_bluetooth_controller")
    public static final int TYPE_HDMI_EARC = 29;
    @android.annotation.FlaggedApi("com.android.media.flags.enable_new_wired_media_route_2_info_types")
    public static final int TYPE_LINE_DIGITAL = 6;
    @android.annotation.FlaggedApi("com.android.media.flags.enable_new_wired_media_route_2_info_types")
    public static final int TYPE_LINE_ANALOG = 5;
    @android.annotation.FlaggedApi("com.android.media.flags.enable_new_wired_media_route_2_info_types")
    public static final int TYPE_AUX_LINE = 19;
    public static final int TYPE_USB_DEVICE = 11;
    public static final int TYPE_USB_ACCESSORY = 12;
    public static final int TYPE_DOCK = 13;
    public static final int TYPE_USB_HEADSET = 22;
    public static final int TYPE_HEARING_AID = 23;
    public static final int TYPE_BLE_HEADSET = 26;
    @android.annotation.FlaggedApi("android.media.audio.enable_multichannel_group_device")
    public static final int TYPE_MULTICHANNEL_SPEAKER_GROUP = 32;
    public static final int TYPE_REMOTE_TV = 1001;
    public static final int TYPE_REMOTE_SPEAKER = 1002;
    public static final int TYPE_REMOTE_AUDIO_VIDEO_RECEIVER = 1003;
    @android.annotation.FlaggedApi("com.android.media.flags.enable_new_media_route_2_info_types")
    public static final int TYPE_REMOTE_TABLET = 1004;
    @android.annotation.FlaggedApi("com.android.media.flags.enable_new_media_route_2_info_types")
    public static final int TYPE_REMOTE_TABLET_DOCKED = 1005;
    @android.annotation.FlaggedApi("com.android.media.flags.enable_new_media_route_2_info_types")
    public static final int TYPE_REMOTE_COMPUTER = 1006;
    @android.annotation.FlaggedApi("com.android.media.flags.enable_new_media_route_2_info_types")
    public static final int TYPE_REMOTE_GAME_CONSOLE = 1007;
    @android.annotation.FlaggedApi("com.android.media.flags.enable_new_media_route_2_info_types")
    public static final int TYPE_REMOTE_CAR = 1008;
    @android.annotation.FlaggedApi("com.android.media.flags.enable_new_media_route_2_info_types")
    public static final int TYPE_REMOTE_SMARTWATCH = 1009;
    @android.annotation.FlaggedApi("com.android.media.flags.enable_new_media_route_2_info_types")
    public static final int TYPE_REMOTE_SMARTPHONE = 1010;
    public static final int TYPE_GROUP = 2000;
    @android.annotation.FlaggedApi("com.android.media.flags.enable_mirroring_in_media_router_2")
    public static final int FLAG_ROUTING_TYPE_SYSTEM_AUDIO = 1;
    @android.annotation.FlaggedApi("com.android.media.flags.enable_mirroring_in_media_router_2")
    public static final int FLAG_ROUTING_TYPE_SYSTEM_VIDEO = 2;
    @android.annotation.FlaggedApi("com.android.media.flags.enable_mirroring_in_media_router_2")
    public static final int FLAG_ROUTING_TYPE_REMOTE = 4;
    public static final java.lang.String FEATURE_LIVE_AUDIO = "android.media.route.feature.LIVE_AUDIO";
    public static final java.lang.String FEATURE_LIVE_VIDEO = "android.media.route.feature.LIVE_VIDEO";
    public static final java.lang.String FEATURE_LOCAL_PLAYBACK = "android.media.route.feature.LOCAL_PLAYBACK";
    public static final java.lang.String FEATURE_REMOTE_PLAYBACK = "android.media.route.feature.REMOTE_PLAYBACK";
    public static final java.lang.String FEATURE_REMOTE_AUDIO_PLAYBACK = "android.media.route.feature.REMOTE_AUDIO_PLAYBACK";
    public static final java.lang.String FEATURE_REMOTE_VIDEO_PLAYBACK = "android.media.route.feature.REMOTE_VIDEO_PLAYBACK";
    public static final java.lang.String FEATURE_REMOTE_GROUP_PLAYBACK = "android.media.route.feature.REMOTE_GROUP_PLAYBACK";
    @android.annotation.FlaggedApi("com.android.media.flags.enable_built_in_speaker_route_suitability_statuses")
    public static final int SUITABILITY_STATUS_SUITABLE_FOR_DEFAULT_TRANSFER = 0;
    @android.annotation.FlaggedApi("com.android.media.flags.enable_built_in_speaker_route_suitability_statuses")
    public static final int SUITABILITY_STATUS_SUITABLE_FOR_MANUAL_TRANSFER = 1;
    @android.annotation.FlaggedApi("com.android.media.flags.enable_built_in_speaker_route_suitability_statuses")
    public static final int SUITABILITY_STATUS_NOT_SUITABLE_FOR_TRANSFER = 2;
    MediaRoute2Info(android.media.MediaRoute2Info.Builder p0) {}
    MediaRoute2Info(android.os.Parcel p0) {}
    @android.annotation.NonNull
    public java.lang.String getId() { return null; }
    @android.annotation.NonNull
    public java.lang.CharSequence getName() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getFeatures() { return null; }
    public int getType() { return 0; }
    @android.annotation.FlaggedApi("com.android.media.flags.enable_mirroring_in_media_router_2")
    public int getSupportedRoutingTypes() { return 0; }
    public boolean isSystemRoute() { return false; }
    @android.annotation.Nullable
    public android.net.Uri getIconUri() { return null; }
    @android.annotation.Nullable
    public java.lang.CharSequence getDescription() { return null; }
    public int getConnectionState() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getClientPackageName() { return null; }
    @android.annotation.FlaggedApi("com.android.media.flags.enable_media_route_2_info_provider_package_name")
    @android.annotation.Nullable
    public java.lang.String getProviderPackageName() { return null; }
    public int getVolumeHandling() { return 0; }
    public int getVolumeMax() { return 0; }
    public int getVolume() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getAddress() { return null; }
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getDeduplicationIds() { return null; }
    @android.annotation.Nullable
    public android.os.Bundle getExtras() { return null; }
    @android.annotation.NonNull
    public java.lang.String getOriginalId() { return null; }
    @android.annotation.Nullable
    public java.lang.String getProviderId() { return null; }
    public boolean hasAnyFeatures(java.util.Collection<java.lang.String> p0) { return false; }
    public boolean hasAllFeatures(java.util.Collection<java.lang.String> p0) { return false; }
    public boolean supportsSystemMediaRouting() { return false; }
    public boolean supportsRemoteRouting() { return false; }
    public boolean isValid() { return false; }
    public boolean isVisibleTo(java.lang.String p0) { return false; }
    @android.annotation.NonNull
    @android.annotation.FlaggedApi("com.android.media.flags.enable_route_visibility_control_api")
    public java.util.List<java.util.Set<java.lang.String>> getRequiredPermissions() { return null; }
    @android.annotation.SuppressLint("SwitchIntDef")
    public boolean isSystemRouteType() { return false; }
    @android.annotation.FlaggedApi("com.android.media.flags.enable_built_in_speaker_route_suitability_statuses")
    public int getSuitabilityStatus() { return 0; }
    public void dump(java.io.PrintWriter p0, java.lang.String p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    static java.lang.String getVolumeString(int p0, int p1, int p2) { return null; }

    public static final class Builder {
        public Builder(java.lang.String p0, java.lang.CharSequence p1) {}
        public Builder(android.media.MediaRoute2Info p0) {}
        public Builder(java.lang.String p0, android.media.MediaRoute2Info p1) {}
        @android.annotation.NonNull
        public android.media.MediaRoute2Info.Builder addFeature(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.media.MediaRoute2Info.Builder addFeatures(java.util.Collection<java.lang.String> p0) { return null; }
        @android.annotation.NonNull
        public android.media.MediaRoute2Info.Builder clearFeatures() { return null; }
        @android.annotation.NonNull
        public android.media.MediaRoute2Info.Builder setType(int p0) { return null; }
        @android.annotation.NonNull
        @android.annotation.FlaggedApi("com.android.media.flags.enable_mirroring_in_media_router_2")
        public android.media.MediaRoute2Info.Builder setSupportedRoutingTypes(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.MediaRoute2Info.Builder setSystemRoute(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.media.MediaRoute2Info.Builder setIconUri(android.net.Uri p0) { return null; }
        @android.annotation.NonNull
        public android.media.MediaRoute2Info.Builder setDescription(java.lang.CharSequence p0) { return null; }
        @android.annotation.NonNull
        public android.media.MediaRoute2Info.Builder setConnectionState(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.MediaRoute2Info.Builder setClientPackageName(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.media.MediaRoute2Info.Builder setProviderPackageName(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.media.MediaRoute2Info.Builder setVolumeHandling(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.MediaRoute2Info.Builder setVolumeMax(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.MediaRoute2Info.Builder setVolume(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.MediaRoute2Info.Builder setAddress(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.media.MediaRoute2Info.Builder setDeduplicationIds(java.util.Set<java.lang.String> p0) { return null; }
        @android.annotation.NonNull
        public android.media.MediaRoute2Info.Builder setExtras(android.os.Bundle p0) { return null; }
        @android.annotation.NonNull
        public android.media.MediaRoute2Info.Builder setProviderId(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.media.MediaRoute2Info.Builder setVisibilityPublic() { return null; }
        @android.annotation.NonNull
        public android.media.MediaRoute2Info.Builder setVisibilityRestricted(java.util.Set<java.lang.String> p0) { return null; }
        @android.annotation.NonNull
        @android.annotation.FlaggedApi("com.android.media.flags.enable_route_visibility_control_api")
        public android.media.MediaRoute2Info.Builder setRequiredPermissions(java.util.Set<java.lang.String> p0) { return null; }
        @android.annotation.NonNull
        @android.annotation.FlaggedApi("com.android.media.flags.enable_route_visibility_control_api")
        public android.media.MediaRoute2Info.Builder setRequiredPermissions(java.util.List<java.util.Set<java.lang.String>> p0) { return null; }
        @android.annotation.NonNull
        @android.annotation.FlaggedApi("com.android.media.flags.enable_built_in_speaker_route_suitability_statuses")
        public android.media.MediaRoute2Info.Builder setSuitabilityStatus(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.MediaRoute2Info build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ConnectionState {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PlaybackVolume {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RoutingType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @android.annotation.FlaggedApi("com.android.media.flags.enable_built_in_speaker_route_suitability_statuses")
    public static @interface SuitabilityStatus {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Type {
    }
}
