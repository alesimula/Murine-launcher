package com.android.internal.accessibility.dialog;

public class AccessibilityShortcutChooserActivity extends android.app.Activity {
    private final int mShortcutType = 0;
    private final java.util.List<com.android.internal.accessibility.dialog.AccessibilityTarget> mTargets = null;
    private android.app.AlertDialog mMenuDialog;
    private android.app.AlertDialog mPermissionDialog;
    private com.android.internal.accessibility.dialog.ShortcutTargetAdapter mTargetAdapter;
    public AccessibilityShortcutChooserActivity() { super(); }
    protected void onCreate(android.os.Bundle p0) {}
    protected void onDestroy() {}
    private void onTargetSelected(android.widget.AdapterView<?> p0, android.view.View p1, int p2, long p3) {}
    private void onTargetChecked(android.widget.AdapterView<?> p0, android.view.View p1, int p2, long p3) {}
    private void onDoneButtonClicked() {}
    private void onEditButtonClicked() {}
    private void updateDialogListeners() {}
    private android.app.AlertDialog createMenuDialog() { return null; }
}
