public class IntercityBus implements Bus{
    String carBrand;
    int year;
    int countSeats;
    public boolean status = true;
    int maxSpeed;
    public IntercityBus(String carBrand,int year, int countSeats, int maxSpeed){
        this.carBrand = carBrand;
        this.year = year;
        this.countSeats = countSeats;
        this.maxSpeed = maxSpeed;
    }
    public void printInfo(){
        System.out.println("марка: " + carBrand + ", количество мест: " + countSeats);
    };

}

