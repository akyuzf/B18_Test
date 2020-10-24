package Test;


    // An immutable class
    public final class Student
    {
          String name;
          int regNo;

        public Student(String name, int regNo)
        {
            this.name = name;
            this.regNo = regNo;
        }
        public String getName()
        {
            return name;
        }
        public int getRegNo()
        {
            return regNo;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setRegNo(int regNo) {
            this.regNo = regNo;
        }
    }

    // Driver class
    class Test
    {
        public static void main(String args[])
        {
            Student s = new Student("ABC", 101);
            System.out.println(s.getName());
            System.out.println(s.getRegNo());

            s.setName("DEF");
            s.setRegNo(102);
            System.out.println(s.getName());
            System.out.println(s.getRegNo());
            // Uncommenting below line causes error
            // s.regNo = 102;
        }
    }
