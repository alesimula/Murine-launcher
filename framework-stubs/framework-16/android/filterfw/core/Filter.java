package android.filterfw.core;

public abstract class Filter {
    static final int STATUS_PREINIT = 0;
    static final int STATUS_UNPREPARED = 1;
    static final int STATUS_PREPARED = 2;
    static final int STATUS_PROCESSING = 3;
    static final int STATUS_SLEEPING = 4;
    static final int STATUS_FINISHED = 5;
    static final int STATUS_ERROR = 6;
    static final int STATUS_RELEASED = 7;
    public Filter(java.lang.String p0) {}
    public static final boolean isAvailable(java.lang.String p0) { return false; }
    public final void initWithValueMap(android.filterfw.core.KeyValueMap p0) {}
    public final void initWithAssignmentString(java.lang.String p0) {}
    public final void initWithAssignmentList(java.lang.Object... p0) {}
    public final void init() throws android.filterfw.core.ProtocolException {}
    public java.lang.String getFilterClassName() { return null; }
    public final java.lang.String getName() { return null; }
    public boolean isOpen() { return false; }
    public void setInputFrame(java.lang.String p0, android.filterfw.core.Frame p1) {}
    public final void setInputValue(java.lang.String p0, java.lang.Object p1) {}
    protected void prepare(android.filterfw.core.FilterContext p0) {}
    protected void parametersUpdated(java.util.Set<java.lang.String> p0) {}
    protected void delayNextProcess(int p0) {}
    public abstract void setupPorts();
    public android.filterfw.core.FrameFormat getOutputFormat(java.lang.String p0, android.filterfw.core.FrameFormat p1) { return null; }
    public final android.filterfw.core.FrameFormat getInputFormat(java.lang.String p0) { return null; }
    public void open(android.filterfw.core.FilterContext p0) {}
    public abstract void process(android.filterfw.core.FilterContext p0);
    public final int getSleepDelay() { return 0; }
    public void close(android.filterfw.core.FilterContext p0) {}
    public void tearDown(android.filterfw.core.FilterContext p0) {}
    public final int getNumberOfConnectedInputs() { return 0; }
    public final int getNumberOfConnectedOutputs() { return 0; }
    public final int getNumberOfInputs() { return 0; }
    public final int getNumberOfOutputs() { return 0; }
    public final android.filterfw.core.InputPort getInputPort(java.lang.String p0) { return null; }
    public final android.filterfw.core.OutputPort getOutputPort(java.lang.String p0) { return null; }
    protected final void pushOutput(java.lang.String p0, android.filterfw.core.Frame p1) {}
    protected final android.filterfw.core.Frame pullInput(java.lang.String p0) { return null; }
    public void fieldPortValueUpdated(java.lang.String p0, android.filterfw.core.FilterContext p1) {}
    protected void transferInputPortFrame(java.lang.String p0, android.filterfw.core.FilterContext p1) {}
    protected void initProgramInputs(android.filterfw.core.Program p0, android.filterfw.core.FilterContext p1) {}
    protected void addInputPort(java.lang.String p0) {}
    protected void addMaskedInputPort(java.lang.String p0, android.filterfw.core.FrameFormat p1) {}
    protected void addOutputPort(java.lang.String p0, android.filterfw.core.FrameFormat p1) {}
    protected void addOutputBasedOnInput(java.lang.String p0, java.lang.String p1) {}
    protected void addFieldPort(java.lang.String p0, java.lang.reflect.Field p1, boolean p2, boolean p3) {}
    protected void addProgramPort(java.lang.String p0, java.lang.String p1, java.lang.reflect.Field p2, java.lang.Class p3, boolean p4) {}
    protected void closeOutputPort(java.lang.String p0) {}
    protected void setWaitsOnInputPort(java.lang.String p0, boolean p1) {}
    protected void setWaitsOnOutputPort(java.lang.String p0, boolean p1) {}
    public java.lang.String toString() { return null; }
    final java.util.Collection<android.filterfw.core.InputPort> getInputPorts() { return null; }
    final java.util.Collection<android.filterfw.core.OutputPort> getOutputPorts() { return null; }
    final synchronized int getStatus() { return 0; }
    final synchronized void unsetStatus(int p0) {}
    final synchronized void performOpen(android.filterfw.core.FilterContext p0) {}
    final synchronized void performProcess(android.filterfw.core.FilterContext p0) {}
    final synchronized void performClose(android.filterfw.core.FilterContext p0) {}
    final synchronized void performTearDown(android.filterfw.core.FilterContext p0) {}
    final synchronized boolean canProcess() { return false; }
    final void openOutputs() {}
    final void clearInputs() {}
    final void clearOutputs() {}
    final void notifyFieldPortValueUpdated(java.lang.String p0, android.filterfw.core.FilterContext p1) {}
    final synchronized void pushInputFrame(java.lang.String p0, android.filterfw.core.Frame p1) {}
    final synchronized void pushInputValue(java.lang.String p0, java.lang.Object p1) {}
}
