package android.media.tv.extension.scan;

public interface IOperatorDetection extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.tv.extension.scan.IOperatorDetection";
    public int setOperatorDetection(android.os.Bundle p0) throws android.os.RemoteException;
    public int setListener(android.media.tv.extension.scan.IOperatorDetectionListener p0) throws android.os.RemoteException;

    public static class Default implements android.media.tv.extension.scan.IOperatorDetection {
        public Default() {}
        public int setOperatorDetection(android.os.Bundle p0) throws android.os.RemoteException { return 0; }
        public int setListener(android.media.tv.extension.scan.IOperatorDetectionListener p0) throws android.os.RemoteException { return 0; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.extension.scan.IOperatorDetection {
        static final int TRANSACTION_setOperatorDetection = 1;
        static final int TRANSACTION_setListener = 2;
        public Stub() { super(); }
        public static android.media.tv.extension.scan.IOperatorDetection asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.tv.extension.scan.IOperatorDetection {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int setOperatorDetection(android.os.Bundle p0) throws android.os.RemoteException { return 0; }
            public int setListener(android.media.tv.extension.scan.IOperatorDetectionListener p0) throws android.os.RemoteException { return 0; }
        }
    }
}
