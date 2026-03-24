package android.service.notification;

public interface IConditionProvider extends android.os.IInterface {
    public void onConnected() throws android.os.RemoteException;
    public void onSubscribe(android.net.Uri p0) throws android.os.RemoteException;
    public void onUnsubscribe(android.net.Uri p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.service.notification.IConditionProvider {
        private static final java.lang.String DESCRIPTOR = "android.service.notification.IConditionProvider";
        static final int TRANSACTION_onConnected = 1;
        static final int TRANSACTION_onSubscribe = 2;
        static final int TRANSACTION_onUnsubscribe = 3;
        public Stub() { super(); }
        public static android.service.notification.IConditionProvider asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.service.notification.IConditionProvider p0) { return false; }
        public static android.service.notification.IConditionProvider getDefaultImpl() { return null; }

        private static class Proxy implements android.service.notification.IConditionProvider {
            private android.os.IBinder mRemote;
            public static android.service.notification.IConditionProvider sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onConnected() throws android.os.RemoteException {}
            public void onSubscribe(android.net.Uri p0) throws android.os.RemoteException {}
            public void onUnsubscribe(android.net.Uri p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.service.notification.IConditionProvider {
        public Default() {}
        public void onConnected() throws android.os.RemoteException {}
        public void onSubscribe(android.net.Uri p0) throws android.os.RemoteException {}
        public void onUnsubscribe(android.net.Uri p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
