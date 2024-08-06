import java.util.*;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int studentNum= sc.nextInt();
        ArrayList<Integer> studentMarks= new ArrayList<>();

        System.out.println("Enter marks: ");

        for(int i=0;i<studentNum;i++)
            studentMarks.add(sc.nextInt());
        
        int highestMarks=0;

        for(int marks: studentMarks){
            if(marks>highestMarks)
                highestMarks= marks;
        }
        System.out.println("Highest Marks: "+ highestMarks);

        double avg=0;
        for(int marks: studentMarks){
            avg+=marks;
        }
        avg/=studentNum;
        System.out.println("Average marks: "+ avg);

        System.out.print("Marks: ");
        for(int i=0;i<studentNum;i++){
            System.out.print((i+1)+"-"+studentMarks.get(i)+ " ");
        }

        System.out.println("\nThird student marks: "+ studentMarks.get(2));

        Collections.sort(studentMarks);
        System.out.print("Sorted: ");
        for(int i=0;i<studentNum;i++){
            System.out.print((i+1)+"-"+studentMarks.get(i)+ "\t");
        }

        sc.close();

    }
    
}
