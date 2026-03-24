package com.android.internal.pm.pkg.parsing;

public class ParsingUtils {
    public static final java.lang.String TAG = "PackageParsing";
    public static final java.lang.String ANDROID_RES_NAMESPACE = "http://schemas.android.com/apk/res/android";
    public static final int DEFAULT_MIN_SDK_VERSION = 1;
    public static final int DEFAULT_MAX_SDK_VERSION = 2147483647;
    public static final int DEFAULT_TARGET_SDK_VERSION = 0;
    public static final int NOT_SET = -1;
    public ParsingUtils() {}
    @android.annotation.Nullable
    public static java.lang.String buildClassName(java.lang.String p0, java.lang.CharSequence p1) { return null; }
    @android.annotation.NonNull
    public static android.content.pm.parsing.result.ParseResult unknownTag(java.lang.String p0, com.android.internal.pm.pkg.parsing.ParsingPackage p1, android.content.res.XmlResourceParser p2, android.content.pm.parsing.result.ParseInput p3) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException { return null; }
    @android.annotation.NonNull
    public static <Interface extends java.lang.Object, Impl extends Interface> java.util.List<Interface> createTypedInterfaceList(android.os.Parcel p0, android.os.Parcelable.Creator<Impl> p1) { return null; }
    @android.annotation.NonNull
    public static void writeParcelableList(android.os.Parcel p0, java.util.List<?> p1) {}
    @android.annotation.NonNull
    public static android.content.pm.parsing.result.ParseResult<java.util.Set<java.lang.String>> parseKnownActivityEmbeddingCerts(android.content.res.TypedArray p0, android.content.res.Resources p1, int p2, android.content.pm.parsing.result.ParseInput p3) { return null; }

    public static class StringPairListParceler implements com.android.internal.util.Parcelling<java.util.List<android.util.Pair<java.lang.String, com.android.internal.pm.pkg.component.ParsedIntentInfo>>> {
        public StringPairListParceler() {}
        public void parcel(java.util.List<android.util.Pair<java.lang.String, com.android.internal.pm.pkg.component.ParsedIntentInfo>> p0, android.os.Parcel p1, int p2) {}
        public java.util.List<android.util.Pair<java.lang.String, com.android.internal.pm.pkg.component.ParsedIntentInfo>> unparcel(android.os.Parcel p0) { return null; }
    }
}
