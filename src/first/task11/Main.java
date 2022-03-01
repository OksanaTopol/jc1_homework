package first.task11;

public class Main {

    public static void main(String[] args){

        denNedeli(3);

    }
    public static String denNedeli(int a)
    {
        String monday = "1.Забрать сапоги; 2.Сдать ножи; 3.Приготовить ужин;";
        String tuesday = "1.Работа; 2.Тренажёрка; 3.Чтение;";
        String wednesday = "1.Офис; 2.Магазин; 3.Врач;";
        String thursday = "1.Купить подарки; 2.Заказать цветы; 3.Маникюр;";
        String friday = "1.Парикмахерская; 2.Педикюр; 3.Танцы;";
        String saturday = "1.Уборка; 2.Шоппинг; 3.Шашлык;";
        String sunday = "1.Аквапарк; 2.Баня; 3.Массаж;";

        switch (a){
            case 1: System.out.println(monday);
                break;
            case 2: System.out.println(tuesday);
                break;
            case 3: System.out.println(wednesday);
                break;
            case 4: System.out.println(thursday);
                break;
            case 5: System.out.println(friday);
                break;
            case 6: System.out.println(saturday);
                break;
            case 7: System.out.println(sunday);
                break;
            default:
                System.out.println("Дня с таким номером не существует");
            break;
        }
        return null;
    }

}
