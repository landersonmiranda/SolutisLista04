public abstract class AnimalAB {
    private String nome;
    private String tipoAnimal;
    private int idade;
    private String habitat;
    private double altura;
    private double peso;

    private double comidaPorRefeicao;
    private double distanciaPorMovimento;
    private int horasDeSono;

    private double comidaConsumida;
    private double distanciaPercorrida;
    private int horasDormidas;

    public AnimalAB(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso, double comidaPorRefeicao, double distanciaPorMovimento, int horasDeSono) {
        this.nome = nome;
        this.tipoAnimal = tipoAnimal;
        this.idade = idade;
        this.habitat = habitat;
        this.altura = altura;
        this.peso = peso;
        this.comidaPorRefeicao = comidaPorRefeicao;
        this.distanciaPorMovimento = distanciaPorMovimento;
        this.horasDeSono = horasDeSono;

        this.comidaConsumida = 0;
        this.distanciaPercorrida = 0;
        this.horasDormidas = 0;
    }

    public String getNome() {
        return nome;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void comer() {
        comidaConsumida += comidaPorRefeicao;
        System.out.println(tipoAnimal + " " + nome + " comeu " + comidaConsumida + " kg de comida.");
    }

    public void mover() {
        distanciaPercorrida += distanciaPorMovimento;
        System.out.println(tipoAnimal + " " + nome + " se moveu " + distanciaPercorrida + " km.");
    }

    public void dormir() {
        horasDormidas += horasDeSono;
        System.out.println(tipoAnimal + " " + nome + " dormiu " + horasDormidas + " horas.");
    }
}
