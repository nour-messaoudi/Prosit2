class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[nbrCages];
    }

    @Override
    public String toString() {
        return "Zoo [Nom: " + this.name + ", Ville: " + this.city + ", Nombre de cages: " + this.nbrCages + "]";
    }

    public void addAnimal(Animal animal, int index) {
        if (index >= 0 && index < nbrCages) {
            animals[index] = animal;
        }
    }
}
