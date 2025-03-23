public class E6 {
    public static void main(String[] args) {
        Patient patient = new Patient(101, "David", "Flu");
        System.out.println("Patient ID: " + patient.getPatientID() + ", Name: " + patient.getName() + ", Disease: " + patient.getDisease());
    }
}


class Patient {
    private final int patientID;
    private String name;
    private String disease;

    public Patient(int patientID, String name, String disease) {
        this.patientID = patientID;
        this.name = name;
        this.disease = disease;
    }

    public int getPatientID() {
        return patientID;
    }

    public String getName() {
        return name;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }
}

