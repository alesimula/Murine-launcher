package android.hardware.usb;

public interface IUsbManagerInternal extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.usb.IUsbManagerInternal";
    public boolean enableUsbDataSignal(boolean p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.hardware.usb.IUsbManagerInternal {
        public Default() {}
        public boolean enableUsbDataSignal(boolean p0, int p1) throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.usb.IUsbManagerInternal {
        static final int TRANSACTION_enableUsbDataSignal = 1;
        public Stub() { super(); }
        public static android.hardware.usb.IUsbManagerInternal asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.usb.IUsbManagerInternal {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean enableUsbDataSignal(boolean p0, int p1) throws android.os.RemoteException { return false; }
        }
    }
}
