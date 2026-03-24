package android.security;

public interface IConfirmationPromptCallback extends android.os.IInterface {
    public void onConfirmationPromptCompleted(int p0, byte[] p1) throws android.os.RemoteException;

    public static class Default implements android.security.IConfirmationPromptCallback {
        public Default() {}
        public void onConfirmationPromptCompleted(int p0, byte[] p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.security.IConfirmationPromptCallback {
        private static final java.lang.String DESCRIPTOR = "android.security.IConfirmationPromptCallback";
        static final int TRANSACTION_onConfirmationPromptCompleted = 1;
        public Stub() { super(); }
        public static android.security.IConfirmationPromptCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.security.IConfirmationPromptCallback p0) { return false; }
        public static android.security.IConfirmationPromptCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.security.IConfirmationPromptCallback {
            private android.os.IBinder mRemote;
            public static android.security.IConfirmationPromptCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onConfirmationPromptCompleted(int p0, byte[] p1) throws android.os.RemoteException {}
        }
    }
}
