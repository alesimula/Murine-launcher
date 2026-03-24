package android.media.tv;

public interface ITvInputManagerCallback extends android.os.IInterface {
    public void onInputAdded(java.lang.String p0) throws android.os.RemoteException;
    public void onInputRemoved(java.lang.String p0) throws android.os.RemoteException;
    public void onInputUpdated(java.lang.String p0) throws android.os.RemoteException;
    public void onInputStateChanged(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void onTvInputInfoUpdated(android.media.tv.TvInputInfo p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.media.tv.ITvInputManagerCallback {
        private static final java.lang.String DESCRIPTOR = "android.media.tv.ITvInputManagerCallback";
        static final int TRANSACTION_onInputAdded = 1;
        static final int TRANSACTION_onInputRemoved = 2;
        static final int TRANSACTION_onInputUpdated = 3;
        static final int TRANSACTION_onInputStateChanged = 4;
        static final int TRANSACTION_onTvInputInfoUpdated = 5;
        public Stub() { super(); }
        public static android.media.tv.ITvInputManagerCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.media.tv.ITvInputManagerCallback p0) { return false; }
        public static android.media.tv.ITvInputManagerCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.media.tv.ITvInputManagerCallback {
            private android.os.IBinder mRemote;
            public static android.media.tv.ITvInputManagerCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onInputAdded(java.lang.String p0) throws android.os.RemoteException {}
            public void onInputRemoved(java.lang.String p0) throws android.os.RemoteException {}
            public void onInputUpdated(java.lang.String p0) throws android.os.RemoteException {}
            public void onInputStateChanged(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void onTvInputInfoUpdated(android.media.tv.TvInputInfo p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.media.tv.ITvInputManagerCallback {
        public Default() {}
        public void onInputAdded(java.lang.String p0) throws android.os.RemoteException {}
        public void onInputRemoved(java.lang.String p0) throws android.os.RemoteException {}
        public void onInputUpdated(java.lang.String p0) throws android.os.RemoteException {}
        public void onInputStateChanged(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void onTvInputInfoUpdated(android.media.tv.TvInputInfo p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
