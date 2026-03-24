package android.service.assist.classification;

public interface IFieldClassificationCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.assist.classification.IFieldClassificationCallback";
    public void onCancellable(android.os.ICancellationSignal p0) throws android.os.RemoteException;
    public void onSuccess(android.service.assist.classification.FieldClassificationResponse p0) throws android.os.RemoteException;
    public void onFailure() throws android.os.RemoteException;
    public boolean isCompleted() throws android.os.RemoteException;
    public void cancel() throws android.os.RemoteException;

    public static class Default implements android.service.assist.classification.IFieldClassificationCallback {
        public Default() {}
        public void onCancellable(android.os.ICancellationSignal p0) throws android.os.RemoteException {}
        public void onSuccess(android.service.assist.classification.FieldClassificationResponse p0) throws android.os.RemoteException {}
        public void onFailure() throws android.os.RemoteException {}
        public boolean isCompleted() throws android.os.RemoteException { return false; }
        public void cancel() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.assist.classification.IFieldClassificationCallback {
        static final int TRANSACTION_onCancellable = 1;
        static final int TRANSACTION_onSuccess = 2;
        static final int TRANSACTION_onFailure = 3;
        static final int TRANSACTION_isCompleted = 4;
        static final int TRANSACTION_cancel = 5;
        public Stub() { super(); }
        public static android.service.assist.classification.IFieldClassificationCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.service.assist.classification.IFieldClassificationCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onCancellable(android.os.ICancellationSignal p0) throws android.os.RemoteException {}
            public void onSuccess(android.service.assist.classification.FieldClassificationResponse p0) throws android.os.RemoteException {}
            public void onFailure() throws android.os.RemoteException {}
            public boolean isCompleted() throws android.os.RemoteException { return false; }
            public void cancel() throws android.os.RemoteException {}
        }
    }
}
