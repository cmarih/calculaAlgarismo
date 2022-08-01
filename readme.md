# Código criado para somar os Algarismos de um número.

- Dentro de um determinado range, utilizando ArrayList é gerado uma lista de inteiros com 4 digitos.



~~~~JAVA

    List<Integer> listaNumeros = new ArrayList<>();
        for (int number = start; number <= end; number++) {
            listaNumeros.add(number);
    }

    public static void main(String[] args) {

            List<Integer> lista = getList(3989, 5000);
~~~~

- Cria-se uma estrutura de decisão que percorre a lista por completo.

~~~~JAVA
      for(int i = 0; i < lista.size(); i++){
~~~~

- Aplica a função de somar os algarismos para cada item da lista.

~~~~JAVA
    
    int result = getSum(lista.get(i));

~~~~

- Função para somar os algarismos.

~~~~JAVA

    static int getSum(int n) {
            int sum = 0;
    
            while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
            }
    
            return sum;
            }

~~~~

- Cria-se uma nova estrutura de decisão para identificar quais os inteiros que na soma dos algarismos retorna o valor = "21".

~~~~JAVA

        if (result == 21) {
            System.out.println("O num: " +
            lista.get(i) + " resulta em: " + result);
        }

~~~~

# Resultado

~~~~JAVA
/usr/lib/jvm/java-11-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -classpath /home/mari/projeto/JAVA/imersao-java-alura/alura-stickers/calcularAlgarismos/out/production/calcularAlgarismos calcularAlagarismos
O num: 3990 resulta em: 21
O num: 4089 resulta em: 21
O num: 4098 resulta em: 21
O num: 4179 resulta em: 21
O num: 4188 resulta em: 21
O num: 4197 resulta em: 21
O num: 4269 resulta em: 21
O num: 4278 resulta em: 21
O num: 4287 resulta em: 21
O num: 4296 resulta em: 21
O num: 4359 resulta em: 21
O num: 4368 resulta em: 21
O num: 4377 resulta em: 21
O num: 4386 resulta em: 21
O num: 4395 resulta em: 21
O num: 4449 resulta em: 21
O num: 4458 resulta em: 21
O num: 4467 resulta em: 21
O num: 4476 resulta em: 21
O num: 4485 resulta em: 21
O num: 4494 resulta em: 21
O num: 4539 resulta em: 21
O num: 4548 resulta em: 21
O num: 4557 resulta em: 21
O num: 4566 resulta em: 21
O num: 4575 resulta em: 21
O num: 4584 resulta em: 21
O num: 4593 resulta em: 21
O num: 4629 resulta em: 21
O num: 4638 resulta em: 21
O num: 4647 resulta em: 21
O num: 4656 resulta em: 21
O num: 4665 resulta em: 21
O num: 4674 resulta em: 21
O num: 4683 resulta em: 21
O num: 4692 resulta em: 21
O num: 4719 resulta em: 21
O num: 4728 resulta em: 21
O num: 4737 resulta em: 21
O num: 4746 resulta em: 21
O num: 4755 resulta em: 21
O num: 4764 resulta em: 21
O num: 4773 resulta em: 21
O num: 4782 resulta em: 21
O num: 4791 resulta em: 21
O num: 4809 resulta em: 21
O num: 4818 resulta em: 21
O num: 4827 resulta em: 21
O num: 4836 resulta em: 21
O num: 4845 resulta em: 21
O num: 4854 resulta em: 21
O num: 4863 resulta em: 21
O num: 4872 resulta em: 21
O num: 4881 resulta em: 21
O num: 4890 resulta em: 21
O num: 4908 resulta em: 21
O num: 4917 resulta em: 21
O num: 4926 resulta em: 21
O num: 4935 resulta em: 21
O num: 4944 resulta em: 21
O num: 4953 resulta em: 21
O num: 4962 resulta em: 21
O num: 4971 resulta em: 21
O num: 4980 resulta em: 21

Process finished with exit code 0

~~~~