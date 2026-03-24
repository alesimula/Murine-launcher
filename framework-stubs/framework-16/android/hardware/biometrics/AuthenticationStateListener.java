package android.hardware.biometrics;

public interface AuthenticationStateListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.biometrics.AuthenticationStateListener";
    public void onAuthenticationAcquired(android.hardware.biometrics.events.AuthenticationAcquiredInfo p0) throws android.os.RemoteException;
    public void onAuthenticationError(android.hardware.biometrics.events.AuthenticationErrorInfo p0) throws android.os.RemoteException;
    public void onAuthenticationFailed(android.hardware.biometrics.events.AuthenticationFailedInfo p0) throws android.os.RemoteException;
    public void onAuthenticationHelp(android.hardware.biometrics.events.AuthenticationHelpInfo p0) throws android.os.RemoteException;
    public void onAuthenticationStarted(android.hardware.biometrics.events.AuthenticationStartedInfo p0) throws android.os.RemoteException;
    public void onAuthenticationStopped(android.hardware.biometrics.events.AuthenticationStoppedInfo p0) throws android.os.RemoteException;
    public void onAuthenticationSucceeded(android.hardware.biometrics.events.AuthenticationSucceededInfo p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.biometrics.AuthenticationStateListener {
        public Default() {}
        public void onAuthenticationAcquired(android.hardware.biometrics.events.AuthenticationAcquiredInfo p0) throws android.os.RemoteException {}
        public void onAuthenticationError(android.hardware.biometrics.events.AuthenticationErrorInfo p0) throws android.os.RemoteException {}
        public void onAuthenticationFailed(android.hardware.biometrics.events.AuthenticationFailedInfo p0) throws android.os.RemoteException {}
        public void onAuthenticationHelp(android.hardware.biometrics.events.AuthenticationHelpInfo p0) throws android.os.RemoteException {}
        public void onAuthenticationStarted(android.hardware.biometrics.events.AuthenticationStartedInfo p0) throws android.os.RemoteException {}
        public void onAuthenticationStopped(android.hardware.biometrics.events.AuthenticationStoppedInfo p0) throws android.os.RemoteException {}
        public void onAuthenticationSucceeded(android.hardware.biometrics.events.AuthenticationSucceededInfo p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.biometrics.AuthenticationStateListener {
        static final int TRANSACTION_onAuthenticationAcquired = 1;
        static final int TRANSACTION_onAuthenticationError = 2;
        static final int TRANSACTION_onAuthenticationFailed = 3;
        static final int TRANSACTION_onAuthenticationHelp = 4;
        static final int TRANSACTION_onAuthenticationStarted = 5;
        static final int TRANSACTION_onAuthenticationStopped = 6;
        static final int TRANSACTION_onAuthenticationSucceeded = 7;
        public Stub() { super(); }
        public static android.hardware.biometrics.AuthenticationStateListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.biometrics.AuthenticationStateListener {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onAuthenticationAcquired(android.hardware.biometrics.events.AuthenticationAcquiredInfo p0) throws android.os.RemoteException {}
            public void onAuthenticationError(android.hardware.biometrics.events.AuthenticationErrorInfo p0) throws android.os.RemoteException {}
            public void onAuthenticationFailed(android.hardware.biometrics.events.AuthenticationFailedInfo p0) throws android.os.RemoteException {}
            public void onAuthenticationHelp(android.hardware.biometrics.events.AuthenticationHelpInfo p0) throws android.os.RemoteException {}
            public void onAuthenticationStarted(android.hardware.biometrics.events.AuthenticationStartedInfo p0) throws android.os.RemoteException {}
            public void onAuthenticationStopped(android.hardware.biometrics.events.AuthenticationStoppedInfo p0) throws android.os.RemoteException {}
            public void onAuthenticationSucceeded(android.hardware.biometrics.events.AuthenticationSucceededInfo p0) throws android.os.RemoteException {}
        }
    }
}
