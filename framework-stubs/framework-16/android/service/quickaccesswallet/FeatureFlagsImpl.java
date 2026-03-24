package android.service.quickaccesswallet;

public final class FeatureFlagsImpl implements android.service.quickaccesswallet.FeatureFlags {
    public FeatureFlagsImpl() {}
    public boolean launchSelectedCardFromQsTile() { return false; }
    public boolean launchWalletOptionOnPowerDoubleTap() { return false; }
    public boolean launchWalletViaSysuiCallbacks() { return false; }
}
