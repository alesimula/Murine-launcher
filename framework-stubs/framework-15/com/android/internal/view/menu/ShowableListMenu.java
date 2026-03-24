package com.android.internal.view.menu;

public interface ShowableListMenu {
    public void show();
    public void dismiss();
    public boolean isShowing();
    public android.widget.ListView getListView();
}
