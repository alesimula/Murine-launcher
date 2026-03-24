package android.media.tv.interactive;

public interface ITvInteractiveAppService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.tv.interactive.ITvInteractiveAppService";
    public void registerCallback(android.media.tv.interactive.ITvInteractiveAppServiceCallback p0) throws android.os.RemoteException;
    public void unregisterCallback(android.media.tv.interactive.ITvInteractiveAppServiceCallback p0) throws android.os.RemoteException;
    public void createSession(android.view.InputChannel p0, android.media.tv.interactive.ITvInteractiveAppSessionCallback p1, java.lang.String p2, int p3) throws android.os.RemoteException;
    public void registerAppLinkInfo(android.media.tv.interactive.AppLinkInfo p0) throws android.os.RemoteException;
    public void unregisterAppLinkInfo(android.media.tv.interactive.AppLinkInfo p0) throws android.os.RemoteException;
    public void sendAppLinkCommand(android.os.Bundle p0) throws android.os.RemoteException;

    public static class Default implements android.media.tv.interactive.ITvInteractiveAppService {
        public Default() {}
        public void registerCallback(android.media.tv.interactive.ITvInteractiveAppServiceCallback p0) throws android.os.RemoteException {}
        public void unregisterCallback(android.media.tv.interactive.ITvInteractiveAppServiceCallback p0) throws android.os.RemoteException {}
        public void createSession(android.view.InputChannel p0, android.media.tv.interactive.ITvInteractiveAppSessionCallback p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
        public void registerAppLinkInfo(android.media.tv.interactive.AppLinkInfo p0) throws android.os.RemoteException {}
        public void unregisterAppLinkInfo(android.media.tv.interactive.AppLinkInfo p0) throws android.os.RemoteException {}
        public void sendAppLinkCommand(android.os.Bundle p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.interactive.ITvInteractiveAppService {
        static final int TRANSACTION_registerCallback = 1;
        static final int TRANSACTION_unregisterCallback = 2;
        static final int TRANSACTION_createSession = 3;
        static final int TRANSACTION_registerAppLinkInfo = 4;
        static final int TRANSACTION_unregisterAppLinkInfo = 5;
        static final int TRANSACTION_sendAppLinkCommand = 6;
        public Stub() { super(); }
        public static android.media.tv.interactive.ITvInteractiveAppService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.tv.interactive.ITvInteractiveAppService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void registerCallback(android.media.tv.interactive.ITvInteractiveAppServiceCallback p0) throws android.os.RemoteException {}
            public void unregisterCallback(android.media.tv.interactive.ITvInteractiveAppServiceCallback p0) throws android.os.RemoteException {}
            public void createSession(android.view.InputChannel p0, android.media.tv.interactive.ITvInteractiveAppSessionCallback p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
            public void registerAppLinkInfo(android.media.tv.interactive.AppLinkInfo p0) throws android.os.RemoteException {}
            public void unregisterAppLinkInfo(android.media.tv.interactive.AppLinkInfo p0) throws android.os.RemoteException {}
            public void sendAppLinkCommand(android.os.Bundle p0) throws android.os.RemoteException {}
        }
    }
}
