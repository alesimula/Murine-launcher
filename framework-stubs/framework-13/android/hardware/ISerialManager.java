package android.hardware;

public interface ISerialManager extends android.os.IInterface {
    @android.annotation.EnforcePermission("android.permission.SERIAL_PORT")
    public java.lang.String[] getSerialPorts() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.SERIAL_PORT")
    public android.os.ParcelFileDescriptor openSerialPort(java.lang.String p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.ISerialManager {
        public Default() {}
        public java.lang.String[] getSerialPorts() throws android.os.RemoteException { return null; }
        public android.os.ParcelFileDescriptor openSerialPort(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.ISerialManager {
        public static final java.lang.String DESCRIPTOR = "android.hardware.ISerialManager";
        static final int TRANSACTION_getSerialPorts = 1;
        static final int TRANSACTION_openSerialPort = 2;
        public Stub() { super(); }
        public static android.hardware.ISerialManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.ISerialManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public java.lang.String[] getSerialPorts() throws android.os.RemoteException { return null; }
            public android.os.ParcelFileDescriptor openSerialPort(java.lang.String p0) throws android.os.RemoteException { return null; }
        }
    }
}
