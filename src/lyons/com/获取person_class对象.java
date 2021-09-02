package lyons.com;

import org.junit.Test;

public class 获取person_class对象 {
    @Test

    public void testClassFor(){
        //1.通过类的实例来获取
        Person person = new Person();
        Class<? extends Person> clazz1 = person.getClass();
        System.out.println("01 - "+clazz1);
        // 2.通过类直接调用class获取
        Class<Person> clazz2 = Person.class;
        System.out.println("02 - " + clazz2);
        // 3.通过Class.forName获取
        Class<?> clazz3 = null;
        try {
            clazz3 = Class.forName("lyons.com.Person");
        } catch (ClassNotFoundException e) {
            // 当找不到指定类时，会抛出此异常
            e.printStackTrace();
        }
        System.out.println("03 - " + clazz3);
        // 4.通过类加载器获取
        ClassLoader classLoader = this.getClass().getClassLoader();
        Class<?> clazz4 = null;
        try {
            clazz4 = classLoader.loadClass("lyons.com.Person");
        } catch (ClassNotFoundException e) {
            // 当找不到指定类时，会抛出此异常
            e.printStackTrace();
        }
        System.out.println("04 - " + clazz4);
    }


}
