package android.companion.datatransfer.continuity;

public interface ITaskContinuityManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.companion.datatransfer.continuity.ITaskContinuityManager";
    public java.util.List<android.companion.datatransfer.continuity.RemoteTask> getRemoteTasks() throws android.os.RemoteException;
    public void registerRemoteTaskListener(android.companion.datatransfer.continuity.IRemoteTaskListener p0) throws android.os.RemoteException;
    public void unregisterRemoteTaskListener(android.companion.datatransfer.continuity.IRemoteTaskListener p0) throws android.os.RemoteException;
    public void requestHandoff(int p0, int p1, android.companion.datatransfer.continuity.IHandoffRequestCallback p2) throws android.os.RemoteException;

    public static class Default implements android.companion.datatransfer.continuity.ITaskContinuityManager {
        public Default() {}
        public java.util.List<android.companion.datatransfer.continuity.RemoteTask> getRemoteTasks() throws android.os.RemoteException { return null; }
        public void registerRemoteTaskListener(android.companion.datatransfer.continuity.IRemoteTaskListener p0) throws android.os.RemoteException {}
        public void unregisterRemoteTaskListener(android.companion.datatransfer.continuity.IRemoteTaskListener p0) throws android.os.RemoteException {}
        public void requestHandoff(int p0, int p1, android.companion.datatransfer.continuity.IHandoffRequestCallback p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.companion.datatransfer.continuity.ITaskContinuityManager {
        static final int TRANSACTION_getRemoteTasks = 1;
        static final int TRANSACTION_registerRemoteTaskListener = 2;
        static final int TRANSACTION_unregisterRemoteTaskListener = 3;
        static final int TRANSACTION_requestHandoff = 4;
        public Stub() { super(); }
        public static android.companion.datatransfer.continuity.ITaskContinuityManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.companion.datatransfer.continuity.ITaskContinuityManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public java.util.List<android.companion.datatransfer.continuity.RemoteTask> getRemoteTasks() throws android.os.RemoteException { return null; }
            public void registerRemoteTaskListener(android.companion.datatransfer.continuity.IRemoteTaskListener p0) throws android.os.RemoteException {}
            public void unregisterRemoteTaskListener(android.companion.datatransfer.continuity.IRemoteTaskListener p0) throws android.os.RemoteException {}
            public void requestHandoff(int p0, int p1, android.companion.datatransfer.continuity.IHandoffRequestCallback p2) throws android.os.RemoteException {}
        }
    }
}
