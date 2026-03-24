package android.app;

public class SearchDialog extends android.app.Dialog {
    static int resolveDialogTheme(android.content.Context p0) { return 0; }
    public SearchDialog(android.content.Context p0, android.app.SearchManager p1) { super((android.content.Context)null); }
    protected void onCreate(android.os.Bundle p0) {}
    public boolean show(java.lang.String p0, boolean p1, android.content.ComponentName p2, android.os.Bundle p3) { return false; }
    public void onStart() {}
    public void onStop() {}
    public void setWorking(boolean p0) {}
    public android.os.Bundle onSaveInstanceState() { return null; }
    public void onRestoreInstanceState(android.os.Bundle p0) {}
    public void onConfigurationChanged() {}
    static boolean isLandscapeMode(android.content.Context p0) { return false; }
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public void hide() {}
    public void launchQuerySearch() {}
    protected void launchQuerySearch(int p0, java.lang.String p1) {}
    public void setListSelection(int p0) {}
    public void onBackPressed() {}

    public static class SearchBar extends android.widget.LinearLayout {
        public SearchBar(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
        public SearchBar(android.content.Context p0) { super((android.content.Context)null); }
        public android.view.ActionMode startActionModeForChild(android.view.View p0, android.view.ActionMode.Callback p1, int p2) { return null; }
    }
}
