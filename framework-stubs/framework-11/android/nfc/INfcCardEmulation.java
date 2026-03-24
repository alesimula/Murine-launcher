package android.nfc;

public interface INfcCardEmulation extends android.os.IInterface {
    public boolean isDefaultServiceForCategory(int p0, android.content.ComponentName p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean isDefaultServiceForAid(int p0, android.content.ComponentName p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean setDefaultServiceForCategory(int p0, android.content.ComponentName p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean setDefaultForNextTap(int p0, android.content.ComponentName p1) throws android.os.RemoteException;
    public boolean registerAidGroupForService(int p0, android.content.ComponentName p1, android.nfc.cardemulation.AidGroup p2) throws android.os.RemoteException;
    public boolean setOffHostForService(int p0, android.content.ComponentName p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean unsetOffHostForService(int p0, android.content.ComponentName p1) throws android.os.RemoteException;
    public android.nfc.cardemulation.AidGroup getAidGroupForService(int p0, android.content.ComponentName p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean removeAidGroupForService(int p0, android.content.ComponentName p1, java.lang.String p2) throws android.os.RemoteException;
    public java.util.List<android.nfc.cardemulation.ApduServiceInfo> getServices(int p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean setPreferredService(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean unsetPreferredService() throws android.os.RemoteException;
    public boolean supportsAidPrefixRegistration() throws android.os.RemoteException;
    public android.nfc.cardemulation.ApduServiceInfo getPreferredPaymentService(int p0) throws android.os.RemoteException;

    public static class Default implements android.nfc.INfcCardEmulation {
        public Default() {}
        public boolean isDefaultServiceForCategory(int p0, android.content.ComponentName p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public boolean isDefaultServiceForAid(int p0, android.content.ComponentName p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public boolean setDefaultServiceForCategory(int p0, android.content.ComponentName p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public boolean setDefaultForNextTap(int p0, android.content.ComponentName p1) throws android.os.RemoteException { return false; }
        public boolean registerAidGroupForService(int p0, android.content.ComponentName p1, android.nfc.cardemulation.AidGroup p2) throws android.os.RemoteException { return false; }
        public boolean setOffHostForService(int p0, android.content.ComponentName p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public boolean unsetOffHostForService(int p0, android.content.ComponentName p1) throws android.os.RemoteException { return false; }
        public android.nfc.cardemulation.AidGroup getAidGroupForService(int p0, android.content.ComponentName p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public boolean removeAidGroupForService(int p0, android.content.ComponentName p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public java.util.List<android.nfc.cardemulation.ApduServiceInfo> getServices(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public boolean setPreferredService(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public boolean unsetPreferredService() throws android.os.RemoteException { return false; }
        public boolean supportsAidPrefixRegistration() throws android.os.RemoteException { return false; }
        public android.nfc.cardemulation.ApduServiceInfo getPreferredPaymentService(int p0) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.nfc.INfcCardEmulation {
        private static final java.lang.String DESCRIPTOR = "android.nfc.INfcCardEmulation";
        static final int TRANSACTION_isDefaultServiceForCategory = 1;
        static final int TRANSACTION_isDefaultServiceForAid = 2;
        static final int TRANSACTION_setDefaultServiceForCategory = 3;
        static final int TRANSACTION_setDefaultForNextTap = 4;
        static final int TRANSACTION_registerAidGroupForService = 5;
        static final int TRANSACTION_setOffHostForService = 6;
        static final int TRANSACTION_unsetOffHostForService = 7;
        static final int TRANSACTION_getAidGroupForService = 8;
        static final int TRANSACTION_removeAidGroupForService = 9;
        static final int TRANSACTION_getServices = 10;
        static final int TRANSACTION_setPreferredService = 11;
        static final int TRANSACTION_unsetPreferredService = 12;
        static final int TRANSACTION_supportsAidPrefixRegistration = 13;
        static final int TRANSACTION_getPreferredPaymentService = 14;
        public Stub() { super(); }
        public static android.nfc.INfcCardEmulation asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.nfc.INfcCardEmulation p0) { return false; }
        public static android.nfc.INfcCardEmulation getDefaultImpl() { return null; }

        private static class Proxy implements android.nfc.INfcCardEmulation {
            private android.os.IBinder mRemote;
            public static android.nfc.INfcCardEmulation sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean isDefaultServiceForCategory(int p0, android.content.ComponentName p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public boolean isDefaultServiceForAid(int p0, android.content.ComponentName p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public boolean setDefaultServiceForCategory(int p0, android.content.ComponentName p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public boolean setDefaultForNextTap(int p0, android.content.ComponentName p1) throws android.os.RemoteException { return false; }
            public boolean registerAidGroupForService(int p0, android.content.ComponentName p1, android.nfc.cardemulation.AidGroup p2) throws android.os.RemoteException { return false; }
            public boolean setOffHostForService(int p0, android.content.ComponentName p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public boolean unsetOffHostForService(int p0, android.content.ComponentName p1) throws android.os.RemoteException { return false; }
            public android.nfc.cardemulation.AidGroup getAidGroupForService(int p0, android.content.ComponentName p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public boolean removeAidGroupForService(int p0, android.content.ComponentName p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public java.util.List<android.nfc.cardemulation.ApduServiceInfo> getServices(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public boolean setPreferredService(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public boolean unsetPreferredService() throws android.os.RemoteException { return false; }
            public boolean supportsAidPrefixRegistration() throws android.os.RemoteException { return false; }
            public android.nfc.cardemulation.ApduServiceInfo getPreferredPaymentService(int p0) throws android.os.RemoteException { return null; }
        }
    }
}
