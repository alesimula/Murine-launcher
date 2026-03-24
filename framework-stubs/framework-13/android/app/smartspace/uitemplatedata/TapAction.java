package android.app.smartspace.uitemplatedata;

@android.annotation.SystemApi
public final class TapAction implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.smartspace.uitemplatedata.TapAction> CREATOR = null;
    TapAction(android.os.Parcel p0) {}
    public java.lang.CharSequence getId() { return null; }
    @android.annotation.SuppressLint("IntentBuilderName")
    public android.content.Intent getIntent() { return null; }
    public android.app.PendingIntent getPendingIntent() { return null; }
    public android.os.UserHandle getUserHandle() { return null; }
    @android.annotation.SuppressLint("NullableCollection")
    public android.os.Bundle getExtras() { return null; }
    public boolean shouldShowOnLockscreen() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    @android.annotation.SystemApi
    public static final class Builder {
        public Builder(java.lang.CharSequence p0) {}
        public android.app.smartspace.uitemplatedata.TapAction.Builder setIntent(android.content.Intent p0) { return null; }
        public android.app.smartspace.uitemplatedata.TapAction.Builder setPendingIntent(android.app.PendingIntent p0) { return null; }
        @android.annotation.SuppressLint("UserHandleName")
        public android.app.smartspace.uitemplatedata.TapAction.Builder setUserHandle(android.os.UserHandle p0) { return null; }
        public android.app.smartspace.uitemplatedata.TapAction.Builder setExtras(android.os.Bundle p0) { return null; }
        public android.app.smartspace.uitemplatedata.TapAction.Builder setShouldShowOnLockscreen(boolean p0) { return null; }
        public android.app.smartspace.uitemplatedata.TapAction build() { return null; }
    }
}
