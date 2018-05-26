package repeticao;

public class RepeticaoSemFor {

    private int total;
    private boolean first = true;

    public static void main(String[] args) {
        RepeticaoSemFor meuObjeto = new RepeticaoSemFor();
        meuObjeto.doFatorial(4);

    }

    public void doFatorial(int num) {
        if (this.first == true) {
            first = false;
            total = num;
        }
        num--;
        total *= num;

        if (num > 1) {
            this.doFatorial(num);
        } else {
            System.out.println(total);
        }
    }

}
