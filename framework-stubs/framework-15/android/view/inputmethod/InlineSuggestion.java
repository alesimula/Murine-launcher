package android.view.inputmethod;

public final class InlineSuggestion implements android.os.Parcelable {
    static com.android.internal.util.Parcelling<android.view.inputmethod.InlineSuggestion.InlineContentCallbackImpl> sParcellingForInlineContentCallback;
    static com.android.internal.util.Parcelling<com.android.internal.view.inline.InlineTooltipUi> sParcellingForInlineTooltipUi;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.view.inputmethod.InlineSuggestion> CREATOR = null;
    @android.annotation.NonNull
    public static android.view.inputmethod.InlineSuggestion newInlineSuggestion(android.view.inputmethod.InlineSuggestionInfo p0) { return null; }
    public InlineSuggestion(android.view.inputmethod.InlineSuggestionInfo p0, com.android.internal.view.inline.IInlineContentProvider p1) {}
    public void inflate(android.content.Context p0, android.util.Size p1, java.util.concurrent.Executor p2, java.util.function.Consumer<android.widget.inline.InlineContentView> p3) {}
    public InlineSuggestion(android.view.inputmethod.InlineSuggestionInfo p0, com.android.internal.view.inline.IInlineContentProvider p1, android.view.inputmethod.InlineSuggestion.InlineContentCallbackImpl p2, com.android.internal.view.inline.InlineTooltipUi p3) {}
    @android.annotation.NonNull
    public android.view.inputmethod.InlineSuggestionInfo getInfo() { return null; }
    @android.annotation.Nullable
    public com.android.internal.view.inline.IInlineContentProvider getContentProvider() { return null; }
    @android.annotation.Nullable
    public android.view.inputmethod.InlineSuggestion.InlineContentCallbackImpl getInlineContentCallback() { return null; }
    @android.annotation.Nullable
    public com.android.internal.view.inline.InlineTooltipUi getInlineTooltipUi() { return null; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    InlineSuggestion(android.os.Parcel p0) {}

    private static final class InlineContentCallbackImpl {
        InlineContentCallbackImpl(android.content.Context p0, com.android.internal.view.inline.IInlineContentProvider p1, java.util.concurrent.Executor p2, java.util.function.Consumer<android.widget.inline.InlineContentView> p3, com.android.internal.view.inline.InlineTooltipUi p4) {}
        public void onContent(android.view.SurfaceControlViewHost.SurfacePackage p0, int p1, int p2) {}
        public void onClick() {}
        public void onLongClick() {}
    }

    private static class InlineContentCallbackImplParceling implements com.android.internal.util.Parcelling<android.view.inputmethod.InlineSuggestion.InlineContentCallbackImpl> {
        public void parcel(android.view.inputmethod.InlineSuggestion.InlineContentCallbackImpl p0, android.os.Parcel p1, int p2) {}
        public android.view.inputmethod.InlineSuggestion.InlineContentCallbackImpl unparcel(android.os.Parcel p0) { return null; }
    }

    private static final class InlineContentCallbackWrapper extends com.android.internal.view.inline.IInlineContentCallback.Stub {
        InlineContentCallbackWrapper(android.view.inputmethod.InlineSuggestion.InlineContentCallbackImpl p0) { super(); }
        public void onContent(android.view.SurfaceControlViewHost.SurfacePackage p0, int p1, int p2) {}
        public void onClick() {}
        public void onLongClick() {}
    }

    private static class InlineTooltipUiParceling implements com.android.internal.util.Parcelling<com.android.internal.view.inline.InlineTooltipUi> {
        public void parcel(com.android.internal.view.inline.InlineTooltipUi p0, android.os.Parcel p1, int p2) {}
        public com.android.internal.view.inline.InlineTooltipUi unparcel(android.os.Parcel p0) { return null; }
    }
}
