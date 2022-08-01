package org.example;

public class Main {
    public static void main(String[] args) {
        Gryffindor harry = new Gryffindor("Гарри", "Поттер", 10, 10, 10, 10, 10);
        Gryffindor germiona = new Gryffindor("Гермиона ", "Грейнджер ", 12, 5, 2, 5, 7);
        Gryffindor ron = new Gryffindor("Рон ", "Уизли ", 10, 12, 1, 5, 1);
        System.out.println(Gryffindor.getBestOfTheBest(harry, germiona));

        Slytherin drako = new Slytherin("Драко", "Малфой", 12, 0, 12, 0, 22, 4, 6);
        Slytherin graham = new Slytherin("Грэхэм", "Монтегю", 12, 0, 12, 12, 2, 4, 60);
        Slytherin greg = new Slytherin("Грегори", "Гойл", 12, 0, 12, 10, 2, 46, 6);
        System.out.println(Slytherin.getBestOfTheBest(drako, greg));

        Hufflepuff zachariah = new Hufflepuff("Захария", "Смит", 90, 12, 5, 2, 56);
        Hufflepuff cedric = new Hufflepuff("Седрик", "Диггори", 90, 12, 5, 2, 56);
        Hufflepuff justin = new Hufflepuff("Джастин", "Финч-Флетчли", 90, 12, 5, 2, 56);
        System.out.println(Hufflepuff.getBestOfTheBest(justin, zachariah));

        Ravenclaw Zhou = new Ravenclaw("Чжоу", "Чанг", 1, 11, 6, 2, 22, 65);
        Ravenclaw padma = new Ravenclaw("Падма", "Патил", 12, 12, 12, 2, 21, 65);
        Ravenclaw markus = new Ravenclaw("Маркус", "Белби", 15, 72, 62, 2, 22, 65);
        System.out.println(Ravenclaw.getBestOfTheBest(Zhou, padma));

        System.out.println(Hogwarts.getBestOfTheBest(harry, drako));
    }
}