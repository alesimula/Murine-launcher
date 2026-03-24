package dalvik.annotation.codegen;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface CovariantReturnType {
    java.lang.Class returnType() default void.class;
    int presentAfter() default 0;
}
