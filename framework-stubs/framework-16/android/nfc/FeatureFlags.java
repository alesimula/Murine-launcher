package android.nfc;

public interface FeatureFlags {
    public boolean enableCardEmulationEuicc();
    public boolean enableNfcCharging();
    public boolean enableNfcMainline();
    public boolean enableNfcReaderOption();
    public boolean enableNfcSetDiscoveryTech();
    public boolean enableNfcUserRestriction();
    public boolean enableTagDetectionBroadcasts();
    public boolean nfcActionManageServicesSettings();
    public boolean nfcApduServiceInfoConstructor();
    public boolean nfcAssociatedRoleServices();
    public boolean nfcCheckTagIntentPreference();
    public boolean nfcEventListener();
    public boolean nfcObserveMode();
    public boolean nfcObserveModeStShim();
    public boolean nfcOemExtension();
    public boolean nfcOverrideRecoverRoutingTable();
    public boolean nfcPersistLog();
    public boolean nfcReadPollingLoop();
    public boolean nfcReadPollingLoopStShim();
    public boolean nfcSetDefaultDiscTech();
    public boolean nfcSetServiceEnabledForCategoryOther();
    public boolean nfcStateChange();
    public boolean nfcStateChangeSecurityLogEventEnabled();
    public boolean nfcVendorCmd();
    public boolean nfcWatchdog();
    public boolean screenStateAttributeToggle();
}
