package android.app;

public final class DirectAction implements android.os.Parcelable {
    public static final java.lang.String KEY_ACTIONS_LIST = "actions_list";
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.DirectAction> CREATOR = null;
    public DirectAction(java.lang.String p0, android.os.Bundle p1, android.content.LocusId p2) {}
    public void setSource(int p0, android.os.IBinder p1) {}
    public DirectAction(android.app.DirectAction p0) {}
    public int getTaskId() { return 0; }
    public android.os.IBinder getActivityId() { return null; }
    @android.annotation.NonNull
    public java.lang.String getId() { return null; }
    @android.annotation.Nullable
    public android.os.Bundle getExtras() { return null; }
    @android.annotation.Nullable
    public android.content.LocusId getLocusId() { return null; }
    public int describeContents() { return 0; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(java.lang.String p0) {}
        @android.annotation.NonNull
        public android.app.DirectAction.Builder setExtras(android.os.Bundle p0) { return null; }
        @android.annotation.NonNull
        public android.app.DirectAction.Builder setLocusId(android.content.LocusId p0) { return null; }
        @android.annotation.NonNull
        public android.app.DirectAction build() { return null; }
    }
}
