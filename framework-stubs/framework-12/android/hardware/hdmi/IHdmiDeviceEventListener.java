package android.hardware.hdmi;

public interface IHdmiDeviceEventListener extends android.os.IInterface {
    public void onStatusChanged(android.hardware.hdmi.HdmiDeviceInfo p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.hardware.hdmi.IHdmiDeviceEventListener {
        public Default() {}
        public void onStatusChanged(android.hardware.hdmi.HdmiDeviceInfo p0, int p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.hdmi.IHdmiDeviceEventListener {
        public static final java.lang.String DESCRIPTOR = "android.hardware.hdmi.IHdmiDeviceEventListener";
        static final int TRANSACTION_onStatusChanged = 1;
        public Stub() { super(); }
        public static android.hardware.hdmi.IHdmiDeviceEventListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.hardware.hdmi.IHdmiDeviceEventListener p0) { return false; }
        public static android.hardware.hdmi.IHdmiDeviceEventListener getDefaultImpl() { return null; }

        private static class Proxy implements android.hardware.hdmi.IHdmiDeviceEventListener {
            private android.os.IBinder mRemote;
            public static android.hardware.hdmi.IHdmiDeviceEventListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onStatusChanged(android.hardware.hdmi.HdmiDeviceInfo p0, int p1) throws android.os.RemoteException {}
        }
    }
}
