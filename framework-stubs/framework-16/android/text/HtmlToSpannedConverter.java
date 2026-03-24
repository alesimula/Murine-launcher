package android.text;

class HtmlToSpannedConverter {
    public HtmlToSpannedConverter(java.lang.String p0, android.text.Html.ImageGetter p1, android.text.Html.TagHandler p2, org.ccil.cowan.tagsoup.Parser p3, int p4) {}
    public android.text.Spanned convert() { return null; }
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

    private static class Alignment {
        public Alignment(android.text.Layout.Alignment p0) {}
    }

    private static class Background {
        public Background(int p0) {}
    }

    private static class Big {
    }

    private static class Blockquote {
    }

    private static class Bold {
    }

    private static class Bullet {
    }

    private static class Font {
        public java.lang.String mFace;
        public Font(java.lang.String p0) {}
    }

    private static class Foreground {
        public Foreground(int p0) {}
    }

    private static class Heading {
        public Heading(int p0) {}
    }

    private static class Href {
        public java.lang.String mHref;
        public Href(java.lang.String p0) {}
    }

    private static class Italic {
    }

    private static class Monospace {
    }

    private static class Newline {
        public Newline(int p0) {}
    }

    private static class Small {
    }

    private static class Strikethrough {
    }

    private static class Sub {
    }

    private static class Super {
    }

    private static class Underline {
    }
}
