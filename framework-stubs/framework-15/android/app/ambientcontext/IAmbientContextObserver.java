package android.app.ambientcontext;

public interface IAmbientContextObserver extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.ambientcontext.IAmbientContextObserver";
    public void onEvents(java.util.List<android.app.ambientcontext.AmbientContextEvent> p0) throws android.os.RemoteException;
    public void onRegistrationComplete(int p0) throws android.os.RemoteException;

    public static class Default implements android.app.ambientcontext.IAmbientContextObserver {
        public Default() {}
        public void onEvents(java.util.List<android.app.ambientcontext.AmbientContextEvent> p0) throws android.os.RemoteException {}
        public void onRegistrationComplete(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.ambientcontext.IAmbientContextObserver {
        static final int TRANSACTION_onEvents = 1;
        static final int TRANSACTION_onRegistrationComplete = 2;
        public Stub() { super(); }
        public static android.app.ambientcontext.IAmbientContextObserver asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.app.ambientcontext.IAmbientContextObserver {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onEvents(java.util.List<android.app.ambientcontext.AmbientContextEvent> p0) throws android.os.RemoteException {}
            public void onRegistrationComplete(int p0) throws android.os.RemoteException {}
        }
    }
}
