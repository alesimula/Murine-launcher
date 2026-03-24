package android.service.autofill;

public class CustomFeatureFlags implements android.service.autofill.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<android.service.autofill.FeatureFlags>> p0) {}
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
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.service.autofill.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
