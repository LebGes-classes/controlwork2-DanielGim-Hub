class Worker extends Person {
    private String position;

    public Worker(String name, String position) {
        super(name);
        this.position = position;
    }

    public void introduce() {
        System.out.println("Здравствуйте, я сотрудник магазина. Меня зовут " + getName() + ", и я работаю на должности " + position + ".");
    }
}