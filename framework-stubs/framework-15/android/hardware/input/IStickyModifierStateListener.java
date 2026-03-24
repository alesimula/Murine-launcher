package android.hardware.input;

public interface IStickyModifierStateListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.input.IStickyModifierStateListener";
    public void onStickyModifierStateChanged(int p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.hardware.input.IStickyModifierStateListener {
        public Default() {}
        public void onStickyModifierStateChanged(int p0, int p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.input.IStickyModifierStateListener {
        static final int TRANSACTION_onStickyModifierStateChanged = 1;
        public Stub() { super(); }
        public static android.hardware.input.IStickyModifierStateListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.input.IStickyModifierStateListener {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onStickyModifierStateChanged(int p0, int p1) throws android.os.RemoteException {}
        }
    }
}
