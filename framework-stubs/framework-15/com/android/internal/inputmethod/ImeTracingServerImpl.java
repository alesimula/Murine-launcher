package com.android.internal.inputmethod;

class ImeTracingServerImpl extends com.android.internal.inputmethod.ImeTracing {
    ImeTracingServerImpl() { super(); }
    public void addToBuffer(android.util.proto.ProtoOutputStream p0, int p1) {}
    public void triggerClientDump(java.lang.String p0, android.view.inputmethod.InputMethodManager p1, byte[] p2) {}
    public void triggerServiceDump(java.lang.String p0, com.android.internal.inputmethod.ImeTracing.ServiceDumper p1, byte[] p2) {}
    public void triggerManagerServiceDump(java.lang.String p0, com.android.internal.inputmethod.ImeTracing.ServiceDumper p1) {}
    public void startTrace(java.io.PrintWriter p0) {}
    public void stopTrace(java.io.PrintWriter p0) {}
    public void saveForBugreport(java.io.PrintWriter p0) {}
}
