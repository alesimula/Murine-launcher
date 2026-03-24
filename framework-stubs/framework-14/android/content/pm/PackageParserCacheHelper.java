package android.content.pm;

public class PackageParserCacheHelper {

    public static class ReadHelper extends android.os.Parcel.ReadWriteHelper {
        public ReadHelper(android.os.Parcel p0) { super(); }
        public void startAndInstall() {}
        public java.lang.String readString(android.os.Parcel p0) { return null; }
        public java.lang.String readString8(android.os.Parcel p0) { return null; }
        public java.lang.String readString16(android.os.Parcel p0) { return null; }
    }

    public static class WriteHelper extends android.os.Parcel.ReadWriteHelper {
        public WriteHelper(android.os.Parcel p0) { super(); }
        public void writeString(android.os.Parcel p0, java.lang.String p1) {}
        public void writeString8(android.os.Parcel p0, java.lang.String p1) {}
        public void writeString16(android.os.Parcel p0, java.lang.String p1) {}
        public void finishAndUninstall() {}
    }
}
