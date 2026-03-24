package com.android.internal.app;

public class ChooserStackedAppDialogFragment extends com.android.internal.app.ChooserTargetActionsDialogFragment implements android.content.DialogInterface.OnClickListener {
    private com.android.internal.app.chooser.MultiDisplayResolveInfo mMultiDisplayResolveInfo;
    private int mParentWhich;
    public ChooserStackedAppDialogFragment() { super(); }
    public ChooserStackedAppDialogFragment(com.android.internal.app.chooser.MultiDisplayResolveInfo p0, int p1, android.os.UserHandle p2) { super(); }
    protected java.lang.CharSequence getItemLabel(com.android.internal.app.chooser.DisplayResolveInfo p0) { return null; }
    protected android.graphics.drawable.Drawable getItemIcon(com.android.internal.app.chooser.DisplayResolveInfo p0) { return null; }
    public void onClick(android.content.DialogInterface p0, int p1) {}
}
