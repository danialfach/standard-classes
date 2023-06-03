package Car;

class Car {
    String CarName;
    String CarBrand;

    Car(String CarName, String CarBrand){
        this.CarName = CarName;
        this.CarBrand = CarBrand;
    }

    void setCar(String paramName){
        System.out.println(" Ini Mobil " + paramName + " dan ini mobil " + CarName);
    }
}
