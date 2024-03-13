class StudentInfo {
    private String firstName;
    private String lastName;
    private String prn;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPrn() {
        return prn;
    }

    public void setPrn(String prn) {
        this.prn = prn;
    }

    public void modifyPrn() {
        String del = this.prn.substring(0, 8);
        this.prn = this.prn.replace(del, "CS");
    }

    public void appendMiddleName(String midName) {
        System.out.println("Full name : " + this.firstName + " " + midName + " " + this.lastName);
    }
}

public class java_37 {
    public static void main(String[] args) {
        StudentInfo s = new StudentInfo();
        s.setFirstName("Onkar");
        s.setLastName("Mendhapurkar");
        s.appendMiddleName("Manoj");
        s.setPrn("22070122135");
        System.out.println("Original PRN: "
+ s.getPrn());
        s.modifyPrn();
        System.out.println("Modified PRN: " + s.getPrn());
    }
}
