package android.app;

public class AlertDialog extends android.app.Dialog implements android.content.DialogInterface {
    @java.lang.Deprecated
    public static final int THEME_TRADITIONAL = 1;
    @java.lang.Deprecated
    public static final int THEME_HOLO_DARK = 2;
    @java.lang.Deprecated
    public static final int THEME_HOLO_LIGHT = 3;
    @java.lang.Deprecated
    public static final int THEME_DEVICE_DEFAULT_DARK = 4;
    @java.lang.Deprecated
    public static final int THEME_DEVICE_DEFAULT_LIGHT = 5;
    public static final int LAYOUT_HINT_NONE = 0;
    public static final int LAYOUT_HINT_SIDE = 1;
    protected AlertDialog(android.content.Context p0) { super((android.content.Context)null); }
    protected AlertDialog(android.content.Context p0, boolean p1, android.content.DialogInterface.OnCancelListener p2) { super((android.content.Context)null); }
    protected AlertDialog(android.content.Context p0, int p1) { super((android.content.Context)null); }
    AlertDialog(android.content.Context p0, int p1, boolean p2) { super((android.content.Context)null); }
    static int resolveDialogTheme(android.content.Context p0, int p1) { return 0; }
    public android.widget.Button getButton(int p0) { return null; }
    public android.widget.ListView getListView() { return null; }
    public void setTitle(java.lang.CharSequence p0) {}
    public void setCustomTitle(android.view.View p0) {}
    public void setMessage(java.lang.CharSequence p0) {}
    public void setMessageMovementMethod(android.text.method.MovementMethod p0) {}
    public void setMessageHyphenationFrequency(int p0) {}
    public void setView(android.view.View p0) {}
    public void setView(android.view.View p0, int p1, int p2, int p3, int p4) {}
    void setButtonPanelLayoutHint(int p0) {}
    public void setButton(int p0, java.lang.CharSequence p1, android.os.Message p2) {}
    public void setButton(int p0, java.lang.CharSequence p1, android.content.DialogInterface.OnClickListener p2) {}
    @java.lang.Deprecated
    public void setButton(java.lang.CharSequence p0, android.os.Message p1) {}
    @java.lang.Deprecated
    public void setButton2(java.lang.CharSequence p0, android.os.Message p1) {}
    @java.lang.Deprecated
    public void setButton3(java.lang.CharSequence p0, android.os.Message p1) {}
    @java.lang.Deprecated
    public void setButton(java.lang.CharSequence p0, android.content.DialogInterface.OnClickListener p1) {}
    @java.lang.Deprecated
    public void setButton2(java.lang.CharSequence p0, android.content.DialogInterface.OnClickListener p1) {}
    @java.lang.Deprecated
    public void setButton3(java.lang.CharSequence p0, android.content.DialogInterface.OnClickListener p1) {}
    public void setIcon(int p0) {}
    public void setIcon(android.graphics.drawable.Drawable p0) {}
    public void setIconAttribute(int p0) {}
    public void setInverseBackgroundForced(boolean p0) {}
    protected void onCreate(android.os.Bundle p0) {}
    public boolean onKeyDown(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyUp(int p0, android.view.KeyEvent p1) { return false; }

    public static class Builder {
        public Builder(android.content.Context p0) {}
        public Builder(android.content.Context p0, int p1) {}
        public android.content.Context getContext() { return null; }
        public android.app.AlertDialog.Builder setTitle(int p0) { return null; }
        public android.app.AlertDialog.Builder setTitle(java.lang.CharSequence p0) { return null; }
        public android.app.AlertDialog.Builder setCustomTitle(android.view.View p0) { return null; }
        public android.app.AlertDialog.Builder setMessage(int p0) { return null; }
        public android.app.AlertDialog.Builder setMessage(java.lang.CharSequence p0) { return null; }
        public android.app.AlertDialog.Builder setIcon(int p0) { return null; }
        public android.app.AlertDialog.Builder setIcon(android.graphics.drawable.Drawable p0) { return null; }
        public android.app.AlertDialog.Builder setIconAttribute(int p0) { return null; }
        public android.app.AlertDialog.Builder setPositiveButton(int p0, android.content.DialogInterface.OnClickListener p1) { return null; }
        public android.app.AlertDialog.Builder setPositiveButton(java.lang.CharSequence p0, android.content.DialogInterface.OnClickListener p1) { return null; }
        public android.app.AlertDialog.Builder setNegativeButton(int p0, android.content.DialogInterface.OnClickListener p1) { return null; }
        public android.app.AlertDialog.Builder setNegativeButton(java.lang.CharSequence p0, android.content.DialogInterface.OnClickListener p1) { return null; }
        public android.app.AlertDialog.Builder setNeutralButton(int p0, android.content.DialogInterface.OnClickListener p1) { return null; }
        public android.app.AlertDialog.Builder setNeutralButton(java.lang.CharSequence p0, android.content.DialogInterface.OnClickListener p1) { return null; }
        public android.app.AlertDialog.Builder setCancelable(boolean p0) { return null; }
        public android.app.AlertDialog.Builder setOnCancelListener(android.content.DialogInterface.OnCancelListener p0) { return null; }
        public android.app.AlertDialog.Builder setOnDismissListener(android.content.DialogInterface.OnDismissListener p0) { return null; }
        public android.app.AlertDialog.Builder setOnKeyListener(android.content.DialogInterface.OnKeyListener p0) { return null; }
        public android.app.AlertDialog.Builder setItems(int p0, android.content.DialogInterface.OnClickListener p1) { return null; }
        public android.app.AlertDialog.Builder setItems(java.lang.CharSequence[] p0, android.content.DialogInterface.OnClickListener p1) { return null; }
        public android.app.AlertDialog.Builder setAdapter(android.widget.ListAdapter p0, android.content.DialogInterface.OnClickListener p1) { return null; }
        public android.app.AlertDialog.Builder setCursor(android.database.Cursor p0, android.content.DialogInterface.OnClickListener p1, java.lang.String p2) { return null; }
        public android.app.AlertDialog.Builder setMultiChoiceItems(int p0, boolean[] p1, android.content.DialogInterface.OnMultiChoiceClickListener p2) { return null; }
        public android.app.AlertDialog.Builder setMultiChoiceItems(java.lang.CharSequence[] p0, boolean[] p1, android.content.DialogInterface.OnMultiChoiceClickListener p2) { return null; }
        public android.app.AlertDialog.Builder setMultiChoiceItems(android.database.Cursor p0, java.lang.String p1, java.lang.String p2, android.content.DialogInterface.OnMultiChoiceClickListener p3) { return null; }
        public android.app.AlertDialog.Builder setSingleChoiceItems(int p0, int p1, android.content.DialogInterface.OnClickListener p2) { return null; }
        public android.app.AlertDialog.Builder setSingleChoiceItems(android.database.Cursor p0, int p1, java.lang.String p2, android.content.DialogInterface.OnClickListener p3) { return null; }
        public android.app.AlertDialog.Builder setSingleChoiceItems(java.lang.CharSequence[] p0, int p1, android.content.DialogInterface.OnClickListener p2) { return null; }
        public android.app.AlertDialog.Builder setSingleChoiceItems(android.widget.ListAdapter p0, int p1, android.content.DialogInterface.OnClickListener p2) { return null; }
        public android.app.AlertDialog.Builder setOnItemSelectedListener(android.widget.AdapterView.OnItemSelectedListener p0) { return null; }
        public android.app.AlertDialog.Builder setView(int p0) { return null; }
        public android.app.AlertDialog.Builder setView(android.view.View p0) { return null; }
        @java.lang.Deprecated
        public android.app.AlertDialog.Builder setView(android.view.View p0, int p1, int p2, int p3, int p4) { return null; }
        @java.lang.Deprecated
        public android.app.AlertDialog.Builder setInverseBackgroundForced(boolean p0) { return null; }
        public android.app.AlertDialog.Builder setRecycleOnMeasureEnabled(boolean p0) { return null; }
        public android.app.AlertDialog create() { return null; }
        public android.app.AlertDialog show() { return null; }
    }
}
