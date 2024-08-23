public abstract class AnimalTerrestreAB extends AnimalAB {
    private int quantidadePatas;

    public AnimalTerrestreAB(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso, int quantidadePatas, double comidaPorRefeicao, double distanciaPorCaminhada, int horasDeSono) {
        super(nome, tipoAnimal, idade, habitat, altura, peso, comidaPorRefeicao, distanciaPorCaminhada, horasDeSono);
        this.quantidadePatas = quantidadePatas;
    }

    public int getQuantidadePatas() {
        return quantidadePatas;
    }
}
