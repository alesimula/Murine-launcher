package android.service.media;

public interface IMediaBrowserService extends android.os.IInterface {
    public void connect(java.lang.String p0, android.os.Bundle p1, android.service.media.IMediaBrowserServiceCallbacks p2) throws android.os.RemoteException;
    public void disconnect(android.service.media.IMediaBrowserServiceCallbacks p0) throws android.os.RemoteException;
    public void addSubscriptionDeprecated(java.lang.String p0, android.service.media.IMediaBrowserServiceCallbacks p1) throws android.os.RemoteException;
    public void removeSubscriptionDeprecated(java.lang.String p0, android.service.media.IMediaBrowserServiceCallbacks p1) throws android.os.RemoteException;
    public void getMediaItem(java.lang.String p0, android.os.ResultReceiver p1, android.service.media.IMediaBrowserServiceCallbacks p2) throws android.os.RemoteException;
    public void addSubscription(java.lang.String p0, android.os.IBinder p1, android.os.Bundle p2, android.service.media.IMediaBrowserServiceCallbacks p3) throws android.os.RemoteException;
    public void removeSubscription(java.lang.String p0, android.os.IBinder p1, android.service.media.IMediaBrowserServiceCallbacks p2) throws android.os.RemoteException;

    public static class Default implements android.service.media.IMediaBrowserService {
        public Default() {}
        public void connect(java.lang.String p0, android.os.Bundle p1, android.service.media.IMediaBrowserServiceCallbacks p2) throws android.os.RemoteException {}
        public void disconnect(android.service.media.IMediaBrowserServiceCallbacks p0) throws android.os.RemoteException {}
        public void addSubscriptionDeprecated(java.lang.String p0, android.service.media.IMediaBrowserServiceCallbacks p1) throws android.os.RemoteException {}
        public void removeSubscriptionDeprecated(java.lang.String p0, android.service.media.IMediaBrowserServiceCallbacks p1) throws android.os.RemoteException {}
        public void getMediaItem(java.lang.String p0, android.os.ResultReceiver p1, android.service.media.IMediaBrowserServiceCallbacks p2) throws android.os.RemoteException {}
        public void addSubscription(java.lang.String p0, android.os.IBinder p1, android.os.Bundle p2, android.service.media.IMediaBrowserServiceCallbacks p3) throws android.os.RemoteException {}
        public void removeSubscription(java.lang.String p0, android.os.IBinder p1, android.service.media.IMediaBrowserServiceCallbacks p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.media.IMediaBrowserService {
        public static final java.lang.String DESCRIPTOR = "android.service.media.IMediaBrowserService";
        static final int TRANSACTION_connect = 1;
        static final int TRANSACTION_disconnect = 2;
        static final int TRANSACTION_addSubscriptionDeprecated = 3;
        static final int TRANSACTION_removeSubscriptionDeprecated = 4;
        static final int TRANSACTION_getMediaItem = 5;
        static final int TRANSACTION_addSubscription = 6;
        static final int TRANSACTION_removeSubscription = 7;
        public Stub() { super(); }
        public static android.service.media.IMediaBrowserService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.service.media.IMediaBrowserService p0) { return false; }
        public static android.service.media.IMediaBrowserService getDefaultImpl() { return null; }

        private static class Proxy implements android.service.media.IMediaBrowserService {
            private android.os.IBinder mRemote;
            public static android.service.media.IMediaBrowserService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void connect(java.lang.String p0, android.os.Bundle p1, android.service.media.IMediaBrowserServiceCallbacks p2) throws android.os.RemoteException {}
            public void disconnect(android.service.media.IMediaBrowserServiceCallbacks p0) throws android.os.RemoteException {}
            public void addSubscriptionDeprecated(java.lang.String p0, android.service.media.IMediaBrowserServiceCallbacks p1) throws android.os.RemoteException {}
            public void removeSubscriptionDeprecated(java.lang.String p0, android.service.media.IMediaBrowserServiceCallbacks p1) throws android.os.RemoteException {}
            public void getMediaItem(java.lang.String p0, android.os.ResultReceiver p1, android.service.media.IMediaBrowserServiceCallbacks p2) throws android.os.RemoteException {}
            public void addSubscription(java.lang.String p0, android.os.IBinder p1, android.os.Bundle p2, android.service.media.IMediaBrowserServiceCallbacks p3) throws android.os.RemoteException {}
            public void removeSubscription(java.lang.String p0, android.os.IBinder p1, android.service.media.IMediaBrowserServiceCallbacks p2) throws android.os.RemoteException {}
        }
    }
}
