package problems.dsa.string;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
import java.util.*;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;

public class BPAJava2023Regional
{
    //VARIABLES ARE GIVEN
    public static String rarity [] = {"Common","Uncommon","Rare","Epic","Legendary","Mythic"} ;
    private static double lowFloor = 0.5;
    private static double highFloor = 99999.99;
    private static String floorMssg = "Please enter in a value between $0.50 to $99,999.99: ";
    private static int lowRarity = 1;
    private static int highRarity = 6;
    private static String rarityMssg = "Please enter in a value between 1 to 6"
            +"(NOTE all rational values will be truncated to the whole number): ";
    private static int lowToken = 1;
    private static int highToken = 2;
    private static String tokenMssg = "Please enter in a 1 for ERC-721 or a 2 for a BEP-721 token type"+
            "(NOTE all rational values will be truncated to the whole number): ";
    static Scanner sc = new Scanner(System.in);

    public static void main (String args [])
    {
        //!!STUDENT WILL MAKE THIS <=====================================
      /*Create the NFTData object with the nested Wallet Address object. Use the data below
         Username: Ana1234
         Collection Name: Bored BPA Yacht Club
         Wallet Address: 1Awyd1QWR5gcfrn1UmL8dUBj2H1eVKtQhg
         HINT: public NFTData (String userName, String collectionName)
         HINT:	public WalletAddress(String wallet address)
      */
        NFTData client = new NFTData("Anna1234", "Bored BPA Yacht Club");
        client.walletAddress = new WalletAddress("1Awyd1QWR5gcfrn1UmL8dUBj2H1eVKtQhg");




        //!!STUDENT WILL MAKE THIS  <=====================================
        //Checks that the customer and wallet object were created and print out the following message
      /*  "Welcome " [DISPLAY USERNAME FROM OBJECT] " to the NFT Market Place form. Your wallet is now connected (verify below):"
           [DISPLAY WALLET ADDRESS FROM OBJECT]
      */
        if(client==null){
            System.exit(1);
        }
        System.out.println("Welcome " + client.getUN() + " to the NFT Market Place form. Your wallet is now connected (verify below):\n" + client.walletAddress.getAdd());

        String yesNo = "";
        //THIS IS GIVEN
        //Prompts the user to see if they want to update the record
        do{
            System.out.print("\nType in \"Yes\" if you want create a new NFT:\nENTER: Yes or No: ");
            yesNo = getUserStringInput();    //helper method created by the student below
            if(yesNo.equals("yes")|| yesNo.equals("y"))
            {
                setFloorPriceNFTDataRecord(client);   //helper method call given
                setNFTRarityRecord(client);
            }
        }while (yesNo.equals("yes") == false && yesNo.equals("no") == false &&
                yesNo.equals("y") == false && yesNo.equals("n") == false);

        //THIS IS GIVEN
        //Prompts the user to see if they want to retrieve the record
        do{
            System.out.print("\nDo you want to see the profile for this user?\nENTER: Yes or No: ");
            yesNo = getUserStringInput();       //helper method created by the student
            if(yesNo.equals("yes")|| yesNo.equals("y"))
            {
                consoleRecordCheck(client);       //helper method call created by student
            }

            else if(yesNo.equals("no")|| yesNo.equals("n")){
                System.out.print("\nHave a great day and see you on the Moon!");
                System.exit(0);
            }
        } while (yesNo.equals("yes") == false && yesNo.equals("no") == false &&
                yesNo.equals("y") == false && yesNo.equals("n") == false);

    } //Ends Main method

    //////////////////BEGINNING OF HELPER METHODS//////////////////

    //THIS IS GIVEN
    //Prompts the user to submit a floorPrice: calls other helper methods
    private static void setFloorPriceNFTDataRecord(NFTData c)
    {
        System.out.println("\nAll new NFT's require a new Floor Price."+
                "How much will be the NFT's floor price? ");
        double numberInput = getUserNumericalInput(lowFloor, highFloor, floorMssg);
        c.setFloorPrice(numberInput);
        setContractAddress(c);

    }

    //THIS IS GIVEN
    //Sets the rarity of the NFT
    //Students will need to make the get method to have user input for the NFT rarity value
    private static void setNFTRarityRecord(NFTData c)
    {
        System.out.println("\nAll new NFT's require a rarity. Choose the number for the level of rarity:\n"+
                "(6)Mythic, (5)Legendary, (4)Epic, (3)Rare, (2)Uncommon, (1)Common");
        int rarityInt = (int)getUserNumericalInput(lowRarity, highRarity, rarityMssg);  //This is an example of casting
        c.setRarity(rarity[rarityInt-1]);
    }

    //!!STUDENT WILL MAKE THIS  <=====================================
    //Create this method below: void setContractAddress(NFTData trader)
    //Creates and stores the reference ID (random letters and numbers) into the object; once the NFT address is created it must be printed to console
   /*The NFTData object needs to store either a ERC-721 or BEP-721 token to create the NFT address properly.
      This can be accomplished in this method. Hyphens must be removed from the token
   */
   /*Address contains the following 3 items: (1) three digits of username (case does not matter)
      + (2) has four sets of random generated numbers of 4 digits (there must be four digits and it is NOT required to have values less than 1000) x's are delimeters to seperate the random number sets.
      + (3) the end of the address is the NFT token type (no hyphens)
      EXAMPLE: Dddx4123xx4567xx8910xx1112xERC721
   */

    //Takes all information about the NFT and creates a unique token by concatenating the first three letters of the name,
    // 4 random 4-digit numbers separated by "x" and finally the token type
    private static void setContractAddress(NFTData trader){
        trader.setNFTAddress(trader.getUN().substring(0,3)+randomNum()+"x"+randomNum()+"x"+randomNum()+"x"+randomNum()+"x"+trader.getTokenType().substring(0,3)+ trader.getTokenType().substring(4));
    }


    //Generates a random number from 0000-9999 that is always 4 digits long
    private static String randomNum(){
        int num = (int)(Math.random()*9999);
        String sNum = "";
        if(num<10){
            sNum+="000";
        } else if (num<100){
            sNum+="00";
        } else if (num<1000){
            sNum+="0";
        }
        sNum+=num;
        return sNum;
    }


    //!!STUDENT WILL MAKE THIS  <=====================================
    //Create this method below: String getUserStringInput()
    //Gets the user input for the yes or no prompts.
    //This is called from do/while loops in the Main method.
   /*Error handling is already performed however you will need to make sure that all
      text entries are formatted to meet the criteria being checked*/
    private static String getUserStringInput(){
        String answer = sc.nextLine().toLowerCase();
        return answer;
    }

    //!!STUDENT WILL MAKE THIS  <=====================================
    //Create this method below: double getUserNumericalInput(double low, double high, String message)
    //Gets use to input numerical responses.
    //The return value is double for simplicity purposes.
    //The return value will need to be cast to int where appropriate
    //An example of casting is given in the initial code in the setNFTRarityRecord() method
    //Use try catch for error handling. If error occurs print the following message: "\nPlease enter a correct value."

    private static double getUserNumericalInput(double low, double high, String message) {
        System.out.println(message);
        double num = sc.nextDouble();
        while(num<low||num>high){
            System.out.println(message);
            num = sc.nextDouble();
        }
        return num;
    }

    //!!STUDENT WILL MAKE THIS  <=====================================
    //Create this method below: void consoleRecordCheck(NFTData c)
    //Prints the final record to the console by using data from the object get methods
    //Each field needs to be on its own line during print
    //This is the order: Username, Wallet Address, Collection Name, NFT Address, Floor Price (formatted for USD), Rarity
    private static void consoleRecordCheck(NFTData c){
        System.out.println("*******************************************************");
        System.out.println("******************* CREATOR RECORDS *******************");
        System.out.println("Username: " + c.getUN());
        System.out.println("Wallet Address: " + c.walletAddress.getAdd());
        System.out.println("Collection Name: " + c.getCollection());
        System.out.println("NFT Address: " + c.getNFTAddress());
        System.out.printf("\nFloor Price: $%.2f%n", c.getFloorPrice());
        System.out.println("Rarity/Collection: " + c.getRarity());
        System.out.println("*******************************************************");
        System.out.println("*******************************************************");

    }
} //Ends class


class NFTData {
    private String userName;
    private String productName;
    private String rarity;
    private String collectionName;
    private double floorPrice;
    private String tokenType;
    private String nftAddress = null;
    public WalletAddress walletAddress;

    public NFTData(String un, String co) {
        this.userName = un;
        this.productName = null;
        this.rarity = null;
        this.collectionName = co;
        this.tokenType = null;
        this.floorPrice = (double)0.0F;
        this.walletAddress = new WalletAddress();
    }

    public NFTData(String un, String pn, String ra, String co, String bc, Double fp) {
        this.userName = un;
        this.productName = pn;
        this.rarity = ra;
        this.collectionName = co;
        this.tokenType = bc;
        this.floorPrice = fp;
        this.walletAddress = new WalletAddress();
    }

    public String getUN() {
        return this.userName;
    }

    public void setUN(String un) {
        this.userName = un;
    }

    public String getPN() {
        return this.productName;
    }

    public void setPN(String pn) {
        this.productName = pn;
    }

    public String getRarity() {
        return this.rarity;
    }

    public void setRarity(String ra) {
        this.rarity = ra;
    }

    public String getCollection() {
        return this.collectionName;
    }

    public void setCollection(String co) {
        this.collectionName = co;
    }

    public Double getFloorPrice() {
        return this.floorPrice;
    }

    public void setFloorPrice(Double f) {
        this.floorPrice = f;
    }

    public String getTokenType() {
        return this.tokenType;
    }

    public void setTokenType(String bc) {
        this.tokenType = bc;
    }

    public void setNFTAddress(String a) {
        this.nftAddress = a;
    }

    public String getNFTAddress() {
        return this.nftAddress;
    }

    public String toString() {
        String var10000 = this.getClass().getName();
        return var10000 + "WRONG  " + this.getUN() + "\n WRONG" + this.getRarity() + " " + this.getCollection() + "\n WRONG" + this.getTokenType() + "\n WRONG" + this.getFloorPrice() + "]";
    }
}



class WalletAddress {
    private String publicKeyWallet;

    public WalletAddress() {
        this.publicKeyWallet = "NA";
    }

    public WalletAddress(String a) {
        this.publicKeyWallet = a;
    }

    public String getAdd() {
        return this.publicKeyWallet;
    }

    public void setAdd(String s) {
        this.publicKeyWallet = s;
    }
}