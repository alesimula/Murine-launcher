package com.android.internal.globalactions;

public abstract class SinglePressAction implements com.android.internal.globalactions.Action {
    protected SinglePressAction(int p0, int p1) {}
    protected SinglePressAction(int p0, android.graphics.drawable.Drawable p1, java.lang.CharSequence p2) {}
    public boolean isEnabled() { return false; }
    public java.lang.String getStatus() { return null; }
    public abstract void onPress();
    public java.lang.CharSequence getLabelForAccessibility(android.content.Context p0) { return null; }
    public android.view.View create(android.content.Context p0, android.view.View p1, android.view.ViewGroup p2, android.view.LayoutInflater p3) { return null; }
}
