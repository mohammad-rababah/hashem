package Q2022.B.Q2;

class Vaccinations extends Records {
    public Vaccinations() {
        letter = "appointment date, location, vaccine name ";
    }

    void letterDetails() {
        System.out.println("Vaccination " + letter);
    }
}