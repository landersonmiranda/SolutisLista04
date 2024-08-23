public abstract class AnimalVoadorAB extends AnimalAB {
    private int quantidadeAssas;
    private double envergaduraAssa;
    private double distanciaPorMovimento;

    public AnimalVoadorAB(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso, int quantidadeAssas, double envergaduraAssa, double comidaPorRefeicao, double distanciaPorMovimento, int horasDeSono) {
        super(nome, tipoAnimal, idade, habitat, altura, peso, comidaPorRefeicao, distanciaPorMovimento, horasDeSono);
        this.quantidadeAssas = quantidadeAssas;
        this.envergaduraAssa = envergaduraAssa;
        this.distanciaPorMovimento = distanciaPorMovimento;
    }

    public int getQuantidadeAssas() {
        return quantidadeAssas;
    }

    public double getEnvergaduraAssa() {
        return envergaduraAssa;
    }
    public double getDistanciaPorMovimento() {return distanciaPorMovimento;}

    public void voar() {
        distanciaPorMovimento = distanciaPorMovimento;
        System.out.println(getTipoAnimal() + " " + getNome() + " voou " + getDistanciaPorMovimento() + " km.");
    }
}
