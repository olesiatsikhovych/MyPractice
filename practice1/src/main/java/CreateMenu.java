import java.util.LinkedList;
import java.util.List;

public class CreateMenu implements Menu {

    private LinkedList<String> menu;

    public CreateMenu() {
        menu = new LinkedList<String>();
        menu.add("1 - Вивести поточні тарифи на комунальні послуги");
        menu.add("2 - Порахувати кількість кубів використаного газу за місяць");
        menu.add("3 - Порахувати кількість кубів використаної води за місяць");
        menu.add("4 - Порахувати кількість використаного світла за місяць");
        menu.add("5 - Отримати суму, яку необхідно сплатити за газ");
        menu.add("6 - Отримати суму, яку необхідно сплатити за воду");
        menu.add("7 - Отримати суму, яку необхідно сплатити за світло");
        menu.add("8 - Підрахувати загальну суму до сплати");
        menu.add("Q - Вихід");
    }

    public void printMenu() {
for (String m : menu)
    System.out.println(m);
    }

    public void printCommand(){
        System.out.println("Введіть номер команди, якою хочете скористатись: ");
    }
}
