package android.service.autofill;

public final class FillContext implements android.os.Parcelable {
    private final int mRequestId = 0;
    private final android.app.assist.AssistStructure mStructure = null;
    private final android.view.autofill.AutofillId mFocusedId = null;
    private transient android.util.ArrayMap<android.view.autofill.AutofillId, android.app.assist.AssistStructure.ViewNode> mViewNodeLookupTable;
    public static final android.os.Parcelable.Creator<android.service.autofill.FillContext> CREATOR = null;
    public java.lang.String toString() { return null; }
    public android.app.assist.AssistStructure.ViewNode[] findViewNodesByAutofillIds(android.view.autofill.AutofillId[] p0) { return null; }
    public FillContext(int p0, android.app.assist.AssistStructure p1, android.view.autofill.AutofillId p2) {}
    public int getRequestId() { return 0; }
    public android.app.assist.AssistStructure getStructure() { return null; }
    public android.view.autofill.AutofillId getFocusedId() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    @java.lang.Deprecated
    private void __metadata() {}
}
