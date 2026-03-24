package android.view;

public interface IGraphicsStatsCallback extends android.os.IInterface {
    public void onRotateGraphicsStatsBuffer() throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.view.IGraphicsStatsCallback {
        private static final java.lang.String DESCRIPTOR = "android.view.IGraphicsStatsCallback";
        static final int TRANSACTION_onRotateGraphicsStatsBuffer = 1;
        public Stub() { super(); }
        public static android.view.IGraphicsStatsCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.view.IGraphicsStatsCallback p0) { return false; }
        public static android.view.IGraphicsStatsCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.view.IGraphicsStatsCallback {
            private android.os.IBinder mRemote;
            public static android.view.IGraphicsStatsCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onRotateGraphicsStatsBuffer() throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.view.IGraphicsStatsCallback {
        public Default() {}
        public void onRotateGraphicsStatsBuffer() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
