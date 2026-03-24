package android.nfc;

public class CustomFeatureFlags implements android.nfc.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<android.nfc.FeatureFlags>> p0) {}
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
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.nfc.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
