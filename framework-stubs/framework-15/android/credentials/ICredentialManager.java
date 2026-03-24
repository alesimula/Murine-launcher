package android.credentials;

public interface ICredentialManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.credentials.ICredentialManager";
    public android.os.ICancellationSignal executeGetCredential(android.credentials.GetCredentialRequest p0, android.credentials.IGetCredentialCallback p1, java.lang.String p2) throws android.os.RemoteException;
    public android.os.ICancellationSignal executePrepareGetCredential(android.credentials.GetCredentialRequest p0, android.credentials.IPrepareGetCredentialCallback p1, android.credentials.IGetCredentialCallback p2, java.lang.String p3) throws android.os.RemoteException;
    public android.os.ICancellationSignal executeCreateCredential(android.credentials.CreateCredentialRequest p0, android.credentials.ICreateCredentialCallback p1, java.lang.String p2) throws android.os.RemoteException;
    public android.os.ICancellationSignal getCandidateCredentials(android.credentials.GetCredentialRequest p0, android.credentials.IGetCandidateCredentialsCallback p1, android.os.IBinder p2, java.lang.String p3) throws android.os.RemoteException;
    public android.os.ICancellationSignal clearCredentialState(android.credentials.ClearCredentialStateRequest p0, android.credentials.IClearCredentialStateCallback p1, java.lang.String p2) throws android.os.RemoteException;
    public void setEnabledProviders(java.util.List<java.lang.String> p0, java.util.List<java.lang.String> p1, int p2, android.credentials.ISetEnabledProvidersCallback p3) throws android.os.RemoteException;
    public void registerCredentialDescription(android.credentials.RegisterCredentialDescriptionRequest p0, java.lang.String p1) throws android.os.RemoteException;
    public void unregisterCredentialDescription(android.credentials.UnregisterCredentialDescriptionRequest p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean isEnabledCredentialProviderService(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public java.util.List<android.credentials.CredentialProviderInfo> getCredentialProviderServices(int p0, int p1) throws android.os.RemoteException;
    public java.util.List<android.credentials.CredentialProviderInfo> getCredentialProviderServicesForTesting(int p0) throws android.os.RemoteException;
    public boolean isServiceEnabled() throws android.os.RemoteException;

    public static class Default implements android.credentials.ICredentialManager {
        public Default() {}
        public android.os.ICancellationSignal executeGetCredential(android.credentials.GetCredentialRequest p0, android.credentials.IGetCredentialCallback p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public android.os.ICancellationSignal executePrepareGetCredential(android.credentials.GetCredentialRequest p0, android.credentials.IPrepareGetCredentialCallback p1, android.credentials.IGetCredentialCallback p2, java.lang.String p3) throws android.os.RemoteException { return null; }
        public android.os.ICancellationSignal executeCreateCredential(android.credentials.CreateCredentialRequest p0, android.credentials.ICreateCredentialCallback p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public android.os.ICancellationSignal getCandidateCredentials(android.credentials.GetCredentialRequest p0, android.credentials.IGetCandidateCredentialsCallback p1, android.os.IBinder p2, java.lang.String p3) throws android.os.RemoteException { return null; }
        public android.os.ICancellationSignal clearCredentialState(android.credentials.ClearCredentialStateRequest p0, android.credentials.IClearCredentialStateCallback p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public void setEnabledProviders(java.util.List<java.lang.String> p0, java.util.List<java.lang.String> p1, int p2, android.credentials.ISetEnabledProvidersCallback p3) throws android.os.RemoteException {}
        public void registerCredentialDescription(android.credentials.RegisterCredentialDescriptionRequest p0, java.lang.String p1) throws android.os.RemoteException {}
        public void unregisterCredentialDescription(android.credentials.UnregisterCredentialDescriptionRequest p0, java.lang.String p1) throws android.os.RemoteException {}
        public boolean isEnabledCredentialProviderService(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public java.util.List<android.credentials.CredentialProviderInfo> getCredentialProviderServices(int p0, int p1) throws android.os.RemoteException { return null; }
        public java.util.List<android.credentials.CredentialProviderInfo> getCredentialProviderServicesForTesting(int p0) throws android.os.RemoteException { return null; }
        public boolean isServiceEnabled() throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.credentials.ICredentialManager {
        static final int TRANSACTION_executeGetCredential = 1;
        static final int TRANSACTION_executePrepareGetCredential = 2;
        static final int TRANSACTION_executeCreateCredential = 3;
        static final int TRANSACTION_getCandidateCredentials = 4;
        static final int TRANSACTION_clearCredentialState = 5;
        static final int TRANSACTION_setEnabledProviders = 6;
        static final int TRANSACTION_registerCredentialDescription = 7;
        static final int TRANSACTION_unregisterCredentialDescription = 8;
        static final int TRANSACTION_isEnabledCredentialProviderService = 9;
        static final int TRANSACTION_getCredentialProviderServices = 10;
        static final int TRANSACTION_getCredentialProviderServicesForTesting = 11;
        static final int TRANSACTION_isServiceEnabled = 12;
        public Stub() { super(); }
        public static android.credentials.ICredentialManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.credentials.ICredentialManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.os.ICancellationSignal executeGetCredential(android.credentials.GetCredentialRequest p0, android.credentials.IGetCredentialCallback p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public android.os.ICancellationSignal executePrepareGetCredential(android.credentials.GetCredentialRequest p0, android.credentials.IPrepareGetCredentialCallback p1, android.credentials.IGetCredentialCallback p2, java.lang.String p3) throws android.os.RemoteException { return null; }
            public android.os.ICancellationSignal executeCreateCredential(android.credentials.CreateCredentialRequest p0, android.credentials.ICreateCredentialCallback p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public android.os.ICancellationSignal getCandidateCredentials(android.credentials.GetCredentialRequest p0, android.credentials.IGetCandidateCredentialsCallback p1, android.os.IBinder p2, java.lang.String p3) throws android.os.RemoteException { return null; }
            public android.os.ICancellationSignal clearCredentialState(android.credentials.ClearCredentialStateRequest p0, android.credentials.IClearCredentialStateCallback p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public void setEnabledProviders(java.util.List<java.lang.String> p0, java.util.List<java.lang.String> p1, int p2, android.credentials.ISetEnabledProvidersCallback p3) throws android.os.RemoteException {}
            public void registerCredentialDescription(android.credentials.RegisterCredentialDescriptionRequest p0, java.lang.String p1) throws android.os.RemoteException {}
            public void unregisterCredentialDescription(android.credentials.UnregisterCredentialDescriptionRequest p0, java.lang.String p1) throws android.os.RemoteException {}
            public boolean isEnabledCredentialProviderService(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public java.util.List<android.credentials.CredentialProviderInfo> getCredentialProviderServices(int p0, int p1) throws android.os.RemoteException { return null; }
            public java.util.List<android.credentials.CredentialProviderInfo> getCredentialProviderServicesForTesting(int p0) throws android.os.RemoteException { return null; }
            public boolean isServiceEnabled() throws android.os.RemoteException { return false; }
        }
    }
}
