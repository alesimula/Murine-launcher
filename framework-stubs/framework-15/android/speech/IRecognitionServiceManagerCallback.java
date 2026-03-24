package android.speech;

public interface IRecognitionServiceManagerCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.speech.IRecognitionServiceManagerCallback";
    public void onSuccess(android.speech.IRecognitionService p0) throws android.os.RemoteException;
    public void onError(int p0) throws android.os.RemoteException;

    public static class Default implements android.speech.IRecognitionServiceManagerCallback {
        public Default() {}
        public void onSuccess(android.speech.IRecognitionService p0) throws android.os.RemoteException {}
        public void onError(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.speech.IRecognitionServiceManagerCallback {
        static final int TRANSACTION_onSuccess = 1;
        static final int TRANSACTION_onError = 2;
        public Stub() { super(); }
        public static android.speech.IRecognitionServiceManagerCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.speech.IRecognitionServiceManagerCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onSuccess(android.speech.IRecognitionService p0) throws android.os.RemoteException {}
            public void onError(int p0) throws android.os.RemoteException {}
        }
    }
}
