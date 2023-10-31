import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
        //создание 2 массива объектов автобусов
        CityBus[] mas_cbus = new CityBus[2];
        IntercityBus[] mas_icbus = new IntercityBus[2];

        mas_cbus[0] = new CityBus("ЛиАЗ-5292",2004, 28, 80);
        mas_cbus[1] = new CityBus("Вектор Next 7.6",2016, 17, 100);
        mas_icbus[0] = new IntercityBus("Луидор-2250",
                                        2013, 19, 135);
        mas_icbus[1] = new IntercityBus("МАЗ-251",
                                        2007, 45, 133);

        Scanner sc = new Scanner(System.in);
        int value;
        while(true){
            System.out.println("1 - вывести список всех автобусов, 2 - забронировать автобус, 3 - выход");
            value = sc.nextInt();
            if(value==1){
                System.out.println("Городские автобусы:");
                for (int i = 0; i < mas_cbus.length; i++) {
                    mas_cbus[i].printInfo();
                }
                System.out.println("Междугородние автобусы:");
                for (int i = 0; i < mas_icbus.length; i++) {
                    mas_icbus[i].printInfo();
                }
            }
            else if(value==2){
                System.out.println("Введите какой тип автобуса вам нужен: 1 - городской, 2 - междугородний");
                value = sc.nextInt();
                if(value == 1){
                    int n = 0;
                    for (int i = 0; i < mas_cbus.length; i++) {
                        if (mas_cbus[i].status == true){
                            n++;
                            System.out.print(n + " - ");
                            mas_cbus[i].printInfo();
                        }
                    }
                    if(n == 0){
                        System.out.println("Нет свободных автобусов");
                    }
                    else{
                        System.out.println("Введите номер автобуса, который вы хотите забронировать:");
                        value = sc.nextInt();
                        if (value <= n && value>0){
                            mas_cbus[value-1].status = false;
                            System.out.print("Забронирован - "); mas_cbus[value-1].printInfo();
                        }
                        else{
                            System.out.println("Неправильная команда");
                        }
                    }
                }
                else if(value == 2){
                    int n = 0;
                    for (int i = 0; i < mas_icbus.length; i++) {
                        if (mas_icbus[i].status == true){
                            n++;
                            System.out.print(n + " - ");
                            mas_icbus[i].printInfo();
                        }
                    }
                    if(n == 0){
                        System.out.println("Нет свободных автобусов");
                    }
                    else{
                        System.out.println("Введите номер автобуса, который вы хотите забронировать:");
                        value = sc.nextInt();
                        if (value <= n && value>0){
                            mas_icbus[value-1].status = false;
                            System.out.print("Забронирован - "); mas_icbus[value-1].printInfo();
                        }
                        else{
                            System.out.println("Неправильная команда");
                        }
                    }
                }
                else{
                    System.out.println("Неправильная команда");
                }
            }
            else if(value==3){
                break;
            }
            else{
                System.out.println("Неправильная команда");
            }
        }
    }
}

