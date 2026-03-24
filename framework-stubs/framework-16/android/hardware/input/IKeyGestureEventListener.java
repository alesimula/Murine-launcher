package android.hardware.input;

public interface IKeyGestureEventListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.input.IKeyGestureEventListener";
    public void onKeyGestureEvent(android.hardware.input.AidlKeyGestureEvent p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.input.IKeyGestureEventListener {
        public Default() {}
        public void onKeyGestureEvent(android.hardware.input.AidlKeyGestureEvent p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.input.IKeyGestureEventListener {
        static final int TRANSACTION_onKeyGestureEvent = 1;
        public Stub() { super(); }
        public static android.hardware.input.IKeyGestureEventListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.input.IKeyGestureEventListener {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onKeyGestureEvent(android.hardware.input.AidlKeyGestureEvent p0) throws android.os.RemoteException {}
        }
    }
}
