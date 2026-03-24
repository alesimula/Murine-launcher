package android.nfc;

public interface FeatureFlags {
    public boolean enableNfcCharging();
    public boolean enableNfcMainline();
    public boolean enableNfcReaderOption();
    public boolean enableNfcSetDiscoveryTech();
    public boolean enableNfcUserRestriction();
    public boolean enableTagDetectionBroadcasts();
    public boolean nfcObserveMode();
    public boolean nfcObserveModeStShim();
    public boolean nfcOemExtension();
    public boolean nfcReadPollingLoop();
    public boolean nfcReadPollingLoopStShim();
    public boolean nfcSetDefaultDiscTech();
    public boolean nfcStateChange();
    public boolean nfcVendorCmd();
}
