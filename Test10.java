public class Test10{
public static void main(String[] args){
    for(int i=1;i<=6;i++){
         for(int k=i-5;k<=i;k++){
			 if(k<=0)
				System.out.printf("*");
			else			
				System.out.printf("%d",k);
        }
         System.out.println("");
        }
	}
}