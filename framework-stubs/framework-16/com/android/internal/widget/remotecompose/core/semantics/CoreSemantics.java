package com.android.internal.widget.remotecompose.core.semantics;

public class CoreSemantics extends com.android.internal.widget.remotecompose.core.Operation implements com.android.internal.widget.remotecompose.core.semantics.AccessibilityModifier {
    public int mContentDescriptionId;
    @android.annotation.Nullable
    public com.android.internal.widget.remotecompose.core.semantics.AccessibleComponent.Role mRole;
    public int mTextId;
    public int mStateDescriptionId;
    public boolean mEnabled;
    public com.android.internal.widget.remotecompose.core.semantics.AccessibleComponent.Mode mMode;
    public boolean mClickable;
    public CoreSemantics() { super(); }
    public int getOpCode() { return 0; }
    @android.annotation.Nullable
    public com.android.internal.widget.remotecompose.core.semantics.AccessibleComponent.Role getRole() { return null; }
    public com.android.internal.widget.remotecompose.core.semantics.AccessibleComponent.Mode getMode() { return null; }
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    @android.annotation.Nullable
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public void serializeToString(int p0, com.android.internal.widget.remotecompose.core.operations.utilities.StringSerializer p1) {}
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public java.lang.Integer getContentDescriptionId() { return null; }
    @android.annotation.Nullable
    public java.lang.Integer getStateDescriptionId() { return null; }
    @android.annotation.Nullable
    public java.lang.Integer getTextId() { return null; }
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
}
