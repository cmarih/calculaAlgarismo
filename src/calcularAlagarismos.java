import java.util.ArrayList;
import java.util.List;

public class calcularAlagarismos {
    public static List<Integer> getList(int start, int end){
        List<Integer> listaNumeros = new ArrayList<>();
        for (int number = start; number <= end; number++) {
            listaNumeros.add(number);
        }

        return listaNumeros;
    }
    static int getSum(int n) {
        int sum = 0;

        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        List<Integer> lista = getList(3989, 5000);

        for(int i = 0; i < lista.size(); i++){
            int result = getSum(lista.get(i));
            if (result == 21) {
                System.out.println("O num: " +
                        lista.get(i) + " resulta em: " + result);
                //System.out.println(result);
            }
        }
    }
}

