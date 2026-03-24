package com.android.internal.widget.remotecompose.core.operations.layout.utils;

public class DebugLog {
    public static final boolean DEBUG_LAYOUT_ON = false;
    @android.annotation.NonNull
    public static com.android.internal.widget.remotecompose.core.operations.layout.utils.DebugLog.Node node;
    @android.annotation.NonNull
    public static com.android.internal.widget.remotecompose.core.operations.layout.utils.DebugLog.Node currentNode;
    public DebugLog() {}
    public static void clear() {}
    public static void s(com.android.internal.widget.remotecompose.core.operations.layout.utils.StringValueSupplier p0) {}
    public static void log(com.android.internal.widget.remotecompose.core.operations.layout.utils.StringValueSupplier p0) {}
    public static void e() {}
    public static void e(com.android.internal.widget.remotecompose.core.operations.layout.utils.StringValueSupplier p0) {}
    public static void printNode(int p0, com.android.internal.widget.remotecompose.core.operations.layout.utils.DebugLog.Node p1, java.lang.StringBuilder p2) {}
    public static void display() {}

    public static class LogNode extends com.android.internal.widget.remotecompose.core.operations.layout.utils.DebugLog.Node {
        public LogNode(com.android.internal.widget.remotecompose.core.operations.layout.utils.DebugLog.Node p0, java.lang.String p1) { super(null, null); }
    }

    public static class Node {
        @android.annotation.Nullable
        public com.android.internal.widget.remotecompose.core.operations.layout.utils.DebugLog.Node parent;
        @android.annotation.NonNull
        public java.lang.String name;
        @android.annotation.NonNull
        public java.lang.String endString;
        @android.annotation.NonNull
        public java.util.ArrayList<com.android.internal.widget.remotecompose.core.operations.layout.utils.DebugLog.Node> list;
        public Node(com.android.internal.widget.remotecompose.core.operations.layout.utils.DebugLog.Node p0, java.lang.String p1) {}
        public void add(com.android.internal.widget.remotecompose.core.operations.layout.utils.DebugLog.Node p0) {}
    }
}
