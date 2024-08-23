package patternProgram.WithCondition;

public class Code1 {

    public static void main(String[] args) {


        for(int i = 1; i <= 5; i++){
            for(int j =1; j <= 5; j++){
                if(i%2==0){
                    System.out.println("#");
                }
                else {
                    System.out.println("$");
                }
            }
            System.out.println();
        }
    }


}
