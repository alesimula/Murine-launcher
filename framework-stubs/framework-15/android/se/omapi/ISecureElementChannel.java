package android.se.omapi;

public interface ISecureElementChannel extends android.os.IInterface {
    public static final int VERSION = 1;
    public static final java.lang.String HASH = "894069bcfe4f35ceb2088278ddf87c83adee8014";
    public void close() throws android.os.RemoteException;
    public boolean isClosed() throws android.os.RemoteException;
    public boolean isBasicChannel() throws android.os.RemoteException;
    public byte[] getSelectResponse() throws android.os.RemoteException;
    public byte[] transmit(byte[] p0) throws android.os.RemoteException;
    public boolean selectNext() throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.se.omapi.ISecureElementChannel {
        public Default() {}
        public void close() throws android.os.RemoteException {}
        public boolean isClosed() throws android.os.RemoteException { return false; }
        public boolean isBasicChannel() throws android.os.RemoteException { return false; }
        public byte[] getSelectResponse() throws android.os.RemoteException { return null; }
        public byte[] transmit(byte[] p0) throws android.os.RemoteException { return null; }
        public boolean selectNext() throws android.os.RemoteException { return false; }
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.se.omapi.ISecureElementChannel {
        public static final java.lang.String DESCRIPTOR = null;
        static final int TRANSACTION_close = 1;
        static final int TRANSACTION_isClosed = 2;
        static final int TRANSACTION_isBasicChannel = 3;
        static final int TRANSACTION_getSelectResponse = 4;
        static final int TRANSACTION_transmit = 5;
        static final int TRANSACTION_selectNext = 6;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.se.omapi.ISecureElementChannel asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.se.omapi.ISecureElementChannel {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void close() throws android.os.RemoteException {}
            public boolean isClosed() throws android.os.RemoteException { return false; }
            public boolean isBasicChannel() throws android.os.RemoteException { return false; }
            public byte[] getSelectResponse() throws android.os.RemoteException { return null; }
            public byte[] transmit(byte[] p0) throws android.os.RemoteException { return null; }
            public boolean selectNext() throws android.os.RemoteException { return false; }
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
