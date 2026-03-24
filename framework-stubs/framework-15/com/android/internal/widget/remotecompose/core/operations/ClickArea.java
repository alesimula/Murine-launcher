package com.android.internal.widget.remotecompose.core.operations;

public class ClickArea implements com.android.internal.widget.remotecompose.core.RemoteComposeOperation {
    int mId;
    int mContentDescription;
    float mLeft;
    float mTop;
    float mRight;
    float mBottom;
    int mMetadata;
    public static final com.android.internal.widget.remotecompose.core.operations.ClickArea.Companion COMPANION = null;
    public ClickArea(int p0, int p1, float p2, float p3, float p4, float p5, int p6) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    public java.lang.String toString() { return null; }
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public java.lang.String deepToString(java.lang.String p0) { return null; }

    public static class Companion implements com.android.internal.widget.remotecompose.core.CompanionOperation {
        public java.lang.String name() { return null; }
        public int id() { return 0; }
        public void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int p2, float p3, float p4, float p5, float p6, int p7) {}
        public void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    }
}
