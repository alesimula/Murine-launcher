package android.text.util;

public class Linkify {
    public static final int WEB_URLS = 1;
    public static final int EMAIL_ADDRESSES = 2;
    public static final int PHONE_NUMBERS = 4;
    @java.lang.Deprecated
    public static final int MAP_ADDRESSES = 8;
    @java.lang.Deprecated
    public static final int ALL = 15;
    public static final android.text.util.Linkify.MatchFilter sUrlMatchFilter = null;
    public static final android.text.util.Linkify.MatchFilter sPhoneNumberMatchFilter = null;
    public static final android.text.util.Linkify.TransformFilter sPhoneNumberTransformFilter = null;
    public Linkify() {}
    public static final boolean addLinks(android.text.Spannable p0, int p1) { return false; }
    public static final boolean addLinks(android.text.Spannable p0, int p1, java.util.function.Function<java.lang.String, android.text.style.URLSpan> p2) { return false; }
    public static boolean containsUnsupportedCharacters(java.lang.String p0) { return false; }
    public static final boolean addLinks(android.widget.TextView p0, int p1) { return false; }
    public static final void addLinks(android.widget.TextView p0, java.util.regex.Pattern p1, java.lang.String p2) {}
    public static final void addLinks(android.widget.TextView p0, java.util.regex.Pattern p1, java.lang.String p2, android.text.util.Linkify.MatchFilter p3, android.text.util.Linkify.TransformFilter p4) {}
    public static final void addLinks(android.widget.TextView p0, java.util.regex.Pattern p1, java.lang.String p2, java.lang.String[] p3, android.text.util.Linkify.MatchFilter p4, android.text.util.Linkify.TransformFilter p5) {}
    public static final boolean addLinks(android.text.Spannable p0, java.util.regex.Pattern p1, java.lang.String p2) { return false; }
    public static final boolean addLinks(android.text.Spannable p0, java.util.regex.Pattern p1, java.lang.String p2, android.text.util.Linkify.MatchFilter p3, android.text.util.Linkify.TransformFilter p4) { return false; }
    public static final boolean addLinks(android.text.Spannable p0, java.util.regex.Pattern p1, java.lang.String p2, java.lang.String[] p3, android.text.util.Linkify.MatchFilter p4, android.text.util.Linkify.TransformFilter p5) { return false; }
    public static final boolean addLinks(android.text.Spannable p0, java.util.regex.Pattern p1, java.lang.String p2, java.lang.String[] p3, android.text.util.Linkify.MatchFilter p4, android.text.util.Linkify.TransformFilter p5, java.util.function.Function<java.lang.String, android.text.style.URLSpan> p6) { return false; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LinkifyMask {
    }

    public static interface MatchFilter {
        public boolean acceptMatch(java.lang.CharSequence p0, int p1, int p2);
    }

    public static interface TransformFilter {
        public java.lang.String transformUrl(java.util.regex.Matcher p0, java.lang.String p1);
    }
}
