package android.os;

@android.annotation.SystemApi
@android.annotation.SuppressLint("PackageLayering")
public final class NewUserRequest {
    @android.annotation.Nullable
    public java.lang.String getName() { return null; }
    public boolean isEphemeral() { return false; }
    public boolean isAdmin() { return false; }
    int getFlags() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getUserType() { return null; }
    @android.annotation.Nullable
    public android.graphics.Bitmap getUserIcon() { return null; }
    @android.annotation.Nullable
    public java.lang.String getAccountName() { return null; }
    @android.annotation.Nullable
    public java.lang.String getAccountType() { return null; }
    @android.annotation.SuppressLint("NullableCollection")
    @android.annotation.Nullable
    public android.os.PersistableBundle getAccountOptions() { return null; }
    public java.lang.String toString() { return null; }

    @android.annotation.SuppressLint("PackageLayering")
    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.os.NewUserRequest.Builder setName(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.os.NewUserRequest.Builder setAdmin() { return null; }
        @android.annotation.NonNull
        public android.os.NewUserRequest.Builder setEphemeral() { return null; }
        @android.annotation.NonNull
        public android.os.NewUserRequest.Builder setUserType(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.os.NewUserRequest.Builder setUserIcon(android.graphics.Bitmap p0) { return null; }
        @android.annotation.NonNull
        public android.os.NewUserRequest.Builder setAccountName(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.os.NewUserRequest.Builder setAccountType(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.os.NewUserRequest.Builder setAccountOptions(android.os.PersistableBundle p0) { return null; }
        @android.annotation.NonNull
        public android.os.NewUserRequest build() { return null; }
    }
}
