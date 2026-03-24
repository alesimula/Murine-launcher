package android.service.autofill;

public final class VisibilitySetterAction extends android.service.autofill.InternalOnClickAction implements android.service.autofill.OnClickAction, android.os.Parcelable {
    private static final java.lang.String TAG = "VisibilitySetterAction";
    private final android.util.SparseIntArray mVisibilities = null;
    public static final android.os.Parcelable.Creator<android.service.autofill.VisibilitySetterAction> CREATOR = null;
    private VisibilitySetterAction(android.service.autofill.VisibilitySetterAction.Builder p0) { super(); }
    public void onClick(android.view.ViewGroup p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private final android.util.SparseIntArray mVisibilities = null;
        private boolean mDestroyed;
        public Builder(int p0, int p1) {}
        public android.service.autofill.VisibilitySetterAction.Builder setVisibility(int p0, int p1) { return null; }
        public android.service.autofill.VisibilitySetterAction build() { return null; }
        private void throwIfDestroyed() {}
    }
}
