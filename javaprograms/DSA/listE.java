import java.util.*;
public class listE
{
    public static void main(String[] args)
    {
        ArrayList<String> listE= new ArrayList<>();
        listE.add("rajendra porte");
        listE.add("Sudarshan");
        listE.add("Anurag");
        System.out.println(listE );
        
        for(String e:listE){
            if(e.contains("e")){
                System.out.println(e);
            }
        }

    }
}