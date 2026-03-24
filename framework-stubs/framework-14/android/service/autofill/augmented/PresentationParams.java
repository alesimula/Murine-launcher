package android.service.autofill.augmented;

@android.annotation.SystemApi
public abstract class PresentationParams {
    PresentationParams() {}
    public android.service.autofill.augmented.PresentationParams.Area getSuggestionArea() { return null; }
    abstract void dump(java.lang.String p0, java.io.PrintWriter p1);

    @android.annotation.SystemApi
    public static abstract class Area {
        public final android.service.autofill.augmented.AugmentedAutofillService.AutofillProxy proxy = null;
        public android.graphics.Rect getBounds() { return null; }
        public java.lang.String toString() { return null; }
    }

    public static final class SystemPopupPresentationParams extends android.service.autofill.augmented.PresentationParams {
        public SystemPopupPresentationParams(android.service.autofill.augmented.AugmentedAutofillService.AutofillProxy p0, android.graphics.Rect p1) { super(); }
        public android.service.autofill.augmented.PresentationParams.Area getSuggestionArea() { return null; }
        void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    }
}
