package problems.dsa.simulation;

import java.io.PrintStream;
import java.util.*;
import java.text.DecimalFormat;

public class AIChatBotGenerator_Regional {
    static Scanner sc = new Scanner(System.in);
    static DecimalFormat formatter = new DecimalFormat("0.00");

    public static final String[][] COMPATIBILITY = {
            {"English", "Spanish"}, {"English", "French"}, {"English", "German"}, {"Japanese", "English"}, {"Japanese", "Hindi"}, {"Portuguese", "French"},
            {"Spanish", "Portuguese"}, {"Spanish", "Italian"}, {"French", "Italian"}, {"Russian", "Chinese"}, {"Russian", "Korean"}, {"Russian", "Japanese"},
            {"Russian", "German"}, {"Hindi", "Arabic"}, {"Japanese", "Korean"}, {"Russian", "Arabic"}, {"Spanish", "Arabic"}, {"Russian", "French"},
            {"Chinese", "Korean"}, {"Japanese", "Vietnamese"}, {"Arabic", "Hebrew"}, {"Greek", "Hebrew"}, {"Arabic", "Indonesian"}, {"Russian", "Indonesian"},
            {"Chinese", "Thai"}, {"Japanese", "Vietnamese"}, {"English", "Chinese"}, {"Japanese", "Thai"}, {"Indonesian", "Thai"}, {"Chinese", "Spanish"},
            {"Arabic", "Turkish"}, {"Greek", "Turkish"}, {"Vietnamese", "Thai"}, {"Vietnamese", "French"}, {"Vietnamese", "Indonesian"}, {"Turkish", "Spanish"},
    };
    public static void main(String args[]) {
        //"How many test bots do you want to create?");
        System.out.println("How many test bots do you want to create?");
        int numChatbots = integerInputManager();
        ArrayList<Chatbots> listOfBots = new ArrayList<>();

        final String[] LANGUAGES = {"English", "French", "Chinese", "Spanish", "Arabic", "Russian", "German", "Japanese", "Portuguese", "Hindi", "Italian", "Korean", "Turkish", "Vietnamese", "Indonesian", "Greek", "Hebrew", "Thai"};
        setChatbots(listOfBots, LANGUAGES, numChatbots);
        printChatbots(listOfBots);

    }



    private static ArrayList<Chatbots> setChatbots(ArrayList<Chatbots> list_of_Bots, String[] languages, int noB) {
        Random rand = new Random();
        int numLanguages = languages.length;
        for(int i=0; i<noB; i++){
            String lang1 = languages[rand.nextInt(0,numLanguages)];
            String lang2 = languages[rand.nextInt(0,numLanguages)];
            while(lang1.equals(lang2)){ //Prevent lang1 and lang2 from being the same
                lang2 = languages[rand.nextInt(0,numLanguages)];
            }
            double tokenRate = Double.parseDouble(formatter.format(rand.nextDouble(0.1,7.51)));
            int algorithmComplexity = rand.nextInt(1,17);
            Chatbots temp = new Chatbots(lang1, lang2, algorithmComplexity, tokenRate);
            list_of_Bots.add(temp);
        }
        return list_of_Bots;
    }

    private static boolean isCompatible(String primaryLang, String secondaryLang) {
        for(int i=0; i<COMPATIBILITY.length; i++) {
            if(COMPATIBILITY[i][0].equals(primaryLang) && COMPATIBILITY[i][1].equals(secondaryLang)){
                return true;
            } else if(COMPATIBILITY[i][0].equals(secondaryLang) && COMPATIBILITY[i][1].equals(primaryLang)){
                return true;
            }
        }
        return false;
    }

    private static void printChatbots(ArrayList<Chatbots> bots) {
        PrintStream printf = new PrintStream(System.out);
        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("| %-4s | %-15s | %-17s | %-20d | %-10f | $%-13f | %-16b%n", "No.", "Primary Lang.", "Secondary Lang.", "Algorithm Complexity", "Token Rate", "Estimated Cost");
        System.out.println("-----------------------------------------------------------------------------");
        for(int i=0; i<bots.size(); i++){
            System.out.printf("| %-4d\t| %-15s | %-17s | %-20d\t| %-10f\t| $%-13f\t| %-16b%n",
                    i+1,
                    bots.get(i).getPrimaryLanguage(),
                    bots.get(i).getSecondaryLanguage(),
                    1,
                    bots.get(i).getTokenRate(),
                    bots.get(i).getEstimatedCost(),
                    isCompatible(bots.get(i).getPrimaryLanguage(), bots.get(i).getSecondaryLanguage())
            );        }
        System.out.println("-----------------------------------------------------------------------------");

    }

    private static int integerInputManager() {
        String input = "";
        int intInput = 0;
        while(true){
            System.out.println("Please enter in a value between 5 and 20: ");
            input = sc.nextLine();
            try{
                intInput = Integer.parseInt(input);
                if(intInput<5 || intInput>20){
                    System.out.println("Your entry is out of range");
                } else {
                    break;
                }
            } catch(NumberFormatException e){
                System.out.println("Please enter a correct value");
            }
        }
        return intInput;
    }


}
//Given
///////////////////////////////////////////////////
class Chatbots
{
    String primaryLang;
    String secondaryLang;
    int complexity_Level;
    double tokenRate;
    double estimatedCost =0;

    public Chatbots()
    {
        primaryLang = "ASCII";
        secondaryLang =  "ASCII";
        complexity_Level = 0;
        tokenRate = 0.0;
    }

    public Chatbots(String primaryLang, String secondaryLang, int complexity_Level, double tokenRate)
    {
        this.primaryLang = primaryLang;
        this.secondaryLang =  secondaryLang;
        this.complexity_Level = complexity_Level;
        this.tokenRate = tokenRate;
        setEstimatedCost();
    }


    public String getPrimaryLanguage()
    {
        return primaryLang;
    }

    public String getSecondaryLanguage()
    {
        return secondaryLang;
    }

    public double getTokenRate()
    {
        return tokenRate;
    }

    public int getComplexity()
    {
        return complexity_Level;
    }

    public void setEstimatedCost()
    {
        estimatedCost = getComplexity() * getTokenRate();
    }

    public double getEstimatedCost()
    {
        return estimatedCost;
    }

}