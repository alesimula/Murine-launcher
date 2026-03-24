package android.media.tv;

public interface ITvInputServiceCallback extends android.os.IInterface {
    public void addHardwareInput(int p0, android.media.tv.TvInputInfo p1) throws android.os.RemoteException;
    public void addHdmiInput(int p0, android.media.tv.TvInputInfo p1) throws android.os.RemoteException;
    public void removeHardwareInput(java.lang.String p0) throws android.os.RemoteException;

    public static class Default implements android.media.tv.ITvInputServiceCallback {
        public Default() {}
        public void addHardwareInput(int p0, android.media.tv.TvInputInfo p1) throws android.os.RemoteException {}
        public void addHdmiInput(int p0, android.media.tv.TvInputInfo p1) throws android.os.RemoteException {}
        public void removeHardwareInput(java.lang.String p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.ITvInputServiceCallback {
        public static final java.lang.String DESCRIPTOR = "android.media.tv.ITvInputServiceCallback";
        static final int TRANSACTION_addHardwareInput = 1;
        static final int TRANSACTION_addHdmiInput = 2;
        static final int TRANSACTION_removeHardwareInput = 3;
        public Stub() { super(); }
        public static android.media.tv.ITvInputServiceCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.media.tv.ITvInputServiceCallback p0) { return false; }
        public static android.media.tv.ITvInputServiceCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.media.tv.ITvInputServiceCallback {
            private android.os.IBinder mRemote;
            public static android.media.tv.ITvInputServiceCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void addHardwareInput(int p0, android.media.tv.TvInputInfo p1) throws android.os.RemoteException {}
            public void addHdmiInput(int p0, android.media.tv.TvInputInfo p1) throws android.os.RemoteException {}
            public void removeHardwareInput(java.lang.String p0) throws android.os.RemoteException {}
        }
    }
}
