package OOP_Part1;

public class Main {

    public static void main(String[] args) {
        for(int i = 1; i<=5; i++){
            LPAStudent s = new LPAStudent("S92300" + i,
                    switch (i){
                case 1 -> "Mary";
                case 2 -> "Carol";
                case 3 -> "Tim";
                case 4 -> "Harry";
                case 5 -> "Lisa";
                        default -> "Anonymous";
                    },
                    "05/11/1985",
                    "Java MasterClass");
            System.out.println(s);
        }

        //The outputs are diff, the class has {} and '' for string but the Record has [] and no ''
        Student pojoStudent = new Student("S923006", "Ann", "05/11/1985","Java MasterClass");
        LPAStudent recordStudent = new LPAStudent("S923007", "Bill", "05/11/1985","Java MasterClass");


        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        //Use of Get method
        //Note the record uses the name of the field without appending "get" prefix
        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());


        //Use of Set method
        //Note: The record can only set using the constructor, it doesnt have the setter method
        //because the fields are set as final
        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
//        recordStudent.setClassList(recordStudent.classList() + ", Java OCP Exam 829");


    }
}
