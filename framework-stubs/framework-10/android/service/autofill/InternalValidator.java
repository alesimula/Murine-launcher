package android.service.autofill;

public abstract class InternalValidator implements android.service.autofill.Validator, android.os.Parcelable {
    public InternalValidator() {}
    public abstract boolean isValid(android.service.autofill.ValueFinder p0);
}
