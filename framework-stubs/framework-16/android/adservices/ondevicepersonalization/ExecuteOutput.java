package android.adservices.ondevicepersonalization;

public final class ExecuteOutput {
    ExecuteOutput() {}
    @android.annotation.FlaggedApi("com.android.adservices.ondevicepersonalization.flags.execute_in_isolated_service_api_enabled")
    public int getBestValue() { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.adservices.ondevicepersonalization.EventLogRecord> getEventLogRecords() { return null; }
    @android.annotation.Nullable
    public byte[] getOutputData() { return null; }
    @android.annotation.Nullable
    public android.adservices.ondevicepersonalization.RenderingConfig getRenderingConfig() { return null; }
    @android.annotation.Nullable
    public android.adservices.ondevicepersonalization.RequestLogRecord getRequestLogRecord() { return null; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.adservices.ondevicepersonalization.ExecuteOutput.Builder addEventLogRecord(android.adservices.ondevicepersonalization.EventLogRecord p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.ondevicepersonalization.ExecuteOutput build() { return null; }
        @android.annotation.FlaggedApi("com.android.adservices.ondevicepersonalization.flags.execute_in_isolated_service_api_enabled")
        @android.annotation.NonNull
        public android.adservices.ondevicepersonalization.ExecuteOutput.Builder setBestValue(int p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.ondevicepersonalization.ExecuteOutput.Builder setEventLogRecords(java.util.List<android.adservices.ondevicepersonalization.EventLogRecord> p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.ondevicepersonalization.ExecuteOutput.Builder setOutputData(byte... p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.ondevicepersonalization.ExecuteOutput.Builder setRenderingConfig(android.adservices.ondevicepersonalization.RenderingConfig p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.ondevicepersonalization.ExecuteOutput.Builder setRequestLogRecord(android.adservices.ondevicepersonalization.RequestLogRecord p0) { return null; }
    }
}
