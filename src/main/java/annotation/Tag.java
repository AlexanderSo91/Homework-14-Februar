package annotation;



import java.lang.annotation.*;
import java.security.cert.Extension;


@Target({ElementType.METHOD,ElementType.TYPE,ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Tag {

    String name();

    String description() default "";

    ExternalDocumentation externalDocs() default @ExternalDocumentation;

    Extension[] extensions() default {};

    class ExternalDocumentation {
    }
}
