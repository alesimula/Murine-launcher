package com.android.internal.app;

public abstract class AlertActivity extends android.app.Activity implements android.content.DialogInterface {
    @android.annotation.UnsupportedAppUsage
    protected com.android.internal.app.AlertController mAlert;
    @android.annotation.UnsupportedAppUsage
    protected com.android.internal.app.AlertController.AlertParams mAlertParams;
    public AlertActivity() { super(); }
    protected void onCreate(android.os.Bundle p0) {}
    public void cancel() {}
    public void dismiss() {}
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0) { return false; }
    public static boolean dispatchPopulateAccessibilityEvent(android.app.Activity p0, android.view.accessibility.AccessibilityEvent p1) { return false; }
    @android.annotation.UnsupportedAppUsage
    protected void setupAlert() {}
    public boolean onKeyDown(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyUp(int p0, android.view.KeyEvent p1) { return false; }
}
