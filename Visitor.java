class Visitor extends Person {
    private int age;

    public Visitor(String name, int age) {
        super(name);
        this.age = age;
    }

    public void introduce() {
        System.out.println("Привет! Я посетитель магазина. Меня зовут " + getName() + ", и мне " + age + " лет.");
    }
}