package android.service.autofill;

public final class FeatureFlagsImpl implements android.service.autofill.FeatureFlags {
    public FeatureFlagsImpl() {}
    public boolean addLastFocusedIdToClientState() { return false; }
    public boolean addSessionIdToClientState() { return false; }
    public boolean autofillCredmanDevIntegration() { return false; }
    public boolean autofillCredmanIntegration() { return false; }
    public boolean autofillCredmanIntegrationPhase2() { return false; }
    public boolean fillFieldsFromCurrentSessionOnly() { return false; }
    public boolean includeInvisibleViewGroupInAssistStructure() { return false; }
    public boolean relayout() { return false; }
    public boolean remoteFillServiceUseWeakReference() { return false; }
    public boolean test() { return false; }
}
