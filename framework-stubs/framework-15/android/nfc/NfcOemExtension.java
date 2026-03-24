package android.nfc;

public final class NfcOemExtension {
    NfcOemExtension() {}
    public void clearPreference() {}
    public void maybeTriggerFirmwareUpdate() {}
    public void registerCallback(java.util.concurrent.Executor p0, android.nfc.NfcOemExtension.Callback p1) {}
    public void synchronizeScreenState() {}
    public void unregisterCallback(android.nfc.NfcOemExtension.Callback p0) {}

    public static interface Callback {
        public void onTagConnected(boolean p0, android.nfc.Tag p1);
    }
}
