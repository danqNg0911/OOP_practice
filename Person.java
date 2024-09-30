public class Person {
    String name;
    short birth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirth() {
        return birth;
    }

    public void setBirth(short birth) {
        this.birth = birth;
    }

    public Person() {

    }

    public Person(String name, short birth) {
        this.name = name;
        this.birth = birth;
    }
}
