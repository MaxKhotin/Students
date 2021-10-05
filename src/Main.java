public class Main {

    public static void main(String[] args) {
      Student st1 = new Student("Grigoriy Ovechkin", "05.08.1998", "0967384821", 1 );
      st1.getInfo();
      Student st2 = new Student();
      st2.setName("Bogdan Studnev");
      st2.setBirthDate("01.01.1995");
      st2.setPhoneNumber("0954357691");
      st2.setGroupNumber(2);
      st2.getInfo();
    }
}
