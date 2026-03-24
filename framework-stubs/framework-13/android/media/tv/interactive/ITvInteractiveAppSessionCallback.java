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
    public void onCommandRequest(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException;
    public void onSetVideoBounds(android.graphics.Rect p0) throws android.os.RemoteException;
    public void onRequestCurrentChannelUri() throws android.os.RemoteException;
    public void onRequestCurrentChannelLcn() throws android.os.RemoteException;
    public void onRequestStreamVolume() throws android.os.RemoteException;
    public void onRequestTrackInfoList() throws android.os.RemoteException;
    public void onRequestCurrentTvInputId() throws android.os.RemoteException;
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
        public void onCommandRequest(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public void onSetVideoBounds(android.graphics.Rect p0) throws android.os.RemoteException {}
        public void onRequestCurrentChannelUri() throws android.os.RemoteException {}
        public void onRequestCurrentChannelLcn() throws android.os.RemoteException {}
        public void onRequestStreamVolume() throws android.os.RemoteException {}
        public void onRequestTrackInfoList() throws android.os.RemoteException {}
        public void onRequestCurrentTvInputId() throws android.os.RemoteException {}
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
        static final int TRANSACTION_onCommandRequest = 8;
        static final int TRANSACTION_onSetVideoBounds = 9;
        static final int TRANSACTION_onRequestCurrentChannelUri = 10;
        static final int TRANSACTION_onRequestCurrentChannelLcn = 11;
        static final int TRANSACTION_onRequestStreamVolume = 12;
        static final int TRANSACTION_onRequestTrackInfoList = 13;
        static final int TRANSACTION_onRequestCurrentTvInputId = 14;
        static final int TRANSACTION_onRequestSigning = 15;
        static final int TRANSACTION_onAdRequest = 16;
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
            public void onCommandRequest(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException {}
            public void onSetVideoBounds(android.graphics.Rect p0) throws android.os.RemoteException {}
            public void onRequestCurrentChannelUri() throws android.os.RemoteException {}
            public void onRequestCurrentChannelLcn() throws android.os.RemoteException {}
            public void onRequestStreamVolume() throws android.os.RemoteException {}
            public void onRequestTrackInfoList() throws android.os.RemoteException {}
            public void onRequestCurrentTvInputId() throws android.os.RemoteException {}
            public void onRequestSigning(java.lang.String p0, java.lang.String p1, java.lang.String p2, byte[] p3) throws android.os.RemoteException {}
            public void onAdRequest(android.media.tv.AdRequest p0) throws android.os.RemoteException {}
        }
    }
}
