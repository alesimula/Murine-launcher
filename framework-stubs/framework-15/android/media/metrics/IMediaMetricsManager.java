package android.media.metrics;

public interface IMediaMetricsManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.metrics.IMediaMetricsManager";
    public void reportPlaybackMetrics(java.lang.String p0, android.media.metrics.PlaybackMetrics p1, int p2) throws android.os.RemoteException;
    public java.lang.String getPlaybackSessionId(int p0) throws android.os.RemoteException;
    public java.lang.String getRecordingSessionId(int p0) throws android.os.RemoteException;
    public void reportNetworkEvent(java.lang.String p0, android.media.metrics.NetworkEvent p1, int p2) throws android.os.RemoteException;
    public void reportPlaybackErrorEvent(java.lang.String p0, android.media.metrics.PlaybackErrorEvent p1, int p2) throws android.os.RemoteException;
    public void reportPlaybackStateEvent(java.lang.String p0, android.media.metrics.PlaybackStateEvent p1, int p2) throws android.os.RemoteException;
    public void reportTrackChangeEvent(java.lang.String p0, android.media.metrics.TrackChangeEvent p1, int p2) throws android.os.RemoteException;
    public void reportEditingEndedEvent(java.lang.String p0, android.media.metrics.EditingEndedEvent p1, int p2) throws android.os.RemoteException;
    public java.lang.String getTranscodingSessionId(int p0) throws android.os.RemoteException;
    public java.lang.String getEditingSessionId(int p0) throws android.os.RemoteException;
    public java.lang.String getBundleSessionId(int p0) throws android.os.RemoteException;
    public void reportBundleMetrics(java.lang.String p0, android.os.PersistableBundle p1, int p2) throws android.os.RemoteException;
    public void releaseSessionId(java.lang.String p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.media.metrics.IMediaMetricsManager {
        public Default() {}
        public void reportPlaybackMetrics(java.lang.String p0, android.media.metrics.PlaybackMetrics p1, int p2) throws android.os.RemoteException {}
        public java.lang.String getPlaybackSessionId(int p0) throws android.os.RemoteException { return null; }
        public java.lang.String getRecordingSessionId(int p0) throws android.os.RemoteException { return null; }
        public void reportNetworkEvent(java.lang.String p0, android.media.metrics.NetworkEvent p1, int p2) throws android.os.RemoteException {}
        public void reportPlaybackErrorEvent(java.lang.String p0, android.media.metrics.PlaybackErrorEvent p1, int p2) throws android.os.RemoteException {}
        public void reportPlaybackStateEvent(java.lang.String p0, android.media.metrics.PlaybackStateEvent p1, int p2) throws android.os.RemoteException {}
        public void reportTrackChangeEvent(java.lang.String p0, android.media.metrics.TrackChangeEvent p1, int p2) throws android.os.RemoteException {}
        public void reportEditingEndedEvent(java.lang.String p0, android.media.metrics.EditingEndedEvent p1, int p2) throws android.os.RemoteException {}
        public java.lang.String getTranscodingSessionId(int p0) throws android.os.RemoteException { return null; }
        public java.lang.String getEditingSessionId(int p0) throws android.os.RemoteException { return null; }
        public java.lang.String getBundleSessionId(int p0) throws android.os.RemoteException { return null; }
        public void reportBundleMetrics(java.lang.String p0, android.os.PersistableBundle p1, int p2) throws android.os.RemoteException {}
        public void releaseSessionId(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.metrics.IMediaMetricsManager {
        static final int TRANSACTION_reportPlaybackMetrics = 1;
        static final int TRANSACTION_getPlaybackSessionId = 2;
        static final int TRANSACTION_getRecordingSessionId = 3;
        static final int TRANSACTION_reportNetworkEvent = 4;
        static final int TRANSACTION_reportPlaybackErrorEvent = 5;
        static final int TRANSACTION_reportPlaybackStateEvent = 6;
        static final int TRANSACTION_reportTrackChangeEvent = 7;
        static final int TRANSACTION_reportEditingEndedEvent = 8;
        static final int TRANSACTION_getTranscodingSessionId = 9;
        static final int TRANSACTION_getEditingSessionId = 10;
        static final int TRANSACTION_getBundleSessionId = 11;
        static final int TRANSACTION_reportBundleMetrics = 12;
        static final int TRANSACTION_releaseSessionId = 13;
        public Stub() { super(); }
        public static android.media.metrics.IMediaMetricsManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.metrics.IMediaMetricsManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void reportPlaybackMetrics(java.lang.String p0, android.media.metrics.PlaybackMetrics p1, int p2) throws android.os.RemoteException {}
            public java.lang.String getPlaybackSessionId(int p0) throws android.os.RemoteException { return null; }
            public java.lang.String getRecordingSessionId(int p0) throws android.os.RemoteException { return null; }
            public void reportNetworkEvent(java.lang.String p0, android.media.metrics.NetworkEvent p1, int p2) throws android.os.RemoteException {}
            public void reportPlaybackErrorEvent(java.lang.String p0, android.media.metrics.PlaybackErrorEvent p1, int p2) throws android.os.RemoteException {}
            public void reportPlaybackStateEvent(java.lang.String p0, android.media.metrics.PlaybackStateEvent p1, int p2) throws android.os.RemoteException {}
            public void reportTrackChangeEvent(java.lang.String p0, android.media.metrics.TrackChangeEvent p1, int p2) throws android.os.RemoteException {}
            public void reportEditingEndedEvent(java.lang.String p0, android.media.metrics.EditingEndedEvent p1, int p2) throws android.os.RemoteException {}
            public java.lang.String getTranscodingSessionId(int p0) throws android.os.RemoteException { return null; }
            public java.lang.String getEditingSessionId(int p0) throws android.os.RemoteException { return null; }
            public java.lang.String getBundleSessionId(int p0) throws android.os.RemoteException { return null; }
            public void reportBundleMetrics(java.lang.String p0, android.os.PersistableBundle p1, int p2) throws android.os.RemoteException {}
            public void releaseSessionId(java.lang.String p0, int p1) throws android.os.RemoteException {}
        }
    }
}
