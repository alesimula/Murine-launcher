package android.util.imetracing;

class ImeTracingClientImpl extends android.util.imetracing.ImeTracing {
    ImeTracingClientImpl() throws android.os.ServiceManager.ServiceNotFoundException, android.os.RemoteException { super(); }
    public void addToBuffer(android.util.proto.ProtoOutputStream p0, int p1) {}
    public void triggerClientDump(java.lang.String p0, android.view.inputmethod.InputMethodManager p1, android.util.proto.ProtoOutputStream p2) {}
    public void triggerServiceDump(java.lang.String p0, android.inputmethodservice.AbstractInputMethodService p1, android.util.proto.ProtoOutputStream p2) {}
    public void triggerManagerServiceDump(java.lang.String p0) {}
    public void startTrace(java.io.PrintWriter p0) {}
    public void stopTrace(java.io.PrintWriter p0) {}
}
