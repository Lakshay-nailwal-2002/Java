package pojo;

public class Main {

    public static void main(String[] args) {

        for(int i =0 ; i<5 ; i++){
            RecordStudent student = new RecordStudent(
                    "2002-10-21",
                    "Lakshay Nailwal",
                    "ABC" + i,
                    "Master Java"
            );
            System.out.println(student);
        }

    }

}
