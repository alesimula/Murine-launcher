package com.android.internal.util;

public interface Parcelling<T extends java.lang.Object> {
    public void parcel(T p0, android.os.Parcel p1, int p2);
    public T unparcel(android.os.Parcel p0);

    public static interface BuiltIn {

        public static class ForBoolean implements com.android.internal.util.Parcelling<java.lang.Boolean> {
            public ForBoolean() {}
            public void parcel(java.lang.Boolean p0, android.os.Parcel p1, int p2) {}
            @android.annotation.Nullable
            public java.lang.Boolean unparcel(android.os.Parcel p0) { return null; }
        }

        public static class ForInstant implements com.android.internal.util.Parcelling<java.time.Instant> {
            public ForInstant() {}
            public void parcel(java.time.Instant p0, android.os.Parcel p1, int p2) {}
            public java.time.Instant unparcel(android.os.Parcel p0) { return null; }
        }

        public static class ForInternedString implements com.android.internal.util.Parcelling<java.lang.String> {
            public ForInternedString() {}
            public void parcel(java.lang.String p0, android.os.Parcel p1, int p2) {}
            @android.annotation.Nullable
            public java.lang.String unparcel(android.os.Parcel p0) { return null; }
        }

        public static class ForInternedStringArray implements com.android.internal.util.Parcelling<java.lang.String[]> {
            public ForInternedStringArray() {}
            public void parcel(java.lang.String[] p0, android.os.Parcel p1, int p2) {}
            @android.annotation.Nullable
            public java.lang.String[] unparcel(android.os.Parcel p0) { return null; }
        }

        public static class ForInternedStringArraySet implements com.android.internal.util.Parcelling<android.util.ArraySet<java.lang.String>> {
            public ForInternedStringArraySet() {}
            public void parcel(android.util.ArraySet<java.lang.String> p0, android.os.Parcel p1, int p2) {}
            public android.util.ArraySet<java.lang.String> unparcel(android.os.Parcel p0) { return null; }
        }

        public static class ForInternedStringList implements com.android.internal.util.Parcelling<java.util.List<java.lang.String>> {
            public ForInternedStringList() {}
            public void parcel(java.util.List<java.lang.String> p0, android.os.Parcel p1, int p2) {}
            public java.util.List<java.lang.String> unparcel(android.os.Parcel p0) { return null; }
        }

        public static class ForInternedStringSet implements com.android.internal.util.Parcelling<java.util.Set<java.lang.String>> {
            public ForInternedStringSet() {}
            public void parcel(java.util.Set<java.lang.String> p0, android.os.Parcel p1, int p2) {}
            public java.util.Set<java.lang.String> unparcel(android.os.Parcel p0) { return null; }
        }

        public static class ForInternedStringValueMap implements com.android.internal.util.Parcelling<java.util.Map<java.lang.String, java.lang.String>> {
            public ForInternedStringValueMap() {}
            public void parcel(java.util.Map<java.lang.String, java.lang.String> p0, android.os.Parcel p1, int p2) {}
            public java.util.Map<java.lang.String, java.lang.String> unparcel(android.os.Parcel p0) { return null; }
        }

        public static class ForPattern implements com.android.internal.util.Parcelling<java.util.regex.Pattern> {
            public ForPattern() {}
            public void parcel(java.util.regex.Pattern p0, android.os.Parcel p1, int p2) {}
            public java.util.regex.Pattern unparcel(android.os.Parcel p0) { return null; }
        }

        public static class ForStringSet implements com.android.internal.util.Parcelling<java.util.Set<java.lang.String>> {
            public ForStringSet() {}
            public void parcel(java.util.Set<java.lang.String> p0, android.os.Parcel p1, int p2) {}
            public java.util.Set<java.lang.String> unparcel(android.os.Parcel p0) { return null; }
        }

        public static class ForUUID implements com.android.internal.util.Parcelling<java.util.UUID> {
            public ForUUID() {}
            public void parcel(java.util.UUID p0, android.os.Parcel p1, int p2) {}
            public java.util.UUID unparcel(android.os.Parcel p0) { return null; }
        }
    }

    public static class Cache {
        @android.annotation.Nullable
        public static <P extends com.android.internal.util.Parcelling<?>> P get(java.lang.Class<P> p0) { return null; }
        public static <P extends com.android.internal.util.Parcelling<?>> P put(P p0) { return null; }
        public static <P extends com.android.internal.util.Parcelling<?>> P getOrCreate(java.lang.Class<P> p0) { return null; }
    }
}
