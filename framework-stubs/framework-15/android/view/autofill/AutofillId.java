package android.view.autofill;

public final class AutofillId implements android.os.Parcelable {
    public static final int NO_SESSION = 0;
    @android.annotation.NonNull
    public static final android.view.autofill.AutofillId NO_AUTOFILL_ID = null;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.view.autofill.AutofillId> CREATOR = null;
    public AutofillId(int p0) {}
    public AutofillId(android.view.autofill.AutofillId p0, int p1) {}
    public AutofillId(int p0, int p1) {}
    public AutofillId(android.view.autofill.AutofillId p0, int p1, int p2) {}
    public AutofillId(android.view.autofill.AutofillId p0, long p1, int p2) {}
    @android.annotation.NonNull
    public static android.view.autofill.AutofillId create(android.view.View p0, int p1) { return null; }
    @android.annotation.NonNull
    public static android.view.autofill.AutofillId withoutSession(android.view.autofill.AutofillId p0) { return null; }
    public int getViewId() { return 0; }
    public int getVirtualChildIntId() { return 0; }
    public long getVirtualChildLongId() { return 0L; }
    public boolean isVirtualInt() { return false; }
    public boolean isVirtualLong() { return false; }
    public boolean isNonVirtual() { return false; }
    public boolean hasSession() { return false; }
    public int getSessionId() { return 0; }
    public void setSessionId(int p0) {}
    public void resetSessionId() {}
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public boolean equalsIgnoreSession(android.view.autofill.AutofillId p0) { return false; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
