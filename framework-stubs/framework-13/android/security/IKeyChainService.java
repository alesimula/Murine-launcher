package android.security;

public interface IKeyChainService extends android.os.IInterface {
    public java.lang.String requestPrivateKey(java.lang.String p0) throws android.os.RemoteException;
    public byte[] getCertificate(java.lang.String p0) throws android.os.RemoteException;
    public byte[] getCaCertificates(java.lang.String p0) throws android.os.RemoteException;
    public boolean isUserSelectable(java.lang.String p0) throws android.os.RemoteException;
    public void setUserSelectable(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public int generateKeyPair(java.lang.String p0, android.security.keystore.ParcelableKeyGenParameterSpec p1) throws android.os.RemoteException;
    public boolean setKeyPairCertificate(java.lang.String p0, byte[] p1, byte[] p2) throws android.os.RemoteException;
    public java.lang.String installCaCertificate(byte[] p0) throws android.os.RemoteException;
    public boolean installKeyPair(byte[] p0, byte[] p1, byte[] p2, java.lang.String p3, int p4) throws android.os.RemoteException;
    public boolean removeKeyPair(java.lang.String p0) throws android.os.RemoteException;
    public boolean containsKeyPair(java.lang.String p0) throws android.os.RemoteException;
    public int[] getGrants(java.lang.String p0) throws android.os.RemoteException;
    public boolean deleteCaCertificate(java.lang.String p0) throws android.os.RemoteException;
    public boolean reset() throws android.os.RemoteException;
    public android.content.pm.StringParceledListSlice getUserCaAliases() throws android.os.RemoteException;
    public android.content.pm.StringParceledListSlice getSystemCaAliases() throws android.os.RemoteException;
    public boolean containsCaAlias(java.lang.String p0) throws android.os.RemoteException;
    public byte[] getEncodedCaCertificate(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getCaCertificateChainAliases(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public void setCredentialManagementApp(java.lang.String p0, android.security.AppUriAuthenticationPolicy p1) throws android.os.RemoteException;
    public boolean hasCredentialManagementApp() throws android.os.RemoteException;
    public java.lang.String getCredentialManagementAppPackageName() throws android.os.RemoteException;
    public android.security.AppUriAuthenticationPolicy getCredentialManagementAppPolicy() throws android.os.RemoteException;
    public java.lang.String getPredefinedAliasForPackageAndUri(java.lang.String p0, android.net.Uri p1) throws android.os.RemoteException;
    public void removeCredentialManagementApp() throws android.os.RemoteException;
    public boolean isCredentialManagementApp(java.lang.String p0) throws android.os.RemoteException;
    public boolean setGrant(int p0, java.lang.String p1, boolean p2) throws android.os.RemoteException;
    public boolean hasGrant(int p0, java.lang.String p1) throws android.os.RemoteException;
    public java.lang.String getWifiKeyGrantAsUser(java.lang.String p0) throws android.os.RemoteException;

    public static class Default implements android.security.IKeyChainService {
        public Default() {}
        public java.lang.String requestPrivateKey(java.lang.String p0) throws android.os.RemoteException { return null; }
        public byte[] getCertificate(java.lang.String p0) throws android.os.RemoteException { return null; }
        public byte[] getCaCertificates(java.lang.String p0) throws android.os.RemoteException { return null; }
        public boolean isUserSelectable(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void setUserSelectable(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
        public int generateKeyPair(java.lang.String p0, android.security.keystore.ParcelableKeyGenParameterSpec p1) throws android.os.RemoteException { return 0; }
        public boolean setKeyPairCertificate(java.lang.String p0, byte[] p1, byte[] p2) throws android.os.RemoteException { return false; }
        public java.lang.String installCaCertificate(byte[] p0) throws android.os.RemoteException { return null; }
        public boolean installKeyPair(byte[] p0, byte[] p1, byte[] p2, java.lang.String p3, int p4) throws android.os.RemoteException { return false; }
        public boolean removeKeyPair(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean containsKeyPair(java.lang.String p0) throws android.os.RemoteException { return false; }
        public int[] getGrants(java.lang.String p0) throws android.os.RemoteException { return null; }
        public boolean deleteCaCertificate(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean reset() throws android.os.RemoteException { return false; }
        public android.content.pm.StringParceledListSlice getUserCaAliases() throws android.os.RemoteException { return null; }
        public android.content.pm.StringParceledListSlice getSystemCaAliases() throws android.os.RemoteException { return null; }
        public boolean containsCaAlias(java.lang.String p0) throws android.os.RemoteException { return false; }
        public byte[] getEncodedCaCertificate(java.lang.String p0, boolean p1) throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getCaCertificateChainAliases(java.lang.String p0, boolean p1) throws android.os.RemoteException { return null; }
        public void setCredentialManagementApp(java.lang.String p0, android.security.AppUriAuthenticationPolicy p1) throws android.os.RemoteException {}
        public boolean hasCredentialManagementApp() throws android.os.RemoteException { return false; }
        public java.lang.String getCredentialManagementAppPackageName() throws android.os.RemoteException { return null; }
        public android.security.AppUriAuthenticationPolicy getCredentialManagementAppPolicy() throws android.os.RemoteException { return null; }
        public java.lang.String getPredefinedAliasForPackageAndUri(java.lang.String p0, android.net.Uri p1) throws android.os.RemoteException { return null; }
        public void removeCredentialManagementApp() throws android.os.RemoteException {}
        public boolean isCredentialManagementApp(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean setGrant(int p0, java.lang.String p1, boolean p2) throws android.os.RemoteException { return false; }
        public boolean hasGrant(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public java.lang.String getWifiKeyGrantAsUser(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.security.IKeyChainService {
        public static final java.lang.String DESCRIPTOR = "android.security.IKeyChainService";
        static final int TRANSACTION_requestPrivateKey = 1;
        static final int TRANSACTION_getCertificate = 2;
        static final int TRANSACTION_getCaCertificates = 3;
        static final int TRANSACTION_isUserSelectable = 4;
        static final int TRANSACTION_setUserSelectable = 5;
        static final int TRANSACTION_generateKeyPair = 6;
        static final int TRANSACTION_setKeyPairCertificate = 7;
        static final int TRANSACTION_installCaCertificate = 8;
        static final int TRANSACTION_installKeyPair = 9;
        static final int TRANSACTION_removeKeyPair = 10;
        static final int TRANSACTION_containsKeyPair = 11;
        static final int TRANSACTION_getGrants = 12;
        static final int TRANSACTION_deleteCaCertificate = 13;
        static final int TRANSACTION_reset = 14;
        static final int TRANSACTION_getUserCaAliases = 15;
        static final int TRANSACTION_getSystemCaAliases = 16;
        static final int TRANSACTION_containsCaAlias = 17;
        static final int TRANSACTION_getEncodedCaCertificate = 18;
        static final int TRANSACTION_getCaCertificateChainAliases = 19;
        static final int TRANSACTION_setCredentialManagementApp = 20;
        static final int TRANSACTION_hasCredentialManagementApp = 21;
        static final int TRANSACTION_getCredentialManagementAppPackageName = 22;
        static final int TRANSACTION_getCredentialManagementAppPolicy = 23;
        static final int TRANSACTION_getPredefinedAliasForPackageAndUri = 24;
        static final int TRANSACTION_removeCredentialManagementApp = 25;
        static final int TRANSACTION_isCredentialManagementApp = 26;
        static final int TRANSACTION_setGrant = 27;
        static final int TRANSACTION_hasGrant = 28;
        static final int TRANSACTION_getWifiKeyGrantAsUser = 29;
        public Stub() { super(); }
        public static android.security.IKeyChainService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.security.IKeyChainService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public java.lang.String requestPrivateKey(java.lang.String p0) throws android.os.RemoteException { return null; }
            public byte[] getCertificate(java.lang.String p0) throws android.os.RemoteException { return null; }
            public byte[] getCaCertificates(java.lang.String p0) throws android.os.RemoteException { return null; }
            public boolean isUserSelectable(java.lang.String p0) throws android.os.RemoteException { return false; }
            public void setUserSelectable(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
            public int generateKeyPair(java.lang.String p0, android.security.keystore.ParcelableKeyGenParameterSpec p1) throws android.os.RemoteException { return 0; }
            public boolean setKeyPairCertificate(java.lang.String p0, byte[] p1, byte[] p2) throws android.os.RemoteException { return false; }
            public java.lang.String installCaCertificate(byte[] p0) throws android.os.RemoteException { return null; }
            public boolean installKeyPair(byte[] p0, byte[] p1, byte[] p2, java.lang.String p3, int p4) throws android.os.RemoteException { return false; }
            public boolean removeKeyPair(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean containsKeyPair(java.lang.String p0) throws android.os.RemoteException { return false; }
            public int[] getGrants(java.lang.String p0) throws android.os.RemoteException { return null; }
            public boolean deleteCaCertificate(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean reset() throws android.os.RemoteException { return false; }
            public android.content.pm.StringParceledListSlice getUserCaAliases() throws android.os.RemoteException { return null; }
            public android.content.pm.StringParceledListSlice getSystemCaAliases() throws android.os.RemoteException { return null; }
            public boolean containsCaAlias(java.lang.String p0) throws android.os.RemoteException { return false; }
            public byte[] getEncodedCaCertificate(java.lang.String p0, boolean p1) throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getCaCertificateChainAliases(java.lang.String p0, boolean p1) throws android.os.RemoteException { return null; }
            public void setCredentialManagementApp(java.lang.String p0, android.security.AppUriAuthenticationPolicy p1) throws android.os.RemoteException {}
            public boolean hasCredentialManagementApp() throws android.os.RemoteException { return false; }
            public java.lang.String getCredentialManagementAppPackageName() throws android.os.RemoteException { return null; }
            public android.security.AppUriAuthenticationPolicy getCredentialManagementAppPolicy() throws android.os.RemoteException { return null; }
            public java.lang.String getPredefinedAliasForPackageAndUri(java.lang.String p0, android.net.Uri p1) throws android.os.RemoteException { return null; }
            public void removeCredentialManagementApp() throws android.os.RemoteException {}
            public boolean isCredentialManagementApp(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean setGrant(int p0, java.lang.String p1, boolean p2) throws android.os.RemoteException { return false; }
            public boolean hasGrant(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public java.lang.String getWifiKeyGrantAsUser(java.lang.String p0) throws android.os.RemoteException { return null; }
        }
    }
}
