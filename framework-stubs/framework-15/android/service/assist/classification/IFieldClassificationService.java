package android.service.assist.classification;

public interface IFieldClassificationService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.assist.classification.IFieldClassificationService";
    public void onConnected(boolean p0, boolean p1) throws android.os.RemoteException;
    public void onDisconnected() throws android.os.RemoteException;
    public void onFieldClassificationRequest(android.service.assist.classification.FieldClassificationRequest p0, android.service.assist.classification.IFieldClassificationCallback p1) throws android.os.RemoteException;

    public static class Default implements android.service.assist.classification.IFieldClassificationService {
        public Default() {}
        public void onConnected(boolean p0, boolean p1) throws android.os.RemoteException {}
        public void onDisconnected() throws android.os.RemoteException {}
        public void onFieldClassificationRequest(android.service.assist.classification.FieldClassificationRequest p0, android.service.assist.classification.IFieldClassificationCallback p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.assist.classification.IFieldClassificationService {
        static final int TRANSACTION_onConnected = 1;
        static final int TRANSACTION_onDisconnected = 2;
        static final int TRANSACTION_onFieldClassificationRequest = 3;
        public Stub() { super(); }
        public static android.service.assist.classification.IFieldClassificationService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.service.assist.classification.IFieldClassificationService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onConnected(boolean p0, boolean p1) throws android.os.RemoteException {}
            public void onDisconnected() throws android.os.RemoteException {}
            public void onFieldClassificationRequest(android.service.assist.classification.FieldClassificationRequest p0, android.service.assist.classification.IFieldClassificationCallback p1) throws android.os.RemoteException {}
        }
    }
}
