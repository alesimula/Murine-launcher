package android.window;

public interface ITaskSnapshotManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.window.ITaskSnapshotManager";
    public android.window.TaskSnapshot getTaskSnapshot(int p0, int p1) throws android.os.RemoteException;
    public android.window.TaskSnapshot takeTaskSnapshot(int p0, boolean p1) throws android.os.RemoteException;

    public static class Default implements android.window.ITaskSnapshotManager {
        public Default() {}
        public android.window.TaskSnapshot getTaskSnapshot(int p0, int p1) throws android.os.RemoteException { return null; }
        public android.window.TaskSnapshot takeTaskSnapshot(int p0, boolean p1) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.window.ITaskSnapshotManager {
        static final int TRANSACTION_getTaskSnapshot = 1;
        static final int TRANSACTION_takeTaskSnapshot = 2;
        public Stub() { super(); }
        public static android.window.ITaskSnapshotManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.window.ITaskSnapshotManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.window.TaskSnapshot getTaskSnapshot(int p0, int p1) throws android.os.RemoteException { return null; }
            public android.window.TaskSnapshot takeTaskSnapshot(int p0, boolean p1) throws android.os.RemoteException { return null; }
        }
    }
}
