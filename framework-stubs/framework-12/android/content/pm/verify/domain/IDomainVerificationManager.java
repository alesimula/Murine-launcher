package android.content.pm.verify.domain;

public interface IDomainVerificationManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.content.pm.verify.domain.IDomainVerificationManager";
    public java.util.List<java.lang.String> queryValidVerificationPackageNames() throws android.os.RemoteException;
    public android.content.pm.verify.domain.DomainVerificationInfo getDomainVerificationInfo(java.lang.String p0) throws android.os.RemoteException;
    public android.content.pm.verify.domain.DomainVerificationUserState getDomainVerificationUserState(java.lang.String p0, int p1) throws android.os.RemoteException;
    public java.util.List<android.content.pm.verify.domain.DomainOwner> getOwnersForDomain(java.lang.String p0, int p1) throws android.os.RemoteException;
    public int setDomainVerificationStatus(java.lang.String p0, android.content.pm.verify.domain.DomainSet p1, int p2) throws android.os.RemoteException;
    public void setDomainVerificationLinkHandlingAllowed(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException;
    public int setDomainVerificationUserSelection(java.lang.String p0, android.content.pm.verify.domain.DomainSet p1, boolean p2, int p3) throws android.os.RemoteException;

    public static class Default implements android.content.pm.verify.domain.IDomainVerificationManager {
        public Default() {}
        public java.util.List<java.lang.String> queryValidVerificationPackageNames() throws android.os.RemoteException { return null; }
        public android.content.pm.verify.domain.DomainVerificationInfo getDomainVerificationInfo(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.content.pm.verify.domain.DomainVerificationUserState getDomainVerificationUserState(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public java.util.List<android.content.pm.verify.domain.DomainOwner> getOwnersForDomain(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public int setDomainVerificationStatus(java.lang.String p0, android.content.pm.verify.domain.DomainSet p1, int p2) throws android.os.RemoteException { return 0; }
        public void setDomainVerificationLinkHandlingAllowed(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException {}
        public int setDomainVerificationUserSelection(java.lang.String p0, android.content.pm.verify.domain.DomainSet p1, boolean p2, int p3) throws android.os.RemoteException { return 0; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.content.pm.verify.domain.IDomainVerificationManager {
        static final int TRANSACTION_queryValidVerificationPackageNames = 1;
        static final int TRANSACTION_getDomainVerificationInfo = 2;
        static final int TRANSACTION_getDomainVerificationUserState = 3;
        static final int TRANSACTION_getOwnersForDomain = 4;
        static final int TRANSACTION_setDomainVerificationStatus = 5;
        static final int TRANSACTION_setDomainVerificationLinkHandlingAllowed = 6;
        static final int TRANSACTION_setDomainVerificationUserSelection = 7;
        public Stub() { super(); }
        public static android.content.pm.verify.domain.IDomainVerificationManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.content.pm.verify.domain.IDomainVerificationManager p0) { return false; }
        public static android.content.pm.verify.domain.IDomainVerificationManager getDefaultImpl() { return null; }

        private static class Proxy implements android.content.pm.verify.domain.IDomainVerificationManager {
            private android.os.IBinder mRemote;
            public static android.content.pm.verify.domain.IDomainVerificationManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public java.util.List<java.lang.String> queryValidVerificationPackageNames() throws android.os.RemoteException { return null; }
            public android.content.pm.verify.domain.DomainVerificationInfo getDomainVerificationInfo(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.content.pm.verify.domain.DomainVerificationUserState getDomainVerificationUserState(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public java.util.List<android.content.pm.verify.domain.DomainOwner> getOwnersForDomain(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public int setDomainVerificationStatus(java.lang.String p0, android.content.pm.verify.domain.DomainSet p1, int p2) throws android.os.RemoteException { return 0; }
            public void setDomainVerificationLinkHandlingAllowed(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException {}
            public int setDomainVerificationUserSelection(java.lang.String p0, android.content.pm.verify.domain.DomainSet p1, boolean p2, int p3) throws android.os.RemoteException { return 0; }
        }
    }
}
