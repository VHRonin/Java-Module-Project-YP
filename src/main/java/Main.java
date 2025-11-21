import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int participantsAmount = 3;
        Racing racing = new Racing();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < participantsAmount; i++){
            System.out.println("Введите название машины №" + (i + 1) + ":");
            String carName = scanner.next();

            while (true){
                try {
                    System.out.println("Введите скорость машины №" + (i + 1) + ":");
                    int carSpeed = scanner.nextInt();

                    if (carSpeed > 0 && carSpeed <= 250){
                        Car car = new Car(carName, carSpeed);
                        racing.setWinner(car);
                        break;
                    }
                    else {
                        System.out.println("Неправильная скорость");
                    }
                }
                catch (InputMismatchException e){
                    System.out.println("Неправильная скорость");
                    scanner.nextLine();
                }
            }
        }

        System.out.println("Самая быстрая машина: " + racing.winner);
    }
}