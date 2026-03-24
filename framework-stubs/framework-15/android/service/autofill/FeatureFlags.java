package android.service.autofill;

public interface FeatureFlags {
    public boolean addLastFocusedIdToClientState();
    public boolean addSessionIdToClientState();
    public boolean autofillCredmanDevIntegration();
    public boolean autofillCredmanIntegration();
    public boolean autofillCredmanIntegrationPhase2();
    public boolean fillFieldsFromCurrentSessionOnly();
    public boolean includeInvisibleViewGroupInAssistStructure();
    public boolean relayout();
    public boolean remoteFillServiceUseWeakReference();
    public boolean test();
}
