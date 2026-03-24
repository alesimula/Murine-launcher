package android.service.autofill;

public abstract class InternalOnClickAction implements android.service.autofill.OnClickAction, android.os.Parcelable {
    public InternalOnClickAction() {}
    public abstract void onClick(android.view.ViewGroup p0);
}
