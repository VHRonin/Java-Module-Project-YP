public class Racing {
    String winner = "";
    int maxDistance = 0;

    void setWinner(Car car){
        int carDistance = car.speed * 24;
        if (carDistance > maxDistance){
            maxDistance = carDistance;
            winner = car.name;
        }
    }
}
