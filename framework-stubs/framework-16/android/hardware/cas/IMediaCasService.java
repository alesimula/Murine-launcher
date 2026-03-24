package android.hardware.cas;

public interface IMediaCasService extends android.os.IInterface {
    public static final int VERSION = 1;
    public static final java.lang.String HASH = "bc51d8d70a55ec4723d3f73d0acf7003306bf69f";
    public static final java.lang.String DESCRIPTOR = null;
    public android.hardware.cas.IDescrambler createDescrambler(int p0) throws android.os.RemoteException;
    public android.hardware.cas.ICas createPlugin(int p0, android.hardware.cas.ICasListener p1) throws android.os.RemoteException;
    public android.hardware.cas.AidlCasPluginDescriptor[] enumeratePlugins() throws android.os.RemoteException;
    public boolean isDescramblerSupported(int p0) throws android.os.RemoteException;
    public boolean isSystemIdSupported(int p0) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.cas.IMediaCasService {
        public Default() {}
        public android.hardware.cas.IDescrambler createDescrambler(int p0) throws android.os.RemoteException { return null; }
        public android.hardware.cas.ICas createPlugin(int p0, android.hardware.cas.ICasListener p1) throws android.os.RemoteException { return null; }
        public android.hardware.cas.AidlCasPluginDescriptor[] enumeratePlugins() throws android.os.RemoteException { return null; }
        public boolean isDescramblerSupported(int p0) throws android.os.RemoteException { return false; }
        public boolean isSystemIdSupported(int p0) throws android.os.RemoteException { return false; }
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.cas.IMediaCasService {
        static final int TRANSACTION_createDescrambler = 1;
        static final int TRANSACTION_createPlugin = 2;
        static final int TRANSACTION_enumeratePlugins = 3;
        static final int TRANSACTION_isDescramblerSupported = 4;
        static final int TRANSACTION_isSystemIdSupported = 5;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.cas.IMediaCasService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.hardware.cas.IMediaCasService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.hardware.cas.IDescrambler createDescrambler(int p0) throws android.os.RemoteException { return null; }
            public android.hardware.cas.ICas createPlugin(int p0, android.hardware.cas.ICasListener p1) throws android.os.RemoteException { return null; }
            public android.hardware.cas.AidlCasPluginDescriptor[] enumeratePlugins() throws android.os.RemoteException { return null; }
            public boolean isDescramblerSupported(int p0) throws android.os.RemoteException { return false; }
            public boolean isSystemIdSupported(int p0) throws android.os.RemoteException { return false; }
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
