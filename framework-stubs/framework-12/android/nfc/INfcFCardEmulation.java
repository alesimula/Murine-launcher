package android.nfc;

public interface INfcFCardEmulation extends android.os.IInterface {
    public java.lang.String getSystemCodeForService(int p0, android.content.ComponentName p1) throws android.os.RemoteException;
    public boolean registerSystemCodeForService(int p0, android.content.ComponentName p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean removeSystemCodeForService(int p0, android.content.ComponentName p1) throws android.os.RemoteException;
    public java.lang.String getNfcid2ForService(int p0, android.content.ComponentName p1) throws android.os.RemoteException;
    public boolean setNfcid2ForService(int p0, android.content.ComponentName p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean enableNfcFForegroundService(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean disableNfcFForegroundService() throws android.os.RemoteException;
    public java.util.List<android.nfc.cardemulation.NfcFServiceInfo> getNfcFServices(int p0) throws android.os.RemoteException;
    public int getMaxNumOfRegisterableSystemCodes() throws android.os.RemoteException;

    public static class Default implements android.nfc.INfcFCardEmulation {
        public Default() {}
        public java.lang.String getSystemCodeForService(int p0, android.content.ComponentName p1) throws android.os.RemoteException { return null; }
        public boolean registerSystemCodeForService(int p0, android.content.ComponentName p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public boolean removeSystemCodeForService(int p0, android.content.ComponentName p1) throws android.os.RemoteException { return false; }
        public java.lang.String getNfcid2ForService(int p0, android.content.ComponentName p1) throws android.os.RemoteException { return null; }
        public boolean setNfcid2ForService(int p0, android.content.ComponentName p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public boolean enableNfcFForegroundService(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public boolean disableNfcFForegroundService() throws android.os.RemoteException { return false; }
        public java.util.List<android.nfc.cardemulation.NfcFServiceInfo> getNfcFServices(int p0) throws android.os.RemoteException { return null; }
        public int getMaxNumOfRegisterableSystemCodes() throws android.os.RemoteException { return 0; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.nfc.INfcFCardEmulation {
        public static final java.lang.String DESCRIPTOR = "android.nfc.INfcFCardEmulation";
        static final int TRANSACTION_getSystemCodeForService = 1;
        static final int TRANSACTION_registerSystemCodeForService = 2;
        static final int TRANSACTION_removeSystemCodeForService = 3;
        static final int TRANSACTION_getNfcid2ForService = 4;
        static final int TRANSACTION_setNfcid2ForService = 5;
        static final int TRANSACTION_enableNfcFForegroundService = 6;
        static final int TRANSACTION_disableNfcFForegroundService = 7;
        static final int TRANSACTION_getNfcFServices = 8;
        static final int TRANSACTION_getMaxNumOfRegisterableSystemCodes = 9;
        public Stub() { super(); }
        public static android.nfc.INfcFCardEmulation asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.nfc.INfcFCardEmulation p0) { return false; }
        public static android.nfc.INfcFCardEmulation getDefaultImpl() { return null; }

        private static class Proxy implements android.nfc.INfcFCardEmulation {
            private android.os.IBinder mRemote;
            public static android.nfc.INfcFCardEmulation sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public java.lang.String getSystemCodeForService(int p0, android.content.ComponentName p1) throws android.os.RemoteException { return null; }
            public boolean registerSystemCodeForService(int p0, android.content.ComponentName p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public boolean removeSystemCodeForService(int p0, android.content.ComponentName p1) throws android.os.RemoteException { return false; }
            public java.lang.String getNfcid2ForService(int p0, android.content.ComponentName p1) throws android.os.RemoteException { return null; }
            public boolean setNfcid2ForService(int p0, android.content.ComponentName p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public boolean enableNfcFForegroundService(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public boolean disableNfcFForegroundService() throws android.os.RemoteException { return false; }
            public java.util.List<android.nfc.cardemulation.NfcFServiceInfo> getNfcFServices(int p0) throws android.os.RemoteException { return null; }
            public int getMaxNumOfRegisterableSystemCodes() throws android.os.RemoteException { return 0; }
        }
    }
}
