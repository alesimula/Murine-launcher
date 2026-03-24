package android.os;

public interface IInputConstants extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.os.IInputConstants";
    public static final int UNMULTIPLIED_DEFAULT_DISPATCHING_TIMEOUT_MILLIS = 5000;
    public static final long BLOCK_FLAG_SLIPPERY = 157929241L;
    public static final int INVALID_BATTERY_CAPACITY = -1;
    public static final int INVALID_INPUT_EVENT_ID = 0;
    public static final int POLICY_FLAG_INJECTED_FROM_ACCESSIBILITY = 131072;
    public static final int INPUT_EVENT_FLAG_IS_ACCESSIBILITY_EVENT = 2048;

    public static class Default implements android.os.IInputConstants {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.IInputConstants {
        public Stub() { super(); }
        public static android.os.IInputConstants asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.os.IInputConstants p0) { return false; }
        public static android.os.IInputConstants getDefaultImpl() { return null; }

        private static class Proxy implements android.os.IInputConstants {
            private android.os.IBinder mRemote;
            public static android.os.IInputConstants sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
        }
    }
}
