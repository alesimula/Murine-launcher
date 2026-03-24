package android.provider;

public class SettingsStringUtil {
    public static final java.lang.String DELIMITER = ":";

    public static abstract class ColonDelimitedSet<T extends java.lang.Object> extends java.util.HashSet<T> {
        public ColonDelimitedSet(java.lang.String p0) { super(); }
        protected abstract T itemFromString(java.lang.String p0);
        protected java.lang.String itemToString(T p0) { return null; }
        public java.lang.String toString() { return null; }

        public static class OfStrings extends android.provider.SettingsStringUtil.ColonDelimitedSet<java.lang.String> {
            public OfStrings(java.lang.String p0) { super(null); }
            protected java.lang.String itemFromString(java.lang.String p0) { return null; }
            public static java.lang.String addAll(java.lang.String p0, java.util.Collection<java.lang.String> p1) { return null; }
            public static java.lang.String add(java.lang.String p0, java.lang.String p1) { return null; }
            public static java.lang.String remove(java.lang.String p0, java.lang.String p1) { return null; }
            public static boolean contains(java.lang.String p0, java.lang.String p1) { return false; }
        }
    }

    public static class ComponentNameSet extends android.provider.SettingsStringUtil.ColonDelimitedSet<android.content.ComponentName> {
        public ComponentNameSet(java.lang.String p0) { super(null); }
        protected android.content.ComponentName itemFromString(java.lang.String p0) { return null; }
        protected java.lang.String itemToString(android.content.ComponentName p0) { return null; }
        public static java.lang.String add(java.lang.String p0, android.content.ComponentName p1) { return null; }
        public static java.lang.String remove(java.lang.String p0, android.content.ComponentName p1) { return null; }
        public static boolean contains(java.lang.String p0, android.content.ComponentName p1) { return false; }
    }

    public static class SettingStringHelper {
        public SettingStringHelper(android.content.ContentResolver p0, java.lang.String p1, int p2) {}
        public java.lang.String read() { return null; }
        public boolean write(java.lang.String p0) { return false; }
        public boolean modify(java.util.function.Function<java.lang.String, java.lang.String> p0) { return false; }
    }
}
