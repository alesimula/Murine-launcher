package com.android.internal.globalactions;

public abstract class ToggleAction implements com.android.internal.globalactions.Action {
    protected com.android.internal.globalactions.ToggleAction.State mState;
    protected int mEnabledIconResId;
    protected int mDisabledIconResid;
    protected int mMessageResId;
    protected int mEnabledStatusMessageResId;
    protected int mDisabledStatusMessageResId;
    public ToggleAction(int p0, int p1, int p2, int p3, int p4) {}
    void willCreate() {}
    public java.lang.CharSequence getLabelForAccessibility(android.content.Context p0) { return null; }
    public android.view.View create(android.content.Context p0, android.view.View p1, android.view.ViewGroup p2, android.view.LayoutInflater p3) { return null; }
    public final void onPress() {}
    public boolean isEnabled() { return false; }
    protected void changeStateFromPress(boolean p0) {}
    public abstract void onToggle(boolean p0);
    public void updateState(com.android.internal.globalactions.ToggleAction.State p0) {}

    public static enum State {
        Off,
        TurningOn,
        TurningOff,
        On;
        public boolean inTransition() { return false; }
    }
}
