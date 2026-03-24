package android.service.carrier;

public interface ICarrierService extends android.os.IInterface {
    public void getCarrierConfig(android.service.carrier.CarrierIdentifier p0, android.os.ResultReceiver p1) throws android.os.RemoteException;

    public static class Default implements android.service.carrier.ICarrierService {
        public Default() {}
        public void getCarrierConfig(android.service.carrier.CarrierIdentifier p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
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
        public static boolean setDefaultImpl(android.service.carrier.ICarrierService p0) { return false; }
        public static android.service.carrier.ICarrierService getDefaultImpl() { return null; }

        private static class Proxy implements android.service.carrier.ICarrierService {
            private android.os.IBinder mRemote;
            public static android.service.carrier.ICarrierService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void getCarrierConfig(android.service.carrier.CarrierIdentifier p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
        }
    }
}
