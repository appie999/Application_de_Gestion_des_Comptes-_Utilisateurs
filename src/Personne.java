public class Personne {

            private int id , age;
            private String name;

     Personne(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public Personne() {

    }

     int getId() {
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

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
