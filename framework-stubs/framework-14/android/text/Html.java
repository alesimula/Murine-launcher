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

    public static interface TagHandler {
        public void handleTag(boolean p0, java.lang.String p1, android.text.Editable p2, org.xml.sax.XMLReader p3);
    }

    public static interface ImageGetter {
        public android.graphics.drawable.Drawable getDrawable(java.lang.String p0);
    }

    private static class HtmlParser {
    }
}
