package com.android.internal.pm.pkg.component;

public interface ParsedIntentInfo {
    public boolean isHasDefault();
    public int getLabelRes();
    @android.annotation.Nullable
    public java.lang.CharSequence getNonLocalizedLabel();
    public int getIcon();
    @android.annotation.NonNull
    public android.content.IntentFilter getIntentFilter();
}
