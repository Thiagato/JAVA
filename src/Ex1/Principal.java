package Ex1;

public class Principal {
    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso(980.00);
        Ingresso ingresso1 = new IngressoVip(980.00, 90.00);
        IngressoVip vip = new IngressoVip(10.00, 90.00);



        System.out.println(vip.getValorAdicional());
        System.out.println(vip.getValor());
        System.out.println(vip);
        System.out.println(ingresso);
        System.out.println(ingresso1);
    }
}
