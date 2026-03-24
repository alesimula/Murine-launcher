package android.service.controls.actions;

public final class BooleanAction extends android.service.controls.actions.ControlAction {
    private static final int TYPE = 1;
    private static final java.lang.String KEY_NEW_STATE = "key_new_state";
    private final boolean mNewState = false;
    public BooleanAction(java.lang.String p0, boolean p1) { super((android.os.Bundle)null); }
    public BooleanAction(java.lang.String p0, boolean p1, java.lang.String p2) { super((android.os.Bundle)null); }
    BooleanAction(android.os.Bundle p0) { super((android.os.Bundle)null); }
    public boolean getNewState() { return false; }
    public int getActionType() { return 0; }
    android.os.Bundle getDataBundle() { return null; }
}
