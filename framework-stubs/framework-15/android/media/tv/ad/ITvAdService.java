package android.media.tv.ad;

public interface ITvAdService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.tv.ad.ITvAdService";
    public void registerCallback(android.media.tv.ad.ITvAdServiceCallback p0) throws android.os.RemoteException;
    public void unregisterCallback(android.media.tv.ad.ITvAdServiceCallback p0) throws android.os.RemoteException;
    public void createSession(android.view.InputChannel p0, android.media.tv.ad.ITvAdSessionCallback p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public void sendAppLinkCommand(android.os.Bundle p0) throws android.os.RemoteException;

    public static class Default implements android.media.tv.ad.ITvAdService {
        public Default() {}
        public void registerCallback(android.media.tv.ad.ITvAdServiceCallback p0) throws android.os.RemoteException {}
        public void unregisterCallback(android.media.tv.ad.ITvAdServiceCallback p0) throws android.os.RemoteException {}
        public void createSession(android.view.InputChannel p0, android.media.tv.ad.ITvAdSessionCallback p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
        public void sendAppLinkCommand(android.os.Bundle p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.ad.ITvAdService {
        static final int TRANSACTION_registerCallback = 1;
        static final int TRANSACTION_unregisterCallback = 2;
        static final int TRANSACTION_createSession = 3;
        static final int TRANSACTION_sendAppLinkCommand = 4;
        public Stub() { super(); }
        public static android.media.tv.ad.ITvAdService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.tv.ad.ITvAdService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void registerCallback(android.media.tv.ad.ITvAdServiceCallback p0) throws android.os.RemoteException {}
            public void unregisterCallback(android.media.tv.ad.ITvAdServiceCallback p0) throws android.os.RemoteException {}
            public void createSession(android.view.InputChannel p0, android.media.tv.ad.ITvAdSessionCallback p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
            public void sendAppLinkCommand(android.os.Bundle p0) throws android.os.RemoteException {}
        }
    }
}
