package com.android.internal.widget.remotecompose.core.operations.layout.modifiers;

public abstract class DimensionModifierOperation extends com.android.internal.widget.remotecompose.core.Operation implements com.android.internal.widget.remotecompose.core.operations.layout.modifiers.ModifierOperation, com.android.internal.widget.remotecompose.core.VariableSupport {
    @android.annotation.NonNull
    com.android.internal.widget.remotecompose.core.operations.layout.modifiers.DimensionModifierOperation.Type mType;
    float mValue;
    float mOutValue;
    public DimensionModifierOperation(com.android.internal.widget.remotecompose.core.operations.layout.modifiers.DimensionModifierOperation.Type p0, float p1) { super(); }
    public DimensionModifierOperation(com.android.internal.widget.remotecompose.core.operations.layout.modifiers.DimensionModifierOperation.Type p0) { super(); }
    public DimensionModifierOperation(float p0) { super(); }
    public void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void registerListening(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public boolean hasWeight() { return false; }
    public boolean isWrap() { return false; }
    public boolean isFill() { return false; }
    public boolean isIntrinsicMin() { return false; }
    public boolean isIntrinsicMax() { return false; }
    @android.annotation.NonNull
    public com.android.internal.widget.remotecompose.core.operations.layout.modifiers.DimensionModifierOperation.Type getType() { return null; }
    public float getValue() { return 0.0f; }
    public void setValue(float p0) {}
    @android.annotation.NonNull
    public java.lang.String serializedName() { return null; }
    public void serializeToString(int p0, com.android.internal.widget.remotecompose.core.operations.utilities.StringSerializer p1) {}
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    @android.annotation.NonNull
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }

    public static enum Type {
        EXACT,
        FILL,
        WRAP,
        WEIGHT,
        INTRINSIC_MIN,
        INTRINSIC_MAX,
        EXACT_DP;
        @android.annotation.NonNull
        static com.android.internal.widget.remotecompose.core.operations.layout.modifiers.DimensionModifierOperation.Type fromInt(int p0) { return null; }
    }
}
