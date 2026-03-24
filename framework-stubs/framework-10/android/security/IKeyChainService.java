package android.security;

public interface IKeyChainService extends android.os.IInterface {
    @android.annotation.UnsupportedAppUsage
    public java.lang.String requestPrivateKey(java.lang.String p0) throws android.os.RemoteException;
    public byte[] getCertificate(java.lang.String p0) throws android.os.RemoteException;
    public byte[] getCaCertificates(java.lang.String p0) throws android.os.RemoteException;
    public boolean isUserSelectable(java.lang.String p0) throws android.os.RemoteException;
    public void setUserSelectable(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public int generateKeyPair(java.lang.String p0, android.security.keystore.ParcelableKeyGenParameterSpec p1) throws android.os.RemoteException;
    public int attestKey(java.lang.String p0, byte[] p1, int[] p2, android.security.keymaster.KeymasterCertificateChain p3) throws android.os.RemoteException;
    public boolean setKeyPairCertificate(java.lang.String p0, byte[] p1, byte[] p2) throws android.os.RemoteException;
    public java.lang.String installCaCertificate(byte[] p0) throws android.os.RemoteException;
    public boolean installKeyPair(byte[] p0, byte[] p1, byte[] p2, java.lang.String p3) throws android.os.RemoteException;
    public boolean removeKeyPair(java.lang.String p0) throws android.os.RemoteException;
    public boolean deleteCaCertificate(java.lang.String p0) throws android.os.RemoteException;
    public boolean reset() throws android.os.RemoteException;
    public android.content.pm.StringParceledListSlice getUserCaAliases() throws android.os.RemoteException;
    public android.content.pm.StringParceledListSlice getSystemCaAliases() throws android.os.RemoteException;
    public boolean containsCaAlias(java.lang.String p0) throws android.os.RemoteException;
    public byte[] getEncodedCaCertificate(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getCaCertificateChainAliases(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public void setGrant(int p0, java.lang.String p1, boolean p2) throws android.os.RemoteException;
    public boolean hasGrant(int p0, java.lang.String p1) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.security.IKeyChainService {
        private static final java.lang.String DESCRIPTOR = "android.security.IKeyChainService";
        static final int TRANSACTION_requestPrivateKey = 1;
        static final int TRANSACTION_getCertificate = 2;
        static final int TRANSACTION_getCaCertificates = 3;
        static final int TRANSACTION_isUserSelectable = 4;
        static final int TRANSACTION_setUserSelectable = 5;
        static final int TRANSACTION_generateKeyPair = 6;
        static final int TRANSACTION_attestKey = 7;
        static final int TRANSACTION_setKeyPairCertificate = 8;
        static final int TRANSACTION_installCaCertificate = 9;
        static final int TRANSACTION_installKeyPair = 10;
        static final int TRANSACTION_removeKeyPair = 11;
        static final int TRANSACTION_deleteCaCertificate = 12;
        static final int TRANSACTION_reset = 13;
        static final int TRANSACTION_getUserCaAliases = 14;
        static final int TRANSACTION_getSystemCaAliases = 15;
        static final int TRANSACTION_containsCaAlias = 16;
        static final int TRANSACTION_getEncodedCaCertificate = 17;
        static final int TRANSACTION_getCaCertificateChainAliases = 18;
        static final int TRANSACTION_setGrant = 19;
        static final int TRANSACTION_hasGrant = 20;
        public Stub() { super(); }
        public static android.security.IKeyChainService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.security.IKeyChainService p0) { return false; }
        public static android.security.IKeyChainService getDefaultImpl() { return null; }

        private static class Proxy implements android.security.IKeyChainService {
            private android.os.IBinder mRemote;
            public static android.security.IKeyChainService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public java.lang.String requestPrivateKey(java.lang.String p0) throws android.os.RemoteException { return null; }
            public byte[] getCertificate(java.lang.String p0) throws android.os.RemoteException { return null; }
            public byte[] getCaCertificates(java.lang.String p0) throws android.os.RemoteException { return null; }
            public boolean isUserSelectable(java.lang.String p0) throws android.os.RemoteException { return false; }
            public void setUserSelectable(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
            public int generateKeyPair(java.lang.String p0, android.security.keystore.ParcelableKeyGenParameterSpec p1) throws android.os.RemoteException { return 0; }
            public int attestKey(java.lang.String p0, byte[] p1, int[] p2, android.security.keymaster.KeymasterCertificateChain p3) throws android.os.RemoteException { return 0; }
            public boolean setKeyPairCertificate(java.lang.String p0, byte[] p1, byte[] p2) throws android.os.RemoteException { return false; }
            public java.lang.String installCaCertificate(byte[] p0) throws android.os.RemoteException { return null; }
            public boolean installKeyPair(byte[] p0, byte[] p1, byte[] p2, java.lang.String p3) throws android.os.RemoteException { return false; }
            public boolean removeKeyPair(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean deleteCaCertificate(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean reset() throws android.os.RemoteException { return false; }
            public android.content.pm.StringParceledListSlice getUserCaAliases() throws android.os.RemoteException { return null; }
            public android.content.pm.StringParceledListSlice getSystemCaAliases() throws android.os.RemoteException { return null; }
            public boolean containsCaAlias(java.lang.String p0) throws android.os.RemoteException { return false; }
            public byte[] getEncodedCaCertificate(java.lang.String p0, boolean p1) throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getCaCertificateChainAliases(java.lang.String p0, boolean p1) throws android.os.RemoteException { return null; }
            public void setGrant(int p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
            public boolean hasGrant(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        }
    }

    public static class Default implements android.security.IKeyChainService {
        public Default() {}
        public java.lang.String requestPrivateKey(java.lang.String p0) throws android.os.RemoteException { return null; }
        public byte[] getCertificate(java.lang.String p0) throws android.os.RemoteException { return null; }
        public byte[] getCaCertificates(java.lang.String p0) throws android.os.RemoteException { return null; }
        public boolean isUserSelectable(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void setUserSelectable(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
        public int generateKeyPair(java.lang.String p0, android.security.keystore.ParcelableKeyGenParameterSpec p1) throws android.os.RemoteException { return 0; }
        public int attestKey(java.lang.String p0, byte[] p1, int[] p2, android.security.keymaster.KeymasterCertificateChain p3) throws android.os.RemoteException { return 0; }
        public boolean setKeyPairCertificate(java.lang.String p0, byte[] p1, byte[] p2) throws android.os.RemoteException { return false; }
        public java.lang.String installCaCertificate(byte[] p0) throws android.os.RemoteException { return null; }
        public boolean installKeyPair(byte[] p0, byte[] p1, byte[] p2, java.lang.String p3) throws android.os.RemoteException { return false; }
        public boolean removeKeyPair(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean deleteCaCertificate(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean reset() throws android.os.RemoteException { return false; }
        public android.content.pm.StringParceledListSlice getUserCaAliases() throws android.os.RemoteException { return null; }
        public android.content.pm.StringParceledListSlice getSystemCaAliases() throws android.os.RemoteException { return null; }
        public boolean containsCaAlias(java.lang.String p0) throws android.os.RemoteException { return false; }
        public byte[] getEncodedCaCertificate(java.lang.String p0, boolean p1) throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getCaCertificateChainAliases(java.lang.String p0, boolean p1) throws android.os.RemoteException { return null; }
        public void setGrant(int p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
        public boolean hasGrant(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }
}
