package android.os;

@android.annotation.SystemApi
@android.annotation.SuppressLint("PackageLayering")
public final class NewUserRequest {
    public java.lang.String getName() { return null; }
    public boolean isEphemeral() { return false; }
    public boolean isAdmin() { return false; }
    int getFlags() { return 0; }
    public java.lang.String getUserType() { return null; }
    public android.graphics.Bitmap getUserIcon() { return null; }
    public java.lang.String getAccountName() { return null; }
    public java.lang.String getAccountType() { return null; }
    @android.annotation.SuppressLint("NullableCollection")
    public android.os.PersistableBundle getAccountOptions() { return null; }
    public java.lang.String toString() { return null; }

    @android.annotation.SuppressLint("PackageLayering")
    public static final class Builder {
        public Builder() {}
        public android.os.NewUserRequest.Builder setName(java.lang.String p0) { return null; }
        public android.os.NewUserRequest.Builder setAdmin() { return null; }
        public android.os.NewUserRequest.Builder setEphemeral() { return null; }
        public android.os.NewUserRequest.Builder setUserType(java.lang.String p0) { return null; }
        public android.os.NewUserRequest.Builder setUserIcon(android.graphics.Bitmap p0) { return null; }
        public android.os.NewUserRequest.Builder setAccountName(java.lang.String p0) { return null; }
        public android.os.NewUserRequest.Builder setAccountType(java.lang.String p0) { return null; }
        public android.os.NewUserRequest.Builder setAccountOptions(android.os.PersistableBundle p0) { return null; }
        public android.os.NewUserRequest build() { return null; }
    }
}
