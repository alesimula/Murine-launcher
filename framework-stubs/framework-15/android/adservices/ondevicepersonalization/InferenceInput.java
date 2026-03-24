package android.adservices.ondevicepersonalization;

public final class InferenceInput {
    InferenceInput() {}
    public int getBatchSize() { return 0; }
    @android.annotation.NonNull
    public android.adservices.ondevicepersonalization.InferenceOutput getExpectedOutputStructure() { return null; }
    @android.annotation.NonNull
    public java.lang.Object[] getInputData() { return null; }
    @android.annotation.NonNull
    public android.adservices.ondevicepersonalization.InferenceInput.Params getParams() { return null; }

    public static final class Builder {
        public Builder(android.adservices.ondevicepersonalization.InferenceInput.Params p0, java.lang.Object[] p1, android.adservices.ondevicepersonalization.InferenceOutput p2) {}
        @android.annotation.NonNull
        public android.adservices.ondevicepersonalization.InferenceInput build() { return null; }
        @android.annotation.NonNull
        public android.adservices.ondevicepersonalization.InferenceInput.Builder setBatchSize(int p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.ondevicepersonalization.InferenceInput.Builder setExpectedOutputStructure(android.adservices.ondevicepersonalization.InferenceOutput p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.ondevicepersonalization.InferenceInput.Builder setInputData(java.lang.Object... p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.ondevicepersonalization.InferenceInput.Builder setParams(android.adservices.ondevicepersonalization.InferenceInput.Params p0) { return null; }
    }

    public static class Params {
        public static final int DELEGATE_CPU = 1;
        public static final int MODEL_TYPE_TENSORFLOW_LITE = 1;
        Params() {}
        public int getDelegateType() { return 0; }
        @android.annotation.NonNull
        public android.adservices.ondevicepersonalization.KeyValueStore getKeyValueStore() { return null; }
        @android.annotation.NonNull
        public java.lang.String getModelKey() { return null; }
        public int getModelType() { return 0; }
        public int getRecommendedNumThreads() { return 0; }

        public static final class Builder {
            public Builder(android.adservices.ondevicepersonalization.KeyValueStore p0, java.lang.String p1) {}
            @android.annotation.NonNull
            public android.adservices.ondevicepersonalization.InferenceInput.Params build() { return null; }
            @android.annotation.NonNull
            public android.adservices.ondevicepersonalization.InferenceInput.Params.Builder setDelegateType(int p0) { return null; }
            @android.annotation.NonNull
            public android.adservices.ondevicepersonalization.InferenceInput.Params.Builder setKeyValueStore(android.adservices.ondevicepersonalization.KeyValueStore p0) { return null; }
            @android.annotation.NonNull
            public android.adservices.ondevicepersonalization.InferenceInput.Params.Builder setModelKey(java.lang.String p0) { return null; }
            @android.annotation.NonNull
            public android.adservices.ondevicepersonalization.InferenceInput.Params.Builder setModelType(int p0) { return null; }
            @android.annotation.NonNull
            public android.adservices.ondevicepersonalization.InferenceInput.Params.Builder setRecommendedNumThreads(int p0) { return null; }
        }
    }
}
