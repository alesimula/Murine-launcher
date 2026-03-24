package com.android.internal.widget.remotecompose.core.operations;

public class TextFromFloat extends com.android.internal.widget.remotecompose.core.Operation implements com.android.internal.widget.remotecompose.core.VariableSupport, com.android.internal.widget.remotecompose.core.serialize.Serializable {
    public int mTextId;
    public float mValue;
    public float mOutValue;
    public short mDigitsBefore;
    public short mDigitsAfter;
    public int mFlags;
    public static final int MAX_STRING_SIZE = 4000;
    char mPre;
    char mAfter;
    public static final int PAD_AFTER_SPACE = 0;
    public static final int PAD_AFTER_NONE = 1;
    public static final int PAD_AFTER_ZERO = 3;
    public static final int PAD_PRE_SPACE = 0;
    public static final int PAD_PRE_NONE = 4;
    public static final int PAD_PRE_ZERO = 12;
    public TextFromFloat(int p0, float p1, short p2, short p3, int p4) { super(); }
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void registerListening(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    @android.annotation.NonNull
    public static java.lang.String name() { return null; }
    public static int id() { return 0; }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, float p2, short p3, short p4, int p5) {}
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    @android.annotation.NonNull
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
}
