package android.location.provider;

public interface ILocationProviderManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.location.provider.ILocationProviderManager";
    public void onInitialize(boolean p0, android.location.provider.ProviderProperties p1, java.lang.String p2) throws android.os.RemoteException;
    public void onSetAllowed(boolean p0) throws android.os.RemoteException;
    public void onSetProperties(android.location.provider.ProviderProperties p0) throws android.os.RemoteException;
    public void onReportLocation(android.location.Location p0) throws android.os.RemoteException;
    public void onReportLocations(java.util.List<android.location.Location> p0) throws android.os.RemoteException;
    public void onFlushComplete() throws android.os.RemoteException;

    public static class Default implements android.location.provider.ILocationProviderManager {
        public Default() {}
        public void onInitialize(boolean p0, android.location.provider.ProviderProperties p1, java.lang.String p2) throws android.os.RemoteException {}
        public void onSetAllowed(boolean p0) throws android.os.RemoteException {}
        public void onSetProperties(android.location.provider.ProviderProperties p0) throws android.os.RemoteException {}
        public void onReportLocation(android.location.Location p0) throws android.os.RemoteException {}
        public void onReportLocations(java.util.List<android.location.Location> p0) throws android.os.RemoteException {}
        public void onFlushComplete() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.location.provider.ILocationProviderManager {
        static final int TRANSACTION_onInitialize = 1;
        static final int TRANSACTION_onSetAllowed = 2;
        static final int TRANSACTION_onSetProperties = 3;
        static final int TRANSACTION_onReportLocation = 4;
        static final int TRANSACTION_onReportLocations = 5;
        static final int TRANSACTION_onFlushComplete = 6;
        public Stub() { super(); }
        public static android.location.provider.ILocationProviderManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.location.provider.ILocationProviderManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onInitialize(boolean p0, android.location.provider.ProviderProperties p1, java.lang.String p2) throws android.os.RemoteException {}
            public void onSetAllowed(boolean p0) throws android.os.RemoteException {}
            public void onSetProperties(android.location.provider.ProviderProperties p0) throws android.os.RemoteException {}
            public void onReportLocation(android.location.Location p0) throws android.os.RemoteException {}
            public void onReportLocations(java.util.List<android.location.Location> p0) throws android.os.RemoteException {}
            public void onFlushComplete() throws android.os.RemoteException {}
        }
    }
}
