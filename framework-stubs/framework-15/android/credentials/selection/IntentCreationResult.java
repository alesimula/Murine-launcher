package android.credentials.selection;

public final class IntentCreationResult {
    @android.annotation.NonNull
    public android.content.Intent getIntent() { return null; }
    @android.annotation.NonNull
    public android.credentials.selection.IntentCreationResult.OemUiUsageStatus getOemUiUsageStatus() { return null; }
    @android.annotation.Nullable
    public java.lang.String getFallbackUiPackageName() { return null; }
    @android.annotation.Nullable
    public java.lang.String getOemUiPackageName() { return null; }

    public static final class Builder {
        public Builder(android.content.Intent p0) {}
        @android.annotation.NonNull
        public android.credentials.selection.IntentCreationResult.Builder setFallbackUiPackageName(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.credentials.selection.IntentCreationResult.Builder setOemUiPackageName(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.credentials.selection.IntentCreationResult.Builder setOemUiUsageStatus(android.credentials.selection.IntentCreationResult.OemUiUsageStatus p0) { return null; }
        @android.annotation.NonNull
        public android.credentials.selection.IntentCreationResult build() { return null; }
    }

    public static enum OemUiUsageStatus {
        UNKNOWN,
        SUCCESS,
        OEM_UI_CONFIG_NOT_SPECIFIED,
        OEM_UI_CONFIG_SPECIFIED_BUT_NOT_FOUND,
        OEM_UI_CONFIG_SPECIFIED_FOUND_BUT_NOT_ENABLED;
    }
}
