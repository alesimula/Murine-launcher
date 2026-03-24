package android.app.appsearch.ast;

@android.annotation.FlaggedApi("com.android.appsearch.flags.enable_abstract_syntax_trees")
public interface Node {
    @android.annotation.NonNull
    default public java.util.List<android.app.appsearch.ast.Node> getChildren() { return null; }
}
