package com.android.internal.widget.remotecompose.core.operations.layout.modifiers;

public abstract class DimensionInModifierOperation extends com.android.internal.widget.remotecompose.core.Operation implements com.android.internal.widget.remotecompose.core.operations.layout.modifiers.ModifierOperation, com.android.internal.widget.remotecompose.core.VariableSupport {
    int mOpCode;
    float mV1;
    float mV2;
    float mValue1;
    float mValue2;
    public DimensionInModifierOperation(int p0, float p1, float p2) { super(); }
    public void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void registerListening(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    @android.annotation.NonNull
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public float getMin() { return 0.0f; }
    public float getMax() { return 0.0f; }
    public void serializeToString(int p0, com.android.internal.widget.remotecompose.core.operations.utilities.StringSerializer p1) {}
}
