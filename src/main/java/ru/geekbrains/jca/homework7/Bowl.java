package ru.geekbrains.jca.homework7;

public class Bowl {
    private int foodAmount;
    private boolean fullness = false;

    public Bowl(int foodAmount) { // метод для добавления еды в тарелку
        this.foodAmount = foodAmount;
        if (foodAmount < 0) this.foodAmount = 0;
    }

//    public boolean decreaseFood(int amount) { // Вариант проверки сытости без создания новых полей
//        if (foodAmount < amount) {
//            amount = this.foodAmount;
//            this.foodAmount -= amount;
//            System.out.printf("Bowl decreased by %d food, now remain: %d\n", amount, this.foodAmount);
//            return false;
//        }
//        this.foodAmount -= amount;
//        System.out.printf("Bowl decreased by %d food, now remain: %d\n", amount, this.foodAmount);
//        return true;
//    }


    public boolean decreaseFoodExercises2_3(int amount) {
        if (foodAmount > amount) {
            fullness = true;
        } else fullness = false;
        if (!fullness) amount = this.foodAmount;
        this.foodAmount -= amount;
        System.out.printf("Bowl decreased by %d food, now remain: %d\n", amount, this.foodAmount);
        return true;
    }

    public boolean decreaseFoodExercises4 (int amount) {
        if (foodAmount > amount) {
            fullness = true;
        } else fullness = false;
        if (fullness) {
        this.foodAmount -= amount;
        System.out.printf("Bowl decreased by %d food, now remain: %d\n", amount, this.foodAmount);
        }
        return true;
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public boolean getfullness() {
        return fullness;
    }


    @Override
    public String toString() {
        return "Bowl{" +
                "foodAmount=" + foodAmount +
                '}';
    }
}
