package android.text;

public class Html {
    public static final int TO_HTML_PARAGRAPH_LINES_CONSECUTIVE = 0;
    public static final int TO_HTML_PARAGRAPH_LINES_INDIVIDUAL = 1;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_PARAGRAPH = 1;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_HEADING = 2;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_LIST_ITEM = 4;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_LIST = 8;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_DIV = 16;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_BLOCKQUOTE = 32;
    public static final int FROM_HTML_OPTION_USE_CSS_COLORS = 256;
    public static final int FROM_HTML_MODE_LEGACY = 0;
    public static final int FROM_HTML_MODE_COMPACT = 63;
    private static final int TO_HTML_PARAGRAPH_FLAG = 1;
    private Html() {}
    @java.lang.Deprecated
    public static android.text.Spanned fromHtml(java.lang.String p0) { return null; }
    public static android.text.Spanned fromHtml(java.lang.String p0, int p1) { return null; }
    @java.lang.Deprecated
    public static android.text.Spanned fromHtml(java.lang.String p0, android.text.Html.ImageGetter p1, android.text.Html.TagHandler p2) { return null; }
    public static android.text.Spanned fromHtml(java.lang.String p0, int p1, android.text.Html.ImageGetter p2, android.text.Html.TagHandler p3) { return null; }
    @java.lang.Deprecated
    public static java.lang.String toHtml(android.text.Spanned p0) { return null; }
    public static java.lang.String toHtml(android.text.Spanned p0, int p1) { return null; }
    public static java.lang.String escapeHtml(java.lang.CharSequence p0) { return null; }
    private static void withinHtml(java.lang.StringBuilder p0, android.text.Spanned p1, int p2) {}
    private static void encodeTextAlignmentByDiv(java.lang.StringBuilder p0, android.text.Spanned p1, int p2) {}
    private static void withinDiv(java.lang.StringBuilder p0, android.text.Spanned p1, int p2, int p3, int p4) {}
    private static java.lang.String getTextDirection(android.text.Spanned p0, int p1, int p2) { return null; }
    private static java.lang.String getTextStyles(android.text.Spanned p0, int p1, int p2, boolean p3, boolean p4) { return null; }
    private static void withinBlockquote(java.lang.StringBuilder p0, android.text.Spanned p1, int p2, int p3, int p4) {}
    private static void withinBlockquoteIndividual(java.lang.StringBuilder p0, android.text.Spanned p1, int p2, int p3) {}
    private static void withinBlockquoteConsecutive(java.lang.StringBuilder p0, android.text.Spanned p1, int p2, int p3) {}
    private static void withinParagraph(java.lang.StringBuilder p0, android.text.Spanned p1, int p2, int p3) {}
    @android.annotation.UnsupportedAppUsage
    private static void withinStyle(java.lang.StringBuilder p0, java.lang.CharSequence p1, int p2, int p3) {}

    public static interface TagHandler {
        public void handleTag(boolean p0, java.lang.String p1, android.text.Editable p2, org.xml.sax.XMLReader p3);
    }

    public static interface ImageGetter {
        public android.graphics.drawable.Drawable getDrawable(java.lang.String p0);
    }

    private static class HtmlParser {
        private HtmlParser() {}
    }
}
