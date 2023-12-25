package ManageStudentData;

/**
 *
 * @author Viona
 */
class UndergraduateStudent extends Person implements Student {
    String className;

    UndergraduateStudent(String name, int age, String className) {
        super(name, age);
        this.className = className;
    }

    @Override
    public void register() {
        System.out.println("Mahasiswa undergraduate " + name + " berhasil didaftarkan dengan kelas " + className);
    }

    @Override
    public void displayInfo() {
        System.out.println("Nama: " + name + " | Umur: " + age + " | Kelas: " + className);
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}



