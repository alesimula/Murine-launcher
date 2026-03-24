package com.android.internal.globalactions;

public interface Action {
    public java.lang.CharSequence getLabelForAccessibility(android.content.Context p0);
    public android.view.View create(android.content.Context p0, android.view.View p1, android.view.ViewGroup p2, android.view.LayoutInflater p3);
    public void onPress();
    public boolean showDuringKeyguard();
    public boolean showBeforeProvisioning();
    public boolean isEnabled();
}
