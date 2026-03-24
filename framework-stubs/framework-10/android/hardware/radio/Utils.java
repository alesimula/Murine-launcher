package android.hardware.radio;

final class Utils {
    private static final java.lang.String TAG = "BroadcastRadio.utils";
    Utils() {}
    static void writeStringMap(android.os.Parcel p0, java.util.Map<java.lang.String, java.lang.String> p1) {}
    static java.util.Map<java.lang.String, java.lang.String> readStringMap(android.os.Parcel p0) { return null; }
    static void writeStringIntMap(android.os.Parcel p0, java.util.Map<java.lang.String, java.lang.Integer> p1) {}
    static java.util.Map<java.lang.String, java.lang.Integer> readStringIntMap(android.os.Parcel p0) { return null; }
    static <T extends android.os.Parcelable> void writeSet(android.os.Parcel p0, java.util.Set<T> p1) {}
    static <T extends java.lang.Object> java.util.Set<T> createSet(android.os.Parcel p0, android.os.Parcelable.Creator<T> p1) { return null; }
    static void writeIntSet(android.os.Parcel p0, java.util.Set<java.lang.Integer> p1) {}
    static java.util.Set<java.lang.Integer> createIntSet(android.os.Parcel p0) { return null; }
    static <T extends android.os.Parcelable> void writeTypedCollection(android.os.Parcel p0, java.util.Collection<T> p1) {}
    static void close(android.hardware.radio.ICloseHandle p0) {}
}
