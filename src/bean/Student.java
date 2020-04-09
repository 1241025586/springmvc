package bean;

import java.util.List;

public class Student {
    private Integer id;
    private String name;
    private  String age;

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    private Integer sex;
    public Student(int i, String s, String s1) {
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sex=" + sex +
                '}';
    }

    public Student(Integer id, String name, String age, List<String> sex) {
        this.id = id;
        this.name = name;
        this.age = age;
   
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    

   

    public void getId(int i) {
    }

    public void getName(String 姓名) {
    }
}
