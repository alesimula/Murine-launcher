package android.adservices.ondevicepersonalization;

public final class InferenceOutput {
    InferenceOutput() {}
    @android.annotation.FlaggedApi("com.android.adservices.ondevicepersonalization.flags.executorch_inference_api_enabled")
    @android.annotation.NonNull
    public byte[] getData() { return null; }
    @android.annotation.NonNull
    public java.util.Map<java.lang.Integer, java.lang.Object> getDataOutputs() { return null; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.adservices.ondevicepersonalization.InferenceOutput.Builder addDataOutput(int p0, java.lang.Object p1) { return null; }
        @android.annotation.NonNull
        public android.adservices.ondevicepersonalization.InferenceOutput build() { return null; }
        @android.annotation.FlaggedApi("com.android.adservices.ondevicepersonalization.flags.executorch_inference_api_enabled")
        @android.annotation.NonNull
        public android.adservices.ondevicepersonalization.InferenceOutput.Builder setData(byte[] p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.ondevicepersonalization.InferenceOutput.Builder setDataOutputs(java.util.Map<java.lang.Integer, java.lang.Object> p0) { return null; }
    }
}
