package android.os;

public interface IVibratorStateListener extends android.os.IInterface {
    public void onVibrating(boolean p0) throws android.os.RemoteException;

    public static class Default implements android.os.IVibratorStateListener {
        public Default() {}
        public void onVibrating(boolean p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.IVibratorStateListener {
        private static final java.lang.String DESCRIPTOR = "android.os.IVibratorStateListener";
        static final int TRANSACTION_onVibrating = 1;
        public Stub() { super(); }
        public static android.os.IVibratorStateListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.os.IVibratorStateListener p0) { return false; }
        public static android.os.IVibratorStateListener getDefaultImpl() { return null; }

        private static class Proxy implements android.os.IVibratorStateListener {
            private android.os.IBinder mRemote;
            public static android.os.IVibratorStateListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onVibrating(boolean p0) throws android.os.RemoteException {}
        }
    }
}
