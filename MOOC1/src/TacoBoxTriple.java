public class TacoBoxTriple implements TacoBox {
    private int tacos;

    TacoBoxTriple() {
        this.tacos = 3;
    }

    public int tacosRemain() {
        return this.tacos;
    }

    public void eat() {
        if (tacos > 0) {
            tacos--;
        } else {
            System.out.println("no more tacos ");
        }
    }
}
