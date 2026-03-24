package android.util.imetracing;

class ImeTracingServerImpl extends android.util.imetracing.ImeTracing {
    private static final java.lang.String TRACE_DIRNAME = "/data/misc/wmtrace/";
    private static final java.lang.String TRACE_FILENAME_CLIENTS = "ime_trace_clients.pb";
    private static final java.lang.String TRACE_FILENAME_IMS = "ime_trace_service.pb";
    private static final java.lang.String TRACE_FILENAME_IMMS = "ime_trace_managerservice.pb";
    private static final int BUFFER_CAPACITY = 4194304;
    private static final long MAGIC_NUMBER_CLIENTS_VALUE = 4990904633913462089L;
    private static final long MAGIC_NUMBER_IMS_VALUE = 4990904633914510665L;
    private static final long MAGIC_NUMBER_IMMS_VALUE = 4990904633914117449L;
    private final com.android.internal.util.TraceBuffer mBufferClients = null;
    private final java.io.File mTraceFileClients = null;
    private final com.android.internal.util.TraceBuffer mBufferIms = null;
    private final java.io.File mTraceFileIms = null;
    private final com.android.internal.util.TraceBuffer mBufferImms = null;
    private final java.io.File mTraceFileImms = null;
    private final java.lang.Object mEnabledLock = null;
    ImeTracingServerImpl() throws android.os.ServiceManager.ServiceNotFoundException { super(); }
    public void addToBuffer(android.util.proto.ProtoOutputStream p0, int p1) {}
    public void triggerClientDump(java.lang.String p0, android.view.inputmethod.InputMethodManager p1, android.util.proto.ProtoOutputStream p2) {}
    public void triggerServiceDump(java.lang.String p0, android.inputmethodservice.AbstractInputMethodService p1, android.util.proto.ProtoOutputStream p2) {}
    public void triggerManagerServiceDump(java.lang.String p0) {}
    private void writeTracesToFilesLocked() {}
    public void startTrace(java.io.PrintWriter p0) {}
    public void stopTrace(java.io.PrintWriter p0) {}
    public void saveForBugreport(java.io.PrintWriter p0) {}
    private void resetBuffers() {}
}
