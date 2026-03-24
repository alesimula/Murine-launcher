package android.hardware.usb.gadget;

public interface IUsbGadgetCallback extends android.os.IInterface {
    public static final int VERSION = 1;
    public static final java.lang.String HASH = "cb628c69682659911bca5c1d04042adba7f0de4b";
    public static final java.lang.String DESCRIPTOR = null;
    public void setCurrentUsbFunctionsCb(long p0, int p1, long p2) throws android.os.RemoteException;
    public void getCurrentUsbFunctionsCb(long p0, int p1, long p2) throws android.os.RemoteException;
    public void getUsbSpeedCb(int p0, long p1) throws android.os.RemoteException;
    public void resetCb(int p0, long p1) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.usb.gadget.IUsbGadgetCallback {
        public Default() {}
        public void setCurrentUsbFunctionsCb(long p0, int p1, long p2) throws android.os.RemoteException {}
        public void getCurrentUsbFunctionsCb(long p0, int p1, long p2) throws android.os.RemoteException {}
        public void getUsbSpeedCb(int p0, long p1) throws android.os.RemoteException {}
        public void resetCb(int p0, long p1) throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.usb.gadget.IUsbGadgetCallback {
        static final int TRANSACTION_setCurrentUsbFunctionsCb = 1;
        static final int TRANSACTION_getCurrentUsbFunctionsCb = 2;
        static final int TRANSACTION_getUsbSpeedCb = 3;
        static final int TRANSACTION_resetCb = 4;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.usb.gadget.IUsbGadgetCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.hardware.usb.gadget.IUsbGadgetCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setCurrentUsbFunctionsCb(long p0, int p1, long p2) throws android.os.RemoteException {}
            public void getCurrentUsbFunctionsCb(long p0, int p1, long p2) throws android.os.RemoteException {}
            public void getUsbSpeedCb(int p0, long p1) throws android.os.RemoteException {}
            public void resetCb(int p0, long p1) throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
