package com.android.internal.widget.remotecompose.core.operations;

public class RootContentBehavior extends com.android.internal.widget.remotecompose.core.Operation implements com.android.internal.widget.remotecompose.core.RemoteComposeOperation, com.android.internal.widget.remotecompose.core.semantics.ScrollableComponent {
    int mScroll;
    int mSizing;
    int mAlignment;
    int mMode;
    protected static final java.lang.String TAG = "RootContentBehavior";
    public static final int NONE = 0;
    public static final int SCROLL_HORIZONTAL = 1;
    public static final int SCROLL_VERTICAL = 2;
    public static final int SIZING_LAYOUT = 1;
    public static final int SIZING_SCALE = 2;
    public static final int ALIGNMENT_TOP = 1;
    public static final int ALIGNMENT_VERTICAL_CENTER = 2;
    public static final int ALIGNMENT_BOTTOM = 4;
    public static final int ALIGNMENT_START = 16;
    public static final int ALIGNMENT_HORIZONTAL_CENTER = 32;
    public static final int ALIGNMENT_END = 64;
    public static final int ALIGNMENT_CENTER = 34;
    public static final int LAYOUT_HORIZONTAL_MATCH_PARENT = 1;
    public static final int LAYOUT_HORIZONTAL_WRAP_CONTENT = 2;
    public static final int LAYOUT_HORIZONTAL_FIXED = 4;
    public static final int LAYOUT_VERTICAL_MATCH_PARENT = 8;
    public static final int LAYOUT_VERTICAL_WRAP_CONTENT = 16;
    public static final int LAYOUT_VERTICAL_FIXED = 32;
    public static final int LAYOUT_MATCH_PARENT = 9;
    public static final int LAYOUT_WRAP_CONTENT = 18;
    public static final int SCALE_INSIDE = 1;
    public static final int SCALE_FILL_WIDTH = 2;
    public static final int SCALE_FILL_HEIGHT = 3;
    public static final int SCALE_FIT = 4;
    public static final int SCALE_CROP = 5;
    public static final int SCALE_FILL_BOUNDS = 6;
    public RootContentBehavior(int p0, int p1, int p2, int p3) { super(); }
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    @android.annotation.NonNull
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    @android.annotation.NonNull
    public static java.lang.String name() { return null; }
    public static int id() { return 0; }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int p2, int p3, int p4) {}
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public boolean isInterestingForSemantics() { return false; }
    public boolean supportsScrollByOffset() { return false; }
    public int scrollByOffset(com.android.internal.widget.remotecompose.core.RemoteContext p0, int p1) { return 0; }
    public int scrollDirection() { return 0; }
}
