package catsTable.model.domain;


import catsTable.model.service.CatIdGenerator;

public class Cat {
    private String name;
    private int weigh;
    private CatColor color;
    private int age;
    private int id;

    public Cat() {
        id = (int) CatIdGenerator.generateId();
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat(String name, int weigh, CatColor color, int age) {
        this();

        this.name = name;
        this.weigh = weigh;
        this.color = color;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeigh() {
        return weigh;
    }

    public void setWeigh(int weigh) {
        this.weigh = weigh;
    }

    public CatColor getColor() {
        return color;
    }

    public void setColor(CatColor color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", weigh=" + weigh +
                ", color=" + color +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
