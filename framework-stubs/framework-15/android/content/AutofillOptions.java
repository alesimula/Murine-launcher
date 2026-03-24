package android.content;

public final class AutofillOptions implements android.os.Parcelable {
    public final int loggingLevel = 0;
    public final boolean compatModeEnabled = false;
    public boolean augmentedAutofillEnabled;
    @android.annotation.Nullable
    @android.annotation.SuppressLint("NullableCollection")
    public android.util.ArraySet<android.content.ComponentName> whitelistedActivitiesForAugmentedAutofill;
    public long appDisabledExpiration;
    @android.annotation.SuppressLint("NullableCollection")
    @android.annotation.Nullable
    public android.util.ArrayMap<java.lang.String, java.lang.Long> disabledActivities;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.content.AutofillOptions> CREATOR = null;
    public AutofillOptions(int p0, boolean p1) {}
    public boolean isAugmentedAutofillEnabled(android.content.Context p0) { return false; }
    public boolean isAutofillDisabledLocked(android.content.ComponentName p0) { return false; }
    public static android.content.AutofillOptions forWhitelistingItself() { return null; }
    public java.lang.String toString() { return null; }
    public void dumpShort(java.io.PrintWriter p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
