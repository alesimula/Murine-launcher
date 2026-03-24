package android.os;

public interface Parcelable {
    public static final int PARCELABLE_WRITE_RETURN_VALUE = 1;
    public static final int PARCELABLE_ELIDE_DUPLICATES = 2;
    public static final int CONTENTS_FILE_DESCRIPTOR = 1;
    public int describeContents();
    public void writeToParcel(android.os.Parcel p0, int p1);

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface WriteFlags {
    }

    public static interface Creator<T extends java.lang.Object> {
        public T createFromParcel(android.os.Parcel p0);
        public T[] newArray(int p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ContentsFlags {
    }

    public static interface ClassLoaderCreator<T extends java.lang.Object> extends android.os.Parcelable.Creator<T> {
        public T createFromParcel(android.os.Parcel p0, java.lang.ClassLoader p1);
    }
}
