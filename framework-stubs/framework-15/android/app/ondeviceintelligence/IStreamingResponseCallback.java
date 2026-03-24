package android.app.ondeviceintelligence;

public interface IStreamingResponseCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.ondeviceintelligence.IStreamingResponseCallback";
    public void onNewContent(android.os.Bundle p0) throws android.os.RemoteException;
    public void onSuccess(android.os.Bundle p0) throws android.os.RemoteException;
    public void onFailure(int p0, java.lang.String p1, android.os.PersistableBundle p2) throws android.os.RemoteException;
    public void onDataAugmentRequest(android.os.Bundle p0, android.os.RemoteCallback p1) throws android.os.RemoteException;

    public static class Default implements android.app.ondeviceintelligence.IStreamingResponseCallback {
        public Default() {}
        public void onNewContent(android.os.Bundle p0) throws android.os.RemoteException {}
        public void onSuccess(android.os.Bundle p0) throws android.os.RemoteException {}
        public void onFailure(int p0, java.lang.String p1, android.os.PersistableBundle p2) throws android.os.RemoteException {}
        public void onDataAugmentRequest(android.os.Bundle p0, android.os.RemoteCallback p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.ondeviceintelligence.IStreamingResponseCallback {
        static final int TRANSACTION_onNewContent = 2;
        static final int TRANSACTION_onSuccess = 3;
        static final int TRANSACTION_onFailure = 4;
        static final int TRANSACTION_onDataAugmentRequest = 5;
        public Stub() { super(); }
        public static android.app.ondeviceintelligence.IStreamingResponseCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.app.ondeviceintelligence.IStreamingResponseCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onNewContent(android.os.Bundle p0) throws android.os.RemoteException {}
            public void onSuccess(android.os.Bundle p0) throws android.os.RemoteException {}
            public void onFailure(int p0, java.lang.String p1, android.os.PersistableBundle p2) throws android.os.RemoteException {}
            public void onDataAugmentRequest(android.os.Bundle p0, android.os.RemoteCallback p1) throws android.os.RemoteException {}
        }
    }
}
