package com.android.internal.app;

public class UnlaunchableAppActivity extends android.app.Activity implements android.content.DialogInterface.OnDismissListener, android.content.DialogInterface.OnClickListener {
    public UnlaunchableAppActivity() { super(); }
    protected void onCreate(android.os.Bundle p0) {}
    public void onDismiss(android.content.DialogInterface p0) {}
    public void onClick(android.content.DialogInterface p0, int p1) {}
    public static android.content.Intent createInQuietModeDialogIntent(int p0) { return null; }
    public static android.content.Intent createInQuietModeDialogIntent(int p0, android.content.IntentSender p1, android.content.pm.ResolveInfo p2) { return null; }
}
