package android.os.flagging;

@android.annotation.FlaggedApi("android.provider.flags.new_storage_public_api")
public class AconfigPackage {
    AconfigPackage() {}
    @android.annotation.FlaggedApi("android.provider.flags.new_storage_public_api")
    public boolean getBooleanFlagValue(java.lang.String p0, boolean p1) { return false; }
    @android.annotation.FlaggedApi("android.provider.flags.new_storage_public_api")
    @android.annotation.NonNull
    public static android.os.flagging.AconfigPackage load(java.lang.String p0) { return null; }
}
