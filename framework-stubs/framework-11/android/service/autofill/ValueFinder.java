package android.service.autofill;

public interface ValueFinder {
    default public java.lang.String findByAutofillId(android.view.autofill.AutofillId p0) { return null; }
    public android.view.autofill.AutofillValue findRawValueByAutofillId(android.view.autofill.AutofillId p0);
}
