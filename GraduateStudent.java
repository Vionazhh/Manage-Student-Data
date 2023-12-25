package ManageStudentData;

/**
 *
 * @author Viona
 */
class GraduateStudent extends Person implements Student {
    String programStudi;

    GraduateStudent(String name, int age, String programStudi) {
        super(name, age);
        this.programStudi = programStudi;
    }

    @Override
    public void register() {
        System.out.println("Mahasiswa graduate " + name + " berhasil didaftarkan dengan program studi " + programStudi);
    }

    @Override
    public void displayInfo() {
        System.out.println("Nama: " + name + " | Umur: " + age + " | Program Studi: " + programStudi);
    }

    public String getProgramStudi() {
        return programStudi;
    }

    public void setProgramStudi(String programStudi) {
        this.programStudi = programStudi;
    }
}



