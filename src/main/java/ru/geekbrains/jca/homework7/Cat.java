package ru.geekbrains.jca.homework7;

public class Cat {
    private String name;
    private int appetite;


    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }


//    public void eat(Bowl bowl) {  // Вариант проверки сытости без создания новых полей
//        System.out.printf("Cat %s ready to eat\n", this.name);
//        if (bowl.decreaseFood(this.appetite) == true) {
//            System.out.printf("Cat %s is full\n", this.name);
//        } else System.out.printf("Cat %s isn't full\n", this.name);
//    }


    public void eat2_3(Bowl bowl) {
        System.out.printf("Cat %s ready to eat\n", this.name);
        bowl.decreaseFoodExercises2_3(this.appetite);
        System.out.printf("Cat %s is full. It is %s\n", this.name, bowl.getfullness());
    }

    public void eat4 (Bowl bowl) {
        System.out.printf("Cat %s ready to eat\n", this.name);
        bowl.decreaseFoodExercises4(this.appetite);
        if (bowl.getfullness()) {
        System.out.printf("Cat %s is full. It is %s\n", this.name, bowl.getfullness());
        } else System.out.printf("Cat %s don't eat\n", this.name);
   }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                '}';
    }
}
