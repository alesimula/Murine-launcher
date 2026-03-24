package android.media.tv.interactive;

public interface ITvInteractiveAppClient extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.tv.interactive.ITvInteractiveAppClient";
    public void onSessionCreated(java.lang.String p0, android.os.IBinder p1, android.view.InputChannel p2, int p3) throws android.os.RemoteException;
    public void onSessionReleased(int p0) throws android.os.RemoteException;
    public void onLayoutSurface(int p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException;
    public void onBroadcastInfoRequest(android.media.tv.BroadcastInfoRequest p0, int p1) throws android.os.RemoteException;
    public void onRemoveBroadcastInfo(int p0, int p1) throws android.os.RemoteException;
    public void onSessionStateChanged(int p0, int p1, int p2) throws android.os.RemoteException;
    public void onBiInteractiveAppCreated(android.net.Uri p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void onTeletextAppStateChanged(int p0, int p1) throws android.os.RemoteException;
    public void onAdBufferReady(android.media.tv.AdBuffer p0, int p1) throws android.os.RemoteException;
    public void onCommandRequest(java.lang.String p0, android.os.Bundle p1, int p2) throws android.os.RemoteException;
    public void onTimeShiftCommandRequest(java.lang.String p0, android.os.Bundle p1, int p2) throws android.os.RemoteException;
    public void onSetVideoBounds(android.graphics.Rect p0, int p1) throws android.os.RemoteException;
    public void onRequestCurrentVideoBounds(int p0) throws android.os.RemoteException;
    public void onRequestCurrentChannelUri(int p0) throws android.os.RemoteException;
    public void onRequestCurrentChannelLcn(int p0) throws android.os.RemoteException;
    public void onRequestStreamVolume(int p0) throws android.os.RemoteException;
    public void onRequestTrackInfoList(int p0) throws android.os.RemoteException;
    public void onRequestCurrentTvInputId(int p0) throws android.os.RemoteException;
    public void onRequestTimeShiftMode(int p0) throws android.os.RemoteException;
    public void onRequestAvailableSpeeds(int p0) throws android.os.RemoteException;
    public void onRequestStartRecording(java.lang.String p0, android.net.Uri p1, int p2) throws android.os.RemoteException;
    public void onRequestStopRecording(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void onRequestScheduleRecording(java.lang.String p0, java.lang.String p1, android.net.Uri p2, android.net.Uri p3, android.os.Bundle p4, int p5) throws android.os.RemoteException;
    public void onRequestScheduleRecording2(java.lang.String p0, java.lang.String p1, android.net.Uri p2, long p3, long p4, int p5, android.os.Bundle p6, int p7) throws android.os.RemoteException;
    public void onSetTvRecordingInfo(java.lang.String p0, android.media.tv.TvRecordingInfo p1, int p2) throws android.os.RemoteException;
    public void onRequestTvRecordingInfo(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void onRequestTvRecordingInfoList(int p0, int p1) throws android.os.RemoteException;
    public void onRequestSigning(java.lang.String p0, java.lang.String p1, java.lang.String p2, byte[] p3, int p4) throws android.os.RemoteException;
    public void onAdRequest(android.media.tv.AdRequest p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.media.tv.interactive.ITvInteractiveAppClient {
        public Default() {}
        public void onSessionCreated(java.lang.String p0, android.os.IBinder p1, android.view.InputChannel p2, int p3) throws android.os.RemoteException {}
        public void onSessionReleased(int p0) throws android.os.RemoteException {}
        public void onLayoutSurface(int p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException {}
        public void onBroadcastInfoRequest(android.media.tv.BroadcastInfoRequest p0, int p1) throws android.os.RemoteException {}
        public void onRemoveBroadcastInfo(int p0, int p1) throws android.os.RemoteException {}
        public void onSessionStateChanged(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void onBiInteractiveAppCreated(android.net.Uri p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void onTeletextAppStateChanged(int p0, int p1) throws android.os.RemoteException {}
        public void onAdBufferReady(android.media.tv.AdBuffer p0, int p1) throws android.os.RemoteException {}
        public void onCommandRequest(java.lang.String p0, android.os.Bundle p1, int p2) throws android.os.RemoteException {}
        public void onTimeShiftCommandRequest(java.lang.String p0, android.os.Bundle p1, int p2) throws android.os.RemoteException {}
        public void onSetVideoBounds(android.graphics.Rect p0, int p1) throws android.os.RemoteException {}
        public void onRequestCurrentVideoBounds(int p0) throws android.os.RemoteException {}
        public void onRequestCurrentChannelUri(int p0) throws android.os.RemoteException {}
        public void onRequestCurrentChannelLcn(int p0) throws android.os.RemoteException {}
        public void onRequestStreamVolume(int p0) throws android.os.RemoteException {}
        public void onRequestTrackInfoList(int p0) throws android.os.RemoteException {}
        public void onRequestCurrentTvInputId(int p0) throws android.os.RemoteException {}
        public void onRequestTimeShiftMode(int p0) throws android.os.RemoteException {}
        public void onRequestAvailableSpeeds(int p0) throws android.os.RemoteException {}
        public void onRequestStartRecording(java.lang.String p0, android.net.Uri p1, int p2) throws android.os.RemoteException {}
        public void onRequestStopRecording(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void onRequestScheduleRecording(java.lang.String p0, java.lang.String p1, android.net.Uri p2, android.net.Uri p3, android.os.Bundle p4, int p5) throws android.os.RemoteException {}
        public void onRequestScheduleRecording2(java.lang.String p0, java.lang.String p1, android.net.Uri p2, long p3, long p4, int p5, android.os.Bundle p6, int p7) throws android.os.RemoteException {}
        public void onSetTvRecordingInfo(java.lang.String p0, android.media.tv.TvRecordingInfo p1, int p2) throws android.os.RemoteException {}
        public void onRequestTvRecordingInfo(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void onRequestTvRecordingInfoList(int p0, int p1) throws android.os.RemoteException {}
        public void onRequestSigning(java.lang.String p0, java.lang.String p1, java.lang.String p2, byte[] p3, int p4) throws android.os.RemoteException {}
        public void onAdRequest(android.media.tv.AdRequest p0, int p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.interactive.ITvInteractiveAppClient {
        static final int TRANSACTION_onSessionCreated = 1;
        static final int TRANSACTION_onSessionReleased = 2;
        static final int TRANSACTION_onLayoutSurface = 3;
        static final int TRANSACTION_onBroadcastInfoRequest = 4;
        static final int TRANSACTION_onRemoveBroadcastInfo = 5;
        static final int TRANSACTION_onSessionStateChanged = 6;
        static final int TRANSACTION_onBiInteractiveAppCreated = 7;
        static final int TRANSACTION_onTeletextAppStateChanged = 8;
        static final int TRANSACTION_onAdBufferReady = 9;
        static final int TRANSACTION_onCommandRequest = 10;
        static final int TRANSACTION_onTimeShiftCommandRequest = 11;
        static final int TRANSACTION_onSetVideoBounds = 12;
        static final int TRANSACTION_onRequestCurrentVideoBounds = 13;
        static final int TRANSACTION_onRequestCurrentChannelUri = 14;
        static final int TRANSACTION_onRequestCurrentChannelLcn = 15;
        static final int TRANSACTION_onRequestStreamVolume = 16;
        static final int TRANSACTION_onRequestTrackInfoList = 17;
        static final int TRANSACTION_onRequestCurrentTvInputId = 18;
        static final int TRANSACTION_onRequestTimeShiftMode = 19;
        static final int TRANSACTION_onRequestAvailableSpeeds = 20;
        static final int TRANSACTION_onRequestStartRecording = 21;
        static final int TRANSACTION_onRequestStopRecording = 22;
        static final int TRANSACTION_onRequestScheduleRecording = 23;
        static final int TRANSACTION_onRequestScheduleRecording2 = 24;
        static final int TRANSACTION_onSetTvRecordingInfo = 25;
        static final int TRANSACTION_onRequestTvRecordingInfo = 26;
        static final int TRANSACTION_onRequestTvRecordingInfoList = 27;
        static final int TRANSACTION_onRequestSigning = 28;
        static final int TRANSACTION_onAdRequest = 29;
        public Stub() { super(); }
        public static android.media.tv.interactive.ITvInteractiveAppClient asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.tv.interactive.ITvInteractiveAppClient {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onSessionCreated(java.lang.String p0, android.os.IBinder p1, android.view.InputChannel p2, int p3) throws android.os.RemoteException {}
            public void onSessionReleased(int p0) throws android.os.RemoteException {}
            public void onLayoutSurface(int p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException {}
            public void onBroadcastInfoRequest(android.media.tv.BroadcastInfoRequest p0, int p1) throws android.os.RemoteException {}
            public void onRemoveBroadcastInfo(int p0, int p1) throws android.os.RemoteException {}
            public void onSessionStateChanged(int p0, int p1, int p2) throws android.os.RemoteException {}
            public void onBiInteractiveAppCreated(android.net.Uri p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void onTeletextAppStateChanged(int p0, int p1) throws android.os.RemoteException {}
            public void onAdBufferReady(android.media.tv.AdBuffer p0, int p1) throws android.os.RemoteException {}
            public void onCommandRequest(java.lang.String p0, android.os.Bundle p1, int p2) throws android.os.RemoteException {}
            public void onTimeShiftCommandRequest(java.lang.String p0, android.os.Bundle p1, int p2) throws android.os.RemoteException {}
            public void onSetVideoBounds(android.graphics.Rect p0, int p1) throws android.os.RemoteException {}
            public void onRequestCurrentVideoBounds(int p0) throws android.os.RemoteException {}
            public void onRequestCurrentChannelUri(int p0) throws android.os.RemoteException {}
            public void onRequestCurrentChannelLcn(int p0) throws android.os.RemoteException {}
            public void onRequestStreamVolume(int p0) throws android.os.RemoteException {}
            public void onRequestTrackInfoList(int p0) throws android.os.RemoteException {}
            public void onRequestCurrentTvInputId(int p0) throws android.os.RemoteException {}
            public void onRequestTimeShiftMode(int p0) throws android.os.RemoteException {}
            public void onRequestAvailableSpeeds(int p0) throws android.os.RemoteException {}
            public void onRequestStartRecording(java.lang.String p0, android.net.Uri p1, int p2) throws android.os.RemoteException {}
            public void onRequestStopRecording(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void onRequestScheduleRecording(java.lang.String p0, java.lang.String p1, android.net.Uri p2, android.net.Uri p3, android.os.Bundle p4, int p5) throws android.os.RemoteException {}
            public void onRequestScheduleRecording2(java.lang.String p0, java.lang.String p1, android.net.Uri p2, long p3, long p4, int p5, android.os.Bundle p6, int p7) throws android.os.RemoteException {}
            public void onSetTvRecordingInfo(java.lang.String p0, android.media.tv.TvRecordingInfo p1, int p2) throws android.os.RemoteException {}
            public void onRequestTvRecordingInfo(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void onRequestTvRecordingInfoList(int p0, int p1) throws android.os.RemoteException {}
            public void onRequestSigning(java.lang.String p0, java.lang.String p1, java.lang.String p2, byte[] p3, int p4) throws android.os.RemoteException {}
            public void onAdRequest(android.media.tv.AdRequest p0, int p1) throws android.os.RemoteException {}
        }
    }
}
