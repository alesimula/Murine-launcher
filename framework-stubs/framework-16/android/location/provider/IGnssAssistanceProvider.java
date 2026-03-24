package android.location.provider;

public interface IGnssAssistanceProvider extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.location.provider.IGnssAssistanceProvider";
    public void request(android.location.provider.IGnssAssistanceCallback p0) throws android.os.RemoteException;

    public static class Default implements android.location.provider.IGnssAssistanceProvider {
        public Default() {}
        public void request(android.location.provider.IGnssAssistanceCallback p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.location.provider.IGnssAssistanceProvider {
        static final int TRANSACTION_request = 1;
        public Stub() { super(); }
        public static android.location.provider.IGnssAssistanceProvider asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.location.provider.IGnssAssistanceProvider {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void request(android.location.provider.IGnssAssistanceCallback p0) throws android.os.RemoteException {}
        }
    }
}
