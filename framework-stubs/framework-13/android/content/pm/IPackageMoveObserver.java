package android.content.pm;

public interface IPackageMoveObserver extends android.os.IInterface {
    public void onCreated(int p0, android.os.Bundle p1) throws android.os.RemoteException;
    public void onStatusChanged(int p0, int p1, long p2) throws android.os.RemoteException;

    public static class Default implements android.content.pm.IPackageMoveObserver {
        public Default() {}
        public void onCreated(int p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public void onStatusChanged(int p0, int p1, long p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.content.pm.IPackageMoveObserver {
        public static final java.lang.String DESCRIPTOR = "android.content.pm.IPackageMoveObserver";
        static final int TRANSACTION_onCreated = 1;
        static final int TRANSACTION_onStatusChanged = 2;
        public Stub() { super(); }
        public static android.content.pm.IPackageMoveObserver asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.content.pm.IPackageMoveObserver {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onCreated(int p0, android.os.Bundle p1) throws android.os.RemoteException {}
            public void onStatusChanged(int p0, int p1, long p2) throws android.os.RemoteException {}
        }
    }
}
