package android.view.accessibility;

public interface FeatureFlags {
    public boolean a11yOverlayCallbacks();
    public boolean a11yQsShortcut();
    public boolean addTypeWindowControl();
    public boolean allowShortcutChooserOnLockscreen();
    public boolean brailleDisplayHid();
    public boolean cleanupAccessibilityWarningDialog();
    public boolean collectionInfoItemCounts();
    public boolean copyEventsForGestureDetection();
    public boolean enableSystemPinchZoomGesture();
    public boolean fixMergedContentChangeEventV2();
    public boolean flashNotificationSystemApi();
    public boolean forceInvertColor();
    public boolean granularScrolling();
    public boolean migrateEnableShortcuts();
    public boolean motionEventObserving();
    public boolean preventLeakingViewrootimpl();
    public boolean reduceWindowContentChangedEventThrottle();
    public boolean restoreA11yShortcutTargetService();
    public boolean skipAccessibilityWarningDialogForTrustedServices();
    public boolean supportSystemPinchZoomOptOutApis();
    public boolean updateAlwaysOnA11yService();
}
