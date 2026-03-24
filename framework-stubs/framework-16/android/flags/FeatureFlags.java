package android.flags;

public class FeatureFlags {
    @android.annotation.NonNull
    public static android.flags.FeatureFlags getInstance() { return null; }
    public static void setInstance(android.flags.FeatureFlags p0) {}
    public FeatureFlags(android.flags.IFeatureFlags p0) {}
    @android.annotation.NonNull
    public static android.flags.BooleanFlag booleanFlag(java.lang.String p0, java.lang.String p1, boolean p2) { return null; }
    @android.annotation.NonNull
    public static android.flags.FusedOffFlag fusedOffFlag(java.lang.String p0, java.lang.String p1) { return null; }
    @android.annotation.NonNull
    public static android.flags.FusedOnFlag fusedOnFlag(java.lang.String p0, java.lang.String p1) { return null; }
    @android.annotation.NonNull
    public static android.flags.DynamicBooleanFlag dynamicBooleanFlag(java.lang.String p0, java.lang.String p1, boolean p2) { return null; }
    public void addChangeListener(android.flags.FeatureFlags.ChangeListener p0) {}
    public void removeChangeListener(android.flags.FeatureFlags.ChangeListener p0) {}
    protected void onFlagChange(android.flags.DynamicFlag<?> p0) {}
    public boolean isEnabled(android.flags.BooleanFlag p0) { return false; }
    public boolean isEnabled(android.flags.FusedOffFlag p0) { return false; }
    public boolean isEnabled(android.flags.FusedOnFlag p0) { return false; }
    public boolean isCurrentlyEnabled(android.flags.DynamicBooleanFlag p0) { return false; }
    public void sync() {}
    protected void syncInternal(java.util.Set<android.flags.Flag<?>> p0) {}
    static boolean parseBoolean(java.lang.String p0) { return false; }

    public static interface ChangeListener {
        public void onFlagChanged(android.flags.DynamicFlag<?> p0);
    }
}
