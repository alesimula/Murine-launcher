package android.media.tv.interactive;

public interface ITvInteractiveAppSessionCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.tv.interactive.ITvInteractiveAppSessionCallback";
    public void onSessionCreated(android.media.tv.interactive.ITvInteractiveAppSession p0) throws android.os.RemoteException;
    public void onLayoutSurface(int p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public void onBroadcastInfoRequest(android.media.tv.BroadcastInfoRequest p0) throws android.os.RemoteException;
    public void onRemoveBroadcastInfo(int p0) throws android.os.RemoteException;
    public void onSessionStateChanged(int p0, int p1) throws android.os.RemoteException;
    public void onBiInteractiveAppCreated(android.net.Uri p0, java.lang.String p1) throws android.os.RemoteException;
    public void onTeletextAppStateChanged(int p0) throws android.os.RemoteException;
    public void onAdBufferReady(android.media.tv.AdBuffer p0) throws android.os.RemoteException;
    public void onCommandRequest(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException;
    public void onTimeShiftCommandRequest(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException;
    public void onSetVideoBounds(android.graphics.Rect p0) throws android.os.RemoteException;
    public void onRequestCurrentVideoBounds() throws android.os.RemoteException;
    public void onRequestCurrentChannelUri() throws android.os.RemoteException;
    public void onRequestCurrentChannelLcn() throws android.os.RemoteException;
    public void onRequestStreamVolume() throws android.os.RemoteException;
    public void onRequestTrackInfoList() throws android.os.RemoteException;
    public void onRequestCurrentTvInputId() throws android.os.RemoteException;
    public void onRequestTimeShiftMode() throws android.os.RemoteException;
    public void onRequestAvailableSpeeds() throws android.os.RemoteException;
    public void onRequestStartRecording(java.lang.String p0, android.net.Uri p1) throws android.os.RemoteException;
    public void onRequestStopRecording(java.lang.String p0) throws android.os.RemoteException;
    public void onRequestScheduleRecording(java.lang.String p0, java.lang.String p1, android.net.Uri p2, android.net.Uri p3, android.os.Bundle p4) throws android.os.RemoteException;
    public void onRequestScheduleRecording2(java.lang.String p0, java.lang.String p1, android.net.Uri p2, long p3, long p4, int p5, android.os.Bundle p6) throws android.os.RemoteException;
    public void onSetTvRecordingInfo(java.lang.String p0, android.media.tv.TvRecordingInfo p1) throws android.os.RemoteException;
    public void onRequestTvRecordingInfo(java.lang.String p0) throws android.os.RemoteException;
    public void onRequestTvRecordingInfoList(int p0) throws android.os.RemoteException;
    public void onRequestSigning(java.lang.String p0, java.lang.String p1, java.lang.String p2, byte[] p3) throws android.os.RemoteException;
    public void onAdRequest(android.media.tv.AdRequest p0) throws android.os.RemoteException;

    public static class Default implements android.media.tv.interactive.ITvInteractiveAppSessionCallback {
        public Default() {}
        public void onSessionCreated(android.media.tv.interactive.ITvInteractiveAppSession p0) throws android.os.RemoteException {}
        public void onLayoutSurface(int p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public void onBroadcastInfoRequest(android.media.tv.BroadcastInfoRequest p0) throws android.os.RemoteException {}
        public void onRemoveBroadcastInfo(int p0) throws android.os.RemoteException {}
        public void onSessionStateChanged(int p0, int p1) throws android.os.RemoteException {}
        public void onBiInteractiveAppCreated(android.net.Uri p0, java.lang.String p1) throws android.os.RemoteException {}
        public void onTeletextAppStateChanged(int p0) throws android.os.RemoteException {}
        public void onAdBufferReady(android.media.tv.AdBuffer p0) throws android.os.RemoteException {}
        public void onCommandRequest(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public void onTimeShiftCommandRequest(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public void onSetVideoBounds(android.graphics.Rect p0) throws android.os.RemoteException {}
        public void onRequestCurrentVideoBounds() throws android.os.RemoteException {}
        public void onRequestCurrentChannelUri() throws android.os.RemoteException {}
        public void onRequestCurrentChannelLcn() throws android.os.RemoteException {}
        public void onRequestStreamVolume() throws android.os.RemoteException {}
        public void onRequestTrackInfoList() throws android.os.RemoteException {}
        public void onRequestCurrentTvInputId() throws android.os.RemoteException {}
        public void onRequestTimeShiftMode() throws android.os.RemoteException {}
        public void onRequestAvailableSpeeds() throws android.os.RemoteException {}
        public void onRequestStartRecording(java.lang.String p0, android.net.Uri p1) throws android.os.RemoteException {}
        public void onRequestStopRecording(java.lang.String p0) throws android.os.RemoteException {}
        public void onRequestScheduleRecording(java.lang.String p0, java.lang.String p1, android.net.Uri p2, android.net.Uri p3, android.os.Bundle p4) throws android.os.RemoteException {}
        public void onRequestScheduleRecording2(java.lang.String p0, java.lang.String p1, android.net.Uri p2, long p3, long p4, int p5, android.os.Bundle p6) throws android.os.RemoteException {}
        public void onSetTvRecordingInfo(java.lang.String p0, android.media.tv.TvRecordingInfo p1) throws android.os.RemoteException {}
        public void onRequestTvRecordingInfo(java.lang.String p0) throws android.os.RemoteException {}
        public void onRequestTvRecordingInfoList(int p0) throws android.os.RemoteException {}
        public void onRequestSigning(java.lang.String p0, java.lang.String p1, java.lang.String p2, byte[] p3) throws android.os.RemoteException {}
        public void onAdRequest(android.media.tv.AdRequest p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.interactive.ITvInteractiveAppSessionCallback {
        static final int TRANSACTION_onSessionCreated = 1;
        static final int TRANSACTION_onLayoutSurface = 2;
        static final int TRANSACTION_onBroadcastInfoRequest = 3;
        static final int TRANSACTION_onRemoveBroadcastInfo = 4;
        static final int TRANSACTION_onSessionStateChanged = 5;
        static final int TRANSACTION_onBiInteractiveAppCreated = 6;
        static final int TRANSACTION_onTeletextAppStateChanged = 7;
        static final int TRANSACTION_onAdBufferReady = 8;
        static final int TRANSACTION_onCommandRequest = 9;
        static final int TRANSACTION_onTimeShiftCommandRequest = 10;
        static final int TRANSACTION_onSetVideoBounds = 11;
        static final int TRANSACTION_onRequestCurrentVideoBounds = 12;
        static final int TRANSACTION_onRequestCurrentChannelUri = 13;
        static final int TRANSACTION_onRequestCurrentChannelLcn = 14;
        static final int TRANSACTION_onRequestStreamVolume = 15;
        static final int TRANSACTION_onRequestTrackInfoList = 16;
        static final int TRANSACTION_onRequestCurrentTvInputId = 17;
        static final int TRANSACTION_onRequestTimeShiftMode = 18;
        static final int TRANSACTION_onRequestAvailableSpeeds = 19;
        static final int TRANSACTION_onRequestStartRecording = 20;
        static final int TRANSACTION_onRequestStopRecording = 21;
        static final int TRANSACTION_onRequestScheduleRecording = 22;
        static final int TRANSACTION_onRequestScheduleRecording2 = 23;
        static final int TRANSACTION_onSetTvRecordingInfo = 24;
        static final int TRANSACTION_onRequestTvRecordingInfo = 25;
        static final int TRANSACTION_onRequestTvRecordingInfoList = 26;
        static final int TRANSACTION_onRequestSigning = 27;
        static final int TRANSACTION_onAdRequest = 28;
        public Stub() { super(); }
        public static android.media.tv.interactive.ITvInteractiveAppSessionCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.tv.interactive.ITvInteractiveAppSessionCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onSessionCreated(android.media.tv.interactive.ITvInteractiveAppSession p0) throws android.os.RemoteException {}
            public void onLayoutSurface(int p0, int p1, int p2, int p3) throws android.os.RemoteException {}
            public void onBroadcastInfoRequest(android.media.tv.BroadcastInfoRequest p0) throws android.os.RemoteException {}
            public void onRemoveBroadcastInfo(int p0) throws android.os.RemoteException {}
            public void onSessionStateChanged(int p0, int p1) throws android.os.RemoteException {}
            public void onBiInteractiveAppCreated(android.net.Uri p0, java.lang.String p1) throws android.os.RemoteException {}
            public void onTeletextAppStateChanged(int p0) throws android.os.RemoteException {}
            public void onAdBufferReady(android.media.tv.AdBuffer p0) throws android.os.RemoteException {}
            public void onCommandRequest(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException {}
            public void onTimeShiftCommandRequest(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException {}
            public void onSetVideoBounds(android.graphics.Rect p0) throws android.os.RemoteException {}
            public void onRequestCurrentVideoBounds() throws android.os.RemoteException {}
            public void onRequestCurrentChannelUri() throws android.os.RemoteException {}
            public void onRequestCurrentChannelLcn() throws android.os.RemoteException {}
            public void onRequestStreamVolume() throws android.os.RemoteException {}
            public void onRequestTrackInfoList() throws android.os.RemoteException {}
            public void onRequestCurrentTvInputId() throws android.os.RemoteException {}
            public void onRequestTimeShiftMode() throws android.os.RemoteException {}
            public void onRequestAvailableSpeeds() throws android.os.RemoteException {}
            public void onRequestStartRecording(java.lang.String p0, android.net.Uri p1) throws android.os.RemoteException {}
            public void onRequestStopRecording(java.lang.String p0) throws android.os.RemoteException {}
            public void onRequestScheduleRecording(java.lang.String p0, java.lang.String p1, android.net.Uri p2, android.net.Uri p3, android.os.Bundle p4) throws android.os.RemoteException {}
            public void onRequestScheduleRecording2(java.lang.String p0, java.lang.String p1, android.net.Uri p2, long p3, long p4, int p5, android.os.Bundle p6) throws android.os.RemoteException {}
            public void onSetTvRecordingInfo(java.lang.String p0, android.media.tv.TvRecordingInfo p1) throws android.os.RemoteException {}
            public void onRequestTvRecordingInfo(java.lang.String p0) throws android.os.RemoteException {}
            public void onRequestTvRecordingInfoList(int p0) throws android.os.RemoteException {}
            public void onRequestSigning(java.lang.String p0, java.lang.String p1, java.lang.String p2, byte[] p3) throws android.os.RemoteException {}
            public void onAdRequest(android.media.tv.AdRequest p0) throws android.os.RemoteException {}
        }
    }
}
