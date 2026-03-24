package com.android.internal.accessibility.dialog;

abstract class TargetAdapter extends android.widget.BaseAdapter {
    TargetAdapter() { super(); }

    static class ViewHolder {
        android.widget.CheckBox mCheckBoxView;
        android.widget.ImageView mIconView;
        android.widget.TextView mLabelView;
        android.widget.TextView mStatusView;
        ViewHolder() {}
    }
}
