package android.service.credentials;

public interface ICredentialProviderService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.credentials.ICredentialProviderService";
    public void onBeginGetCredential(android.service.credentials.BeginGetCredentialRequest p0, android.service.credentials.IBeginGetCredentialCallback p1) throws android.os.RemoteException;
    public void onBeginCreateCredential(android.service.credentials.BeginCreateCredentialRequest p0, android.service.credentials.IBeginCreateCredentialCallback p1) throws android.os.RemoteException;
    public void onClearCredentialState(android.service.credentials.ClearCredentialStateRequest p0, android.service.credentials.IClearCredentialStateCallback p1) throws android.os.RemoteException;

    public static class Default implements android.service.credentials.ICredentialProviderService {
        public Default() {}
        public void onBeginGetCredential(android.service.credentials.BeginGetCredentialRequest p0, android.service.credentials.IBeginGetCredentialCallback p1) throws android.os.RemoteException {}
        public void onBeginCreateCredential(android.service.credentials.BeginCreateCredentialRequest p0, android.service.credentials.IBeginCreateCredentialCallback p1) throws android.os.RemoteException {}
        public void onClearCredentialState(android.service.credentials.ClearCredentialStateRequest p0, android.service.credentials.IClearCredentialStateCallback p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.credentials.ICredentialProviderService {
        static final int TRANSACTION_onBeginGetCredential = 1;
        static final int TRANSACTION_onBeginCreateCredential = 2;
        static final int TRANSACTION_onClearCredentialState = 3;
        public Stub() { super(); }
        public static android.service.credentials.ICredentialProviderService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.service.credentials.ICredentialProviderService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onBeginGetCredential(android.service.credentials.BeginGetCredentialRequest p0, android.service.credentials.IBeginGetCredentialCallback p1) throws android.os.RemoteException {}
            public void onBeginCreateCredential(android.service.credentials.BeginCreateCredentialRequest p0, android.service.credentials.IBeginCreateCredentialCallback p1) throws android.os.RemoteException {}
            public void onClearCredentialState(android.service.credentials.ClearCredentialStateRequest p0, android.service.credentials.IClearCredentialStateCallback p1) throws android.os.RemoteException {}
        }
    }
}
