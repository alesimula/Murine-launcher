package android.se.omapi;

public interface ISecureElementChannel extends android.os.IInterface {
    public void close() throws android.os.RemoteException;
    public boolean isClosed() throws android.os.RemoteException;
    public boolean isBasicChannel() throws android.os.RemoteException;
    public byte[] getSelectResponse() throws android.os.RemoteException;
    public byte[] transmit(byte[] p0) throws android.os.RemoteException;
    public boolean selectNext() throws android.os.RemoteException;

    public static class Default implements android.se.omapi.ISecureElementChannel {
        public Default() {}
        public void close() throws android.os.RemoteException {}
        public boolean isClosed() throws android.os.RemoteException { return false; }
        public boolean isBasicChannel() throws android.os.RemoteException { return false; }
        public byte[] getSelectResponse() throws android.os.RemoteException { return null; }
        public byte[] transmit(byte[] p0) throws android.os.RemoteException { return null; }
        public boolean selectNext() throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.se.omapi.ISecureElementChannel {
        public static final java.lang.String DESCRIPTOR = "android.se.omapi.ISecureElementChannel";
        static final int TRANSACTION_close = 1;
        static final int TRANSACTION_isClosed = 2;
        static final int TRANSACTION_isBasicChannel = 3;
        static final int TRANSACTION_getSelectResponse = 4;
        static final int TRANSACTION_transmit = 5;
        static final int TRANSACTION_selectNext = 6;
        public Stub() { super(); }
        public static android.se.omapi.ISecureElementChannel asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.se.omapi.ISecureElementChannel p0) { return false; }
        public static android.se.omapi.ISecureElementChannel getDefaultImpl() { return null; }

        private static class Proxy implements android.se.omapi.ISecureElementChannel {
            private android.os.IBinder mRemote;
            public static android.se.omapi.ISecureElementChannel sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void close() throws android.os.RemoteException {}
            public boolean isClosed() throws android.os.RemoteException { return false; }
            public boolean isBasicChannel() throws android.os.RemoteException { return false; }
            public byte[] getSelectResponse() throws android.os.RemoteException { return null; }
            public byte[] transmit(byte[] p0) throws android.os.RemoteException { return null; }
            public boolean selectNext() throws android.os.RemoteException { return false; }
        }
    }
}
