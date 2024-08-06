import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TestPatientList {
    public static void main(String[] args) {
        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient(1, "John Doe", 30));
        patients.add(new Patient(2, "Jane Smith", 25));
        patients.add(new Patient(3, "Alice Johnson", 35));

        Collections.sort(patients);
        System.out.println("Sorted by Name:");
        for (Patient patient : patients) {
            System.out.println(patient.getName());
        }

        Collections.sort(patients, (p1, p2) -> Integer.compare(p2.getAge(), p1.getAge()));
        System.out.println("\nSorted by Age (Alternate Sorting Order):");
        Iterator<Patient> iterator = patients.iterator();
        
        while (iterator.hasNext()) {
            Patient patient = iterator.next();
            System.out.println(patient.getName());
            System.out.println(patient.getAge());

        }

        TreeSet<Patient> patientTreeSet = new TreeSet<>(patients);
        System.out.println("\nTreeSet Display:");
        for (Patient patient : patientTreeSet) {
            System.out.println(patient.getName());
        }

        TreeSet<Patient> patientTreeSetCopy = new TreeSet<>(patients);
        System.out.println("\nGetting Age of Jane Smith:");
        Patient janeSmith = new Patient(2, "Jane Smith", 25);
        int janeAge = getPatientAge(janeSmith, patientTreeSetCopy);
        System.out.println("Age: " + janeAge);
    }

    public static int getPatientAge(Patient patient, TreeSet<Patient> patientTreeSet) {
        for (Patient p : patientTreeSet) {
            if (p.getName().equals(patient.getName())) {
                return p.getAge();
            }
        }
        return -1; 
    }
}
