package android.view;

public abstract class ActionProvider {
    public ActionProvider(android.content.Context p0) {}
    @java.lang.Deprecated
    @android.annotation.NonNull
    public abstract android.view.View onCreateActionView();
    @android.annotation.NonNull
    public android.view.View onCreateActionView(android.view.MenuItem p0) { return null; }
    public boolean overridesItemVisibility() { return false; }
    public boolean isVisible() { return false; }
    public void refreshVisibility() {}
    public boolean onPerformDefaultAction() { return false; }
    public boolean hasSubMenu() { return false; }
    public void onPrepareSubMenu(android.view.SubMenu p0) {}
    public void subUiVisibilityChanged(boolean p0) {}
    public void setSubUiVisibilityListener(android.view.ActionProvider.SubUiVisibilityListener p0) {}
    public void setVisibilityListener(android.view.ActionProvider.VisibilityListener p0) {}
    public void reset() {}

    public static interface SubUiVisibilityListener {
        public void onSubUiVisibilityChanged(boolean p0);
    }

    public static interface VisibilityListener {
        public void onActionProviderVisibilityChanged(boolean p0);
    }
}
