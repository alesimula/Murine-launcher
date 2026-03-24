package android.media.tv.interactive;

public final class TvInteractiveAppManager {
    public static final int SERVICE_STATE_UNREALIZED = 1;
    public static final int SERVICE_STATE_PREPARING = 2;
    public static final int SERVICE_STATE_READY = 3;
    public static final int SERVICE_STATE_ERROR = 4;
    public static final int INTERACTIVE_APP_STATE_STOPPED = 1;
    public static final int INTERACTIVE_APP_STATE_RUNNING = 2;
    public static final int INTERACTIVE_APP_STATE_ERROR = 3;
    public static final int ERROR_NONE = 0;
    public static final int ERROR_UNKNOWN = 1;
    public static final int ERROR_NOT_SUPPORTED = 2;
    public static final int ERROR_WEAK_SIGNAL = 3;
    public static final int ERROR_RESOURCE_UNAVAILABLE = 4;
    public static final int ERROR_BLOCKED = 5;
    public static final int ERROR_ENCRYPTED = 6;
    public static final int ERROR_UNKNOWN_CHANNEL = 7;
    public static final int TELETEXT_APP_STATE_SHOW = 1;
    public static final int TELETEXT_APP_STATE_HIDE = 2;
    public static final int TELETEXT_APP_STATE_ERROR = 3;
    public static final java.lang.String APP_LINK_KEY_PACKAGE_NAME = "package_name";
    public static final java.lang.String APP_LINK_KEY_CLASS_NAME = "class_name";
    public static final java.lang.String APP_LINK_KEY_COMMAND_TYPE = "command_type";
    public static final java.lang.String APP_LINK_KEY_SERVICE_ID = "service_id";
    public static final java.lang.String APP_LINK_KEY_BACK_URI = "back_uri";
    public static final java.lang.String ACTION_APP_LINK_COMMAND = "android.media.tv.interactive.action.APP_LINK_COMMAND";
    public static final java.lang.String INTENT_KEY_TV_INPUT_ID = "tv_input_id";
    public static final java.lang.String INTENT_KEY_INTERACTIVE_APP_SERVICE_ID = "interactive_app_id";
    public static final java.lang.String INTENT_KEY_CHANNEL_URI = "channel_uri";
    public static final java.lang.String INTENT_KEY_BI_INTERACTIVE_APP_TYPE = "bi_interactive_app_type";
    public static final java.lang.String INTENT_KEY_BI_INTERACTIVE_APP_URI = "bi_interactive_app_uri";
    public static final java.lang.String INTENT_KEY_COMMAND_TYPE = "command_type";
    public TvInteractiveAppManager(android.media.tv.interactive.ITvInteractiveAppManager p0, int p1) {}
    public void createSession(java.lang.String p0, int p1, android.media.tv.interactive.TvInteractiveAppManager.SessionCallback p2, android.os.Handler p3) {}
    public java.util.List<android.media.tv.interactive.TvInteractiveAppServiceInfo> getTvInteractiveAppServiceList() { return null; }
    public void registerAppLinkInfo(java.lang.String p0, android.media.tv.interactive.AppLinkInfo p1) {}
    public void unregisterAppLinkInfo(java.lang.String p0, android.media.tv.interactive.AppLinkInfo p1) {}
    public void sendAppLinkCommand(java.lang.String p0, android.os.Bundle p1) {}
    public void registerCallback(java.util.concurrent.Executor p0, android.media.tv.interactive.TvInteractiveAppManager.TvInteractiveAppCallback p1) {}
    public void unregisterCallback(android.media.tv.interactive.TvInteractiveAppManager.TvInteractiveAppCallback p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ErrorCode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface InteractiveAppState {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ServiceState {
    }

    public static final class Session {
        static final int DISPATCH_IN_PROGRESS = -1;
        static final int DISPATCH_NOT_HANDLED = 0;
        static final int DISPATCH_HANDLED = 1;
        public android.media.tv.TvInputManager.Session getInputSession() { return null; }
        public void setInputSession(android.media.tv.TvInputManager.Session p0) {}
        void startInteractiveApp() {}
        void stopInteractiveApp() {}
        void resetInteractiveApp() {}
        void createBiInteractiveApp(android.net.Uri p0, android.os.Bundle p1) {}
        void destroyBiInteractiveApp(java.lang.String p0) {}
        void setTeletextAppEnabled(boolean p0) {}
        void sendCurrentChannelUri(android.net.Uri p0) {}
        void sendCurrentChannelLcn(int p0) {}
        void sendStreamVolume(float p0) {}
        void sendTrackInfoList(java.util.List<android.media.tv.TvTrackInfo> p0) {}
        void sendCurrentTvInputId(java.lang.String p0) {}
        void sendSigningResult(java.lang.String p0, byte[] p1) {}
        void notifyError(java.lang.String p0, android.os.Bundle p1) {}
        public void setSurface(android.view.Surface p0) {}
        void createMediaView(android.view.View p0, android.graphics.Rect p1) {}
        void relayoutMediaView(android.graphics.Rect p0) {}
        void removeMediaView() {}
        public void dispatchSurfaceChanged(int p0, int p1, int p2) {}
        public int dispatchInputEvent(android.view.InputEvent p0, java.lang.Object p1, android.media.tv.interactive.TvInteractiveAppManager.Session.FinishedInputEventCallback p2, android.os.Handler p3) { return 0; }
        public void notifyBroadcastInfoResponse(android.media.tv.BroadcastInfoResponse p0) {}
        public void notifyAdResponse(android.media.tv.AdResponse p0) {}
        public void release() {}
        public void notifyTuned(android.net.Uri p0) {}
        public void notifyTrackSelected(int p0, java.lang.String p1) {}
        public void notifyTracksChanged(java.util.List<android.media.tv.TvTrackInfo> p0) {}
        public void notifyVideoAvailable() {}
        public void notifyVideoUnavailable(int p0) {}
        public void notifyContentAllowed() {}
        public void notifyContentBlocked(android.media.tv.TvContentRating p0) {}
        public void notifySignalStrength(int p0) {}
        void invokeFinishedInputEventCallback(android.media.tv.interactive.TvInteractiveAppManager.Session.PendingEvent p0, boolean p1) {}
        void finishedInputEvent(int p0, boolean p1, boolean p2) {}

        public static interface FinishedInputEventCallback {
            public void onFinishedInputEvent(java.lang.Object p0, boolean p1);
        }

        private final class InputEventHandler extends android.os.Handler {
            public static final int MSG_SEND_INPUT_EVENT = 1;
            public static final int MSG_TIMEOUT_INPUT_EVENT = 2;
            public static final int MSG_FLUSH_INPUT_EVENT = 3;
            InputEventHandler(android.media.tv.interactive.TvInteractiveAppManager.Session p0, android.os.Looper p1) { super(); }
            public void handleMessage(android.os.Message p0) {}
        }

        private final class PendingEvent implements java.lang.Runnable {
            public android.view.InputEvent mEvent;
            public java.lang.Object mEventToken;
            public android.media.tv.interactive.TvInteractiveAppManager.Session.FinishedInputEventCallback mCallback;
            public android.os.Handler mEventHandler;
            public boolean mHandled;
            public void recycle() {}
            public void run() {}
        }

        private final class TvInputEventSender extends android.view.InputEventSender {
            TvInputEventSender(android.media.tv.interactive.TvInteractiveAppManager.Session p0, android.view.InputChannel p1, android.os.Looper p2) { super(null, null); }
            public void onInputEventFinished(int p0, boolean p1) {}
        }
    }

    public static abstract class SessionCallback {
        public SessionCallback() {}
        public void onSessionCreated(android.media.tv.interactive.TvInteractiveAppManager.Session p0) {}
        public void onSessionReleased(android.media.tv.interactive.TvInteractiveAppManager.Session p0) {}
        public void onLayoutSurface(android.media.tv.interactive.TvInteractiveAppManager.Session p0, int p1, int p2, int p3, int p4) {}
        public void onCommandRequest(android.media.tv.interactive.TvInteractiveAppManager.Session p0, java.lang.String p1, android.os.Bundle p2) {}
        public void onSetVideoBounds(android.media.tv.interactive.TvInteractiveAppManager.Session p0, android.graphics.Rect p1) {}
        public void onRequestCurrentChannelUri(android.media.tv.interactive.TvInteractiveAppManager.Session p0) {}
        public void onRequestCurrentChannelLcn(android.media.tv.interactive.TvInteractiveAppManager.Session p0) {}
        public void onRequestStreamVolume(android.media.tv.interactive.TvInteractiveAppManager.Session p0) {}
        public void onRequestTrackInfoList(android.media.tv.interactive.TvInteractiveAppManager.Session p0) {}
        public void onRequestCurrentTvInputId(android.media.tv.interactive.TvInteractiveAppManager.Session p0) {}
        public void onRequestSigning(android.media.tv.interactive.TvInteractiveAppManager.Session p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, byte[] p4) {}
        public void onSessionStateChanged(android.media.tv.interactive.TvInteractiveAppManager.Session p0, int p1, int p2) {}
        public void onBiInteractiveAppCreated(android.media.tv.interactive.TvInteractiveAppManager.Session p0, android.net.Uri p1, java.lang.String p2) {}
        public void onTeletextAppStateChanged(android.media.tv.interactive.TvInteractiveAppManager.Session p0, int p1) {}
    }

    private static final class SessionCallbackRecord {
        SessionCallbackRecord(android.media.tv.interactive.TvInteractiveAppManager.SessionCallback p0, android.os.Handler p1) {}
        void postSessionCreated(android.media.tv.interactive.TvInteractiveAppManager.Session p0) {}
        void postSessionReleased() {}
        void postLayoutSurface(int p0, int p1, int p2, int p3) {}
        void postBroadcastInfoRequest(android.media.tv.BroadcastInfoRequest p0) {}
        void postRemoveBroadcastInfo(int p0) {}
        void postCommandRequest(java.lang.String p0, android.os.Bundle p1) {}
        void postSetVideoBounds(android.graphics.Rect p0) {}
        void postRequestCurrentChannelUri() {}
        void postRequestCurrentChannelLcn() {}
        void postRequestStreamVolume() {}
        void postRequestTrackInfoList() {}
        void postRequestCurrentTvInputId() {}
        void postRequestSigning(java.lang.String p0, java.lang.String p1, java.lang.String p2, byte[] p3) {}
        void postAdRequest(android.media.tv.AdRequest p0) {}
        void postSessionStateChanged(int p0, int p1) {}
        void postBiInteractiveAppCreated(android.net.Uri p0, java.lang.String p1) {}
        void postTeletextAppStateChanged(int p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TeletextAppState {
    }

    public static abstract class TvInteractiveAppCallback {
        public TvInteractiveAppCallback() {}
        public void onInteractiveAppServiceAdded(java.lang.String p0) {}
        public void onInteractiveAppServiceRemoved(java.lang.String p0) {}
        public void onInteractiveAppServiceUpdated(java.lang.String p0) {}
        public void onTvInteractiveAppServiceInfoUpdated(android.media.tv.interactive.TvInteractiveAppServiceInfo p0) {}
        public void onTvInteractiveAppServiceStateChanged(java.lang.String p0, int p1, int p2, int p3) {}
    }

    private static final class TvInteractiveAppCallbackRecord {
        TvInteractiveAppCallbackRecord(android.media.tv.interactive.TvInteractiveAppManager.TvInteractiveAppCallback p0, java.util.concurrent.Executor p1) {}
        public android.media.tv.interactive.TvInteractiveAppManager.TvInteractiveAppCallback getCallback() { return null; }
        public void postInteractiveAppServiceAdded(java.lang.String p0) {}
        public void postInteractiveAppServiceRemoved(java.lang.String p0) {}
        public void postInteractiveAppServiceUpdated(java.lang.String p0) {}
        public void postTvInteractiveAppServiceInfoUpdated(android.media.tv.interactive.TvInteractiveAppServiceInfo p0) {}
        public void postStateChanged(java.lang.String p0, int p1, int p2, int p3) {}
    }
}
