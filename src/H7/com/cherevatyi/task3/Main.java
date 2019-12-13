package H7.com.cherevatyi.task3;

public class Main {
    public static void main(String[] args) {
        Cat.createCats();
        Dog.createDogs();
        Dog.createDogs();
        Animal.join();
        Animal.printPets();
        Cat.createCats();
        Animal.join();
        Animal.printPets();
        Animal.removeCats();
        Dog.createDogs();
        Animal.printPets();
        Animal.join();
        Animal.printPets();
    }
}
