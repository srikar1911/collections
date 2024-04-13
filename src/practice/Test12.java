package practice;

class Employe{
    int eno;
    String ename;
    String dept;
    double sal;

    static Employe empClone(Employe e){

        Employe clonedEmployee = new Employe();
        clonedEmployee.eno = e.eno;
        clonedEmployee.dept = e.dept;
        clonedEmployee.ename = e.ename;
        clonedEmployee.sal = e.sal;

        return clonedEmployee;
    }

    public static void main(String[] args) {
        
    }
}