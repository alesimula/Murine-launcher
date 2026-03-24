package android.hardware;

public interface IConsumerIrService extends android.os.IInterface {
    public boolean hasIrEmitter() throws android.os.RemoteException;
    public void transmit(java.lang.String p0, int p1, int[] p2) throws android.os.RemoteException;
    public int[] getCarrierFrequencies() throws android.os.RemoteException;

    public static class Default implements android.hardware.IConsumerIrService {
        public Default() {}
        public boolean hasIrEmitter() throws android.os.RemoteException { return false; }
        public void transmit(java.lang.String p0, int p1, int[] p2) throws android.os.RemoteException {}
        public int[] getCarrierFrequencies() throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.IConsumerIrService {
        private static final java.lang.String DESCRIPTOR = "android.hardware.IConsumerIrService";
        static final int TRANSACTION_hasIrEmitter = 1;
        static final int TRANSACTION_transmit = 2;
        static final int TRANSACTION_getCarrierFrequencies = 3;
        public Stub() { super(); }
        public static android.hardware.IConsumerIrService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.hardware.IConsumerIrService p0) { return false; }
        public static android.hardware.IConsumerIrService getDefaultImpl() { return null; }

        private static class Proxy implements android.hardware.IConsumerIrService {
            private android.os.IBinder mRemote;
            public static android.hardware.IConsumerIrService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean hasIrEmitter() throws android.os.RemoteException { return false; }
            public void transmit(java.lang.String p0, int p1, int[] p2) throws android.os.RemoteException {}
            public int[] getCarrierFrequencies() throws android.os.RemoteException { return null; }
        }
    }
}
