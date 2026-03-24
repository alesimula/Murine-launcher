package com.android.internal.widget.remotecompose.core.serialize;

public interface MapSerializer {
    public com.android.internal.widget.remotecompose.core.serialize.MapSerializer addType(java.lang.String p0);
    public com.android.internal.widget.remotecompose.core.serialize.MapSerializer addFloatExpressionSrc(java.lang.String p0, float[] p1);
    public com.android.internal.widget.remotecompose.core.serialize.MapSerializer addIntExpressionSrc(java.lang.String p0, int[] p1, int p2);
    public com.android.internal.widget.remotecompose.core.serialize.MapSerializer addPath(java.lang.String p0, float[] p1);
    public com.android.internal.widget.remotecompose.core.serialize.MapSerializer addTags(com.android.internal.widget.remotecompose.core.serialize.SerializeTags... p0);
    public <T extends java.lang.Object> com.android.internal.widget.remotecompose.core.serialize.MapSerializer add(java.lang.String p0, java.util.List<T> p1);
    public <T extends java.lang.Object> com.android.internal.widget.remotecompose.core.serialize.MapSerializer add(java.lang.String p0, java.util.Map<java.lang.String, T> p1);
    public com.android.internal.widget.remotecompose.core.serialize.MapSerializer add(java.lang.String p0, com.android.internal.widget.remotecompose.core.serialize.Serializable p1);
    public com.android.internal.widget.remotecompose.core.serialize.MapSerializer add(java.lang.String p0, java.lang.String p1);
    public com.android.internal.widget.remotecompose.core.serialize.MapSerializer add(java.lang.String p0, float p1, float p2, float p3, float p4);
    public com.android.internal.widget.remotecompose.core.serialize.MapSerializer add(java.lang.String p0, float p1, float p2);
    public com.android.internal.widget.remotecompose.core.serialize.MapSerializer add(java.lang.String p0, java.lang.Byte p1);
    public com.android.internal.widget.remotecompose.core.serialize.MapSerializer add(java.lang.String p0, java.lang.Short p1);
    public com.android.internal.widget.remotecompose.core.serialize.MapSerializer add(java.lang.String p0, java.lang.Integer p1);
    public com.android.internal.widget.remotecompose.core.serialize.MapSerializer add(java.lang.String p0, java.lang.Long p1);
    public com.android.internal.widget.remotecompose.core.serialize.MapSerializer add(java.lang.String p0, java.lang.Float p1);
    public com.android.internal.widget.remotecompose.core.serialize.MapSerializer add(java.lang.String p0, java.lang.Double p1);
    public com.android.internal.widget.remotecompose.core.serialize.MapSerializer add(java.lang.String p0, java.lang.Boolean p1);
    public <T extends java.lang.Enum<T>> com.android.internal.widget.remotecompose.core.serialize.MapSerializer add(java.lang.String p0, java.lang.Enum<T> p1);
    public static java.util.LinkedHashMap<java.lang.String, java.lang.Object> orderedOf(java.lang.Object... p0) { return null; }
}
