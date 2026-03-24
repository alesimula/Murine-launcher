package android.hardware.hdmi;

public interface IHdmiControlStatusChangeListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.hdmi.IHdmiControlStatusChangeListener";
    public void onStatusChange(int p0, boolean p1) throws android.os.RemoteException;

    public static class Default implements android.hardware.hdmi.IHdmiControlStatusChangeListener {
        public Default() {}
        public void onStatusChange(int p0, boolean p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.hdmi.IHdmiControlStatusChangeListener {
        static final int TRANSACTION_onStatusChange = 1;
        public Stub() { super(); }
        public static android.hardware.hdmi.IHdmiControlStatusChangeListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.hardware.hdmi.IHdmiControlStatusChangeListener p0) { return false; }
        public static android.hardware.hdmi.IHdmiControlStatusChangeListener getDefaultImpl() { return null; }

        private static class Proxy implements android.hardware.hdmi.IHdmiControlStatusChangeListener {
            private android.os.IBinder mRemote;
            public static android.hardware.hdmi.IHdmiControlStatusChangeListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onStatusChange(int p0, boolean p1) throws android.os.RemoteException {}
        }
    }
}
