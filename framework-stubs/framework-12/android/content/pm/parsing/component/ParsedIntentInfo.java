package android.content.pm.parsing.component;

public final class ParsedIntentInfo extends android.content.IntentFilter {
    public static final android.content.pm.parsing.component.ParsedIntentInfo.Parceler PARCELER = null;
    boolean hasDefault;
    int labelRes;
    java.lang.CharSequence nonLocalizedLabel;
    int icon;
    public ParsedIntentInfo() { super(); }
    public ParsedIntentInfo(android.os.Parcel p0) { super(); }
    public void writeIntentInfoToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public boolean isHasDefault() { return false; }
    public int getLabelRes() { return 0; }
    public java.lang.CharSequence getNonLocalizedLabel() { return null; }
    public int getIcon() { return 0; }

    public static class ListParceler implements com.android.internal.util.Parcelling<java.util.List<android.content.pm.parsing.component.ParsedIntentInfo>> {
        public ListParceler() {}
        public void parcel(java.util.List<android.content.pm.parsing.component.ParsedIntentInfo> p0, android.os.Parcel p1, int p2) {}
        public java.util.List<android.content.pm.parsing.component.ParsedIntentInfo> unparcel(android.os.Parcel p0) { return null; }
    }

    public static class Parceler implements com.android.internal.util.Parcelling<android.content.pm.parsing.component.ParsedIntentInfo> {
        public Parceler() {}
        public void parcel(android.content.pm.parsing.component.ParsedIntentInfo p0, android.os.Parcel p1, int p2) {}
        public android.content.pm.parsing.component.ParsedIntentInfo unparcel(android.os.Parcel p0) { return null; }
    }

    public static class StringPairListParceler implements com.android.internal.util.Parcelling<java.util.List<android.util.Pair<java.lang.String, android.content.pm.parsing.component.ParsedIntentInfo>>> {
        public StringPairListParceler() {}
        public void parcel(java.util.List<android.util.Pair<java.lang.String, android.content.pm.parsing.component.ParsedIntentInfo>> p0, android.os.Parcel p1, int p2) {}
        public java.util.List<android.util.Pair<java.lang.String, android.content.pm.parsing.component.ParsedIntentInfo>> unparcel(android.os.Parcel p0) { return null; }
    }
}
