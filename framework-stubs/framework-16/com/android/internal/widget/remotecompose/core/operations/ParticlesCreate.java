package com.android.internal.widget.remotecompose.core.operations;

public class ParticlesCreate extends com.android.internal.widget.remotecompose.core.PaintOperation implements com.android.internal.widget.remotecompose.core.VariableSupport {
    @android.annotation.NonNull
    com.android.internal.widget.remotecompose.core.operations.utilities.AnimatedFloatExpression mExp;
    public ParticlesCreate(int p0, int[] p1, float[][] p2, int p3) { super(); }
    public void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void registerListening(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int[] p2, float[][] p3, int p4) {}
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    @android.annotation.NonNull
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public void paint(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    void initializeParticle(int p0) {}
    public float[][] getParticles() { return null; }
    public int[] getVariableIds() { return null; }
    public float[][] getEquations() { return null; }
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
}
