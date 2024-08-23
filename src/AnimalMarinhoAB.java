public abstract class AnimalMarinhoAB extends AnimalAB {
    private double distanciaPorMovimento;


    public AnimalMarinhoAB(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso, double comidaPorRefeicao, double distanciaPorMovimento, int horasDeSono) {
        super(nome, tipoAnimal, idade, habitat, altura, peso, comidaPorRefeicao, distanciaPorMovimento, horasDeSono);
        this.distanciaPorMovimento = distanciaPorMovimento;

    }
    public double getDistanciaPorMovimento() {return distanciaPorMovimento;}
    public void nadar() {
        distanciaPorMovimento = distanciaPorMovimento;
        System.out.println(getTipoAnimal() + " " + getNome() + " nadou " + getDistanciaPorMovimento() + " km.");
    }
}
