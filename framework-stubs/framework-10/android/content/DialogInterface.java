package android.content;

public interface DialogInterface {
    public static final int BUTTON_POSITIVE = -1;
    public static final int BUTTON_NEGATIVE = -2;
    public static final int BUTTON_NEUTRAL = -3;
    @java.lang.Deprecated
    public static final int BUTTON1 = -1;
    @java.lang.Deprecated
    public static final int BUTTON2 = -2;
    @java.lang.Deprecated
    public static final int BUTTON3 = -3;
    public void cancel();
    public void dismiss();

    public static interface OnShowListener {
        public void onShow(android.content.DialogInterface p0);
    }

    public static interface OnMultiChoiceClickListener {
        public void onClick(android.content.DialogInterface p0, int p1, boolean p2);
    }

    public static interface OnKeyListener {
        public boolean onKey(android.content.DialogInterface p0, int p1, android.view.KeyEvent p2);
    }

    public static interface OnDismissListener {
        public void onDismiss(android.content.DialogInterface p0);
    }

    public static interface OnClickListener {
        public void onClick(android.content.DialogInterface p0, int p1);
    }

    public static interface OnCancelListener {
        public void onCancel(android.content.DialogInterface p0);
    }
}
