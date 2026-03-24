package com.android.internal.accessibility.dialog;

public abstract class AccessibilityTarget implements com.android.internal.accessibility.dialog.TargetOperations, com.android.internal.accessibility.dialog.OnTargetSelectedListener, com.android.internal.accessibility.dialog.OnTargetCheckedChangeListener {
    public AccessibilityTarget(android.content.Context p0, int p1, int p2, boolean p3, java.lang.String p4, int p5, java.lang.CharSequence p6, android.graphics.drawable.Drawable p7, java.lang.String p8) {}
    public void updateActionItem(com.android.internal.accessibility.dialog.TargetAdapter.ViewHolder p0, int p1) {}
    public void onSelected() {}
    public void onCheckedChanged(boolean p0) {}
    public void setStateDescription(java.lang.CharSequence p0) {}
    public java.lang.CharSequence getStateDescription() { return null; }
    public void setShortcutEnabled(boolean p0) {}
    public android.content.Context getContext() { return null; }
    public int getShortcutType() { return 0; }
    public int getFragmentType() { return 0; }
    public boolean isShortcutEnabled() { return false; }
    public java.lang.String getId() { return null; }
    public int getUid() { return 0; }
    public android.content.ComponentName getComponentName() { return null; }
    public java.lang.CharSequence getLabel() { return null; }
    public android.graphics.drawable.Drawable getIcon() { return null; }
    public java.lang.String getKey() { return null; }
}
