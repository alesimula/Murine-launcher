package android.nfc;

public interface INfcTag extends android.os.IInterface {
    public int connect(int p0, int p1) throws android.os.RemoteException;
    public int reconnect(int p0) throws android.os.RemoteException;
    public int[] getTechList(int p0) throws android.os.RemoteException;
    public boolean isNdef(int p0) throws android.os.RemoteException;
    public boolean isPresent(int p0) throws android.os.RemoteException;
    public android.nfc.TransceiveResult transceive(int p0, byte[] p1, boolean p2) throws android.os.RemoteException;
    public android.nfc.NdefMessage ndefRead(int p0) throws android.os.RemoteException;
    public int ndefWrite(int p0, android.nfc.NdefMessage p1) throws android.os.RemoteException;
    public int ndefMakeReadOnly(int p0) throws android.os.RemoteException;
    public boolean ndefIsWritable(int p0) throws android.os.RemoteException;
    public int formatNdef(int p0, byte[] p1) throws android.os.RemoteException;
    public android.nfc.Tag rediscover(int p0) throws android.os.RemoteException;
    public int setTimeout(int p0, int p1) throws android.os.RemoteException;
    public int getTimeout(int p0) throws android.os.RemoteException;
    public void resetTimeouts() throws android.os.RemoteException;
    public boolean canMakeReadOnly(int p0) throws android.os.RemoteException;
    public int getMaxTransceiveLength(int p0) throws android.os.RemoteException;
    public boolean getExtendedLengthApdusSupported() throws android.os.RemoteException;

    public static class Default implements android.nfc.INfcTag {
        public Default() {}
        public int connect(int p0, int p1) throws android.os.RemoteException { return 0; }
        public int reconnect(int p0) throws android.os.RemoteException { return 0; }
        public int[] getTechList(int p0) throws android.os.RemoteException { return null; }
        public boolean isNdef(int p0) throws android.os.RemoteException { return false; }
        public boolean isPresent(int p0) throws android.os.RemoteException { return false; }
        public android.nfc.TransceiveResult transceive(int p0, byte[] p1, boolean p2) throws android.os.RemoteException { return null; }
        public android.nfc.NdefMessage ndefRead(int p0) throws android.os.RemoteException { return null; }
        public int ndefWrite(int p0, android.nfc.NdefMessage p1) throws android.os.RemoteException { return 0; }
        public int ndefMakeReadOnly(int p0) throws android.os.RemoteException { return 0; }
        public boolean ndefIsWritable(int p0) throws android.os.RemoteException { return false; }
        public int formatNdef(int p0, byte[] p1) throws android.os.RemoteException { return 0; }
        public android.nfc.Tag rediscover(int p0) throws android.os.RemoteException { return null; }
        public int setTimeout(int p0, int p1) throws android.os.RemoteException { return 0; }
        public int getTimeout(int p0) throws android.os.RemoteException { return 0; }
        public void resetTimeouts() throws android.os.RemoteException {}
        public boolean canMakeReadOnly(int p0) throws android.os.RemoteException { return false; }
        public int getMaxTransceiveLength(int p0) throws android.os.RemoteException { return 0; }
        public boolean getExtendedLengthApdusSupported() throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.nfc.INfcTag {
        public static final java.lang.String DESCRIPTOR = "android.nfc.INfcTag";
        static final int TRANSACTION_connect = 1;
        static final int TRANSACTION_reconnect = 2;
        static final int TRANSACTION_getTechList = 3;
        static final int TRANSACTION_isNdef = 4;
        static final int TRANSACTION_isPresent = 5;
        static final int TRANSACTION_transceive = 6;
        static final int TRANSACTION_ndefRead = 7;
        static final int TRANSACTION_ndefWrite = 8;
        static final int TRANSACTION_ndefMakeReadOnly = 9;
        static final int TRANSACTION_ndefIsWritable = 10;
        static final int TRANSACTION_formatNdef = 11;
        static final int TRANSACTION_rediscover = 12;
        static final int TRANSACTION_setTimeout = 13;
        static final int TRANSACTION_getTimeout = 14;
        static final int TRANSACTION_resetTimeouts = 15;
        static final int TRANSACTION_canMakeReadOnly = 16;
        static final int TRANSACTION_getMaxTransceiveLength = 17;
        static final int TRANSACTION_getExtendedLengthApdusSupported = 18;
        public Stub() { super(); }
        public static android.nfc.INfcTag asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.nfc.INfcTag p0) { return false; }
        public static android.nfc.INfcTag getDefaultImpl() { return null; }

        private static class Proxy implements android.nfc.INfcTag {
            private android.os.IBinder mRemote;
            public static android.nfc.INfcTag sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int connect(int p0, int p1) throws android.os.RemoteException { return 0; }
            public int reconnect(int p0) throws android.os.RemoteException { return 0; }
            public int[] getTechList(int p0) throws android.os.RemoteException { return null; }
            public boolean isNdef(int p0) throws android.os.RemoteException { return false; }
            public boolean isPresent(int p0) throws android.os.RemoteException { return false; }
            public android.nfc.TransceiveResult transceive(int p0, byte[] p1, boolean p2) throws android.os.RemoteException { return null; }
            public android.nfc.NdefMessage ndefRead(int p0) throws android.os.RemoteException { return null; }
            public int ndefWrite(int p0, android.nfc.NdefMessage p1) throws android.os.RemoteException { return 0; }
            public int ndefMakeReadOnly(int p0) throws android.os.RemoteException { return 0; }
            public boolean ndefIsWritable(int p0) throws android.os.RemoteException { return false; }
            public int formatNdef(int p0, byte[] p1) throws android.os.RemoteException { return 0; }
            public android.nfc.Tag rediscover(int p0) throws android.os.RemoteException { return null; }
            public int setTimeout(int p0, int p1) throws android.os.RemoteException { return 0; }
            public int getTimeout(int p0) throws android.os.RemoteException { return 0; }
            public void resetTimeouts() throws android.os.RemoteException {}
            public boolean canMakeReadOnly(int p0) throws android.os.RemoteException { return false; }
            public int getMaxTransceiveLength(int p0) throws android.os.RemoteException { return 0; }
            public boolean getExtendedLengthApdusSupported() throws android.os.RemoteException { return false; }
        }
    }
}
