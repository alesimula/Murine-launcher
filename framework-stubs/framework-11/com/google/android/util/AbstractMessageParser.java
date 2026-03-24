package com.google.android.util;

public abstract class AbstractMessageParser {
    public static final java.lang.String musicNote = "♫ ";
    private java.lang.String text;
    private int nextChar;
    private int nextClass;
    private java.util.ArrayList<com.google.android.util.AbstractMessageParser.Part> parts;
    private java.util.ArrayList<com.google.android.util.AbstractMessageParser.Token> tokens;
    private java.util.HashMap<java.lang.Character, com.google.android.util.AbstractMessageParser.Format> formatStart;
    private boolean parseSmilies;
    private boolean parseAcronyms;
    private boolean parseFormatting;
    private boolean parseUrls;
    private boolean parseMeText;
    private boolean parseMusic;
    protected abstract com.google.android.util.AbstractMessageParser.Resources getResources();
    public AbstractMessageParser(java.lang.String p0) {}
    public AbstractMessageParser(java.lang.String p0, boolean p1, boolean p2, boolean p3, boolean p4, boolean p5, boolean p6) {}
    public final java.lang.String getRawText() { return null; }
    public final int getPartCount() { return 0; }
    public final com.google.android.util.AbstractMessageParser.Part getPart(int p0) { return null; }
    public final java.util.List<com.google.android.util.AbstractMessageParser.Part> getParts() { return null; }
    public void parse() {}
    public static com.google.android.util.AbstractMessageParser.Token tokenForUrl(java.lang.String p0, java.lang.String p1) { return null; }
    private void buildParts(java.lang.String p0) {}
    private com.google.android.util.AbstractMessageParser.Part lastPart() { return null; }
    private boolean parseMusicTrack() { return false; }
    private void parseText() {}
    private boolean parseSmiley() { return false; }
    private boolean parseAcronym() { return false; }
    private boolean isDomainChar(char p0) { return false; }
    private boolean isValidDomain(java.lang.String p0) { return false; }
    private boolean parseURL() { return false; }
    private void addURLToken(java.lang.String p0, java.lang.String p1) {}
    private boolean parseFormatting() { return false; }
    private boolean isWordBreak(int p0) { return false; }
    private boolean isSmileyBreak(int p0) { return false; }
    private boolean isURLBreak(int p0) { return false; }
    private int getCharClass(int p0) { return 0; }
    private static boolean isSmileyBreak(char p0, char p1) { return false; }
    private static boolean isPunctuation(char p0) { return false; }
    private static boolean isFormatChar(char p0) { return false; }
    private void addToken(com.google.android.util.AbstractMessageParser.Token p0) {}
    public java.lang.String toHtml() { return null; }
    protected static java.lang.String reverse(java.lang.String p0) { return null; }
    private static boolean matches(com.google.android.util.AbstractMessageParser.TrieNode p0, java.lang.String p1) { return false; }
    private static com.google.android.util.AbstractMessageParser.TrieNode longestMatch(com.google.android.util.AbstractMessageParser.TrieNode p0, com.google.android.util.AbstractMessageParser p1, int p2) { return null; }
    private static com.google.android.util.AbstractMessageParser.TrieNode longestMatch(com.google.android.util.AbstractMessageParser.TrieNode p0, com.google.android.util.AbstractMessageParser p1, int p2, boolean p3) { return null; }

    public static class Acronym extends com.google.android.util.AbstractMessageParser.Token {
        private java.lang.String value;
        public Acronym(java.lang.String p0, java.lang.String p1) { super(null, null); }
        public java.lang.String getValue() { return null; }
        public boolean isHtml() { return false; }
        public java.util.List<java.lang.String> getInfo() { return null; }
    }

    public static class FlickrPhoto extends com.google.android.util.AbstractMessageParser.Token {
        private static final java.util.regex.Pattern URL_PATTERN = null;
        private static final java.util.regex.Pattern GROUPING_PATTERN = null;
        private static final java.lang.String SETS = "sets";
        private static final java.lang.String TAGS = "tags";
        private java.lang.String user;
        private java.lang.String photo;
        private java.lang.String grouping;
        private java.lang.String groupingId;
        public FlickrPhoto(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) { super(null, null); }
        public java.lang.String getUser() { return null; }
        public java.lang.String getPhoto() { return null; }
        public java.lang.String getGrouping() { return null; }
        public java.lang.String getGroupingId() { return null; }
        public boolean isHtml() { return false; }
        public boolean isMedia() { return false; }
        public static com.google.android.util.AbstractMessageParser.FlickrPhoto matchURL(java.lang.String p0, java.lang.String p1) { return null; }
        public java.util.List<java.lang.String> getInfo() { return null; }
        public java.lang.String getUrl() { return null; }
        public static java.lang.String getRssUrl(java.lang.String p0) { return null; }
        public static java.lang.String getTagsURL(java.lang.String p0) { return null; }
        public static java.lang.String getUserURL(java.lang.String p0) { return null; }
        public static java.lang.String getPhotoURL(java.lang.String p0, java.lang.String p1) { return null; }
        public static java.lang.String getUserTagsURL(java.lang.String p0, java.lang.String p1) { return null; }
        public static java.lang.String getUserSetsURL(java.lang.String p0, java.lang.String p1) { return null; }
    }

    public static class Format extends com.google.android.util.AbstractMessageParser.Token {
        private char ch;
        private boolean start;
        private boolean matched;
        public Format(char p0, boolean p1) { super(null, null); }
        public void setMatched(boolean p0) {}
        public boolean isHtml() { return false; }
        public java.lang.String toHtml(boolean p0) { return null; }
        public java.util.List<java.lang.String> getInfo() { return null; }
        public boolean controlCaps() { return false; }
        public boolean setCaps() { return false; }
        private java.lang.String getFormatStart(char p0) { return null; }
        private java.lang.String getFormatEnd(char p0) { return null; }
    }

    public static class Html extends com.google.android.util.AbstractMessageParser.Token {
        private java.lang.String html;
        public Html(java.lang.String p0, java.lang.String p1) { super(null, null); }
        public boolean isHtml() { return false; }
        public java.lang.String toHtml(boolean p0) { return null; }
        public java.util.List<java.lang.String> getInfo() { return null; }
        public void trimLeadingWhitespace() {}
        public void trimTrailingWhitespace() {}
        private static java.lang.String trimLeadingWhitespace(java.lang.String p0) { return null; }
        public static java.lang.String trimTrailingWhitespace(java.lang.String p0) { return null; }
    }

    public static class Link extends com.google.android.util.AbstractMessageParser.Token {
        private java.lang.String url;
        public Link(java.lang.String p0, java.lang.String p1) { super(null, null); }
        public java.lang.String getURL() { return null; }
        public boolean isHtml() { return false; }
        public java.util.List<java.lang.String> getInfo() { return null; }
    }

    public static class MusicTrack extends com.google.android.util.AbstractMessageParser.Token {
        private java.lang.String track;
        public MusicTrack(java.lang.String p0) { super(null, null); }
        public java.lang.String getTrack() { return null; }
        public boolean isHtml() { return false; }
        public java.util.List<java.lang.String> getInfo() { return null; }
    }

    public static class Part {
        private java.lang.String meText;
        private java.util.ArrayList<com.google.android.util.AbstractMessageParser.Token> tokens;
        public Part() {}
        public java.lang.String getType(boolean p0) { return null; }
        private java.lang.String getPartType() { return null; }
        public boolean isMedia() { return false; }
        public com.google.android.util.AbstractMessageParser.Token getMediaToken() { return null; }
        public void add(com.google.android.util.AbstractMessageParser.Token p0) {}
        public void setMeText(java.lang.String p0) {}
        public java.lang.String getRawText() { return null; }
        public java.util.ArrayList<com.google.android.util.AbstractMessageParser.Token> getTokens() { return null; }
    }

    public static class Photo extends com.google.android.util.AbstractMessageParser.Token {
        private static final java.util.regex.Pattern URL_PATTERN = null;
        private java.lang.String user;
        private java.lang.String album;
        private java.lang.String photo;
        public Photo(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) { super(null, null); }
        public java.lang.String getUser() { return null; }
        public java.lang.String getAlbum() { return null; }
        public java.lang.String getPhoto() { return null; }
        public boolean isHtml() { return false; }
        public boolean isMedia() { return false; }
        public static com.google.android.util.AbstractMessageParser.Photo matchURL(java.lang.String p0, java.lang.String p1) { return null; }
        public java.util.List<java.lang.String> getInfo() { return null; }
        public static java.lang.String getRssUrl(java.lang.String p0) { return null; }
        public static java.lang.String getAlbumURL(java.lang.String p0, java.lang.String p1) { return null; }
        public static java.lang.String getPhotoURL(java.lang.String p0, java.lang.String p1, java.lang.String p2) { return null; }
    }

    public static interface Resources {
        public java.util.Set<java.lang.String> getSchemes();
        public com.google.android.util.AbstractMessageParser.TrieNode getDomainSuffixes();
        public com.google.android.util.AbstractMessageParser.TrieNode getSmileys();
        public com.google.android.util.AbstractMessageParser.TrieNode getAcronyms();
    }

    public static class Smiley extends com.google.android.util.AbstractMessageParser.Token {
        public Smiley(java.lang.String p0) { super(null, null); }
        public boolean isHtml() { return false; }
        public java.util.List<java.lang.String> getInfo() { return null; }
    }

    public static abstract class Token {
        protected com.google.android.util.AbstractMessageParser.Token.Type type;
        protected java.lang.String text;
        protected Token(com.google.android.util.AbstractMessageParser.Token.Type p0, java.lang.String p1) {}
        public com.google.android.util.AbstractMessageParser.Token.Type getType() { return null; }
        public java.util.List<java.lang.String> getInfo() { return null; }
        public java.lang.String getRawText() { return null; }
        public boolean isMedia() { return false; }
        public abstract boolean isHtml();
        public boolean isArray() { return false; }
        public java.lang.String toHtml(boolean p0) { return null; }
        public boolean controlCaps() { return false; }
        public boolean setCaps() { return false; }

        public static enum Type {
            HTML,
            FORMAT,
            LINK,
            SMILEY,
            ACRONYM,
            MUSIC,
            GOOGLE_VIDEO,
            YOUTUBE_VIDEO,
            PHOTO,
            FLICKR;
            private java.lang.String stringRep;
            private Type() {}
            public java.lang.String toString() { return null; }
        }
    }

    public static class TrieNode {
        private final java.util.HashMap<java.lang.Character, com.google.android.util.AbstractMessageParser.TrieNode> children = null;
        private java.lang.String text;
        private java.lang.String value;
        public TrieNode() {}
        public TrieNode(java.lang.String p0) {}
        public final boolean exists() { return false; }
        public final java.lang.String getText() { return null; }
        public final java.lang.String getValue() { return null; }
        public void setValue(java.lang.String p0) {}
        public com.google.android.util.AbstractMessageParser.TrieNode getChild(char p0) { return null; }
        public com.google.android.util.AbstractMessageParser.TrieNode getOrCreateChild(char p0) { return null; }
        public static void addToTrie(com.google.android.util.AbstractMessageParser.TrieNode p0, java.lang.String p1, java.lang.String p2) {}
    }

    public static class Video extends com.google.android.util.AbstractMessageParser.Token {
        private static final java.util.regex.Pattern URL_PATTERN = null;
        private java.lang.String docid;
        public Video(java.lang.String p0, java.lang.String p1) { super(null, null); }
        public java.lang.String getDocID() { return null; }
        public boolean isHtml() { return false; }
        public boolean isMedia() { return false; }
        public static com.google.android.util.AbstractMessageParser.Video matchURL(java.lang.String p0, java.lang.String p1) { return null; }
        public java.util.List<java.lang.String> getInfo() { return null; }
        public static java.lang.String getRssUrl(java.lang.String p0) { return null; }
        public static java.lang.String getURL(java.lang.String p0) { return null; }
        public static java.lang.String getURL(java.lang.String p0, java.lang.String p1) { return null; }
    }

    public static class YouTubeVideo extends com.google.android.util.AbstractMessageParser.Token {
        private static final java.util.regex.Pattern URL_PATTERN = null;
        private java.lang.String docid;
        public YouTubeVideo(java.lang.String p0, java.lang.String p1) { super(null, null); }
        public java.lang.String getDocID() { return null; }
        public boolean isHtml() { return false; }
        public boolean isMedia() { return false; }
        public static com.google.android.util.AbstractMessageParser.YouTubeVideo matchURL(java.lang.String p0, java.lang.String p1) { return null; }
        public java.util.List<java.lang.String> getInfo() { return null; }
        public static java.lang.String getRssUrl(java.lang.String p0) { return null; }
        public static java.lang.String getURL(java.lang.String p0) { return null; }
        public static java.lang.String getURL(java.lang.String p0, java.lang.String p1) { return null; }
        public static java.lang.String getPrefixedURL(boolean p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) { return null; }
    }
}
