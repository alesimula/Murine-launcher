package com.android.internal.widget.remotecompose.core.operations;

public abstract class DrawBase6 extends com.android.internal.widget.remotecompose.core.PaintOperation implements com.android.internal.widget.remotecompose.core.VariableSupport {
    public static final com.android.internal.widget.remotecompose.core.operations.DrawBase6.Companion COMPANION = null;
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
    public java.lang.String toString() { return null; }

    public static class Companion implements com.android.internal.widget.remotecompose.core.CompanionOperation {
        public final int OP_CODE = 0;
        protected Companion(int p0) {}
        public void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
        public com.android.internal.widget.remotecompose.core.Operation construct(float p0, float p1, float p2, float p3, float p4, float p5) { return null; }
        public java.lang.String name() { return null; }
        public int id() { return 0; }
        public void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, float p1, float p2, float p3, float p4, float p5, float p6) {}
    }
}
