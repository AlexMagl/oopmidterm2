package midterm;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    private String name;
    private int age;

    // Constructor, getters, and setters

    public Professor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
