package android.media.tv;

public interface ITvInputSession extends android.os.IInterface {
    public void release() throws android.os.RemoteException;
    public void setMain(boolean p0) throws android.os.RemoteException;
    public void setSurface(android.view.Surface p0) throws android.os.RemoteException;
    public void dispatchSurfaceChanged(int p0, int p1, int p2) throws android.os.RemoteException;
    public void setVolume(float p0) throws android.os.RemoteException;
    public void tune(android.net.Uri p0, android.os.Bundle p1) throws android.os.RemoteException;
    public void setCaptionEnabled(boolean p0) throws android.os.RemoteException;
    public void selectTrack(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void appPrivateCommand(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException;
    public void createOverlayView(android.os.IBinder p0, android.graphics.Rect p1) throws android.os.RemoteException;
    public void relayoutOverlayView(android.graphics.Rect p0) throws android.os.RemoteException;
    public void removeOverlayView() throws android.os.RemoteException;
    public void unblockContent(java.lang.String p0) throws android.os.RemoteException;
    public void timeShiftPlay(android.net.Uri p0) throws android.os.RemoteException;
    public void timeShiftPause() throws android.os.RemoteException;
    public void timeShiftResume() throws android.os.RemoteException;
    public void timeShiftSeekTo(long p0) throws android.os.RemoteException;
    public void timeShiftSetPlaybackParams(android.media.PlaybackParams p0) throws android.os.RemoteException;
    public void timeShiftEnablePositionTracking(boolean p0) throws android.os.RemoteException;
    public void startRecording(android.net.Uri p0) throws android.os.RemoteException;
    public void stopRecording() throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.media.tv.ITvInputSession {
        private static final java.lang.String DESCRIPTOR = "android.media.tv.ITvInputSession";
        static final int TRANSACTION_release = 1;
        static final int TRANSACTION_setMain = 2;
        static final int TRANSACTION_setSurface = 3;
        static final int TRANSACTION_dispatchSurfaceChanged = 4;
        static final int TRANSACTION_setVolume = 5;
        static final int TRANSACTION_tune = 6;
        static final int TRANSACTION_setCaptionEnabled = 7;
        static final int TRANSACTION_selectTrack = 8;
        static final int TRANSACTION_appPrivateCommand = 9;
        static final int TRANSACTION_createOverlayView = 10;
        static final int TRANSACTION_relayoutOverlayView = 11;
        static final int TRANSACTION_removeOverlayView = 12;
        static final int TRANSACTION_unblockContent = 13;
        static final int TRANSACTION_timeShiftPlay = 14;
        static final int TRANSACTION_timeShiftPause = 15;
        static final int TRANSACTION_timeShiftResume = 16;
        static final int TRANSACTION_timeShiftSeekTo = 17;
        static final int TRANSACTION_timeShiftSetPlaybackParams = 18;
        static final int TRANSACTION_timeShiftEnablePositionTracking = 19;
        static final int TRANSACTION_startRecording = 20;
        static final int TRANSACTION_stopRecording = 21;
        public Stub() { super(); }
        public static android.media.tv.ITvInputSession asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.media.tv.ITvInputSession p0) { return false; }
        public static android.media.tv.ITvInputSession getDefaultImpl() { return null; }

        private static class Proxy implements android.media.tv.ITvInputSession {
            private android.os.IBinder mRemote;
            public static android.media.tv.ITvInputSession sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void release() throws android.os.RemoteException {}
            public void setMain(boolean p0) throws android.os.RemoteException {}
            public void setSurface(android.view.Surface p0) throws android.os.RemoteException {}
            public void dispatchSurfaceChanged(int p0, int p1, int p2) throws android.os.RemoteException {}
            public void setVolume(float p0) throws android.os.RemoteException {}
            public void tune(android.net.Uri p0, android.os.Bundle p1) throws android.os.RemoteException {}
            public void setCaptionEnabled(boolean p0) throws android.os.RemoteException {}
            public void selectTrack(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void appPrivateCommand(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException {}
            public void createOverlayView(android.os.IBinder p0, android.graphics.Rect p1) throws android.os.RemoteException {}
            public void relayoutOverlayView(android.graphics.Rect p0) throws android.os.RemoteException {}
            public void removeOverlayView() throws android.os.RemoteException {}
            public void unblockContent(java.lang.String p0) throws android.os.RemoteException {}
            public void timeShiftPlay(android.net.Uri p0) throws android.os.RemoteException {}
            public void timeShiftPause() throws android.os.RemoteException {}
            public void timeShiftResume() throws android.os.RemoteException {}
            public void timeShiftSeekTo(long p0) throws android.os.RemoteException {}
            public void timeShiftSetPlaybackParams(android.media.PlaybackParams p0) throws android.os.RemoteException {}
            public void timeShiftEnablePositionTracking(boolean p0) throws android.os.RemoteException {}
            public void startRecording(android.net.Uri p0) throws android.os.RemoteException {}
            public void stopRecording() throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.media.tv.ITvInputSession {
        public Default() {}
        public void release() throws android.os.RemoteException {}
        public void setMain(boolean p0) throws android.os.RemoteException {}
        public void setSurface(android.view.Surface p0) throws android.os.RemoteException {}
        public void dispatchSurfaceChanged(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void setVolume(float p0) throws android.os.RemoteException {}
        public void tune(android.net.Uri p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public void setCaptionEnabled(boolean p0) throws android.os.RemoteException {}
        public void selectTrack(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void appPrivateCommand(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public void createOverlayView(android.os.IBinder p0, android.graphics.Rect p1) throws android.os.RemoteException {}
        public void relayoutOverlayView(android.graphics.Rect p0) throws android.os.RemoteException {}
        public void removeOverlayView() throws android.os.RemoteException {}
        public void unblockContent(java.lang.String p0) throws android.os.RemoteException {}
        public void timeShiftPlay(android.net.Uri p0) throws android.os.RemoteException {}
        public void timeShiftPause() throws android.os.RemoteException {}
        public void timeShiftResume() throws android.os.RemoteException {}
        public void timeShiftSeekTo(long p0) throws android.os.RemoteException {}
        public void timeShiftSetPlaybackParams(android.media.PlaybackParams p0) throws android.os.RemoteException {}
        public void timeShiftEnablePositionTracking(boolean p0) throws android.os.RemoteException {}
        public void startRecording(android.net.Uri p0) throws android.os.RemoteException {}
        public void stopRecording() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
