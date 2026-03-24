package android.debug;

public interface IAdbManager extends android.os.IInterface {
    public void allowDebugging(boolean p0, java.lang.String p1) throws android.os.RemoteException;
    public void denyDebugging() throws android.os.RemoteException;
    public void clearDebuggingKeys() throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.debug.IAdbManager {
        private static final java.lang.String DESCRIPTOR = "android.debug.IAdbManager";
        static final int TRANSACTION_allowDebugging = 1;
        static final int TRANSACTION_denyDebugging = 2;
        static final int TRANSACTION_clearDebuggingKeys = 3;
        public Stub() { super(); }
        public static android.debug.IAdbManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.debug.IAdbManager p0) { return false; }
        public static android.debug.IAdbManager getDefaultImpl() { return null; }

        private static class Proxy implements android.debug.IAdbManager {
            private android.os.IBinder mRemote;
            public static android.debug.IAdbManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void allowDebugging(boolean p0, java.lang.String p1) throws android.os.RemoteException {}
            public void denyDebugging() throws android.os.RemoteException {}
            public void clearDebuggingKeys() throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.debug.IAdbManager {
        public Default() {}
        public void allowDebugging(boolean p0, java.lang.String p1) throws android.os.RemoteException {}
        public void denyDebugging() throws android.os.RemoteException {}
        public void clearDebuggingKeys() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
