package android.service.autofill;

public final class FillContext implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.service.autofill.FillContext> CREATOR = null;
    public java.lang.String toString() { return null; }
    @android.annotation.NonNull
    public android.app.assist.AssistStructure.ViewNode[] findViewNodesByAutofillIds(android.view.autofill.AutofillId[] p0) { return null; }
    public FillContext(int p0, android.app.assist.AssistStructure p1, android.view.autofill.AutofillId p2) {}
    public int getRequestId() { return 0; }
    @android.annotation.NonNull
    public android.app.assist.AssistStructure getStructure() { return null; }
    @android.annotation.NonNull
    public android.view.autofill.AutofillId getFocusedId() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
}
