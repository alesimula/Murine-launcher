package android.nfc;

public interface INfcAdapter extends android.os.IInterface {
    public android.nfc.INfcTag getNfcTagInterface() throws android.os.RemoteException;
    public android.nfc.INfcCardEmulation getNfcCardEmulationInterface() throws android.os.RemoteException;
    public android.nfc.INfcFCardEmulation getNfcFCardEmulationInterface() throws android.os.RemoteException;
    public android.nfc.INfcAdapterExtras getNfcAdapterExtrasInterface(java.lang.String p0) throws android.os.RemoteException;
    public android.nfc.INfcDta getNfcDtaInterface(java.lang.String p0) throws android.os.RemoteException;
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
    public boolean setControllerAlwaysOn(boolean p0) throws android.os.RemoteException;
    public boolean isControllerAlwaysOn() throws android.os.RemoteException;
    public boolean isControllerAlwaysOnSupported() throws android.os.RemoteException;
    public void registerControllerAlwaysOnListener(android.nfc.INfcControllerAlwaysOnListener p0) throws android.os.RemoteException;
    public void unregisterControllerAlwaysOnListener(android.nfc.INfcControllerAlwaysOnListener p0) throws android.os.RemoteException;

    public static class Default implements android.nfc.INfcAdapter {
        public Default() {}
        public android.nfc.INfcTag getNfcTagInterface() throws android.os.RemoteException { return null; }
        public android.nfc.INfcCardEmulation getNfcCardEmulationInterface() throws android.os.RemoteException { return null; }
        public android.nfc.INfcFCardEmulation getNfcFCardEmulationInterface() throws android.os.RemoteException { return null; }
        public android.nfc.INfcAdapterExtras getNfcAdapterExtrasInterface(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.nfc.INfcDta getNfcDtaInterface(java.lang.String p0) throws android.os.RemoteException { return null; }
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
        public boolean setControllerAlwaysOn(boolean p0) throws android.os.RemoteException { return false; }
        public boolean isControllerAlwaysOn() throws android.os.RemoteException { return false; }
        public boolean isControllerAlwaysOnSupported() throws android.os.RemoteException { return false; }
        public void registerControllerAlwaysOnListener(android.nfc.INfcControllerAlwaysOnListener p0) throws android.os.RemoteException {}
        public void unregisterControllerAlwaysOnListener(android.nfc.INfcControllerAlwaysOnListener p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.nfc.INfcAdapter {
        public static final java.lang.String DESCRIPTOR = "android.nfc.INfcAdapter";
        static final int TRANSACTION_getNfcTagInterface = 1;
        static final int TRANSACTION_getNfcCardEmulationInterface = 2;
        static final int TRANSACTION_getNfcFCardEmulationInterface = 3;
        static final int TRANSACTION_getNfcAdapterExtrasInterface = 4;
        static final int TRANSACTION_getNfcDtaInterface = 5;
        static final int TRANSACTION_getState = 6;
        static final int TRANSACTION_disable = 7;
        static final int TRANSACTION_enable = 8;
        static final int TRANSACTION_enableNdefPush = 9;
        static final int TRANSACTION_disableNdefPush = 10;
        static final int TRANSACTION_isNdefPushEnabled = 11;
        static final int TRANSACTION_pausePolling = 12;
        static final int TRANSACTION_resumePolling = 13;
        static final int TRANSACTION_setForegroundDispatch = 14;
        static final int TRANSACTION_setAppCallback = 15;
        static final int TRANSACTION_invokeBeam = 16;
        static final int TRANSACTION_invokeBeamInternal = 17;
        static final int TRANSACTION_ignore = 18;
        static final int TRANSACTION_dispatch = 19;
        static final int TRANSACTION_setReaderMode = 20;
        static final int TRANSACTION_setP2pModes = 21;
        static final int TRANSACTION_addNfcUnlockHandler = 22;
        static final int TRANSACTION_removeNfcUnlockHandler = 23;
        static final int TRANSACTION_verifyNfcPermission = 24;
        static final int TRANSACTION_isNfcSecureEnabled = 25;
        static final int TRANSACTION_deviceSupportsNfcSecure = 26;
        static final int TRANSACTION_setNfcSecure = 27;
        static final int TRANSACTION_setControllerAlwaysOn = 28;
        static final int TRANSACTION_isControllerAlwaysOn = 29;
        static final int TRANSACTION_isControllerAlwaysOnSupported = 30;
        static final int TRANSACTION_registerControllerAlwaysOnListener = 31;
        static final int TRANSACTION_unregisterControllerAlwaysOnListener = 32;
        public Stub() { super(); }
        public static android.nfc.INfcAdapter asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.nfc.INfcAdapter {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.nfc.INfcTag getNfcTagInterface() throws android.os.RemoteException { return null; }
            public android.nfc.INfcCardEmulation getNfcCardEmulationInterface() throws android.os.RemoteException { return null; }
            public android.nfc.INfcFCardEmulation getNfcFCardEmulationInterface() throws android.os.RemoteException { return null; }
            public android.nfc.INfcAdapterExtras getNfcAdapterExtrasInterface(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.nfc.INfcDta getNfcDtaInterface(java.lang.String p0) throws android.os.RemoteException { return null; }
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
            public boolean setControllerAlwaysOn(boolean p0) throws android.os.RemoteException { return false; }
            public boolean isControllerAlwaysOn() throws android.os.RemoteException { return false; }
            public boolean isControllerAlwaysOnSupported() throws android.os.RemoteException { return false; }
            public void registerControllerAlwaysOnListener(android.nfc.INfcControllerAlwaysOnListener p0) throws android.os.RemoteException {}
            public void unregisterControllerAlwaysOnListener(android.nfc.INfcControllerAlwaysOnListener p0) throws android.os.RemoteException {}
        }
    }
}
