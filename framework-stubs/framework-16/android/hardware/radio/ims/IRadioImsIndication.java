package android.hardware.radio.ims;

public interface IRadioImsIndication extends android.os.IInterface {
    public static final int VERSION = 3;
    public static final java.lang.String HASH = "b2a615a151c7114c4216b1987fd32d40c797d00a";
    public static final java.lang.String DESCRIPTOR = null;
    public void onConnectionSetupFailure(int p0, int p1, android.hardware.radio.ims.ConnectionFailureInfo p2) throws android.os.RemoteException;
    public void notifyAnbr(int p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public void triggerImsDeregistration(int p0, int p1) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.radio.ims.IRadioImsIndication {
        public Default() {}
        public void onConnectionSetupFailure(int p0, int p1, android.hardware.radio.ims.ConnectionFailureInfo p2) throws android.os.RemoteException {}
        public void notifyAnbr(int p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public void triggerImsDeregistration(int p0, int p1) throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.radio.ims.IRadioImsIndication {
        static final int TRANSACTION_onConnectionSetupFailure = 1;
        static final int TRANSACTION_notifyAnbr = 2;
        static final int TRANSACTION_triggerImsDeregistration = 3;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.radio.ims.IRadioImsIndication asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.hardware.radio.ims.IRadioImsIndication {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onConnectionSetupFailure(int p0, int p1, android.hardware.radio.ims.ConnectionFailureInfo p2) throws android.os.RemoteException {}
            public void notifyAnbr(int p0, int p1, int p2, int p3) throws android.os.RemoteException {}
            public void triggerImsDeregistration(int p0, int p1) throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
