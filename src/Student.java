public class Student {
    static int counter =0;

    private String name;
    private String birthDate;
    private String phoneNumber;
    private int groupNumber;

    public Student() {
        counter++;
    }

    public Student(String name, String birthDate, String phoneNumber, int groupNumber) {
        counter++;
        this.name = name;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.groupNumber = groupNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    void getInfo () {
        System.out.println(getName()+" "+getBirthDate()+" "+getPhoneNumber()+" "+getGroupNumber()+" counter ="+counter);
    }
}
