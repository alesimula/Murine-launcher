package android.nfc;

public interface INfcAdapter extends android.os.IInterface {
    public android.nfc.INfcTag getNfcTagInterface() throws android.os.RemoteException;
    public android.nfc.INfcCardEmulation getNfcCardEmulationInterface() throws android.os.RemoteException;
    public android.nfc.INfcFCardEmulation getNfcFCardEmulationInterface() throws android.os.RemoteException;
    public android.nfc.INfcAdapterExtras getNfcAdapterExtrasInterface(java.lang.String p0) throws android.os.RemoteException;
    public android.nfc.INfcDta getNfcDtaInterface(java.lang.String p0) throws android.os.RemoteException;
    public android.os.IBinder getNfcAdapterVendorInterface(java.lang.String p0) throws android.os.RemoteException;
    public int getState() throws android.os.RemoteException;
    public boolean disable(boolean p0) throws android.os.RemoteException;
    public boolean enable() throws android.os.RemoteException;
    public boolean enableNdefPush() throws android.os.RemoteException;
    public boolean disableNdefPush() throws android.os.RemoteException;
    public boolean isNdefPushEnabled() throws android.os.RemoteException;
    public void pausePolling(int p0) throws android.os.RemoteException;
    public void resumePolling() throws android.os.RemoteException;
    public void setForegroundDispatch(android.app.PendingIntent p0, android.content.IntentFilter[] p1, android.nfc.TechListParcel p2) throws android.os.RemoteException;
    public void setAppCallback(android.nfc.IAppCallback p0) throws android.os.RemoteException;
    public void invokeBeam() throws android.os.RemoteException;
    public void invokeBeamInternal(android.nfc.BeamShareData p0) throws android.os.RemoteException;
    public boolean ignore(int p0, int p1, android.nfc.ITagRemovedCallback p2) throws android.os.RemoteException;
    public void dispatch(android.nfc.Tag p0) throws android.os.RemoteException;
    public void setReaderMode(android.os.IBinder p0, android.nfc.IAppCallback p1, int p2, android.os.Bundle p3) throws android.os.RemoteException;
    public void setP2pModes(int p0, int p1) throws android.os.RemoteException;
    public void addNfcUnlockHandler(android.nfc.INfcUnlockHandler p0, int[] p1) throws android.os.RemoteException;
    public void removeNfcUnlockHandler(android.nfc.INfcUnlockHandler p0) throws android.os.RemoteException;
    public void verifyNfcPermission() throws android.os.RemoteException;
    public boolean isNfcSecureEnabled() throws android.os.RemoteException;
    public boolean deviceSupportsNfcSecure() throws android.os.RemoteException;
    public boolean setNfcSecure(boolean p0) throws android.os.RemoteException;

    public static class Default implements android.nfc.INfcAdapter {
        public Default() {}
        public android.nfc.INfcTag getNfcTagInterface() throws android.os.RemoteException { return null; }
        public android.nfc.INfcCardEmulation getNfcCardEmulationInterface() throws android.os.RemoteException { return null; }
        public android.nfc.INfcFCardEmulation getNfcFCardEmulationInterface() throws android.os.RemoteException { return null; }
        public android.nfc.INfcAdapterExtras getNfcAdapterExtrasInterface(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.nfc.INfcDta getNfcDtaInterface(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.os.IBinder getNfcAdapterVendorInterface(java.lang.String p0) throws android.os.RemoteException { return null; }
        public int getState() throws android.os.RemoteException { return 0; }
        public boolean disable(boolean p0) throws android.os.RemoteException { return false; }
        public boolean enable() throws android.os.RemoteException { return false; }
        public boolean enableNdefPush() throws android.os.RemoteException { return false; }
        public boolean disableNdefPush() throws android.os.RemoteException { return false; }
        public boolean isNdefPushEnabled() throws android.os.RemoteException { return false; }
        public void pausePolling(int p0) throws android.os.RemoteException {}
        public void resumePolling() throws android.os.RemoteException {}
        public void setForegroundDispatch(android.app.PendingIntent p0, android.content.IntentFilter[] p1, android.nfc.TechListParcel p2) throws android.os.RemoteException {}
        public void setAppCallback(android.nfc.IAppCallback p0) throws android.os.RemoteException {}
        public void invokeBeam() throws android.os.RemoteException {}
        public void invokeBeamInternal(android.nfc.BeamShareData p0) throws android.os.RemoteException {}
        public boolean ignore(int p0, int p1, android.nfc.ITagRemovedCallback p2) throws android.os.RemoteException { return false; }
        public void dispatch(android.nfc.Tag p0) throws android.os.RemoteException {}
        public void setReaderMode(android.os.IBinder p0, android.nfc.IAppCallback p1, int p2, android.os.Bundle p3) throws android.os.RemoteException {}
        public void setP2pModes(int p0, int p1) throws android.os.RemoteException {}
        public void addNfcUnlockHandler(android.nfc.INfcUnlockHandler p0, int[] p1) throws android.os.RemoteException {}
        public void removeNfcUnlockHandler(android.nfc.INfcUnlockHandler p0) throws android.os.RemoteException {}
        public void verifyNfcPermission() throws android.os.RemoteException {}
        public boolean isNfcSecureEnabled() throws android.os.RemoteException { return false; }
        public boolean deviceSupportsNfcSecure() throws android.os.RemoteException { return false; }
        public boolean setNfcSecure(boolean p0) throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.nfc.INfcAdapter {
        private static final java.lang.String DESCRIPTOR = "android.nfc.INfcAdapter";
        static final int TRANSACTION_getNfcTagInterface = 1;
        static final int TRANSACTION_getNfcCardEmulationInterface = 2;
        static final int TRANSACTION_getNfcFCardEmulationInterface = 3;
        static final int TRANSACTION_getNfcAdapterExtrasInterface = 4;
        static final int TRANSACTION_getNfcDtaInterface = 5;
        static final int TRANSACTION_getNfcAdapterVendorInterface = 6;
        static final int TRANSACTION_getState = 7;
        static final int TRANSACTION_disable = 8;
        static final int TRANSACTION_enable = 9;
        static final int TRANSACTION_enableNdefPush = 10;
        static final int TRANSACTION_disableNdefPush = 11;
        static final int TRANSACTION_isNdefPushEnabled = 12;
        static final int TRANSACTION_pausePolling = 13;
        static final int TRANSACTION_resumePolling = 14;
        static final int TRANSACTION_setForegroundDispatch = 15;
        static final int TRANSACTION_setAppCallback = 16;
        static final int TRANSACTION_invokeBeam = 17;
        static final int TRANSACTION_invokeBeamInternal = 18;
        static final int TRANSACTION_ignore = 19;
        static final int TRANSACTION_dispatch = 20;
        static final int TRANSACTION_setReaderMode = 21;
        static final int TRANSACTION_setP2pModes = 22;
        static final int TRANSACTION_addNfcUnlockHandler = 23;
        static final int TRANSACTION_removeNfcUnlockHandler = 24;
        static final int TRANSACTION_verifyNfcPermission = 25;
        static final int TRANSACTION_isNfcSecureEnabled = 26;
        static final int TRANSACTION_deviceSupportsNfcSecure = 27;
        static final int TRANSACTION_setNfcSecure = 28;
        public Stub() { super(); }
        public static android.nfc.INfcAdapter asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.nfc.INfcAdapter p0) { return false; }
        public static android.nfc.INfcAdapter getDefaultImpl() { return null; }

        private static class Proxy implements android.nfc.INfcAdapter {
            private android.os.IBinder mRemote;
            public static android.nfc.INfcAdapter sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.nfc.INfcTag getNfcTagInterface() throws android.os.RemoteException { return null; }
            public android.nfc.INfcCardEmulation getNfcCardEmulationInterface() throws android.os.RemoteException { return null; }
            public android.nfc.INfcFCardEmulation getNfcFCardEmulationInterface() throws android.os.RemoteException { return null; }
            public android.nfc.INfcAdapterExtras getNfcAdapterExtrasInterface(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.nfc.INfcDta getNfcDtaInterface(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.os.IBinder getNfcAdapterVendorInterface(java.lang.String p0) throws android.os.RemoteException { return null; }
            public int getState() throws android.os.RemoteException { return 0; }
            public boolean disable(boolean p0) throws android.os.RemoteException { return false; }
            public boolean enable() throws android.os.RemoteException { return false; }
            public boolean enableNdefPush() throws android.os.RemoteException { return false; }
            public boolean disableNdefPush() throws android.os.RemoteException { return false; }
            public boolean isNdefPushEnabled() throws android.os.RemoteException { return false; }
            public void pausePolling(int p0) throws android.os.RemoteException {}
            public void resumePolling() throws android.os.RemoteException {}
            public void setForegroundDispatch(android.app.PendingIntent p0, android.content.IntentFilter[] p1, android.nfc.TechListParcel p2) throws android.os.RemoteException {}
            public void setAppCallback(android.nfc.IAppCallback p0) throws android.os.RemoteException {}
            public void invokeBeam() throws android.os.RemoteException {}
            public void invokeBeamInternal(android.nfc.BeamShareData p0) throws android.os.RemoteException {}
            public boolean ignore(int p0, int p1, android.nfc.ITagRemovedCallback p2) throws android.os.RemoteException { return false; }
            public void dispatch(android.nfc.Tag p0) throws android.os.RemoteException {}
            public void setReaderMode(android.os.IBinder p0, android.nfc.IAppCallback p1, int p2, android.os.Bundle p3) throws android.os.RemoteException {}
            public void setP2pModes(int p0, int p1) throws android.os.RemoteException {}
            public void addNfcUnlockHandler(android.nfc.INfcUnlockHandler p0, int[] p1) throws android.os.RemoteException {}
            public void removeNfcUnlockHandler(android.nfc.INfcUnlockHandler p0) throws android.os.RemoteException {}
            public void verifyNfcPermission() throws android.os.RemoteException {}
            public boolean isNfcSecureEnabled() throws android.os.RemoteException { return false; }
            public boolean deviceSupportsNfcSecure() throws android.os.RemoteException { return false; }
            public boolean setNfcSecure(boolean p0) throws android.os.RemoteException { return false; }
        }
    }
}
