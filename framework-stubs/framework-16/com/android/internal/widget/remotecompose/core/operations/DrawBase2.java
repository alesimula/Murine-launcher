package com.android.internal.widget.remotecompose.core.operations;

public abstract class DrawBase2 extends com.android.internal.widget.remotecompose.core.PaintOperation implements com.android.internal.widget.remotecompose.core.VariableSupport, com.android.internal.widget.remotecompose.core.serialize.Serializable {
    @android.annotation.NonNull
    protected java.lang.String mName;
    float mV1;
    float mV2;
    float mValue1;
    float mValue2;
    public DrawBase2(float p0, float p1) { super(); }
    public void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void registerListening(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    protected abstract void write(com.android.internal.widget.remotecompose.core.WireBuffer p0, float p1, float p2);
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public static void read(com.android.internal.widget.remotecompose.core.operations.DrawBase2.Maker p0, com.android.internal.widget.remotecompose.core.WireBuffer p1, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p2) {}
    @android.annotation.Nullable
    public com.android.internal.widget.remotecompose.core.Operation construct(float p0, float p1) { return null; }
    protected static void write(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, float p2, float p3) {}
    protected com.android.internal.widget.remotecompose.core.serialize.MapSerializer serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0, java.lang.String p1, java.lang.String p2) { return null; }

    protected static interface Maker {
        public com.android.internal.widget.remotecompose.core.operations.DrawBase2 create(float p0, float p1);
    }
}
