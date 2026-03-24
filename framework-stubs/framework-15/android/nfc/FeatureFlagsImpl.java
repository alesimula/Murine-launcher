package android.nfc;

public final class FeatureFlagsImpl implements android.nfc.FeatureFlags {
    public FeatureFlagsImpl() {}
    public boolean enableNfcCharging() { return false; }
    public boolean enableNfcMainline() { return false; }
    public boolean enableNfcReaderOption() { return false; }
    public boolean enableNfcSetDiscoveryTech() { return false; }
    public boolean enableNfcUserRestriction() { return false; }
    public boolean enableTagDetectionBroadcasts() { return false; }
    public boolean nfcObserveMode() { return false; }
    public boolean nfcObserveModeStShim() { return false; }
    public boolean nfcOemExtension() { return false; }
    public boolean nfcReadPollingLoop() { return false; }
    public boolean nfcReadPollingLoopStShim() { return false; }
    public boolean nfcSetDefaultDiscTech() { return false; }
    public boolean nfcStateChange() { return false; }
    public boolean nfcVendorCmd() { return false; }
}
