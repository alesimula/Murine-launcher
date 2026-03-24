package android.app;

@java.lang.Deprecated
public class DialogFragment extends android.app.Fragment implements android.content.DialogInterface.OnCancelListener, android.content.DialogInterface.OnDismissListener {
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_TITLE = 1;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    private static final java.lang.String SAVED_DIALOG_STATE_TAG = "android:savedDialogState";
    private static final java.lang.String SAVED_STYLE = "android:style";
    private static final java.lang.String SAVED_THEME = "android:theme";
    private static final java.lang.String SAVED_CANCELABLE = "android:cancelable";
    private static final java.lang.String SAVED_SHOWS_DIALOG = "android:showsDialog";
    private static final java.lang.String SAVED_BACK_STACK_ID = "android:backStackId";
    int mStyle;
    int mTheme;
    boolean mCancelable;
    boolean mShowsDialog;
    @android.annotation.UnsupportedAppUsage
    int mBackStackId;
    android.app.Dialog mDialog;
    @android.annotation.UnsupportedAppUsage
    boolean mViewDestroyed;
    @android.annotation.UnsupportedAppUsage
    boolean mDismissed;
    @android.annotation.UnsupportedAppUsage
    boolean mShownByMe;
    public DialogFragment() { super(); }
    public void setStyle(int p0, int p1) {}
    public void show(android.app.FragmentManager p0, java.lang.String p1) {}
    @android.annotation.UnsupportedAppUsage
    public void showAllowingStateLoss(android.app.FragmentManager p0, java.lang.String p1) {}
    public int show(android.app.FragmentTransaction p0, java.lang.String p1) { return 0; }
    public void dismiss() {}
    public void dismissAllowingStateLoss() {}
    void dismissInternal(boolean p0) {}
    public android.app.Dialog getDialog() { return null; }
    public int getTheme() { return 0; }
    public void setCancelable(boolean p0) {}
    public boolean isCancelable() { return false; }
    public void setShowsDialog(boolean p0) {}
    public boolean getShowsDialog() { return false; }
    public void onAttach(android.content.Context p0) {}
    public void onDetach() {}
    public void onCreate(android.os.Bundle p0) {}
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle p0) { return null; }
    public android.app.Dialog onCreateDialog(android.os.Bundle p0) { return null; }
    public void onCancel(android.content.DialogInterface p0) {}
    public void onDismiss(android.content.DialogInterface p0) {}
    public void onActivityCreated(android.os.Bundle p0) {}
    public void onStart() {}
    public void onSaveInstanceState(android.os.Bundle p0) {}
    public void onStop() {}
    public void onDestroyView() {}
    public void dump(java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3) {}
}
