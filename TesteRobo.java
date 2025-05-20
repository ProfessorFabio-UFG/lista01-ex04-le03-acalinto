public class TesteRobo {
    public static void main(String[] args) {
        RoboAspirador r1 = new RoboAspirador(1, 100);
        RoboAspirador r2 = new RoboAspirador(2, 200);

        r1.ligar();
        r1.andar(5, 5);
        r1.aspirar(50);
        System.out.println(r1);
        r1.aspirar(60); 
        System.out.println(r1);
    }
}
