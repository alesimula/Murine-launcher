package android.app.appsearch.ast;

@android.annotation.FlaggedApi("com.android.appsearch.flags.enable_abstract_syntax_trees")
public final class TextNode implements android.app.appsearch.ast.Node {
    public TextNode(android.app.appsearch.ast.TextNode p0) {}
    public TextNode(java.lang.String p0) {}
    @android.annotation.NonNull
    public java.lang.String getValue() { return null; }
    public boolean isPrefix() { return false; }
    public boolean isVerbatim() { return false; }
    public void setPrefix(boolean p0) {}
    public void setValue(java.lang.String p0) {}
    public void setVerbatim(boolean p0) {}
}
