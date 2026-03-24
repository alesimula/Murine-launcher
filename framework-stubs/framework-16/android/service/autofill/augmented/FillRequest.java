package android.service.autofill.augmented;

@android.annotation.SystemApi
public final class FillRequest {
    public int getTaskId() { return 0; }
    @android.annotation.NonNull
    public android.content.ComponentName getActivityComponent() { return null; }
    @android.annotation.NonNull
    public android.view.autofill.AutofillId getFocusedId() { return null; }
    @android.annotation.NonNull
    public android.view.autofill.AutofillValue getFocusedValue() { return null; }
    @android.annotation.Nullable
    public android.app.assist.AssistStructure.ViewNode getFocusedViewNode() { return null; }
    @android.annotation.Nullable
    public android.service.autofill.augmented.PresentationParams getPresentationParams() { return null; }
    java.lang.String proxyToString() { return null; }
    public FillRequest(android.service.autofill.augmented.AugmentedAutofillService.AutofillProxy p0, android.view.inputmethod.InlineSuggestionsRequest p1) {}
    @android.annotation.Nullable
    public android.view.inputmethod.InlineSuggestionsRequest getInlineSuggestionsRequest() { return null; }
    public java.lang.String toString() { return null; }
}
