package model;

public class Trainer extends Person implements Trainable {

    private String specialization;

    public Trainer(int id, String name, int age, String specialization) {
        super(id, name, age);
        setSpecialization(specialization);
    }

    @Override
    public void work() {
        System.out.println("Trainer " + name + " is coaching.");
    }

    @Override
    public String getRole() {
        return "Trainer";
    }

    @Override
    public void train() {
        System.out.println("Trainer " + name + " is conducting a workout.");
    }

    public void setSpecialization(String specialization) {
        if (specialization == null || specialization.trim().isEmpty()) {
            throw new IllegalArgumentException("Specialization cannot be empty");
        }
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }
}
