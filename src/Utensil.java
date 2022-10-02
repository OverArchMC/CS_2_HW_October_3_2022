public class Utensil {
    String name = "fork";

    public static int howManyProngs(String nameOfUtensil){
        if(!nameOfUtensil.equals("fork")){
            return 0;
        }
        return 4;
    }
    public static int howManyProngs(String nameOfUtensil, boolean isFork){
        if(isFork){
            return 4;
        }
        return 0;
    }

    public static boolean thisWillReturnTrue(){
        return false;
    }
}
