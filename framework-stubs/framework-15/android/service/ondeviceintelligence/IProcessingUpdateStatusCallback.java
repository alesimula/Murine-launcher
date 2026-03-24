package android.service.ondeviceintelligence;

public interface IProcessingUpdateStatusCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.ondeviceintelligence.IProcessingUpdateStatusCallback";
    public void onSuccess(android.os.PersistableBundle p0) throws android.os.RemoteException;
    public void onFailure(int p0, java.lang.String p1) throws android.os.RemoteException;

    public static class Default implements android.service.ondeviceintelligence.IProcessingUpdateStatusCallback {
        public Default() {}
        public void onSuccess(android.os.PersistableBundle p0) throws android.os.RemoteException {}
        public void onFailure(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.ondeviceintelligence.IProcessingUpdateStatusCallback {
        static final int TRANSACTION_onSuccess = 2;
        static final int TRANSACTION_onFailure = 3;
        public Stub() { super(); }
        public static android.service.ondeviceintelligence.IProcessingUpdateStatusCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.service.ondeviceintelligence.IProcessingUpdateStatusCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onSuccess(android.os.PersistableBundle p0) throws android.os.RemoteException {}
            public void onFailure(int p0, java.lang.String p1) throws android.os.RemoteException {}
        }
    }
}
