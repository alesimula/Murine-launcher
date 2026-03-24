package com.android.internal.widget.remotecompose.core.operations;

public class TextData extends com.android.internal.widget.remotecompose.core.Operation implements com.android.internal.widget.remotecompose.core.SerializableToString, com.android.internal.widget.remotecompose.core.serialize.Serializable {
    public final int mTextId = 0;
    @android.annotation.NonNull
    public java.lang.String mText;
    public static final int MAX_STRING_SIZE = 4000;
    public TextData(int p0, java.lang.String p1) { super(); }
    public void update(com.android.internal.widget.remotecompose.core.operations.TextData p0) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    @android.annotation.NonNull
    public static java.lang.String name() { return null; }
    public static int id() { return 0; }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, java.lang.String p2) {}
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    @android.annotation.NonNull
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public void serializeToString(int p0, com.android.internal.widget.remotecompose.core.operations.utilities.StringSerializer p1) {}
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
}
