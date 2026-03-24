package android.companion;

public class CustomFeatureFlags implements android.companion.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<android.companion.FeatureFlags>> p0) {}
    public boolean associationDeviceIcon() { return false; }
    public boolean associationFailureCode() { return false; }
    public boolean associationTag() { return false; }
    public boolean associationVerification() { return false; }
    public boolean devicePresence() { return false; }
    public boolean enableTaskContinuity() { return false; }
    public boolean newAssociationBuilder() { return false; }
    public boolean notifyAssociationRemoved() { return false; }
    public boolean ongoingPermSync() { return false; }
    public boolean permSyncUserConsent() { return false; }
    public boolean unpairAssociatedDevice() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.companion.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
