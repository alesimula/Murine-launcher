package android.nfc;

public final class NfcAdapter {
    static final java.lang.String TAG = "NFC";
    public static final java.lang.String ACTION_NDEF_DISCOVERED = "android.nfc.action.NDEF_DISCOVERED";
    public static final java.lang.String ACTION_TECH_DISCOVERED = "android.nfc.action.TECH_DISCOVERED";
    public static final java.lang.String ACTION_TAG_DISCOVERED = "android.nfc.action.TAG_DISCOVERED";
    public static final java.lang.String ACTION_TRANSACTION_DETECTED = "android.nfc.action.TRANSACTION_DETECTED";
    public static final java.lang.String ACTION_PREFERRED_PAYMENT_CHANGED = "android.nfc.action.PREFERRED_PAYMENT_CHANGED";
    public static final java.lang.String ACTION_TAG_LEFT_FIELD = "android.nfc.action.TAG_LOST";
    public static final java.lang.String EXTRA_TAG = "android.nfc.extra.TAG";
    public static final java.lang.String EXTRA_NDEF_MESSAGES = "android.nfc.extra.NDEF_MESSAGES";
    public static final java.lang.String EXTRA_ID = "android.nfc.extra.ID";
    public static final java.lang.String ACTION_ADAPTER_STATE_CHANGED = "android.nfc.action.ADAPTER_STATE_CHANGED";
    public static final java.lang.String EXTRA_ADAPTER_STATE = "android.nfc.extra.ADAPTER_STATE";
    public static final java.lang.String EXTRA_AID = "android.nfc.extra.AID";
    public static final java.lang.String EXTRA_DATA = "android.nfc.extra.DATA";
    public static final java.lang.String EXTRA_SECURE_ELEMENT_NAME = "android.nfc.extra.SECURE_ELEMENT_NAME";
    public static final java.lang.String EXTRA_PREFERRED_PAYMENT_CHANGED_REASON = "android.nfc.extra.PREFERRED_PAYMENT_CHANGED_REASON";
    public static final int PREFERRED_PAYMENT_LOADED = 1;
    public static final int PREFERRED_PAYMENT_CHANGED = 2;
    public static final int PREFERRED_PAYMENT_UPDATED = 3;
    public static final int STATE_OFF = 1;
    public static final int STATE_TURNING_ON = 2;
    public static final int STATE_ON = 3;
    public static final int STATE_TURNING_OFF = 4;
    public static final int FLAG_READER_NFC_A = 1;
    public static final int FLAG_READER_NFC_B = 2;
    public static final int FLAG_READER_NFC_F = 4;
    public static final int FLAG_READER_NFC_V = 8;
    public static final int FLAG_READER_NFC_BARCODE = 16;
    public static final int FLAG_READER_SKIP_NDEF_CHECK = 128;
    public static final int FLAG_READER_NO_PLATFORM_SOUNDS = 256;
    public static final java.lang.String EXTRA_READER_PRESENCE_CHECK_DELAY = "presence";
    @android.annotation.SystemApi
    public static final int FLAG_NDEF_PUSH_NO_CONFIRM = 1;
    public static final java.lang.String ACTION_HANDOVER_TRANSFER_STARTED = "android.nfc.action.HANDOVER_TRANSFER_STARTED";
    public static final java.lang.String ACTION_HANDOVER_TRANSFER_DONE = "android.nfc.action.HANDOVER_TRANSFER_DONE";
    public static final java.lang.String EXTRA_HANDOVER_TRANSFER_STATUS = "android.nfc.extra.HANDOVER_TRANSFER_STATUS";
    public static final int HANDOVER_TRANSFER_STATUS_SUCCESS = 0;
    public static final int HANDOVER_TRANSFER_STATUS_FAILURE = 1;
    public static final java.lang.String EXTRA_HANDOVER_TRANSFER_URI = "android.nfc.extra.HANDOVER_TRANSFER_URI";
    static boolean sIsInitialized;
    static boolean sHasNfcFeature;
    static boolean sHasBeamFeature;
    static android.nfc.INfcAdapter sService;
    static android.nfc.INfcTag sTagService;
    static android.nfc.INfcCardEmulation sCardEmulationService;
    static android.nfc.INfcFCardEmulation sNfcFCardEmulationService;
    static java.util.HashMap<android.content.Context, android.nfc.NfcAdapter> sNfcAdapters;
    static android.nfc.NfcAdapter sNullContextNfcAdapter;
    final android.nfc.NfcActivityManager mNfcActivityManager = null;
    final android.content.Context mContext = null;
    final java.util.HashMap<android.nfc.NfcAdapter.NfcUnlockHandler, android.nfc.INfcUnlockHandler> mNfcUnlockHandlers = null;
    final java.lang.Object mLock = null;
    android.nfc.ITagRemovedCallback mTagRemovedListener;
    android.app.OnActivityPausedListener mForegroundDispatchListener;
    private static boolean hasBeamFeature() { return false; }
    private static boolean hasNfcFeature() { return false; }
    private static boolean hasNfcHceFeature() { return false; }
    public java.util.List<java.lang.String> getSupportedOffHostSecureElements() { return null; }
    public static synchronized android.nfc.NfcAdapter getNfcAdapter(android.content.Context p0) { return null; }
    private static android.nfc.INfcAdapter getServiceInterface() { return null; }
    public static android.nfc.NfcAdapter getDefaultAdapter(android.content.Context p0) { return null; }
    @java.lang.Deprecated
    public static android.nfc.NfcAdapter getDefaultAdapter() { return null; }
    NfcAdapter(android.content.Context p0) {}
    public android.content.Context getContext() { return null; }
    public android.nfc.INfcAdapter getService() { return null; }
    public android.nfc.INfcTag getTagService() { return null; }
    public android.nfc.INfcCardEmulation getCardEmulationService() { return null; }
    public android.nfc.INfcFCardEmulation getNfcFCardEmulationService() { return null; }
    public android.nfc.INfcDta getNfcDtaInterface() { return null; }
    public void attemptDeadServiceRecovery(java.lang.Exception p0) {}
    public boolean isEnabled() { return false; }
    public int getAdapterState() { return 0; }
    @android.annotation.SystemApi
    public boolean enable() { return false; }
    @android.annotation.SystemApi
    public boolean disable() { return false; }
    @android.annotation.SystemApi
    public boolean disable(boolean p0) { return false; }
    public void pausePolling(int p0) {}
    public void resumePolling() {}
    @java.lang.Deprecated
    public void setBeamPushUris(android.net.Uri[] p0, android.app.Activity p1) {}
    @java.lang.Deprecated
    public void setBeamPushUrisCallback(android.nfc.NfcAdapter.CreateBeamUrisCallback p0, android.app.Activity p1) {}
    @java.lang.Deprecated
    public void setNdefPushMessage(android.nfc.NdefMessage p0, android.app.Activity p1, android.app.Activity... p2) {}
    @android.annotation.SystemApi
    public void setNdefPushMessage(android.nfc.NdefMessage p0, android.app.Activity p1, int p2) {}
    @java.lang.Deprecated
    public void setNdefPushMessageCallback(android.nfc.NfcAdapter.CreateNdefMessageCallback p0, android.app.Activity p1, android.app.Activity... p2) {}
    public void setNdefPushMessageCallback(android.nfc.NfcAdapter.CreateNdefMessageCallback p0, android.app.Activity p1, int p2) {}
    @java.lang.Deprecated
    public void setOnNdefPushCompleteCallback(android.nfc.NfcAdapter.OnNdefPushCompleteCallback p0, android.app.Activity p1, android.app.Activity... p2) {}
    public void enableForegroundDispatch(android.app.Activity p0, android.app.PendingIntent p1, android.content.IntentFilter[] p2, java.lang.String[][] p3) {}
    public void disableForegroundDispatch(android.app.Activity p0) {}
    void disableForegroundDispatchInternal(android.app.Activity p0, boolean p1) {}
    public void enableReaderMode(android.app.Activity p0, android.nfc.NfcAdapter.ReaderCallback p1, int p2, android.os.Bundle p3) {}
    public void disableReaderMode(android.app.Activity p0) {}
    @java.lang.Deprecated
    public boolean invokeBeam(android.app.Activity p0) { return false; }
    public boolean invokeBeam(android.nfc.BeamShareData p0) { return false; }
    @java.lang.Deprecated
    public void enableForegroundNdefPush(android.app.Activity p0, android.nfc.NdefMessage p1) {}
    @java.lang.Deprecated
    public void disableForegroundNdefPush(android.app.Activity p0) {}
    @android.annotation.SystemApi
    public boolean enableSecureNfc(boolean p0) { return false; }
    public boolean isSecureNfcSupported() { return false; }
    public boolean isSecureNfcEnabled() { return false; }
    @android.annotation.SystemApi
    public boolean enableNdefPush() { return false; }
    @android.annotation.SystemApi
    public boolean disableNdefPush() { return false; }
    @java.lang.Deprecated
    public boolean isNdefPushEnabled() { return false; }
    public boolean ignore(android.nfc.Tag p0, int p1, android.nfc.NfcAdapter.OnTagRemovedListener p2, android.os.Handler p3) { return false; }
    public void dispatch(android.nfc.Tag p0) {}
    public void setP2pModes(int p0, int p1) {}
    @android.annotation.SystemApi
    public boolean addNfcUnlockHandler(android.nfc.NfcAdapter.NfcUnlockHandler p0, java.lang.String[] p1) { return false; }
    @android.annotation.SystemApi
    public boolean removeNfcUnlockHandler(android.nfc.NfcAdapter.NfcUnlockHandler p0) { return false; }
    public android.nfc.INfcAdapterExtras getNfcAdapterExtrasInterface() { return null; }
    void enforceResumed(android.app.Activity p0) {}
    int getSdkVersion() { return 0; }

    @java.lang.Deprecated
    public static interface CreateBeamUrisCallback {
        public android.net.Uri[] createBeamUris(android.nfc.NfcEvent p0);
    }

    @java.lang.Deprecated
    public static interface CreateNdefMessageCallback {
        public android.nfc.NdefMessage createNdefMessage(android.nfc.NfcEvent p0);
    }

    @android.annotation.SystemApi
    public static interface NfcUnlockHandler {
        public boolean onUnlockAttempted(android.nfc.Tag p0);
    }

    @java.lang.Deprecated
    public static interface OnNdefPushCompleteCallback {
        public void onNdefPushComplete(android.nfc.NfcEvent p0);
    }

    public static interface OnTagRemovedListener {
        public void onTagRemoved();
    }

    public static interface ReaderCallback {
        public void onTagDiscovered(android.nfc.Tag p0);
    }
}
