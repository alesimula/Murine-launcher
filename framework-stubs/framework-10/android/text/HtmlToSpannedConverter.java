package android.text;

class HtmlToSpannedConverter {
    private static final float[] HEADING_SIZES = null;
    private java.lang.String mSource;
    private android.text.SpannableStringBuilder mSpannableStringBuilder;
    private android.text.Html.ImageGetter mImageGetter;
    private android.text.Html.TagHandler mTagHandler;
    private int mFlags;
    private static java.util.regex.Pattern sTextAlignPattern;
    private static java.util.regex.Pattern sForegroundColorPattern;
    private static java.util.regex.Pattern sBackgroundColorPattern;
    private static java.util.regex.Pattern sTextDecorationPattern;
    private static final java.util.Map<java.lang.String, java.lang.Integer> sColorMap = null;
    private static java.util.regex.Pattern getTextAlignPattern() { return null; }
    private static java.util.regex.Pattern getForegroundColorPattern() { return null; }
    private static java.util.regex.Pattern getBackgroundColorPattern() { return null; }
    private static java.util.regex.Pattern getTextDecorationPattern() { return null; }
    public HtmlToSpannedConverter(java.lang.String p0, android.text.Html.ImageGetter p1, android.text.Html.TagHandler p2, org.ccil.cowan.tagsoup.Parser p3, int p4) {}
    public android.text.Spanned convert() { return null; }
    private void handleStartTag(java.lang.String p0, org.xml.sax.Attributes p1) {}
    private void handleEndTag(java.lang.String p0) {}
    private int getMarginParagraph() { return 0; }
    private int getMarginHeading() { return 0; }
    private int getMarginListItem() { return 0; }
    private int getMarginList() { return 0; }
    private int getMarginDiv() { return 0; }
    private int getMarginBlockquote() { return 0; }
    private int getMargin(int p0) { return 0; }
    private static void appendNewlines(android.text.Editable p0, int p1) {}
    private static void startBlockElement(android.text.Editable p0, org.xml.sax.Attributes p1, int p2) {}
    private static void endBlockElement(android.text.Editable p0) {}
    private static void handleBr(android.text.Editable p0) {}
    private void startLi(android.text.Editable p0, org.xml.sax.Attributes p1) {}
    private static void endLi(android.text.Editable p0) {}
    private void startBlockquote(android.text.Editable p0, org.xml.sax.Attributes p1) {}
    private static void endBlockquote(android.text.Editable p0) {}
    private void startHeading(android.text.Editable p0, org.xml.sax.Attributes p1, int p2) {}
    private static void endHeading(android.text.Editable p0) {}
    private static <T extends java.lang.Object> T getLast(android.text.Spanned p0, java.lang.Class<T> p1) { return null; }
    private static void setSpanFromMark(android.text.Spannable p0, java.lang.Object p1, java.lang.Object... p2) {}
    private static void start(android.text.Editable p0, java.lang.Object p1) {}
    private static void end(android.text.Editable p0, java.lang.Class p1, java.lang.Object p2) {}
    private void startCssStyle(android.text.Editable p0, org.xml.sax.Attributes p1) {}
    private static void endCssStyle(android.text.Editable p0) {}
    private static void startImg(android.text.Editable p0, org.xml.sax.Attributes p1, android.text.Html.ImageGetter p2) {}
    private void startFont(android.text.Editable p0, org.xml.sax.Attributes p1) {}
    private static void endFont(android.text.Editable p0) {}
    private static void startA(android.text.Editable p0, org.xml.sax.Attributes p1) {}
    private static void endA(android.text.Editable p0) {}
    private int getHtmlColor(java.lang.String p0) { return 0; }
    public void setDocumentLocator(org.xml.sax.Locator p0) {}
    public void startDocument() throws org.xml.sax.SAXException {}
    public void endDocument() throws org.xml.sax.SAXException {}
    public void startPrefixMapping(java.lang.String p0, java.lang.String p1) throws org.xml.sax.SAXException {}
    public void endPrefixMapping(java.lang.String p0) throws org.xml.sax.SAXException {}
    public void startElement(java.lang.String p0, java.lang.String p1, java.lang.String p2, org.xml.sax.Attributes p3) throws org.xml.sax.SAXException {}
    public void endElement(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws org.xml.sax.SAXException {}
    public void characters(char[] p0, int p1, int p2) throws org.xml.sax.SAXException {}
    public void ignorableWhitespace(char[] p0, int p1, int p2) throws org.xml.sax.SAXException {}
    public void processingInstruction(java.lang.String p0, java.lang.String p1) throws org.xml.sax.SAXException {}
    public void skippedEntity(java.lang.String p0) throws org.xml.sax.SAXException {}

    private static class Underline {
        private Underline() {}
    }

    private static class Super {
        private Super() {}
    }

    private static class Sub {
        private Sub() {}
    }

    private static class Strikethrough {
        private Strikethrough() {}
    }

    private static class Small {
        private Small() {}
    }

    private static class Newline {
        private int mNumNewlines;
        public Newline(int p0) {}
    }

    private static class Monospace {
        private Monospace() {}
    }

    private static class Italic {
        private Italic() {}
    }

    private static class Href {
        public java.lang.String mHref;
        public Href(java.lang.String p0) {}
    }

    private static class Heading {
        private int mLevel;
        public Heading(int p0) {}
    }

    private static class Foreground {
        private int mForegroundColor;
        public Foreground(int p0) {}
    }

    private static class Font {
        public java.lang.String mFace;
        public Font(java.lang.String p0) {}
    }

    private static class Bullet {
        private Bullet() {}
    }

    private static class Bold {
        private Bold() {}
    }

    private static class Blockquote {
        private Blockquote() {}
    }

    private static class Big {
        private Big() {}
    }

    private static class Background {
        private int mBackgroundColor;
        public Background(int p0) {}
    }

    private static class Alignment {
        private android.text.Layout.Alignment mAlignment;
        public Alignment(android.text.Layout.Alignment p0) {}
    }
}
