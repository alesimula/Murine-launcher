package android.service.translation;

public interface ITranslationService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.translation.ITranslationService";
    public void onConnected(android.os.IBinder p0) throws android.os.RemoteException;
    public void onDisconnected() throws android.os.RemoteException;
    public void onCreateTranslationSession(android.view.translation.TranslationContext p0, int p1, com.android.internal.os.IResultReceiver p2) throws android.os.RemoteException;
    public void onTranslationCapabilitiesRequest(int p0, int p1, android.os.ResultReceiver p2) throws android.os.RemoteException;

    public static class Default implements android.service.translation.ITranslationService {
        public Default() {}
        public void onConnected(android.os.IBinder p0) throws android.os.RemoteException {}
        public void onDisconnected() throws android.os.RemoteException {}
        public void onCreateTranslationSession(android.view.translation.TranslationContext p0, int p1, com.android.internal.os.IResultReceiver p2) throws android.os.RemoteException {}
        public void onTranslationCapabilitiesRequest(int p0, int p1, android.os.ResultReceiver p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.translation.ITranslationService {
        static final int TRANSACTION_onConnected = 1;
        static final int TRANSACTION_onDisconnected = 2;
        static final int TRANSACTION_onCreateTranslationSession = 3;
        static final int TRANSACTION_onTranslationCapabilitiesRequest = 4;
        public Stub() { super(); }
        public static android.service.translation.ITranslationService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.service.translation.ITranslationService p0) { return false; }
        public static android.service.translation.ITranslationService getDefaultImpl() { return null; }

        private static class Proxy implements android.service.translation.ITranslationService {
            private android.os.IBinder mRemote;
            public static android.service.translation.ITranslationService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onConnected(android.os.IBinder p0) throws android.os.RemoteException {}
            public void onDisconnected() throws android.os.RemoteException {}
            public void onCreateTranslationSession(android.view.translation.TranslationContext p0, int p1, com.android.internal.os.IResultReceiver p2) throws android.os.RemoteException {}
            public void onTranslationCapabilitiesRequest(int p0, int p1, android.os.ResultReceiver p2) throws android.os.RemoteException {}
        }
    }
}
