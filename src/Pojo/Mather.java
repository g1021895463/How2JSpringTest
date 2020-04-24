package Pojo;

public class Mather {

    protected String name;
    protected int age;
    protected Daughter daughter;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public Daughter getDaughter() {
        return this.daughter;
    }

    public void setDaughter(Daughter daughter) {
        this.daughter = daughter;
    }
}
