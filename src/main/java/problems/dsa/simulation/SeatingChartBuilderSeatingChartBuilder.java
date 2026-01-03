package problems.dsa.simulation;

// Contestant #: 1357908642
import java.io.FileNotFoundException;
import java.io.File;
import java.util.*;
import java.text.DecimalFormat;
public class SeatingChartBuilderSeatingChartBuilder
{
    static Scanner sc = new Scanner(System.in);  //SC1
    static DecimalFormat formatter = new DecimalFormat("#.00"); //SC7

    public static void main (String args [])
    {
        //First prompt text: "How many test students do you want to create?"
        System.out.println("How many test students do you want to create?");
        int students = integerInputManager();
        ArrayList<Students> studentList = new ArrayList<>(); //SC2
        final String[] ALL_NAMES = {"Walter","Jones","Rose","Wilson" ,"Jack", "Rodriguez" , "Elizabeth" , "Smith", "Earl", "Carter", "Linda", "Ward", "Christopher",
                "Turner", "Martin", "Murphy", "Betty", "Garcia", "Shawn", "Taylor","Sean", "Simmons", "Joshua", "Evans", "Norma", "Mitchell", "Brenda", "Johnson", "Donna",
                "Clark", "Irene", "Diaz","Marilyn", "Coleman","Arthur", "Collins","Henry", "Hall","Howard", "Robinson","Jerry", "Green","Maria", "Price", "Evelyn", "Bell",
                "Janet", "Moore", "Susan", "Foster"};
        setStudents(studentList, ALL_NAMES, students);
        printStudents(studentList);
        System.exit(0);
    }

    //Creates s
    private static ArrayList<Students> setStudents(ArrayList<Students> stuList, String [] allNames, int nc)
    {
        Random rand = new Random(); //SC6
        for(int i=0; i<nc; i++){
            int length = allNames.length;
            int firstName = rand.nextInt(0,length);
            int lastName = rand.nextInt(0,length);
            while(firstName == lastName){ //SC8
                lastName = rand.nextInt(0,length);
            }
            //SC9
            //SC10
            Students temp = new Students(allNames[firstName], allNames[lastName], (int)(rand.nextInt(9,13)), Double.parseDouble(formatter.format(rand.nextDouble(1.00,4.00))));
            stuList.add(temp);
        }
        return stuList;
    }


    private static void printStudents(ArrayList<Students> students)
    { //SC11
        for(int i=0; i<students.size(); i++){
            Students curr = students.get(i);
            System.out.println(i+1+") "+curr.getLastName()+", "+curr.getFirstName()+" | "+curr.getGradeLevel()+" | "+ formatter.format(curr.getGPA()));
        }
    }


    private static int integerInputManager()  //SC3
    {
        String answer;
        int intAnswer = 0;
        while(true) {
            System.out.println("Please enter in a value between 1 and 50");
            answer = sc.nextLine();
            try {
                intAnswer = Integer.parseInt(answer);
                if(intAnswer>50 || intAnswer<1){ //SC5
                    intAnswer = 0;
                    System.out.println("Your entry is out of range.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a correct value.");
            }

        }
        return intAnswer;
    }


}
//Given
///////////////////////////////////////////////////
class Students
{
    String first_Name;
    String last_Name;
    int grade_Level;
    double GPA;

    public Students()
    {
        first_Name = "Dee";
        last_Name =  "Fault";
        grade_Level = 0;
        GPA = 0.0;
    }

    public Students(String fn, String ln, int gl, double gpa)
    {
        first_Name = fn;
        last_Name =  ln;
        grade_Level = gl;
        GPA = gpa;
    }

    //last, first
    public String getWholeName()
    {
        return last_Name + ", "+first_Name;
    }

    public String getFirstName()
    {
        return first_Name;
    }

    public String getLastName()
    {
        return last_Name;
    }

    public double getGPA()
    {
        return GPA;
    }

    public int getGradeLevel()
    {
        return grade_Level;
    }

    public void setFirstName(String fn)
    {
        first_Name = fn;
    }

    public void setLastName(String ln)
    {
        last_Name = ln;
    }
}