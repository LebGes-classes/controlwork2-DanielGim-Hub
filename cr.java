public class cr {
    public static void main(String[] args) {
        Person[] people = {
                new Worker("Даниэль Гимаев", "Кассир"),
                new Worker("Кадим Арсланов", "Продавец"),
                new Worker("Саня Энергосов", "Продавец-консультант"),
                new Visitor("Света Бережная", 23),
                new Visitor("Каролина Новикова", 42)
        };

        for (Person person : people) {
            person.introduce();
        }
    }
}