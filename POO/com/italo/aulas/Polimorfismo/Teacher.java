package POO.com.italo.aulas.Polimorfismo;

public class Teacher extends People {

    private double salary;
    private String nameCourse;

    public void verifyAcess(){
        this.nomeVisibilidade = "sadasd";
        super.nomeVisibilidade = "dasdasdas";
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public double calculateLiquidSalary(){
        return 0;
    }

    public String getAddressLabel(){
        String s = "Teache's Address: ";
        s += this.getAddress();
        return s;
    }
}