package OOPS;

public class Student {
        String name;
        // private int rollno;
        int rollno;
        double percentage;

        //DEFAULT CONSTRUCTOR
        public Student(){

        }
        //CONSTRUCTOR
        public Student(String naam, int roll, double per){
            name= naam;
            rollno= roll;
            percentage= per;
        }

        //SETTER
    public void setRoll(int roll){
        rollno= roll;
    }
        //GETTER
    public int getRollno(){       //is considered as attribute 
        return rollno;
    }

    
}

