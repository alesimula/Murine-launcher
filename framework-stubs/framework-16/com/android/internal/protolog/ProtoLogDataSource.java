package com.android.internal.protolog;

public class ProtoLogDataSource extends android.tracing.perfetto.DataSource<com.android.internal.protolog.ProtoLogDataSource.Instance, com.android.internal.protolog.ProtoLogDataSource.TlsState, com.android.internal.protolog.ProtoLogDataSource.IncrementalState> {
    public ProtoLogDataSource() { super(null); }
    public ProtoLogDataSource(java.lang.String p0) { super(null); }
    @android.annotation.NonNull
    public com.android.internal.protolog.ProtoLogDataSource.Instance createInstance(android.util.proto.ProtoInputStream p0, int p1) { return null; }
    @android.annotation.NonNull
    public com.android.internal.protolog.ProtoLogDataSource.TlsState createTlsState(android.tracing.perfetto.CreateTlsStateArgs<com.android.internal.protolog.ProtoLogDataSource.Instance> p0) { return null; }
    @android.annotation.NonNull
    public com.android.internal.protolog.ProtoLogDataSource.IncrementalState createIncrementalState(android.tracing.perfetto.CreateIncrementalStateArgs<com.android.internal.protolog.ProtoLogDataSource.Instance> p0) { return null; }
    public synchronized void registerOnStartCallback(com.android.internal.protolog.ProtoLogDataSource.Instance.TracingInstanceStartCallback p0) {}
    public void registerOnFlushCallback(com.android.internal.protolog.ProtoLogDataSource.Instance.TracingFlushCallback p0) {}
    public void registerOnStopCallback(com.android.internal.protolog.ProtoLogDataSource.Instance.TracingInstanceStopCallback p0) {}
    public void unregisterOnStartCallback(com.android.internal.protolog.ProtoLogDataSource.Instance.TracingInstanceStartCallback p0) {}
    public void unregisterOnFlushCallback(com.android.internal.protolog.ProtoLogDataSource.Instance.TracingFlushCallback p0) {}
    public void unregisterOnStopCallback(com.android.internal.protolog.ProtoLogDataSource.Instance.TracingInstanceStopCallback p0) {}

    public static class GroupConfig {
        public final com.android.internal.protolog.common.LogLevel logFrom = null;
        public final boolean collectStackTrace = false;
        public GroupConfig(com.android.internal.protolog.common.LogLevel p0, boolean p1) {}
    }

    public static class IncrementalState {
        public final java.util.Set<java.lang.Integer> protologGroupInterningSet = null;
        public final java.util.Set<java.lang.Long> protologMessageInterningSet = null;
        public final java.util.Map<java.lang.String, java.lang.Integer> argumentInterningMap = null;
        public final java.util.Map<java.lang.String, java.lang.Integer> stacktraceInterningMap = null;
        public boolean clearReported;
        public IncrementalState() {}
    }

    public static class Instance extends android.tracing.perfetto.DataSourceInstance {
        public Instance(android.tracing.perfetto.DataSource<com.android.internal.protolog.ProtoLogDataSource.Instance, com.android.internal.protolog.ProtoLogDataSource.TlsState, com.android.internal.protolog.ProtoLogDataSource.IncrementalState> p0, int p1, com.android.internal.protolog.ProtoLogDataSource.ProtoLogConfig p2, com.android.internal.protolog.ProtoLogDataSource.Instance.TracingInstanceStartCallback p3, com.android.internal.protolog.ProtoLogDataSource.Instance.TracingFlushCallback p4, com.android.internal.protolog.ProtoLogDataSource.Instance.TracingInstanceStopCallback p5) { super(null, 0); }
        public void onStart(android.tracing.perfetto.StartCallbackArguments p0) {}
        public void onFlush(android.tracing.perfetto.FlushCallbackArguments p0) {}
        public void onStop(android.tracing.perfetto.StopCallbackArguments p0) {}

        @java.lang.FunctionalInterface
        public static interface TracingFlushCallback {
            public void onTracingFlush();
        }

        @java.lang.FunctionalInterface
        public static interface TracingInstanceStartCallback {
            public void onTracingInstanceStart(int p0, com.android.internal.protolog.ProtoLogDataSource.ProtoLogConfig p1);
        }

        @java.lang.FunctionalInterface
        public static interface TracingInstanceStopCallback {
            public void onTracingInstanceStop(int p0, com.android.internal.protolog.ProtoLogDataSource.ProtoLogConfig p1);
        }
    }

    public static class ProtoLogConfig {
        public com.android.internal.protolog.ProtoLogDataSource.GroupConfig getConfigFor(java.lang.String p0) { return null; }
        public com.android.internal.protolog.ProtoLogDataSource.GroupConfig getDefaultGroupConfig() { return null; }
        public java.util.Set<java.lang.String> getGroupTagsWithOverriddenConfigs() { return null; }
    }

    public static class TlsState {
        public com.android.internal.protolog.common.LogLevel getLogFromLevel(java.lang.String p0) { return null; }
        public boolean getShouldCollectStacktrace(java.lang.String p0) { return false; }
    }
}
