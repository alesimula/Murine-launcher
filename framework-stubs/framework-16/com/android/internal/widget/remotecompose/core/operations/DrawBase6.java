package com.android.internal.widget.remotecompose.core.operations;

public abstract class DrawBase6 extends com.android.internal.widget.remotecompose.core.PaintOperation implements com.android.internal.widget.remotecompose.core.VariableSupport, com.android.internal.widget.remotecompose.core.serialize.Serializable {
    @android.annotation.NonNull
    protected java.lang.String mName;
    float mV1;
    float mV2;
    float mV3;
    float mV4;
    float mV5;
    float mV6;
    float mValue1;
    float mValue2;
    float mValue3;
    float mValue4;
    float mValue5;
    float mValue6;
    public DrawBase6(float p0, float p1, float p2, float p3, float p4, float p5) { super(); }
    public void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void registerListening(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    protected abstract void write(com.android.internal.widget.remotecompose.core.WireBuffer p0, float p1, float p2, float p3, float p4, float p5, float p6);
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public static void read(com.android.internal.widget.remotecompose.core.operations.DrawBase6.Maker p0, com.android.internal.widget.remotecompose.core.WireBuffer p1, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p2) {}
    @android.annotation.Nullable
    public com.android.internal.widget.remotecompose.core.Operation construct(float p0, float p1, float p2, float p3, float p4, float p5) { return null; }
    @android.annotation.NonNull
    public static java.lang.String name() { return null; }
    protected com.android.internal.widget.remotecompose.core.serialize.MapSerializer serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, java.lang.String p6) { return null; }

    static interface Maker {
        public com.android.internal.widget.remotecompose.core.operations.DrawBase6 create(float p0, float p1, float p2, float p3, float p4, float p5);
    }
}
