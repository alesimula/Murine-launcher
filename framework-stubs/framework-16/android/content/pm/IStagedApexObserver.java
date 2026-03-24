package android.content.pm;

public interface IStagedApexObserver extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.content.pm.IStagedApexObserver";
    public void onApexStaged(android.content.pm.ApexStagedEvent p0) throws android.os.RemoteException;

    public static class Default implements android.content.pm.IStagedApexObserver {
        public Default() {}
        public void onApexStaged(android.content.pm.ApexStagedEvent p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.content.pm.IStagedApexObserver {
        static final int TRANSACTION_onApexStaged = 1;
        public Stub() { super(); }
        public static android.content.pm.IStagedApexObserver asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.content.pm.IStagedApexObserver {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onApexStaged(android.content.pm.ApexStagedEvent p0) throws android.os.RemoteException {}
        }
    }
}
