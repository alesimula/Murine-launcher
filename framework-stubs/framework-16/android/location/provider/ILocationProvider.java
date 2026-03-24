package android.location.provider;

public interface ILocationProvider extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.location.provider.ILocationProvider";
    public void setLocationProviderManager(android.location.provider.ILocationProviderManager p0) throws android.os.RemoteException;
    public void setRequest(android.location.provider.ProviderRequest p0) throws android.os.RemoteException;
    public void flush() throws android.os.RemoteException;
    public void sendExtraCommand(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException;

    public static class Default implements android.location.provider.ILocationProvider {
        public Default() {}
        public void setLocationProviderManager(android.location.provider.ILocationProviderManager p0) throws android.os.RemoteException {}
        public void setRequest(android.location.provider.ProviderRequest p0) throws android.os.RemoteException {}
        public void flush() throws android.os.RemoteException {}
        public void sendExtraCommand(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.location.provider.ILocationProvider {
        static final int TRANSACTION_setLocationProviderManager = 1;
        static final int TRANSACTION_setRequest = 2;
        static final int TRANSACTION_flush = 3;
        static final int TRANSACTION_sendExtraCommand = 4;
        public Stub() { super(); }
        public static android.location.provider.ILocationProvider asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.location.provider.ILocationProvider {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setLocationProviderManager(android.location.provider.ILocationProviderManager p0) throws android.os.RemoteException {}
            public void setRequest(android.location.provider.ProviderRequest p0) throws android.os.RemoteException {}
            public void flush() throws android.os.RemoteException {}
            public void sendExtraCommand(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException {}
        }
    }
}
