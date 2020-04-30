public class Main {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Макс", 10),
                new Cat("Димончик", 25),
                new Cat("Плюш", 15),
                new Cat("Тузик", 5),
                new Cat("Не придумал", 1)
        };

        Plate plate = new Plate(32);

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }

        plate.addFood(50);
        plate.info();
    }
    }

