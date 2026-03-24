package android.hardware.hdmi;

public interface IHdmiVendorCommandListener extends android.os.IInterface {
    public void onReceived(int p0, int p1, byte[] p2, boolean p3) throws android.os.RemoteException;
    public void onControlStateChanged(boolean p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.hardware.hdmi.IHdmiVendorCommandListener {
        public Default() {}
        public void onReceived(int p0, int p1, byte[] p2, boolean p3) throws android.os.RemoteException {}
        public void onControlStateChanged(boolean p0, int p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.hdmi.IHdmiVendorCommandListener {
        private static final java.lang.String DESCRIPTOR = "android.hardware.hdmi.IHdmiVendorCommandListener";
        static final int TRANSACTION_onReceived = 1;
        static final int TRANSACTION_onControlStateChanged = 2;
        public Stub() { super(); }
        public static android.hardware.hdmi.IHdmiVendorCommandListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.hardware.hdmi.IHdmiVendorCommandListener p0) { return false; }
        public static android.hardware.hdmi.IHdmiVendorCommandListener getDefaultImpl() { return null; }

        private static class Proxy implements android.hardware.hdmi.IHdmiVendorCommandListener {
            private android.os.IBinder mRemote;
            public static android.hardware.hdmi.IHdmiVendorCommandListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onReceived(int p0, int p1, byte[] p2, boolean p3) throws android.os.RemoteException {}
            public void onControlStateChanged(boolean p0, int p1) throws android.os.RemoteException {}
        }
    }
}
