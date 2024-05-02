import java.util.Scanner;
import java.time.LocalDate;

public class Kladbuche {
    public static void Byket() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какой букет Вы возьмёте на похороны?:");
        System.out.println("1. Цветы, которые Вы принесли с собой");
        System.out.println("2. Цветы купленные у нас");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Вы взяли цветы, которые принесли с собой");
                break;
            case 2:
                System.out.println("Вы приобрели цветы для похорон у нас");
                break;
            default:
                System.out.println("Извините, но такого выбора нет в списке");
        }
    }
    public static void Grob() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите гроб: ");
        System.out.println("1. Обычный");
        System.out.println("2. Hello Kitty");
        System.out.println("3. Лучше кремация!");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Вы выбрали обычный гроб");
                break;
            case 2:
                System.out.println("Вы выбрали гроб Hello Kitty");
                break;
            case 3:
                System.out.println("Как жестоко... Вы решили кремировать человека");
                break;
            default:
                System.out.println("Извините, но такого выбора нет в списке");
        }
    }
    public static void Pohoronu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите место захоронения: ");
        System.out.println("1. Возле семейного кладбища");
        System.out.println("2. На общем кладбище");
        System.out.println("3. Я же сказал кремация, поэтому заберу собой прах в вазе");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Вы решили похоронить человека возле семейного кладбища");
                break;
            case 2:
                System.out.println("Вы решили похоронить человека на общем кладбище");
                break;
            case 3:
                System.out.println("Вы забрали собой прах покойного");
                break;
            default:
                System.out.println("Извините, но такого выбора нет в списке");
        }
    }

    public void Prochanue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Как Вы будете прощаться с покойником: ");
        System.out.println("1. Скажу добрые слова перед захоронением");
        System.out.println("2. Буду читать молитву");
        System.out.println("3. Скажу, что он так и невернул мне деньги, которые брал в долг");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Вы сказали добрые слова на последок");
                break;
            case 2:
                System.out.println("Вы прочитали молитву");
                break;
            case 3:
                System.out.println("Жаль, но деньги Вы уже не получите");
                break;
            default:
                System.out.println("Извините, но такого выбора нет в списке");
        }
    }
    public void Data() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату (ГГГГ ММ ДД): ");
        String dateString = scanner.nextLine();

        String[] dateParts = dateString.split(" ");

        System.out.println("Вы ввели дату: " + dateParts[0] + " " + dateParts[1] + " " + dateParts[2]);
    }
    public void Tryps() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество трупов для хоронения:");
        int numberOfCorpses = scanner.nextInt();

        System.out.println("Количество трупов для хоронения: " + numberOfCorpses);
    }

    public void Grave(String name) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите глубину могилы в футах:");
        int depth = scanner.nextInt();

        int graveDepth = Depth(depth);
        System.out.println("Глубина могилы составляет " + graveDepth + " футов.");
    }

    public static int Depth(int feet) {
        return feet;
    }

    public void Mourn(String name) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя ушедшего: ");
        String names = scanner.nextLine();

        System.out.println("Имя ушедшего: " + name);
    }

    public void Resurrect(String name) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Кого Вы воскресите: ");
        String names = scanner.nextLine();

        System.out.println("Имя воскшесшего: " + name);
    }

    public void Psychic(int depth) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Хотите ли вы пригласить экстрасенса (да/нет)? ");
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("да")) {
            System.out.println("Вы решили пригласить экстрасенса.");
        } else if (answer.equalsIgnoreCase("нет")) {
            System.out.println("Вы решили не приглашать экстрасенса.");
        } else {
            System.out.println("Неверный ввод. Пожалуйста, ответьте \"да\" или \"нет\".");
        }
    }

    public static void main(String[] args) {

        Kladbuche.Byket();
        Kladbuche.Grob();
        Kladbuche.Pohoronu();

        Kladbuche graveyard = new Kladbuche();
        graveyard.Prochanue();
        graveyard.Data();
        graveyard.Tryps();

        graveyard.Mourn("Чарли");
        graveyard.Resurrect("Дмитрий");
        graveyard.Psychic(6);
    }
}
