package android.service.autofill.augmented;

@android.annotation.SystemApi
public final class FillResponse {
    private android.service.autofill.augmented.FillWindow mFillWindow;
    private java.util.List<android.service.autofill.Dataset> mInlineSuggestions;
    private android.os.Bundle mClientState;
    private static android.service.autofill.augmented.FillWindow defaultFillWindow() { return null; }
    private static java.util.List<android.service.autofill.Dataset> defaultInlineSuggestions() { return null; }
    private static android.os.Bundle defaultClientState() { return null; }
    FillResponse(android.service.autofill.augmented.FillWindow p0, java.util.List<android.service.autofill.Dataset> p1, android.os.Bundle p2) {}
    public android.service.autofill.augmented.FillWindow getFillWindow() { return null; }
    public java.util.List<android.service.autofill.Dataset> getInlineSuggestions() { return null; }
    public android.os.Bundle getClientState() { return null; }
    @java.lang.Deprecated
    private void __metadata() {}

    static abstract class BaseBuilder {
        BaseBuilder() {}
        abstract android.service.autofill.augmented.FillResponse.Builder addInlineSuggestion(android.service.autofill.Dataset p0);
    }

    public static final class Builder extends android.service.autofill.augmented.FillResponse.BaseBuilder {
        private android.service.autofill.augmented.FillWindow mFillWindow;
        private java.util.List<android.service.autofill.Dataset> mInlineSuggestions;
        private android.os.Bundle mClientState;
        private long mBuilderFieldsSet;
        public Builder() { super(); }
        public android.service.autofill.augmented.FillResponse.Builder setFillWindow(android.service.autofill.augmented.FillWindow p0) { return null; }
        public android.service.autofill.augmented.FillResponse.Builder setInlineSuggestions(java.util.List<android.service.autofill.Dataset> p0) { return null; }
        android.service.autofill.augmented.FillResponse.Builder addInlineSuggestion(android.service.autofill.Dataset p0) { return null; }
        public android.service.autofill.augmented.FillResponse.Builder setClientState(android.os.Bundle p0) { return null; }
        public android.service.autofill.augmented.FillResponse build() { return null; }
        private void checkNotUsed() {}
    }
}
