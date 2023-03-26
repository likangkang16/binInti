package mode;

import org.springframework.stereotype.Component;

import java.awt.print.Pageable;

/**
 * @ClassName Uers
 * @Description //TODO
 * @Author lkk
 * Date 2023/03/22/14:40
 * @Version 1.0
 **/
@Component
public class Uers {

    private String name;
    private String age;

    public Uers(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public Uers() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }


    public void  show(){
        System.out.println("初始化....");
    }

    public void  showAuto(){
        System.out.println("auto初始化....");
    }


    @Override
    public String toString() {
        return "Uers{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
