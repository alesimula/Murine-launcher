package android.app.slice;

public interface ISliceListener extends android.os.IInterface {
    public void onSliceUpdated(android.app.slice.Slice p0) throws android.os.RemoteException;

    public static class Default implements android.app.slice.ISliceListener {
        public Default() {}
        public void onSliceUpdated(android.app.slice.Slice p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.slice.ISliceListener {
        private static final java.lang.String DESCRIPTOR = "android.app.slice.ISliceListener";
        static final int TRANSACTION_onSliceUpdated = 1;
        public Stub() { super(); }
        public static android.app.slice.ISliceListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.app.slice.ISliceListener p0) { return false; }
        public static android.app.slice.ISliceListener getDefaultImpl() { return null; }

        private static class Proxy implements android.app.slice.ISliceListener {
            private android.os.IBinder mRemote;
            public static android.app.slice.ISliceListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onSliceUpdated(android.app.slice.Slice p0) throws android.os.RemoteException {}
        }
    }
}
