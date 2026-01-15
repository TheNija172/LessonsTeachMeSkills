package Lesson6;

/*
Создать класс, описывающий банкомат. Набор купюр, находящихся в банкомате, должен
задаваться тремя свойствами: количеством купюр номиналом 20, 50 и 100. Сделать
метод для добавления денег в банкомат. Сделать функцию, снимающую деньги, которая
принимает сумму денег, а возвращает булевое значение - успешность выполнения
операции. При снятии денег, функция должна распечатывать каким количеством купюр
какого номинала выдаётся сумма. Создать конструктор с тремя параметрами -
количеством купюр каждого номинала.
*/

public class ATM {
    int amountHundred;
    int amountFifty;
    int amountTwenty;

    public ATM(int amountHundred, int amountFifty, int amountTwenty) {
        this.amountHundred = amountHundred;
        this.amountFifty = amountFifty;
        this.amountTwenty = amountTwenty;
    }

    public void increaseAmount(int amountHundred, int amountFifty, int amountTwenty) {
        this.amountHundred += amountHundred;
        this.amountFifty += amountFifty;
        this.amountTwenty += amountTwenty;
    }

    public boolean decreaseAmount(int amount) {
        if (!(amount >= 20 && amount != 30 && amount % 10 == 0)) {
            return false;
        }
        for (int h = Math.min(amount / Banknotes.HUNDRED.getValue(), amountHundred); h >= 0; h--) {
            int restAfterHundred = amount - h * Banknotes.HUNDRED.getValue();

            for (int f = Math.min(restAfterHundred / Banknotes.FIFTY.getValue(), amountFifty); f >= 0; f--) {
                int restAfterFifty = restAfterHundred - f * Banknotes.FIFTY.getValue();

                if (restAfterFifty % Banknotes.TWENTY.getValue() == 0) {
                    int t = restAfterFifty / Banknotes.TWENTY.getValue();

                    if (t <= amountTwenty) {
                        amountHundred -= h;
                        amountFifty -= f;
                        amountTwenty -= t;

                        withdrawnBanknotes(h, f, t);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void withdrawnBanknotes(int amountHundred, int amountFifty, int amountTwenty) {
        System.out.println("Снято 100: " + amountHundred);
        System.out.println("Снято 50: " + amountFifty);
        System.out.println("Снято 20: " + amountTwenty);
    }

    @Override
    public String toString() {
        return "Осталось 100: " + this.amountHundred + "\nОсталось 50: " + this.amountFifty + "\nОсталось 20: " + this.amountTwenty;
    }
}
