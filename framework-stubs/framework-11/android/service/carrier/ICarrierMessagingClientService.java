package android.service.carrier;

public interface ICarrierMessagingClientService extends android.os.IInterface {

    public static class Default implements android.service.carrier.ICarrierMessagingClientService {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.carrier.ICarrierMessagingClientService {
        private static final java.lang.String DESCRIPTOR = "android.service.carrier.ICarrierMessagingClientService";
        public Stub() { super(); }
        public static android.service.carrier.ICarrierMessagingClientService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.service.carrier.ICarrierMessagingClientService p0) { return false; }
        public static android.service.carrier.ICarrierMessagingClientService getDefaultImpl() { return null; }

        private static class Proxy implements android.service.carrier.ICarrierMessagingClientService {
            private android.os.IBinder mRemote;
            public static android.service.carrier.ICarrierMessagingClientService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
        }
    }
}
