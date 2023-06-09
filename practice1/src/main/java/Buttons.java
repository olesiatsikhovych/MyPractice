import java.util.Scanner;

public class Buttons {
    String command;

    double gasAmount;
    double waterAmount;
    double lightAmount;

    double gasPayMonth;
    double waterPayMonth;
    double lightPayMonth;

    double inputCurrentGasValue;
    double inputPastGasValue;
    double inputCurrentWaterValue;
    double inputPastWaterValue;
    double inputCurrentLightValue;
    double inputPastLightValue;

    Scanner scanner = new Scanner(System.in);
    Prices prices = new Prices();
    Menu men = new CreateMenu();

    public void doCommand(){
    do{
men.printMenu();
((CreateMenu) men).printCommand();
        command = scanner.nextLine();
        pressButton(command);
    }
    while (!command.equals("Q"));
}

 private void pressButton(String command) {
        switch (command) {
            case "1":
                pressButton1();
                break;
            case "2":
                pressButton2();
                break;
            case "3":
                pressButton3();
                break;
            case "4":
                pressButton4();
                break;
            case "5":
                pressButton5();
                break;
            case "6":
                pressButton6();
                break;
            case "7":
                pressButton7();
                break;
            case "8":
                pressButton8();
                break;
            case "Q":
                System.out.println("Вийти");
                break;
            default:
                System.out.println("Неіснуюча команда");
                break;

        }
    }

    private void pressButton1(){
        System.out.println("Ціна газу за м³: " + prices.getPriceOfGas() + " грн.");
        System.out.println("Ціна води за м³: " + prices.getPriceOfWater() + " грн.");
        System.out.println("Ціна світла за кВт/год: " + prices.getPriceOfLight() + " грн.");
        System.out.println("Ціна за доставку газу: " + prices.getPriceOfDeliveryGas() + " грн.");
        System.out.println("Ціна за інтернет: " + prices.getPriceOfInternet() + " грн.");
        System.out.println("Ціна за обслуговування будинку: " + prices.getPriceOfHouseMaintenance() + " грн.");
    }

    private void pressButton2(){
        System.out.println("Введіть цьогомісячний показник газу: ");
        double currentGasValue = Double.parseDouble(scanner.nextLine());
        inputCurrentGasValue = currentGasValue;
        System.out.println("Введіть минуломісячний показник газу: ");
        double pastGasValue = Double.parseDouble(scanner.nextLine());
        inputPastGasValue = pastGasValue;
        double usedGas = currentGasValue - pastGasValue;
        gasAmount = usedGas;
        System.out.println("Використана кількість газу за поточний місяць: " + usedGas + " м³");
    }

    private void pressButton3(){
        System.out.println("Введіть цьогомісячний показник води: ");
        double currentWaterValue = Double.parseDouble(scanner.nextLine());
        inputCurrentWaterValue = currentWaterValue;
        System.out.println("Введіть минуломісячний показник води: ");
        double pastWaterValue = Double.parseDouble(scanner.nextLine());
        inputPastWaterValue = pastWaterValue;
        double usedWater = currentWaterValue - pastWaterValue;
        waterAmount = usedWater;
        System.out.println("Використана кількість води за поточний місяць: " + usedWater + " м³");
    }

    private void pressButton4(){
        System.out.println("Введіть цьогомісячний показник світла: ");
        double currentLightValue = Double.parseDouble(scanner.nextLine());
        inputCurrentLightValue = currentLightValue;
        System.out.println("Введіть минуломіячний показник світла: ");
        double pastLightValue = Double.parseDouble(scanner.nextLine());
        inputPastLightValue = pastLightValue;
        double usedLight = currentLightValue - pastLightValue;
        lightAmount = usedLight;
        System.out.println("Використана кількість світла за поточний місяць: " + usedLight + " кВт/год");

    }

    private void pressButton5(){
pressButton2();
double payForGas = gasAmount * prices.getPriceOfGas();
gasPayMonth = payForGas;
        System.out.println("Сума до сплати за газ: " + payForGas + " грн.");
    }

    private void pressButton6(){
pressButton3();
double payForWater = waterAmount * prices.getPriceOfWater();
waterPayMonth = payForWater;
        System.out.println("Сума до сплати за воду: " + payForWater + " грн.");
    }

    private void pressButton7(){
pressButton4();
double payForLight = lightAmount * prices.getPriceOfLight();
lightPayMonth = payForLight;
        System.out.println("Сума до сплати за світло: " + payForLight + " грн.");
    }

    private void pressButton8(){
pressButton5();
pressButton6();
pressButton7();
double sum = gasPayMonth + waterPayMonth + lightPayMonth + prices.getPriceOfHouseMaintenance() + prices.getPriceOfInternet() + prices.getPriceOfDeliveryGas();
        System.out.println("Загальна сума до сплати: " + sum + " грн.");

        System.out.println("         "+"пок.ліч.пот   пок.ліч.мин   к-сть за місяць   сума до сплати");
        System.out.println("газ      " +inputCurrentGasValue+"           "+inputPastGasValue+"            "+gasAmount+"           "+gasPayMonth);
        System.out.println("вода     " +inputCurrentWaterValue+"            "+inputPastWaterValue+"              "+waterAmount+"            "+waterPayMonth);
        System.out.println("світло   "+inputCurrentLightValue+"          "+inputPastLightValue+"            "+lightAmount+"           "+lightPayMonth);
        System.out.println("інтернет                                   1              "+prices.getPriceOfInternet());
        System.out.println("дос.газ                                    1              "+prices.getPriceOfDeliveryGas());
        System.out.println("к.послуги                                  1              "+prices.getPriceOfHouseMaintenance());
        System.out.println("заг.сума "+"                                               Σ="+sum);
    }


}