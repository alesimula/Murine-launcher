package android.security.apc;

public interface IProtectedConfirmation extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = null;
    public static final int FLAG_UI_OPTION_INVERTED = 1;
    public static final int FLAG_UI_OPTION_MAGNIFIED = 2;
    public void presentPrompt(android.security.apc.IConfirmationCallback p0, java.lang.String p1, byte[] p2, java.lang.String p3, int p4) throws android.os.RemoteException;
    public void cancelPrompt(android.security.apc.IConfirmationCallback p0) throws android.os.RemoteException;
    public boolean isSupported() throws android.os.RemoteException;

    public static class Default implements android.security.apc.IProtectedConfirmation {
        public Default() {}
        public void presentPrompt(android.security.apc.IConfirmationCallback p0, java.lang.String p1, byte[] p2, java.lang.String p3, int p4) throws android.os.RemoteException {}
        public void cancelPrompt(android.security.apc.IConfirmationCallback p0) throws android.os.RemoteException {}
        public boolean isSupported() throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.security.apc.IProtectedConfirmation {
        static final int TRANSACTION_presentPrompt = 1;
        static final int TRANSACTION_cancelPrompt = 2;
        static final int TRANSACTION_isSupported = 3;
        public Stub() { super(); }
        public static android.security.apc.IProtectedConfirmation asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.security.apc.IProtectedConfirmation p0) { return false; }
        public static android.security.apc.IProtectedConfirmation getDefaultImpl() { return null; }

        private static class Proxy implements android.security.apc.IProtectedConfirmation {
            private android.os.IBinder mRemote;
            public static android.security.apc.IProtectedConfirmation sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void presentPrompt(android.security.apc.IConfirmationCallback p0, java.lang.String p1, byte[] p2, java.lang.String p3, int p4) throws android.os.RemoteException {}
            public void cancelPrompt(android.security.apc.IConfirmationCallback p0) throws android.os.RemoteException {}
            public boolean isSupported() throws android.os.RemoteException { return false; }
        }
    }
}
