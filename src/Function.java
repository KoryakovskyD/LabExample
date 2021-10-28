import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

//@Retention()
@Target(ElementType.METHOD)
public @interface Function {
    String value();
    int name();
}
