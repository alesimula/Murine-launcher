package android.service.autofill;

public abstract class InternalSanitizer implements android.service.autofill.Sanitizer, android.os.Parcelable {
    public InternalSanitizer() {}
    @android.annotation.Nullable
    public abstract android.view.autofill.AutofillValue sanitize(android.view.autofill.AutofillValue p0);
}
