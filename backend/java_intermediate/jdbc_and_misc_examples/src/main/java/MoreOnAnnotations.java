import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
* Modern day coding involves POJO based design
* Plain Ordinary Java Objects (Java Beans)
* You just build applications by creating ordinary java classes and using Annotations
* */

public class MoreOnAnnotations {
    public static void main(String[] args) {
        // Annotations are constructs that you add on your code without changing the fundamental design
        // Annotations are similar to adding metadata in your code
        Person person = new Person("Joe", 34);
        Class personCls = person.getClass();
        MyComment myComment = (MyComment) personCls.getDeclaredAnnotation(MyComment.class);
        System.out.println(myComment.value());
        if(myComment.value().contains("Useless")) {
            throw new RuntimeException("Stop using useless class: " + personCls.getName());
        }
        for (Field field : personCls.getDeclaredFields()) {
            field.setAccessible(true);
            MyComment fieldComment = (MyComment) field.getAnnotation(MyComment.class);
            System.out.println(field.getName() + ": " + fieldComment.value());
        }
        for (Method method : personCls.getDeclaredMethods()) {
            method.setAccessible(true);
            MyComment methodComment = (MyComment) method.getAnnotation(MyComment.class);
            System.out.println(method.getName() + ": " + methodComment.value());
        }
    }
}

@MyComment("Useful class")
class Person {
    @MyComment("give your firstname and lastname")
    private String name;
    @MyComment("value should be less than 80")
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @MyComment("don't eat too much carbohydrates")
    public void eat() {
        System.out.println(this.name + " is eating");
    }
}

@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.FIELD, ElementType.METHOD, ElementType.TYPE})
@interface MyComment {
    String value();
}

