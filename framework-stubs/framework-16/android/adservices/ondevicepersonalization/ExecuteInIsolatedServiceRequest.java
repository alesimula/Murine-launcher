package android.adservices.ondevicepersonalization;

@android.annotation.FlaggedApi("com.android.adservices.ondevicepersonalization.flags.execute_in_isolated_service_api_enabled")
public class ExecuteInIsolatedServiceRequest {
    ExecuteInIsolatedServiceRequest() {}
    @android.annotation.NonNull
    public android.os.PersistableBundle getAppParams() { return null; }
    @android.annotation.NonNull
    public android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceRequest.OutputSpec getOutputSpec() { return null; }
    @android.annotation.NonNull
    public android.content.ComponentName getService() { return null; }

    public static final class Builder {
        public Builder(android.content.ComponentName p0) {}
        @android.annotation.NonNull
        public android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceRequest build() { return null; }
        @android.annotation.NonNull
        public android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceRequest.Builder setAppParams(android.os.PersistableBundle p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceRequest.Builder setOutputSpec(android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceRequest.OutputSpec p0) { return null; }
    }

    public static class OutputSpec {
        @android.annotation.NonNull
        public static final android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceRequest.OutputSpec DEFAULT = null;
        public static final int OUTPUT_TYPE_BEST_VALUE = 1;
        public static final int OUTPUT_TYPE_NULL = 0;
        OutputSpec() {}
        @android.annotation.NonNull
        public static android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceRequest.OutputSpec buildBestValueSpec(int p0) { return null; }
        public int getMaxIntValue() { return 0; }
        public int getOutputType() { return 0; }
    }
}
