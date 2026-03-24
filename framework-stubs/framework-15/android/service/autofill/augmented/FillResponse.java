package android.service.autofill.augmented;

@android.annotation.SystemApi
public final class FillResponse {
    FillResponse(android.service.autofill.augmented.FillWindow p0, java.util.List<android.service.autofill.Dataset> p1, android.os.Bundle p2) {}
    @android.annotation.Nullable
    public android.service.autofill.augmented.FillWindow getFillWindow() { return null; }
    @android.annotation.Nullable
    public java.util.List<android.service.autofill.Dataset> getInlineSuggestions() { return null; }
    @android.annotation.Nullable
    public android.os.Bundle getClientState() { return null; }

    static abstract class BaseBuilder {
        BaseBuilder() {}
        abstract android.service.autofill.augmented.FillResponse.Builder addInlineSuggestion(android.service.autofill.Dataset p0);
    }

    public static final class Builder extends android.service.autofill.augmented.FillResponse.BaseBuilder {
        public Builder() { super(); }
        @android.annotation.NonNull
        public android.service.autofill.augmented.FillResponse.Builder setFillWindow(android.service.autofill.augmented.FillWindow p0) { return null; }
        @android.annotation.NonNull
        public android.service.autofill.augmented.FillResponse.Builder setInlineSuggestions(java.util.List<android.service.autofill.Dataset> p0) { return null; }
        @android.annotation.NonNull
        android.service.autofill.augmented.FillResponse.Builder addInlineSuggestion(android.service.autofill.Dataset p0) { return null; }
        @android.annotation.NonNull
        public android.service.autofill.augmented.FillResponse.Builder setClientState(android.os.Bundle p0) { return null; }
        @android.annotation.NonNull
        public android.service.autofill.augmented.FillResponse build() { return null; }
    }
}
