package android.preference;

@java.lang.Deprecated
public abstract class DialogPreference extends android.preference.Preference implements android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnDismissListener, android.preference.PreferenceManager.OnActivityDestroyListener {
    private android.app.AlertDialog.Builder mBuilder;
    private java.lang.CharSequence mDialogTitle;
    private java.lang.CharSequence mDialogMessage;
    private android.graphics.drawable.Drawable mDialogIcon;
    private java.lang.CharSequence mPositiveButtonText;
    private java.lang.CharSequence mNegativeButtonText;
    private int mDialogLayoutResId;
    private android.app.Dialog mDialog;
    private int mWhichButtonClicked;
    private final java.lang.Runnable mDismissRunnable = null;
    public DialogPreference(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public DialogPreference(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public DialogPreference(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public DialogPreference(android.content.Context p0) { super((android.content.Context)null); }
    public void setDialogTitle(java.lang.CharSequence p0) {}
    public void setDialogTitle(int p0) {}
    public java.lang.CharSequence getDialogTitle() { return null; }
    public void setDialogMessage(java.lang.CharSequence p0) {}
    public void setDialogMessage(int p0) {}
    public java.lang.CharSequence getDialogMessage() { return null; }
    public void setDialogIcon(android.graphics.drawable.Drawable p0) {}
    public void setDialogIcon(int p0) {}
    public android.graphics.drawable.Drawable getDialogIcon() { return null; }
    public void setPositiveButtonText(java.lang.CharSequence p0) {}
    public void setPositiveButtonText(int p0) {}
    public java.lang.CharSequence getPositiveButtonText() { return null; }
    public void setNegativeButtonText(java.lang.CharSequence p0) {}
    public void setNegativeButtonText(int p0) {}
    public java.lang.CharSequence getNegativeButtonText() { return null; }
    public void setDialogLayoutResource(int p0) {}
    public int getDialogLayoutResource() { return 0; }
    protected void onPrepareDialogBuilder(android.app.AlertDialog.Builder p0) {}
    protected void onClick() {}
    protected void showDialog(android.os.Bundle p0) {}
    private android.view.View getDecorView() { return null; }
    void postDismiss() {}
    private void removeDismissCallbacks() {}
    protected boolean needInputMethod() { return false; }
    private void requestInputMethod(android.app.Dialog p0) {}
    protected android.view.View onCreateDialogView() { return null; }
    protected void onBindDialogView(android.view.View p0) {}
    public void onClick(android.content.DialogInterface p0, int p1) {}
    public void onDismiss(android.content.DialogInterface p0) {}
    protected void onDialogClosed(boolean p0) {}
    public android.app.Dialog getDialog() { return null; }
    public void onActivityDestroy() {}
    protected android.os.Parcelable onSaveInstanceState() { return null; }
    protected void onRestoreInstanceState(android.os.Parcelable p0) {}

    private static class SavedState extends android.preference.Preference.BaseSavedState {
        boolean isDialogShowing;
        android.os.Bundle dialogBundle;
        public static final android.os.Parcelable.Creator<android.preference.DialogPreference.SavedState> CREATOR = null;
        public SavedState(android.os.Parcel p0) { super((android.os.Parcel)null); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public SavedState(android.os.Parcelable p0) { super((android.os.Parcel)null); }
    }
}
