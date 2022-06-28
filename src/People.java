public class People {
    private String name;
    private int age;
    private float money;

    public People(String name, int age, float money) {
        this.name = name;
        this.age = age;
        this.money = money;
    }

    public People(String name, int age ) {
        this.name = name;
        this.age = age;


    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getMoney() {
        return money;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", money=" + money +
                '}';
    }




}
