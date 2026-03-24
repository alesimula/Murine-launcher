package android.companion.datatransfer.continuity;

public interface IRemoteTaskListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.companion.datatransfer.continuity.IRemoteTaskListener";
    public void onRemoteTasksChanged(java.util.List<android.companion.datatransfer.continuity.RemoteTask> p0) throws android.os.RemoteException;

    public static class Default implements android.companion.datatransfer.continuity.IRemoteTaskListener {
        public Default() {}
        public void onRemoteTasksChanged(java.util.List<android.companion.datatransfer.continuity.RemoteTask> p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.companion.datatransfer.continuity.IRemoteTaskListener {
        static final int TRANSACTION_onRemoteTasksChanged = 1;
        public Stub() { super(); }
        public static android.companion.datatransfer.continuity.IRemoteTaskListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.companion.datatransfer.continuity.IRemoteTaskListener {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onRemoteTasksChanged(java.util.List<android.companion.datatransfer.continuity.RemoteTask> p0) throws android.os.RemoteException {}
        }
    }
}
