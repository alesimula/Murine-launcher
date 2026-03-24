package android.app.usage;

public final class StorageStats implements android.os.Parcelable {
    public java.lang.String packageName;
    public int userHandle;
    public int uid;
    public long codeBytes;
    public long dataBytes;
    public long cacheBytes;
    public long apkBytes;
    public long libBytes;
    public long dmBytes;
    public long dexoptBytes;
    public long curProfBytes;
    public long refProfBytes;
    public long externalCacheBytes;
    @android.annotation.FlaggedApi("android.app.usage.get_app_bytes_by_data_type_api")
    public static final int APP_DATA_TYPE_FILE_TYPE_DEXOPT_ARTIFACT = 0;
    @android.annotation.FlaggedApi("android.app.usage.get_app_bytes_by_data_type_api")
    public static final int APP_DATA_TYPE_FILE_TYPE_REFERENCE_PROFILE = 1;
    @android.annotation.FlaggedApi("android.app.usage.get_app_bytes_by_data_type_api")
    public static final int APP_DATA_TYPE_FILE_TYPE_CURRENT_PROFILE = 2;
    @android.annotation.FlaggedApi("android.app.usage.get_app_bytes_by_data_type_api")
    public static final int APP_DATA_TYPE_FILE_TYPE_APK = 3;
    @android.annotation.FlaggedApi("android.app.usage.get_app_bytes_by_data_type_api")
    public static final int APP_DATA_TYPE_FILE_TYPE_DM = 4;
    @android.annotation.FlaggedApi("android.app.usage.get_app_bytes_by_data_type_api")
    public static final int APP_DATA_TYPE_LIB = 5;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.usage.StorageStats> CREATOR = null;
    public long getAppBytes() { return 0L; }
    @android.annotation.FlaggedApi("android.app.usage.get_app_bytes_by_data_type_api")
    public long getAppBytesByDataType(int p0) { return 0L; }
    public long getDataBytes() { return 0L; }
    public long getCacheBytes() { return 0L; }
    public long getExternalCacheBytes() { return 0L; }
    public StorageStats() {}
    public StorageStats(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @android.annotation.FlaggedApi("android.app.usage.get_app_bytes_by_data_type_api")
    public static @interface AppDataType {
    }
}
