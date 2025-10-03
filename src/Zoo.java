class Zoo {
    public static void displayZoo(Animal[] animals) {
        String name;
        String city;
        int nbrCages;

        public Zoo(String name, String city, int nbrCages){
            this.name = name;
            this.city = city;
            this.nbrCages = nbrCages;
        }

        Animal a = new Animal(Lion, Simba, 8, true);
        Zoo z = new Zoo(Belvedere, Tunis, 30);

        System.out.println(MyZoo);
        System.out.println(MyZoo.toString());
    }
}
