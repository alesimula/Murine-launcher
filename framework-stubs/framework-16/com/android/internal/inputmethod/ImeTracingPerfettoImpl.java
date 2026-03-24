package com.android.internal.inputmethod;

final class ImeTracingPerfettoImpl extends com.android.internal.inputmethod.ImeTracing {
    ImeTracingPerfettoImpl() { super(); }
    public void triggerClientDump(java.lang.String p0, android.view.inputmethod.InputMethodManager p1, byte[] p2) {}
    public void triggerServiceDump(java.lang.String p0, com.android.internal.inputmethod.ImeTracing.ServiceDumper p1, byte[] p2) {}
    public void triggerManagerServiceDump(java.lang.String p0, com.android.internal.inputmethod.ImeTracing.ServiceDumper p1) {}
    public boolean isEnabled() { return false; }
    public void startTrace(java.io.PrintWriter p0) {}
    public void stopTrace(java.io.PrintWriter p0) {}
    public void addToBuffer(android.util.proto.ProtoOutputStream p0, int p1) {}
}
