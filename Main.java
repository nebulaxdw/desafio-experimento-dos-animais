import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char c;
        int d = 0, e = 0, f = 0, i, t;
	System.out.println("Digite a quantidade de vezes que o loop será feito: ");
	int a = input.nextInt();
        DecimalFormat df = new DecimalFormat("0.00");
        while (a > 0) {
            t = 0;
            System.out.println("Digite a quantidade de animais: ");
	    i = input.nextInt();
	    if (i > 15) {
		System.out.println("A quantidade de animais deve ser menor ou igual a 15");
                continue;
            }
            System.out.println("Digite o animal: \n");
	    c = input.next().charAt(0);
	    if (c == 'C') {
                d += i;
            }
	    else if (c == 'R') {
                e += i;
            }
	    else if (c == 'S') {
                f += i;
            }
            t += d + e + f;
            a--;
            double percentual_coelhos = (Double.valueOf(d) / Double.valueOf(t)) * 100;
            double percentual_ratos = (Double.valueOf(e) / Double.valueOf(t)) * 100;
            double percentual_sapos = (Double.valueOf(f) / Double.valueOf(t)) * 100;
            System.out.println("Total: " + t + " cobaias");
            System.out.println("Total de coelhos: " + d);
            System.out.println("Total de ratos: " + e);
            System.out.println("Total de sapos: " + f);
            System.out.println(String.format(Locale.US, "Percentual de coelhos: %.2f %%", percentual_coelhos));
            System.out.println(String.format(Locale.US, "Percentual de ratos: %.2f %%", percentual_ratos));
            System.out.println(String.format(Locale.US, "Percentual de sapos: %.2f %%", percentual_sapos));
        }
    }
}
