public class For {
    public static void main(String[] args) {

        int numero = 10;

        for(numero = 10; numero >0; numero--) {
            System.out.println("O numero atual é " + numero);
            if (numero==8){
                System.out.println("encontrei o numero 8");
                System.out.println("vou parar agora ...");
                break;
            }
        }

}
}
