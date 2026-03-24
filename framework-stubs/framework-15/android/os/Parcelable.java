package android.os;

public interface Parcelable {
    public static final int PARCELABLE_WRITE_RETURN_VALUE = 1;
    public static final int PARCELABLE_ELIDE_DUPLICATES = 2;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    public static final int PARCELABLE_STABILITY_LOCAL = 0;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    public static final int PARCELABLE_STABILITY_VINTF = 1;
    public static final int CONTENTS_FILE_DESCRIPTOR = 1;
    public int describeContents();
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    default public int getStability() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1);

    public static interface ClassLoaderCreator<T extends java.lang.Object> extends android.os.Parcelable.Creator<T> {
        public T createFromParcel(android.os.Parcel p0, java.lang.ClassLoader p1);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ContentsFlags {
    }

    public static interface Creator<T extends java.lang.Object> {
        public T createFromParcel(android.os.Parcel p0);
        public T[] newArray(int p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Stability {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface WriteFlags {
    }
}
