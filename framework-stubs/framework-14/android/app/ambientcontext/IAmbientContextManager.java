package android.app.ambientcontext;

public interface IAmbientContextManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.ambientcontext.IAmbientContextManager";
    public void registerObserver(android.app.ambientcontext.AmbientContextEventRequest p0, android.app.PendingIntent p1, android.os.RemoteCallback p2) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.ACCESS_AMBIENT_CONTEXT_EVENT")
    public void registerObserverWithCallback(android.app.ambientcontext.AmbientContextEventRequest p0, java.lang.String p1, android.app.ambientcontext.IAmbientContextObserver p2) throws android.os.RemoteException;
    public void unregisterObserver(java.lang.String p0) throws android.os.RemoteException;
    public void queryServiceStatus(int[] p0, java.lang.String p1, android.os.RemoteCallback p2) throws android.os.RemoteException;
    public void startConsentActivity(int[] p0, java.lang.String p1) throws android.os.RemoteException;

    public static class Default implements android.app.ambientcontext.IAmbientContextManager {
        public Default() {}
        public void registerObserver(android.app.ambientcontext.AmbientContextEventRequest p0, android.app.PendingIntent p1, android.os.RemoteCallback p2) throws android.os.RemoteException {}
        public void registerObserverWithCallback(android.app.ambientcontext.AmbientContextEventRequest p0, java.lang.String p1, android.app.ambientcontext.IAmbientContextObserver p2) throws android.os.RemoteException {}
        public void unregisterObserver(java.lang.String p0) throws android.os.RemoteException {}
        public void queryServiceStatus(int[] p0, java.lang.String p1, android.os.RemoteCallback p2) throws android.os.RemoteException {}
        public void startConsentActivity(int[] p0, java.lang.String p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.ambientcontext.IAmbientContextManager {
        static final int TRANSACTION_registerObserver = 1;
        static final int TRANSACTION_registerObserverWithCallback = 2;
        static final int TRANSACTION_unregisterObserver = 3;
        static final int TRANSACTION_queryServiceStatus = 4;
        static final int TRANSACTION_startConsentActivity = 5;
        public Stub() { super(); }
        public static android.app.ambientcontext.IAmbientContextManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.app.ambientcontext.IAmbientContextManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void registerObserver(android.app.ambientcontext.AmbientContextEventRequest p0, android.app.PendingIntent p1, android.os.RemoteCallback p2) throws android.os.RemoteException {}
            public void registerObserverWithCallback(android.app.ambientcontext.AmbientContextEventRequest p0, java.lang.String p1, android.app.ambientcontext.IAmbientContextObserver p2) throws android.os.RemoteException {}
            public void unregisterObserver(java.lang.String p0) throws android.os.RemoteException {}
            public void queryServiceStatus(int[] p0, java.lang.String p1, android.os.RemoteCallback p2) throws android.os.RemoteException {}
            public void startConsentActivity(int[] p0, java.lang.String p1) throws android.os.RemoteException {}
        }
    }
}
