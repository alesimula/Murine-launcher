package android.view;

public class MenuInflater {
    public MenuInflater(android.content.Context p0) {}
    public MenuInflater(android.content.Context p0, java.lang.Object p1) {}
    public void inflate(int p0, android.view.Menu p1) {}
    android.content.Context getContext() { return null; }

    private static class InflatedOnMenuItemClickListener implements android.view.MenuItem.OnMenuItemClickListener {
        public InflatedOnMenuItemClickListener(java.lang.Object p0, java.lang.String p1) {}
        public boolean onMenuItemClick(android.view.MenuItem p0) { return false; }
    }

    private class MenuState {
        public MenuState(android.view.MenuInflater p0, android.view.Menu p1) {}
        public void resetGroup() {}
        public void readGroup(android.util.AttributeSet p0) {}
        public void readItem(android.util.AttributeSet p0) {}
        public android.view.MenuItem addItem() { return null; }
        public android.view.SubMenu addSubMenuItem() { return null; }
        public boolean hasAddedItem() { return false; }
    }
}
