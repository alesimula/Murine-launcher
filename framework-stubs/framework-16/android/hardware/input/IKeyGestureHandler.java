package android.hardware.input;

public interface IKeyGestureHandler extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.input.IKeyGestureHandler";
    public void handleKeyGesture(android.hardware.input.AidlKeyGestureEvent p0, android.os.IBinder p1) throws android.os.RemoteException;

    public static class Default implements android.hardware.input.IKeyGestureHandler {
        public Default() {}
        public void handleKeyGesture(android.hardware.input.AidlKeyGestureEvent p0, android.os.IBinder p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.input.IKeyGestureHandler {
        static final int TRANSACTION_handleKeyGesture = 1;
        public Stub() { super(); }
        public static android.hardware.input.IKeyGestureHandler asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.input.IKeyGestureHandler {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void handleKeyGesture(android.hardware.input.AidlKeyGestureEvent p0, android.os.IBinder p1) throws android.os.RemoteException {}
        }
    }
}
