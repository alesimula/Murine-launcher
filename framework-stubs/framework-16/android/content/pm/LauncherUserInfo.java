package android.content.pm;

@android.annotation.FlaggedApi("android.os.allow_private_profile")
public final class LauncherUserInfo implements android.os.Parcelable {
    @android.annotation.FlaggedApi("android.multiuser.add_launcher_user_config")
    public static final java.lang.String PRIVATE_SPACE_ENTRYPOINT_HIDDEN = "private_space_entrypoint_hidden";
    @android.annotation.FlaggedApi("android.os.allow_private_profile")
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.content.pm.LauncherUserInfo> CREATOR = null;
    @android.annotation.FlaggedApi("android.os.allow_private_profile")
    @android.annotation.NonNull
    public java.lang.String getUserType() { return null; }
    @android.annotation.FlaggedApi("android.multiuser.add_launcher_user_config")
    @android.annotation.NonNull
    public android.os.Bundle getUserConfig() { return null; }
    @android.annotation.FlaggedApi("android.os.allow_private_profile")
    public int getUserSerialNumber() { return 0; }
    @android.annotation.FlaggedApi("android.os.allow_private_profile")
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.FlaggedApi("android.os.allow_private_profile")
    public int describeContents() { return 0; }

    public static final class Builder {
        @android.annotation.FlaggedApi("android.multiuser.add_launcher_user_config")
        public Builder(java.lang.String p0, int p1, android.os.Bundle p2) {}
        public Builder(java.lang.String p0, int p1) {}
        @android.annotation.NonNull
        public android.content.pm.LauncherUserInfo build() { return null; }
    }
}
