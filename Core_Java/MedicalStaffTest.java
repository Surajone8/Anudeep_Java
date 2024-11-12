class Doctor {
    public void treatPatient() {
        System.out.println("Doctor is treating the patient.");
    }
}

class Surgeon extends Doctor {
    @Override
    public void treatPatient() {
        System.out.println("Surgeon is performing surgery.");
    }

    public void performSurgery() {
        System.out.println("Surgeon is performing a complex operation.");
    }
}

class Nurse extends Doctor {
    @Override
    public void treatPatient() {
        System.out.println("Nurse is assisting in patient care.");
    }

    public void provideCare() {
        System.out.println("Nurse is providing general care to the patient.");
    }
}

public class MedicalStaffTest {
    public static void main(String[] args) {
        Surgeon surgeon = new Surgeon();
        surgeon.treatPatient();
        surgeon.performSurgery();

        Nurse nurse = new Nurse();
        nurse.treatPatient();
        nurse.provideCare();
    }
}

/* Output:
Surgeon is performing surgery.
Surgeon is performing a complex operation.
Nurse is assisting in patient care.
Nurse is providing general care to the patient.
   */
