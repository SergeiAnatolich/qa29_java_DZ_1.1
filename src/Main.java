public class Main {
    public static void main(String[] args) {
        int ticketPrice = 103; //цена билета
        int multiplicity = 20; //кратность начисления бонусов
        int bonusRate = 1; //бонусная ставка в милях
        int bonus = ticketPrice / multiplicity * bonusRate;
        System.out.println("За покупку билета в нашей компании Вам начислено бонусных миль - " + bonus);
    }
}