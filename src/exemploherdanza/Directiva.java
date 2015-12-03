package exemploherdanza;
public class Directiva extends EquipoFutbol{
    private int numMembros;
    
    public Directiva(){
        super();
    }
    public Directiva(int id,int idade,String nome,String apelido, int numMembros){
        super(id,idade,nome,apelido);
        this.numMembros=numMembros;
    }

    public int getNumMembros() {
        return numMembros;
    }

    public void setNumMembros(int numMembros) {
        this.numMembros = numMembros;
    }
    public void tomarDecisions(){
        System.out.println("A DIRECTIVA toma decisions");
    }

    @Override
    public String toString() {
        String resposta= super.toString();
        return "Directiva{" + "numMembros=" + numMembros + '}';
    }
    
}
