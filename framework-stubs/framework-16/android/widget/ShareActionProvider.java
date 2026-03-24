package android.widget;

public class ShareActionProvider extends android.view.ActionProvider {
    public static final java.lang.String DEFAULT_SHARE_HISTORY_FILE_NAME = "share_history.xml";
    public ShareActionProvider(android.content.Context p0) { super(null); }
    public void setOnShareTargetSelectedListener(android.widget.ShareActionProvider.OnShareTargetSelectedListener p0) {}
    public android.view.View onCreateActionView() { return null; }
    public boolean hasSubMenu() { return false; }
    public void onPrepareSubMenu(android.view.SubMenu p0) {}
    public void setShareHistoryFileName(java.lang.String p0) {}
    public void setShareIntent(android.content.Intent p0) {}

    public static interface OnShareTargetSelectedListener {
        public boolean onShareTargetSelected(android.widget.ShareActionProvider p0, android.content.Intent p1);
    }

    private class ShareActivityChooserModelPolicy implements android.widget.ActivityChooserModel.OnChooseActivityListener {
        public boolean onChooseActivity(android.widget.ActivityChooserModel p0, android.content.Intent p1) { return false; }
    }

    private class ShareMenuItemOnMenuItemClickListener implements android.view.MenuItem.OnMenuItemClickListener {
        public boolean onMenuItemClick(android.view.MenuItem p0) { return false; }
    }
}
