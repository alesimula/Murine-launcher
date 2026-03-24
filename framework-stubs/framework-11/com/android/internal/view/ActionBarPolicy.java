package com.android.internal.view;

public class ActionBarPolicy {
    private android.content.Context mContext;
    public static com.android.internal.view.ActionBarPolicy get(android.content.Context p0) { return null; }
    private ActionBarPolicy(android.content.Context p0) {}
    public int getMaxActionButtons() { return 0; }
    public boolean showsOverflowMenuButton() { return false; }
    public int getEmbeddedMenuWidthLimit() { return 0; }
    public boolean hasEmbeddedTabs() { return false; }
    public int getTabContainerHeight() { return 0; }
    public boolean enableHomeButtonByDefault() { return false; }
    public int getStackedTabMaxWidth() { return 0; }
}
