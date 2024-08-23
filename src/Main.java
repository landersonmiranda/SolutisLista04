public class Main {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Pedrita", 8, "apartamento", 10, 10, 4);
        Pombo pombo = new Pombo("Pivete", 7, "Praça da Sé", 1.2, 0.8, 2, 2.3);
        Peixe peixe = new Peixe("Shark", 1, "Baia de todos os santos", 0.2, 0.8);
        Leao leao = new Leao("Simba", 28, "Madagascar",18,47,4);
        Gato gato = new Gato("Estrela", 5, "Casa", 6,4,4);
        Elefante elefante = new Elefante("Java", 48, "Savana", 53,230,4);


        cachorro.comer();
        cachorro.mover();
        cachorro.dormir();
        System.out.println("---------------------------");
        pombo.comer();
        pombo.voar();
        pombo.dormir();
        System.out.println("---------------------------");
        peixe.comer();
        peixe.nadar();
        peixe.dormir();
        System.out.println("---------------------------");
        leao.comer();
        leao.mover();
        leao.dormir();
        System.out.println("---------------------------");
        gato.comer();
        gato.mover();
        gato.dormir();
        System.out.println("---------------------------");
        elefante.comer();
        elefante.mover();
        elefante.dormir();
    }
}