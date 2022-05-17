public class TacoBoxCu implements TacoBox {
    private int tacos;

    public TacoBoxCu(int tacos) {
        this.tacos = tacos;
    }

    public int tacosRemain() {
        return this.tacos;
    }

    public void eat() {
        if (tacos > 0) {
            tacos--;
        } else {
            System.out.println("no more tacosS");
        }
    }
}
