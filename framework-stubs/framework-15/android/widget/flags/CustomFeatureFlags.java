package android.widget.flags;

public class CustomFeatureFlags implements android.widget.flags.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<android.widget.flags.FeatureFlags>> p0) {}
    public boolean bigPictureStyleDiscardEmptyIconBitmapDrawables() { return false; }
    public boolean callStyleSetDataAsync() { return false; }
    public boolean conversationStyleSetAvatarAsync() { return false; }
    public boolean enablePlatformWidgetDifferentialMotionFling() { return false; }
    public boolean messagingChildRequestLayout() { return false; }
    public boolean notifLinearlayoutOptimized() { return false; }
    public boolean toastNoWeakref() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.widget.flags.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
