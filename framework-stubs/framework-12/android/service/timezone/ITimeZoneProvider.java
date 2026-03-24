package android.service.timezone;

public interface ITimeZoneProvider extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.timezone.ITimeZoneProvider";
    public void startUpdates(android.service.timezone.ITimeZoneProviderManager p0, long p1) throws android.os.RemoteException;
    public void stopUpdates() throws android.os.RemoteException;

    public static class Default implements android.service.timezone.ITimeZoneProvider {
        public Default() {}
        public void startUpdates(android.service.timezone.ITimeZoneProviderManager p0, long p1) throws android.os.RemoteException {}
        public void stopUpdates() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.timezone.ITimeZoneProvider {
        static final int TRANSACTION_startUpdates = 1;
        static final int TRANSACTION_stopUpdates = 2;
        public Stub() { super(); }
        public static android.service.timezone.ITimeZoneProvider asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.service.timezone.ITimeZoneProvider p0) { return false; }
        public static android.service.timezone.ITimeZoneProvider getDefaultImpl() { return null; }

        private static class Proxy implements android.service.timezone.ITimeZoneProvider {
            private android.os.IBinder mRemote;
            public static android.service.timezone.ITimeZoneProvider sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void startUpdates(android.service.timezone.ITimeZoneProviderManager p0, long p1) throws android.os.RemoteException {}
            public void stopUpdates() throws android.os.RemoteException {}
        }
    }
}
