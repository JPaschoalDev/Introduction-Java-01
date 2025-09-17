import java.util.Scanner;

public class AtividadeCurso {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double c,h,A,v1,v2;

        System.out.println("QUANTOS METROS TEM O COMPRIMENTO DO SEU TERRENO?");
        c=input.nextDouble();
        System.out.println("QUANTOS METROS TEM A LARGURA DE SEU TERRENO?");
        h=input.nextDouble();
        A=c*h;
        System.out.println("A ÁREA DE SEU TERRENO É DE "+A+" METROS QUADRADOS");
        System.out.println();
        System.out.println("QUAL O VALOR COBRADO POR METRO QUADRADO?");
        v1=input.nextDouble();
        v2=A*v1;
        System.out.println("O VALOR COBRADO PELA SEU TERRENO SERÁ DE R$"+v2);

    }
}
