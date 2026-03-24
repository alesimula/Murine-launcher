package android.service.carrier;

public interface ICarrierService extends android.os.IInterface {
    public void getCarrierConfig(int p0, android.service.carrier.CarrierIdentifier p1, android.os.ResultReceiver p2) throws android.os.RemoteException;

    public static class Default implements android.service.carrier.ICarrierService {
        public Default() {}
        public void getCarrierConfig(int p0, android.service.carrier.CarrierIdentifier p1, android.os.ResultReceiver p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.carrier.ICarrierService {
        public static final java.lang.String DESCRIPTOR = "android.service.carrier.ICarrierService";
        static final int TRANSACTION_getCarrierConfig = 1;
        public Stub() { super(); }
        public static android.service.carrier.ICarrierService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.service.carrier.ICarrierService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void getCarrierConfig(int p0, android.service.carrier.CarrierIdentifier p1, android.os.ResultReceiver p2) throws android.os.RemoteException {}
        }
    }
}
