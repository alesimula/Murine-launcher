package android.app.contentsuggestions;

@android.annotation.SystemApi
public final class ClassificationsRequest implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.contentsuggestions.ClassificationsRequest> CREATOR = null;
    @android.annotation.NonNull
    public java.util.List<android.app.contentsuggestions.ContentSelection> getSelections() { return null; }
    @android.annotation.NonNull
    public android.os.Bundle getExtras() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.SystemApi
    public static final class Builder {
        public Builder(java.util.List<android.app.contentsuggestions.ContentSelection> p0) {}
        @android.annotation.NonNull
        public android.app.contentsuggestions.ClassificationsRequest.Builder setExtras(android.os.Bundle p0) { return null; }
        @android.annotation.NonNull
        public android.app.contentsuggestions.ClassificationsRequest build() { return null; }
    }
}
