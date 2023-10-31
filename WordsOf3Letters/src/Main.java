import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Поиск слов на 'а' больше 3 символов.");
        System.out.println("Введите строку:");

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        //разделение строки на массив подстрок
        String[] words = line.split("\\s");

        int n = 0; //счетчик совпадений
        boolean result;

        System.out.println("\nРезультат:");
        for (int i = 0; i < words.length; i++) {
            result = words[i].matches("^[а](.){2}.+$"); //проверка
            if(result){
                System.out.println(words[i]);
                n++;
            }
        }
        if(n==0){
            System.out.println("Слов на 'а' больше 3 символов не найдено");
        }
    }
}