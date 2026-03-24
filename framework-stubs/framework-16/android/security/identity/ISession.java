package android.security.identity;

public interface ISession extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.security.identity.ISession";
    public byte[] getEphemeralKeyPair() throws android.os.RemoteException;
    public long getAuthChallenge() throws android.os.RemoteException;
    public void setReaderEphemeralPublicKey(byte[] p0) throws android.os.RemoteException;
    public void setSessionTranscript(byte[] p0) throws android.os.RemoteException;
    public android.security.identity.ICredential getCredentialForPresentation(java.lang.String p0) throws android.os.RemoteException;

    public static class Default implements android.security.identity.ISession {
        public Default() {}
        public byte[] getEphemeralKeyPair() throws android.os.RemoteException { return null; }
        public long getAuthChallenge() throws android.os.RemoteException { return 0L; }
        public void setReaderEphemeralPublicKey(byte[] p0) throws android.os.RemoteException {}
        public void setSessionTranscript(byte[] p0) throws android.os.RemoteException {}
        public android.security.identity.ICredential getCredentialForPresentation(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.security.identity.ISession {
        static final int TRANSACTION_getEphemeralKeyPair = 1;
        static final int TRANSACTION_getAuthChallenge = 2;
        static final int TRANSACTION_setReaderEphemeralPublicKey = 3;
        static final int TRANSACTION_setSessionTranscript = 4;
        static final int TRANSACTION_getCredentialForPresentation = 5;
        public Stub() { super(); }
        public static android.security.identity.ISession asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.security.identity.ISession {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public byte[] getEphemeralKeyPair() throws android.os.RemoteException { return null; }
            public long getAuthChallenge() throws android.os.RemoteException { return 0L; }
            public void setReaderEphemeralPublicKey(byte[] p0) throws android.os.RemoteException {}
            public void setSessionTranscript(byte[] p0) throws android.os.RemoteException {}
            public android.security.identity.ICredential getCredentialForPresentation(java.lang.String p0) throws android.os.RemoteException { return null; }
        }
    }
}
