package Test;


    public class testT {
        String school = "college";
        public  void print(){
            System.out.println(this.school);
        }
    }
    class CybertekStudent extends testT {
        String school = "Cybertek";
        public  void print(){
            System.out.println(this.school);
        }
        public  void print2(){
            System.out.println(super.school);
        }
    }
    class Main {
        public static void main(String [] args) {
            testT student = new testT();
            student.print();
            CybertekStudent cybertekStudent = new CybertekStudent();
            cybertekStudent.print();
            cybertekStudent.print2();
        }
    }
/*
        Output:

        college
        Cybertek
        college
 */

