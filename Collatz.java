package conjectura.de.collatz;
public class Collatz {
    private int cont = 0;
    public void collatz(int num){
        while(num > 1){
            if(num % 2 == 0){ //se for par
                num = num/2;
                System.out.println(num);
                cont++;
            }else{//se for ímpar
                num = (num * 3)+1;
                System.out.println(num);
                cont++;
            }
        }
        System.out.println("O loop de repetição repetiu: "+cont+" vezes");
    }
}