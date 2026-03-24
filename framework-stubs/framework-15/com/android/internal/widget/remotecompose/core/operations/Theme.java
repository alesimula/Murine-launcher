package com.android.internal.widget.remotecompose.core.operations;

public class Theme implements com.android.internal.widget.remotecompose.core.RemoteComposeOperation {
    int mTheme;
    public static final int UNSPECIFIED = -1;
    public static final int DARK = -2;
    public static final int LIGHT = -3;
    public static final com.android.internal.widget.remotecompose.core.operations.Theme.Companion COMPANION = null;
    public Theme(int p0) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    public java.lang.String toString() { return null; }
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public java.lang.String deepToString(java.lang.String p0) { return null; }

    public static class Companion implements com.android.internal.widget.remotecompose.core.CompanionOperation {
        public java.lang.String name() { return null; }
        public int id() { return 0; }
        public void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1) {}
        public void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    }
}
