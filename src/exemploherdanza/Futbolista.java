package exemploherdanza;
public class Futbolista extends EquipoFutbol{
  private int dorsal;
  private String demarcacion;
  
  public Futbolista(){
      super();
  }
  public Futbolista(int id,int idade,String nome,String apelido,int dorsal,String demarcacion){
      super(id,idade,nome,apelido);//Chama o metodo EquipoFutbol para dar valos os parametros
      this.dorsal=dorsal;
      this.demarcacion=demarcacion;
  }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
  
  public void xogarPartido(){
      System.out.println("Xoga o partido os FUTBOLISTAS");
  }
  public void entrenar(){
      System.out.println("Entrenan os FUTBOLISTAS");
  }

    @Override
    public String toString() {
       String resposta= super.toString();
        return "Futbolista{"+resposta + "dorsal=" + dorsal + ", demarcacion=" + demarcacion + '}';
    }
  
}
