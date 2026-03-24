package android.os;

public interface IRecoverySystem extends android.os.IInterface {
    public boolean uncrypt(java.lang.String p0, android.os.IRecoverySystemProgressListener p1) throws android.os.RemoteException;
    public boolean setupBcb(java.lang.String p0) throws android.os.RemoteException;
    public boolean clearBcb() throws android.os.RemoteException;
    public void rebootRecoveryWithCommand(java.lang.String p0) throws android.os.RemoteException;
    public boolean requestLskf(java.lang.String p0, android.content.IntentSender p1) throws android.os.RemoteException;
    public boolean clearLskf() throws android.os.RemoteException;
    public boolean rebootWithLskf(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;

    public static class Default implements android.os.IRecoverySystem {
        public Default() {}
        public boolean uncrypt(java.lang.String p0, android.os.IRecoverySystemProgressListener p1) throws android.os.RemoteException { return false; }
        public boolean setupBcb(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean clearBcb() throws android.os.RemoteException { return false; }
        public void rebootRecoveryWithCommand(java.lang.String p0) throws android.os.RemoteException {}
        public boolean requestLskf(java.lang.String p0, android.content.IntentSender p1) throws android.os.RemoteException { return false; }
        public boolean clearLskf() throws android.os.RemoteException { return false; }
        public boolean rebootWithLskf(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.IRecoverySystem {
        private static final java.lang.String DESCRIPTOR = "android.os.IRecoverySystem";
        static final int TRANSACTION_uncrypt = 1;
        static final int TRANSACTION_setupBcb = 2;
        static final int TRANSACTION_clearBcb = 3;
        static final int TRANSACTION_rebootRecoveryWithCommand = 4;
        static final int TRANSACTION_requestLskf = 5;
        static final int TRANSACTION_clearLskf = 6;
        static final int TRANSACTION_rebootWithLskf = 7;
        public Stub() { super(); }
        public static android.os.IRecoverySystem asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.os.IRecoverySystem p0) { return false; }
        public static android.os.IRecoverySystem getDefaultImpl() { return null; }

        private static class Proxy implements android.os.IRecoverySystem {
            private android.os.IBinder mRemote;
            public static android.os.IRecoverySystem sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean uncrypt(java.lang.String p0, android.os.IRecoverySystemProgressListener p1) throws android.os.RemoteException { return false; }
            public boolean setupBcb(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean clearBcb() throws android.os.RemoteException { return false; }
            public void rebootRecoveryWithCommand(java.lang.String p0) throws android.os.RemoteException {}
            public boolean requestLskf(java.lang.String p0, android.content.IntentSender p1) throws android.os.RemoteException { return false; }
            public boolean clearLskf() throws android.os.RemoteException { return false; }
            public boolean rebootWithLskf(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        }
    }
}
