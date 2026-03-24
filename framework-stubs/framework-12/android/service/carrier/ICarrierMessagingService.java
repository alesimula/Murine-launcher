package android.service.carrier;

public interface ICarrierMessagingService extends android.os.IInterface {
    public void filterSms(android.service.carrier.MessagePdu p0, java.lang.String p1, int p2, int p3, android.service.carrier.ICarrierMessagingCallback p4) throws android.os.RemoteException;
    public void sendTextSms(java.lang.String p0, int p1, java.lang.String p2, int p3, android.service.carrier.ICarrierMessagingCallback p4) throws android.os.RemoteException;
    public void sendDataSms(byte[] p0, int p1, java.lang.String p2, int p3, int p4, android.service.carrier.ICarrierMessagingCallback p5) throws android.os.RemoteException;
    public void sendMultipartTextSms(java.util.List<java.lang.String> p0, int p1, java.lang.String p2, int p3, android.service.carrier.ICarrierMessagingCallback p4) throws android.os.RemoteException;
    public void sendMms(android.net.Uri p0, int p1, android.net.Uri p2, android.service.carrier.ICarrierMessagingCallback p3) throws android.os.RemoteException;
    public void downloadMms(android.net.Uri p0, int p1, android.net.Uri p2, android.service.carrier.ICarrierMessagingCallback p3) throws android.os.RemoteException;

    public static class Default implements android.service.carrier.ICarrierMessagingService {
        public Default() {}
        public void filterSms(android.service.carrier.MessagePdu p0, java.lang.String p1, int p2, int p3, android.service.carrier.ICarrierMessagingCallback p4) throws android.os.RemoteException {}
        public void sendTextSms(java.lang.String p0, int p1, java.lang.String p2, int p3, android.service.carrier.ICarrierMessagingCallback p4) throws android.os.RemoteException {}
        public void sendDataSms(byte[] p0, int p1, java.lang.String p2, int p3, int p4, android.service.carrier.ICarrierMessagingCallback p5) throws android.os.RemoteException {}
        public void sendMultipartTextSms(java.util.List<java.lang.String> p0, int p1, java.lang.String p2, int p3, android.service.carrier.ICarrierMessagingCallback p4) throws android.os.RemoteException {}
        public void sendMms(android.net.Uri p0, int p1, android.net.Uri p2, android.service.carrier.ICarrierMessagingCallback p3) throws android.os.RemoteException {}
        public void downloadMms(android.net.Uri p0, int p1, android.net.Uri p2, android.service.carrier.ICarrierMessagingCallback p3) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.carrier.ICarrierMessagingService {
        public static final java.lang.String DESCRIPTOR = "android.service.carrier.ICarrierMessagingService";
        static final int TRANSACTION_filterSms = 1;
        static final int TRANSACTION_sendTextSms = 2;
        static final int TRANSACTION_sendDataSms = 3;
        static final int TRANSACTION_sendMultipartTextSms = 4;
        static final int TRANSACTION_sendMms = 5;
        static final int TRANSACTION_downloadMms = 6;
        public Stub() { super(); }
        public static android.service.carrier.ICarrierMessagingService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.service.carrier.ICarrierMessagingService p0) { return false; }
        public static android.service.carrier.ICarrierMessagingService getDefaultImpl() { return null; }

        private static class Proxy implements android.service.carrier.ICarrierMessagingService {
            private android.os.IBinder mRemote;
            public static android.service.carrier.ICarrierMessagingService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void filterSms(android.service.carrier.MessagePdu p0, java.lang.String p1, int p2, int p3, android.service.carrier.ICarrierMessagingCallback p4) throws android.os.RemoteException {}
            public void sendTextSms(java.lang.String p0, int p1, java.lang.String p2, int p3, android.service.carrier.ICarrierMessagingCallback p4) throws android.os.RemoteException {}
            public void sendDataSms(byte[] p0, int p1, java.lang.String p2, int p3, int p4, android.service.carrier.ICarrierMessagingCallback p5) throws android.os.RemoteException {}
            public void sendMultipartTextSms(java.util.List<java.lang.String> p0, int p1, java.lang.String p2, int p3, android.service.carrier.ICarrierMessagingCallback p4) throws android.os.RemoteException {}
            public void sendMms(android.net.Uri p0, int p1, android.net.Uri p2, android.service.carrier.ICarrierMessagingCallback p3) throws android.os.RemoteException {}
            public void downloadMms(android.net.Uri p0, int p1, android.net.Uri p2, android.service.carrier.ICarrierMessagingCallback p3) throws android.os.RemoteException {}
        }
    }
}
