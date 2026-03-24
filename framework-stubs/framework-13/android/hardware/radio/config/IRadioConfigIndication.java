package android.hardware.radio.config;

public interface IRadioConfigIndication extends android.os.IInterface {
    public static final int VERSION = 1;
    public static final java.lang.String HASH = "dd9c3f8e21930f9b4c46a4125bd5f5cec90318ec";
    public static final java.lang.String DESCRIPTOR = null;
    public void simSlotsStatusChanged(int p0, android.hardware.radio.config.SimSlotStatus[] p1) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.radio.config.IRadioConfigIndication {
        public Default() {}
        public void simSlotsStatusChanged(int p0, android.hardware.radio.config.SimSlotStatus[] p1) throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.radio.config.IRadioConfigIndication {
        static final int TRANSACTION_simSlotsStatusChanged = 1;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.radio.config.IRadioConfigIndication asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.hardware.radio.config.IRadioConfigIndication {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void simSlotsStatusChanged(int p0, android.hardware.radio.config.SimSlotStatus[] p1) throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
