package android.service.autofill;

public interface ValueFinder {
    @android.annotation.Nullable
    default public java.lang.String findByAutofillId(android.view.autofill.AutofillId p0) { return null; }
    @android.annotation.Nullable
    public android.view.autofill.AutofillValue findRawValueByAutofillId(android.view.autofill.AutofillId p0);
}
