package android.app.timezone;

public interface IRulesManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.timezone.IRulesManager";
    public android.app.timezone.RulesState getRulesState() throws android.os.RemoteException;
    public int requestInstall(android.os.ParcelFileDescriptor p0, byte[] p1, android.app.timezone.ICallback p2) throws android.os.RemoteException;
    public int requestUninstall(byte[] p0, android.app.timezone.ICallback p1) throws android.os.RemoteException;
    public void requestNothing(byte[] p0, boolean p1) throws android.os.RemoteException;

    public static class Default implements android.app.timezone.IRulesManager {
        public Default() {}
        public android.app.timezone.RulesState getRulesState() throws android.os.RemoteException { return null; }
        public int requestInstall(android.os.ParcelFileDescriptor p0, byte[] p1, android.app.timezone.ICallback p2) throws android.os.RemoteException { return 0; }
        public int requestUninstall(byte[] p0, android.app.timezone.ICallback p1) throws android.os.RemoteException { return 0; }
        public void requestNothing(byte[] p0, boolean p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.timezone.IRulesManager {
        static final int TRANSACTION_getRulesState = 1;
        static final int TRANSACTION_requestInstall = 2;
        static final int TRANSACTION_requestUninstall = 3;
        static final int TRANSACTION_requestNothing = 4;
        public Stub() { super(); }
        public static android.app.timezone.IRulesManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.app.timezone.IRulesManager p0) { return false; }
        public static android.app.timezone.IRulesManager getDefaultImpl() { return null; }

        private static class Proxy implements android.app.timezone.IRulesManager {
            private android.os.IBinder mRemote;
            public static android.app.timezone.IRulesManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.app.timezone.RulesState getRulesState() throws android.os.RemoteException { return null; }
            public int requestInstall(android.os.ParcelFileDescriptor p0, byte[] p1, android.app.timezone.ICallback p2) throws android.os.RemoteException { return 0; }
            public int requestUninstall(byte[] p0, android.app.timezone.ICallback p1) throws android.os.RemoteException { return 0; }
            public void requestNothing(byte[] p0, boolean p1) throws android.os.RemoteException {}
        }
    }
}
