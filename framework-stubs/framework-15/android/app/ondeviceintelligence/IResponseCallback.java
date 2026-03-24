package android.app.ondeviceintelligence;

public interface IResponseCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.ondeviceintelligence.IResponseCallback";
    public void onSuccess(android.os.Bundle p0) throws android.os.RemoteException;
    public void onFailure(int p0, java.lang.String p1, android.os.PersistableBundle p2) throws android.os.RemoteException;
    public void onDataAugmentRequest(android.os.Bundle p0, android.os.RemoteCallback p1) throws android.os.RemoteException;

    public static class Default implements android.app.ondeviceintelligence.IResponseCallback {
        public Default() {}
        public void onSuccess(android.os.Bundle p0) throws android.os.RemoteException {}
        public void onFailure(int p0, java.lang.String p1, android.os.PersistableBundle p2) throws android.os.RemoteException {}
        public void onDataAugmentRequest(android.os.Bundle p0, android.os.RemoteCallback p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.ondeviceintelligence.IResponseCallback {
        static final int TRANSACTION_onSuccess = 2;
        static final int TRANSACTION_onFailure = 3;
        static final int TRANSACTION_onDataAugmentRequest = 4;
        public Stub() { super(); }
        public static android.app.ondeviceintelligence.IResponseCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.app.ondeviceintelligence.IResponseCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onSuccess(android.os.Bundle p0) throws android.os.RemoteException {}
            public void onFailure(int p0, java.lang.String p1, android.os.PersistableBundle p2) throws android.os.RemoteException {}
            public void onDataAugmentRequest(android.os.Bundle p0, android.os.RemoteCallback p1) throws android.os.RemoteException {}
        }
    }
}
