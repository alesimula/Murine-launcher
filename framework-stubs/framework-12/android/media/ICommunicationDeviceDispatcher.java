package android.media;

public interface ICommunicationDeviceDispatcher extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.ICommunicationDeviceDispatcher";
    public void dispatchCommunicationDeviceChanged(int p0) throws android.os.RemoteException;

    public static class Default implements android.media.ICommunicationDeviceDispatcher {
        public Default() {}
        public void dispatchCommunicationDeviceChanged(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.ICommunicationDeviceDispatcher {
        static final int TRANSACTION_dispatchCommunicationDeviceChanged = 1;
        public Stub() { super(); }
        public static android.media.ICommunicationDeviceDispatcher asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.media.ICommunicationDeviceDispatcher p0) { return false; }
        public static android.media.ICommunicationDeviceDispatcher getDefaultImpl() { return null; }

        private static class Proxy implements android.media.ICommunicationDeviceDispatcher {
            private android.os.IBinder mRemote;
            public static android.media.ICommunicationDeviceDispatcher sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void dispatchCommunicationDeviceChanged(int p0) throws android.os.RemoteException {}
        }
    }
}
