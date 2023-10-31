public class CityBus implements Bus{
    String carBrand;
    int year;
    int countSeats;
    int maxSpeed;
    boolean status = true;


    public CityBus(String carBrand,int year, int countSeats, int maxSpeed){
        this.carBrand = carBrand;
        this.year = year;
        this.countSeats = countSeats;
        this.maxSpeed = maxSpeed;
    }
    public void printInfo(){
        System.out.println("марка: " + carBrand + ", количество мест: " + countSeats);
    };

    /*public void drive(){
        System.out.println("CityBus");
        year = 2004;
        System.out.println(year);
    }*/
}
