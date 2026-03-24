package android.hardware.hdmi;

public interface IHdmiHotplugEventListener extends android.os.IInterface {
    public void onReceived(android.hardware.hdmi.HdmiHotplugEvent p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.hdmi.IHdmiHotplugEventListener {
        public Default() {}
        public void onReceived(android.hardware.hdmi.HdmiHotplugEvent p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.hdmi.IHdmiHotplugEventListener {
        public static final java.lang.String DESCRIPTOR = "android.hardware.hdmi.IHdmiHotplugEventListener";
        static final int TRANSACTION_onReceived = 1;
        public Stub() { super(); }
        public static android.hardware.hdmi.IHdmiHotplugEventListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.hardware.hdmi.IHdmiHotplugEventListener p0) { return false; }
        public static android.hardware.hdmi.IHdmiHotplugEventListener getDefaultImpl() { return null; }

        private static class Proxy implements android.hardware.hdmi.IHdmiHotplugEventListener {
            private android.os.IBinder mRemote;
            public static android.hardware.hdmi.IHdmiHotplugEventListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onReceived(android.hardware.hdmi.HdmiHotplugEvent p0) throws android.os.RemoteException {}
        }
    }
}
