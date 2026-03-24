package android.hardware.cas;

public interface IDescrambler extends android.os.IInterface {
    public static final int VERSION = 1;
    public static final java.lang.String HASH = "bc51d8d70a55ec4723d3f73d0acf7003306bf69f";
    public static final java.lang.String DESCRIPTOR = null;
    public int descramble(int p0, android.hardware.cas.SubSample[] p1, android.hardware.cas.SharedBuffer p2, long p3, android.hardware.cas.DestinationBuffer p4, long p5) throws android.os.RemoteException;
    public void release() throws android.os.RemoteException;
    public boolean requiresSecureDecoderComponent(java.lang.String p0) throws android.os.RemoteException;
    public void setMediaCasSession(byte[] p0) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.cas.IDescrambler {
        public Default() {}
        public int descramble(int p0, android.hardware.cas.SubSample[] p1, android.hardware.cas.SharedBuffer p2, long p3, android.hardware.cas.DestinationBuffer p4, long p5) throws android.os.RemoteException { return 0; }
        public void release() throws android.os.RemoteException {}
        public boolean requiresSecureDecoderComponent(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void setMediaCasSession(byte[] p0) throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.cas.IDescrambler {
        static final int TRANSACTION_descramble = 1;
        static final int TRANSACTION_release = 2;
        static final int TRANSACTION_requiresSecureDecoderComponent = 3;
        static final int TRANSACTION_setMediaCasSession = 4;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.cas.IDescrambler asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.hardware.cas.IDescrambler {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int descramble(int p0, android.hardware.cas.SubSample[] p1, android.hardware.cas.SharedBuffer p2, long p3, android.hardware.cas.DestinationBuffer p4, long p5) throws android.os.RemoteException { return 0; }
            public void release() throws android.os.RemoteException {}
            public boolean requiresSecureDecoderComponent(java.lang.String p0) throws android.os.RemoteException { return false; }
            public void setMediaCasSession(byte[] p0) throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
