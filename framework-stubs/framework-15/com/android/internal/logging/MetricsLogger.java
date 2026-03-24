package com.android.internal.logging;

public class MetricsLogger {
    public static final int VIEW_UNKNOWN = 0;
    public static final int LOGTAG = 524292;
    public MetricsLogger() {}
    protected void saveLog(android.metrics.LogMaker p0) {}
    public void write(android.metrics.LogMaker p0) {}
    public void count(java.lang.String p0, int p1) {}
    public void histogram(java.lang.String p0, int p1) {}
    public void visible(int p0) throws java.lang.IllegalArgumentException {}
    public void hidden(int p0) throws java.lang.IllegalArgumentException {}
    public void visibility(int p0, boolean p1) throws java.lang.IllegalArgumentException {}
    public void visibility(int p0, int p1) throws java.lang.IllegalArgumentException {}
    public void action(int p0) {}
    public void action(int p0, int p1) {}
    public void action(int p0, boolean p1) {}
    public void action(int p0, java.lang.String p1) {}
    @java.lang.Deprecated
    public static void visible(android.content.Context p0, int p1) throws java.lang.IllegalArgumentException {}
    @java.lang.Deprecated
    public static void hidden(android.content.Context p0, int p1) throws java.lang.IllegalArgumentException {}
    @java.lang.Deprecated
    public static void visibility(android.content.Context p0, int p1, boolean p2) throws java.lang.IllegalArgumentException {}
    @java.lang.Deprecated
    public static void visibility(android.content.Context p0, int p1, int p2) throws java.lang.IllegalArgumentException {}
    @java.lang.Deprecated
    public static void action(android.content.Context p0, int p1) {}
    @java.lang.Deprecated
    public static void action(android.content.Context p0, int p1, int p2) {}
    @java.lang.Deprecated
    public static void action(android.content.Context p0, int p1, boolean p2) {}
    @java.lang.Deprecated
    public static void action(android.metrics.LogMaker p0) {}
    @java.lang.Deprecated
    public static void action(android.content.Context p0, int p1, java.lang.String p2) {}
    @java.lang.Deprecated
    public static void count(android.content.Context p0, java.lang.String p1, int p2) {}
    @java.lang.Deprecated
    public static void histogram(android.content.Context p0, java.lang.String p1, int p2) {}
}
