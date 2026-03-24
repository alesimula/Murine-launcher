package android.service.quicksettings;

public class CustomFeatureFlags implements android.service.quicksettings.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<android.service.quicksettings.FeatureFlags>> p0) {}
    public boolean quicksettingsTileCategories() { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.service.quicksettings.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
    public boolean isFlagFinalized(java.lang.String p0) { return false; }
}
