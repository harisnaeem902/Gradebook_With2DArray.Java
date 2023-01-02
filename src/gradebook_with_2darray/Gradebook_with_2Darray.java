package gradebook_with_2darray;

public class Gradebook_with_2Darray 
{

    public static void main(String[] args) 
    {
        double [][] r={
                            {34,27,36,48,16},
                            {20,46,29,45,34},
                            {46,47,46,46,47},
                            {48,28,35,54,45},
                            {36,44,22,33,44}
                      };
        
        gradebook oop=new gradebook("CSC-103 OOP",r);
        oop.processGrade();
        
        
        double [][] r1={
                            {44,45,33},
                            {35,26,44},
                            {47,46,35}
                        };
        gradebook math=new gradebook("MTH543 Math",r1);
        math.processGrade();

    }
    
}
