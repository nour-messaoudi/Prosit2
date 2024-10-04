class ZooManagement {
    public static void main(String[] args) {

        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal tiger = new Animal("Felidae", "Tiger", 4, true);

        Zoo myZoo = new Zoo("My Zoo", "Paris", 20);

        myZoo.addAnimal(lion, 0);
        myZoo.addAnimal(tiger, 1);

        System.out.println(myZoo);
        System.out.println(lion);
        System.out.println(tiger);
    }
}
