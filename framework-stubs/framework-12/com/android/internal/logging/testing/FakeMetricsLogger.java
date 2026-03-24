package com.android.internal.logging.testing;

public class FakeMetricsLogger extends com.android.internal.logging.MetricsLogger {
    private java.util.Queue<android.metrics.LogMaker> logs;
    public FakeMetricsLogger() { super(); }
    protected void saveLog(android.metrics.LogMaker p0) {}
    public java.util.Queue<android.metrics.LogMaker> getLogs() { return null; }
    public void reset() {}
}
