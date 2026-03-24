package android.app;

public final class Person implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.Person> CREATOR = null;
    public android.app.Person.Builder toBuilder() { return null; }
    @android.annotation.Nullable
    public java.lang.String getUri() { return null; }
    @android.annotation.Nullable
    public java.lang.CharSequence getName() { return null; }
    @android.annotation.Nullable
    public android.graphics.drawable.Icon getIcon() { return null; }
    @android.annotation.Nullable
    public java.lang.String getKey() { return null; }
    public boolean isBot() { return false; }
    public boolean isImportant() { return false; }
    public java.lang.String resolveToLegacyUri() { return null; }
    @android.annotation.Nullable
    public android.net.Uri getIconUri() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void visitUris(java.util.function.Consumer<android.net.Uri> p0) {}

    public static class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.app.Person.Builder setName(java.lang.CharSequence p0) { return null; }
        @android.annotation.NonNull
        public android.app.Person.Builder setIcon(android.graphics.drawable.Icon p0) { return null; }
        @android.annotation.NonNull
        public android.app.Person.Builder setUri(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.app.Person.Builder setKey(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.app.Person.Builder setImportant(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.app.Person.Builder setBot(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.app.Person build() { return null; }
    }
}
