public class Zoo {
        private Animal[] animals;
        private String name;
        private String city;
        private int nbrCages;

        public Zoo(String name, String city, int nbrCages){
            this.animals = new Animal[25];
            this.name = name;
            this.city = city;
            this.nbrCages = nbrCages;
        }

            void displayZoo() {
                System.out.println("my Zoo " + name + " in " + city + " with " + nbrCages + " cages.");
            }

    public static void main(String[] args) {
        Animal a1 = new Animal("Lion", "Simba", 8, true);
        Animal a2 = new Animal("Singe", "Darwin", 10, true);
        Animal a3 = new Animal("Ursidae", "Baloo", 12, true);

        Zoo myZoo = new Zoo("Belvedere", "Tunis", 15);

        myZoo.displayZoo();
    }

}


