package com.android.internal.app;

public class ChooserTargetActionsDialogFragment extends android.app.DialogFragment implements android.content.DialogInterface.OnClickListener {
    protected java.util.ArrayList<com.android.internal.app.chooser.DisplayResolveInfo> mTargetInfos;
    protected android.os.UserHandle mUserHandle;
    protected java.lang.String mShortcutId;
    protected java.lang.String mShortcutTitle;
    protected boolean mIsShortcutPinned;
    protected android.content.IntentFilter mIntentFilter;
    public static final java.lang.String USER_HANDLE_KEY = "user_handle";
    public static final java.lang.String TARGET_INFOS_KEY = "target_infos";
    public static final java.lang.String SHORTCUT_ID_KEY = "shortcut_id";
    public static final java.lang.String SHORTCUT_TITLE_KEY = "shortcut_title";
    public static final java.lang.String IS_SHORTCUT_PINNED_KEY = "is_shortcut_pinned";
    public static final java.lang.String INTENT_FILTER_KEY = "intent_filter";
    public ChooserTargetActionsDialogFragment() { super(); }
    public void onCreate(android.os.Bundle p0) {}
    void setStateFromBundle(android.os.Bundle p0) {}
    public void onSaveInstanceState(android.os.Bundle p0) {}
    public android.view.View onCreateView(android.view.LayoutInflater p0, android.view.ViewGroup p1, android.os.Bundle p2) { return null; }
    public void onClick(android.content.DialogInterface p0, int p1) {}
    protected java.lang.CharSequence getItemLabel(com.android.internal.app.chooser.DisplayResolveInfo p0) { return null; }
    protected android.graphics.drawable.Drawable getItemIcon(com.android.internal.app.chooser.DisplayResolveInfo p0) { return null; }

    class VH extends com.android.internal.widget.RecyclerView.ViewHolder {
        android.widget.TextView mLabel;
        android.widget.ImageView mIcon;
        VH(com.android.internal.app.ChooserTargetActionsDialogFragment p0, android.view.View p1) { super(null); }
        public void bind(android.util.Pair<android.graphics.drawable.Drawable, java.lang.CharSequence> p0, int p1) {}
    }

    class VHAdapter extends com.android.internal.widget.RecyclerView.Adapter<com.android.internal.app.ChooserTargetActionsDialogFragment.VH> {
        java.util.List<android.util.Pair<android.graphics.drawable.Drawable, java.lang.CharSequence>> mItems;
        VHAdapter(java.util.List<android.util.Pair<android.graphics.drawable.Drawable, java.lang.CharSequence>> p0) { super(); }
        public com.android.internal.app.ChooserTargetActionsDialogFragment.VH onCreateViewHolder(android.view.ViewGroup p0, int p1) { return null; }
        public void onBindViewHolder(com.android.internal.app.ChooserTargetActionsDialogFragment.VH p0, int p1) {}
        public int getItemCount() { return 0; }
    }
}
