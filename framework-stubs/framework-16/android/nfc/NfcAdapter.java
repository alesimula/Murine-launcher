package android.nfc;

public final class NfcAdapter {
    public static final java.lang.String ACTION_ADAPTER_STATE_CHANGED = "android.nfc.action.ADAPTER_STATE_CHANGED";
    @android.annotation.FlaggedApi("android.nfc.nfc_check_tag_intent_preference")
    public static final java.lang.String ACTION_CHANGE_TAG_INTENT_PREFERENCE = "android.nfc.action.CHANGE_TAG_INTENT_PREFERENCE";
    public static final java.lang.String ACTION_NDEF_DISCOVERED = "android.nfc.action.NDEF_DISCOVERED";
    public static final java.lang.String ACTION_PREFERRED_PAYMENT_CHANGED = "android.nfc.action.PREFERRED_PAYMENT_CHANGED";
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
    public static final java.lang.String ACTION_REQUIRE_UNLOCK_FOR_NFC = "android.nfc.action.REQUIRE_UNLOCK_FOR_NFC";
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
    public static final java.lang.String ACTION_SHOW_NFC_RESOLVER = "android.nfc.action.SHOW_NFC_RESOLVER";
    public static final java.lang.String ACTION_TAG_DISCOVERED = "android.nfc.action.TAG_DISCOVERED";
    public static final java.lang.String ACTION_TECH_DISCOVERED = "android.nfc.action.TECH_DISCOVERED";
    public static final java.lang.String ACTION_TRANSACTION_DETECTED = "android.nfc.action.TRANSACTION_DETECTED";
    public static final java.lang.String EXTRA_ADAPTER_STATE = "android.nfc.extra.ADAPTER_STATE";
    public static final java.lang.String EXTRA_AID = "android.nfc.extra.AID";
    public static final java.lang.String EXTRA_DATA = "android.nfc.extra.DATA";
    public static final java.lang.String EXTRA_ID = "android.nfc.extra.ID";
    public static final java.lang.String EXTRA_NDEF_MESSAGES = "android.nfc.extra.NDEF_MESSAGES";
    public static final java.lang.String EXTRA_PREFERRED_PAYMENT_CHANGED_REASON = "android.nfc.extra.PREFERRED_PAYMENT_CHANGED_REASON";
    public static final java.lang.String EXTRA_READER_PRESENCE_CHECK_DELAY = "presence";
    @android.annotation.FlaggedApi("com.android.nfc.module.flags.reader_mode_annotations")
    public static final java.lang.String EXTRA_READER_TECH_A_POLLING_LOOP_ANNOTATION = "android.nfc.extra.READER_TECH_A_POLLING_LOOP_ANNOTATION";
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
    public static final java.lang.String EXTRA_RESOLVE_INFOS = "android.nfc.extra.RESOLVE_INFOS";
    public static final java.lang.String EXTRA_SECURE_ELEMENT_NAME = "android.nfc.extra.SECURE_ELEMENT_NAME";
    public static final java.lang.String EXTRA_TAG = "android.nfc.extra.TAG";
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_set_discovery_tech")
    public static final int FLAG_LISTEN_DISABLE = 0;
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_set_discovery_tech")
    public static final int FLAG_LISTEN_KEEP = -2147483648;
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_set_discovery_tech")
    public static final int FLAG_LISTEN_NFC_PASSIVE_A = 1;
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_set_discovery_tech")
    public static final int FLAG_LISTEN_NFC_PASSIVE_B = 2;
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_set_discovery_tech")
    public static final int FLAG_LISTEN_NFC_PASSIVE_F = 4;
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_set_discovery_tech")
    public static final int FLAG_READER_DISABLE = 0;
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_set_discovery_tech")
    public static final int FLAG_READER_KEEP = -2147483648;
    public static final int FLAG_READER_NFC_A = 1;
    public static final int FLAG_READER_NFC_B = 2;
    public static final int FLAG_READER_NFC_BARCODE = 16;
    public static final int FLAG_READER_NFC_F = 4;
    public static final int FLAG_READER_NFC_V = 8;
    public static final int FLAG_READER_NO_PLATFORM_SOUNDS = 256;
    public static final int FLAG_READER_SKIP_NDEF_CHECK = 128;
    @android.annotation.FlaggedApi("android.nfc.nfc_set_default_disc_tech")
    public static final int FLAG_SET_DEFAULT_TECH = 1073741824;
    @android.annotation.FlaggedApi("android.nfc.nfc_vendor_cmd")
    public static final int MESSAGE_TYPE_COMMAND = 1;
    public static final int PREFERRED_PAYMENT_CHANGED = 2;
    public static final int PREFERRED_PAYMENT_LOADED = 1;
    public static final int PREFERRED_PAYMENT_UPDATED = 3;
    @android.annotation.FlaggedApi("android.nfc.nfc_vendor_cmd")
    public static final int SEND_VENDOR_NCI_STATUS_FAILED = 3;
    @android.annotation.FlaggedApi("android.nfc.nfc_vendor_cmd")
    public static final int SEND_VENDOR_NCI_STATUS_MESSAGE_CORRUPTED = 2;
    @android.annotation.FlaggedApi("android.nfc.nfc_vendor_cmd")
    public static final int SEND_VENDOR_NCI_STATUS_REJECTED = 1;
    @android.annotation.FlaggedApi("android.nfc.nfc_vendor_cmd")
    public static final int SEND_VENDOR_NCI_STATUS_SUCCESS = 0;
    public static final int STATE_OFF = 1;
    public static final int STATE_ON = 3;
    public static final int STATE_TURNING_OFF = 4;
    public static final int STATE_TURNING_ON = 2;
    public static final int TAG_INTENT_APP_PREF_RESULT_PACKAGE_NOT_FOUND = -1;
    public static final int TAG_INTENT_APP_PREF_RESULT_SUCCESS = 0;
    public static final int TAG_INTENT_APP_PREF_RESULT_UNAVAILABLE = -2;
    NfcAdapter() {}
    public boolean addNfcUnlockHandler(android.nfc.NfcAdapter.NfcUnlockHandler p0, java.lang.String[] p1) { return false; }
    @android.annotation.FlaggedApi("android.nfc.nfc_state_change")
    public boolean disable() { return false; }
    public boolean disable(boolean p0) { return false; }
    public void disableForegroundDispatch(android.app.Activity p0) {}
    public void disableReaderMode(android.app.Activity p0) {}
    @android.annotation.FlaggedApi("android.nfc.nfc_state_change")
    public boolean enable() { return false; }
    public void enableForegroundDispatch(android.app.Activity p0, android.app.PendingIntent p1, android.content.IntentFilter[] p2, java.lang.String[][] p3) {}
    public void enableReaderMode(android.app.Activity p0, android.nfc.NfcAdapter.ReaderCallback p1, int p2, android.os.Bundle p3) {}
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_reader_option")
    public boolean enableReaderOption(boolean p0) { return false; }
    public boolean enableSecureNfc(boolean p0) { return false; }
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
    public int getAdapterState() { return 0; }
    public static android.nfc.NfcAdapter getDefaultAdapter(android.content.Context p0) { return null; }
    @android.annotation.Nullable
    public android.nfc.NfcAntennaInfo getNfcAntennaInfo() { return null; }
    @android.annotation.FlaggedApi("android.nfc.nfc_oem_extension")
    @android.annotation.NonNull
    public android.nfc.NfcOemExtension getNfcOemExtension() { return null; }
    @android.annotation.NonNull
    public java.util.Map<java.lang.String, java.lang.Boolean> getTagIntentAppPreferenceForUser(int p0) { return null; }
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_charging")
    @android.annotation.Nullable
    public android.nfc.WlcListenerDeviceInfo getWlcListenerDeviceInfo() { return null; }
    public boolean ignore(android.nfc.Tag p0, int p1, android.nfc.NfcAdapter.OnTagRemovedListener p2, android.os.Handler p3) { return false; }
    public boolean isControllerAlwaysOn() { return false; }
    public boolean isControllerAlwaysOnSupported() { return false; }
    public boolean isEnabled() { return false; }
    public boolean isObserveModeEnabled() { return false; }
    public boolean isObserveModeSupported() { return false; }
    @android.annotation.FlaggedApi("com.android.nfc.module.flags.nfc_power_saving_mode")
    public boolean isPowerSavingModeEnabled() { return false; }
    @android.annotation.FlaggedApi("com.android.nfc.module.flags.nfc_power_saving_mode")
    public boolean isPowerSavingModeSupported() { return false; }
    @android.annotation.FlaggedApi("com.android.nfc.module.flags.reader_mode_annotations")
    public boolean isReaderModeAnnotationSupported() { return false; }
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_reader_option")
    public boolean isReaderOptionEnabled() { return false; }
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_reader_option")
    public boolean isReaderOptionSupported() { return false; }
    public boolean isSecureNfcEnabled() { return false; }
    public boolean isSecureNfcSupported() { return false; }
    @android.annotation.FlaggedApi("android.nfc.nfc_check_tag_intent_preference")
    public boolean isTagIntentAllowed() { return false; }
    @android.annotation.FlaggedApi("android.nfc.nfc_check_tag_intent_preference")
    public boolean isTagIntentAppPreferenceSupported() { return false; }
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_charging")
    public boolean isWlcEnabled() { return false; }
    public void registerControllerAlwaysOnListener(java.util.concurrent.Executor p0, android.nfc.NfcAdapter.ControllerAlwaysOnListener p1) {}
    @android.annotation.FlaggedApi("android.nfc.nfc_vendor_cmd")
    public void registerNfcVendorNciCallback(java.util.concurrent.Executor p0, android.nfc.NfcAdapter.NfcVendorNciCallback p1) {}
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_charging")
    public void registerWlcStateListener(java.util.concurrent.Executor p0, android.nfc.NfcAdapter.WlcStateListener p1) {}
    public boolean removeNfcUnlockHandler(android.nfc.NfcAdapter.NfcUnlockHandler p0) { return false; }
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_set_discovery_tech")
    public void resetDiscoveryTechnology(android.app.Activity p0) {}
    @android.annotation.FlaggedApi("android.nfc.nfc_vendor_cmd")
    public int sendVendorNciMessage(int p0, int p1, int p2, byte[] p3) { return 0; }
    public boolean setControllerAlwaysOn(boolean p0) { return false; }
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_set_discovery_tech")
    public void setDiscoveryTechnology(android.app.Activity p0, int p1, int p2) {}
    public boolean setObserveModeEnabled(boolean p0) { return false; }
    @android.annotation.FlaggedApi("com.android.nfc.module.flags.nfc_power_saving_mode")
    public void setPowerSavingMode(boolean p0) {}
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
    public void setReaderModePollingEnabled(boolean p0) {}
    public int setTagIntentAppPreferenceForUser(int p0, java.lang.String p1, boolean p2) { return 0; }
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_charging")
    public boolean setWlcEnabled(boolean p0) { return false; }
    public void unregisterControllerAlwaysOnListener(android.nfc.NfcAdapter.ControllerAlwaysOnListener p0) {}
    @android.annotation.FlaggedApi("android.nfc.nfc_vendor_cmd")
    public void unregisterNfcVendorNciCallback(android.nfc.NfcAdapter.NfcVendorNciCallback p0) {}
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_charging")
    public void unregisterWlcStateListener(android.nfc.NfcAdapter.WlcStateListener p0) {}

    public static interface ControllerAlwaysOnListener {
        public void onControllerAlwaysOnChanged(boolean p0);
    }

    @java.lang.Deprecated
    public static interface CreateBeamUrisCallback {
        @java.lang.Deprecated
        public android.net.Uri[] createBeamUris(android.nfc.NfcEvent p0);
    }

    @java.lang.Deprecated
    public static interface CreateNdefMessageCallback {
        @java.lang.Deprecated
        public android.nfc.NdefMessage createNdefMessage(android.nfc.NfcEvent p0);
    }

    public static interface NfcUnlockHandler {
        public boolean onUnlockAttempted(android.nfc.Tag p0);
    }

    @android.annotation.FlaggedApi("android.nfc.nfc_vendor_cmd")
    public static interface NfcVendorNciCallback {
        @android.annotation.FlaggedApi("android.nfc.nfc_vendor_cmd")
        public void onVendorNciNotification(int p0, int p1, byte[] p2);
        @android.annotation.FlaggedApi("android.nfc.nfc_vendor_cmd")
        public void onVendorNciResponse(int p0, int p1, byte[] p2);
    }

    @java.lang.Deprecated
    public static interface OnNdefPushCompleteCallback {
        @java.lang.Deprecated
        public void onNdefPushComplete(android.nfc.NfcEvent p0);
    }

    public static interface OnTagRemovedListener {
        public void onTagRemoved();
    }

    public static interface ReaderCallback {
        public void onTagDiscovered(android.nfc.Tag p0);
    }

    @android.annotation.FlaggedApi("android.nfc.enable_nfc_charging")
    public static interface WlcStateListener {
        public void onWlcStateChanged(android.nfc.WlcListenerDeviceInfo p0);
    }
}
