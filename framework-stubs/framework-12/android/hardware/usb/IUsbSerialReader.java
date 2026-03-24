package android.hardware.usb;

public interface IUsbSerialReader extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.usb.IUsbSerialReader";
    public java.lang.String getSerial(java.lang.String p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.usb.IUsbSerialReader {
        public Default() {}
        public java.lang.String getSerial(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.usb.IUsbSerialReader {
        static final int TRANSACTION_getSerial = 1;
        public Stub() { super(); }
        public static android.hardware.usb.IUsbSerialReader asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.hardware.usb.IUsbSerialReader p0) { return false; }
        public static android.hardware.usb.IUsbSerialReader getDefaultImpl() { return null; }

        private static class Proxy implements android.hardware.usb.IUsbSerialReader {
            private android.os.IBinder mRemote;
            public static android.hardware.usb.IUsbSerialReader sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public java.lang.String getSerial(java.lang.String p0) throws android.os.RemoteException { return null; }
        }
    }
}
