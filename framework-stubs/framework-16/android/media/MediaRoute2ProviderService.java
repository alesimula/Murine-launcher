package android.media;

public abstract class MediaRoute2ProviderService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.media.MediaRoute2ProviderService";
    @android.annotation.FlaggedApi("com.android.media.flags.enable_mirroring_in_media_router_2")
    public static final java.lang.String CATEGORY_SYSTEM_MEDIA = "android.media.MediaRoute2ProviderService.SYSTEM_MEDIA";
    public static final java.lang.String CATEGORY_SELF_SCAN_ONLY = "android.media.MediaRoute2ProviderService.SELF_SCAN_ONLY";
    public static final long REQUEST_ID_NONE = 0L;
    public static final int REASON_UNKNOWN_ERROR = 0;
    public static final int REASON_REJECTED = 1;
    public static final int REASON_NETWORK_ERROR = 2;
    public static final int REASON_ROUTE_NOT_AVAILABLE = 3;
    public static final int REASON_INVALID_COMMAND = 4;
    @android.annotation.FlaggedApi("com.android.media.flags.enable_mirroring_in_media_router_2")
    public static final int REASON_UNIMPLEMENTED = 5;
    @android.annotation.FlaggedApi("com.android.media.flags.enable_mirroring_in_media_router_2")
    public static final int REASON_FAILED_TO_REROUTE_SYSTEM_MEDIA = 6;
    public MediaRoute2ProviderService() { super(); }
    @android.annotation.Nullable
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract void onSetRouteVolume(long p0, java.lang.String p1, int p2);
    public abstract void onSetSessionVolume(long p0, java.lang.String p1, int p2);
    @android.annotation.Nullable
    public final android.media.RoutingSessionInfo getSessionInfo(java.lang.String p0) { return null; }
    @android.annotation.NonNull
    public final java.util.List<android.media.RoutingSessionInfo> getAllSessionInfo() { return null; }
    public final void notifySessionCreated(long p0, android.media.RoutingSessionInfo p1) {}
    @android.annotation.FlaggedApi("com.android.media.flags.enable_mirroring_in_media_router_2")
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    @android.annotation.Nullable
    public final android.media.MediaRoute2ProviderService.MediaStreams notifySystemRoutingSessionCreated(long p0, android.media.RoutingSessionInfo p1, android.media.MediaRoute2ProviderService.MediaStreamsFormats p2) { return null; }
    public final void notifySessionUpdated(android.media.RoutingSessionInfo p0) {}
    public final void notifySessionReleased(java.lang.String p0) {}
    public final void notifyRequestFailed(long p0, int p1) {}
    public abstract void onCreateSession(long p0, java.lang.String p1, java.lang.String p2, android.os.Bundle p3);
    @android.annotation.FlaggedApi("com.android.media.flags.enable_mirroring_in_media_router_2")
    public void onCreateSystemRoutingSession(long p0, java.lang.String p1, android.media.MediaRoute2ProviderService.SystemRoutingSessionParams p2) {}
    public abstract void onReleaseSession(long p0, java.lang.String p1);
    public abstract void onSelectRoute(long p0, java.lang.String p1, java.lang.String p2);
    public abstract void onDeselectRoute(long p0, java.lang.String p1, java.lang.String p2);
    public abstract void onTransferToRoute(long p0, java.lang.String p1, java.lang.String p2);
    public void onDiscoveryPreferenceChanged(android.media.RouteDiscoveryPreference p0) {}
    public final void notifyRoutes(java.util.Collection<android.media.MediaRoute2Info> p0) {}
    void setCallback(android.media.IMediaRoute2ProviderServiceCallback p0) {}
    void schedulePublishState() {}
    void scheduleUpdateSessions() {}

    final class MediaRoute2ProviderServiceStub extends android.media.IMediaRoute2ProviderService.Stub {
        MediaRoute2ProviderServiceStub(android.media.MediaRoute2ProviderService p0) { super(); }
        public void setCallback(android.media.IMediaRoute2ProviderServiceCallback p0) {}
        public void updateDiscoveryPreference(android.media.RouteDiscoveryPreference p0) {}
        public void setRouteVolume(long p0, java.lang.String p1, int p2) {}
        public void requestCreateSession(long p0, java.lang.String p1, java.lang.String p2, android.os.Bundle p3) {}
        public void requestCreateSystemMediaSession(long p0, int p1, java.lang.String p2, java.lang.String p3, android.os.Bundle p4) {}
        public void selectRoute(long p0, java.lang.String p1, java.lang.String p2) {}
        public void deselectRoute(long p0, java.lang.String p1, java.lang.String p2) {}
        public void transferToRoute(long p0, java.lang.String p1, java.lang.String p2) {}
        public void setSessionVolume(long p0, java.lang.String p1, int p2) {}
        public void releaseSession(long p0, java.lang.String p1) {}
    }

    @android.annotation.FlaggedApi("com.android.media.flags.enable_mirroring_in_media_router_2")
    public static final class MediaStreams {
        @android.annotation.Nullable
        public android.media.AudioRecord getAudioRecord() { return null; }

        public static final class Builder {
            Builder(android.media.RoutingSessionInfo p0) {}
            public android.media.MediaRoute2ProviderService.MediaStreams.Builder setAudioStream(android.media.audiopolicy.AudioPolicy p0, android.media.AudioRecord p1) { return null; }
            public android.media.MediaRoute2ProviderService.MediaStreams build() { return null; }
        }
    }

    @android.annotation.FlaggedApi("com.android.media.flags.enable_mirroring_in_media_router_2")
    public static final class MediaStreamsFormats {
        @android.annotation.FlaggedApi("com.android.media.flags.enable_mirroring_in_media_router_2")
        @android.annotation.Nullable
        public android.media.AudioFormat getAudioFormat() { return null; }

        @android.annotation.FlaggedApi("com.android.media.flags.enable_mirroring_in_media_router_2")
        public static final class Builder {
            public Builder() {}
            @android.annotation.NonNull
            public android.media.MediaRoute2ProviderService.MediaStreamsFormats.Builder setAudioFormat(android.media.AudioFormat p0) { return null; }
            @android.annotation.NonNull
            public android.media.MediaRoute2ProviderService.MediaStreamsFormats build() { return null; }
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Reason {
    }

    @android.annotation.FlaggedApi("com.android.media.flags.enable_mirroring_in_media_router_2")
    public static final class SystemRoutingSessionParams {
        @android.annotation.FlaggedApi("com.android.media.flags.enable_mirroring_in_media_router_2")
        @android.annotation.NonNull
        public java.lang.String getPackageName() { return null; }
        @android.annotation.FlaggedApi("com.android.media.flags.enable_mirroring_in_media_router_2")
        @android.annotation.NonNull
        public android.os.Bundle getExtras() { return null; }

        public static final class Builder {
            public Builder() {}
            @android.annotation.NonNull
            public android.media.MediaRoute2ProviderService.SystemRoutingSessionParams.Builder setExtras(android.os.Bundle p0) { return null; }
            @android.annotation.NonNull
            public android.media.MediaRoute2ProviderService.SystemRoutingSessionParams.Builder setPackageName(java.lang.String p0) { return null; }
            @android.annotation.NonNull
            public android.media.MediaRoute2ProviderService.SystemRoutingSessionParams build() { return null; }
        }
    }
}
