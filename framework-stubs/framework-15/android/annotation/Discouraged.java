package android.annotation;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
@java.lang.annotation.Target({java.lang.annotation.ElementType.CONSTRUCTOR, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.TYPE})
public @interface Discouraged {
    public java.lang.String message();
}
