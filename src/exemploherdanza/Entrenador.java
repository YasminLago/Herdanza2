package exemploherdanza;
public class Entrenador extends EquipoFutbol{
    private String idFederacion;
    
    public Entrenador(){
        super();
    }
    public Entrenador(int id,int idade,String nome,String apelido,String idFederacion){
        super(id,idade,nome,apelido);
        this.idFederacion=idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
    
    public void dirixirPartido(){
        System.out.println("O ENTRENADOR dirixe o partido");
    }
    public void dirixirEntrenamento(){
        System.out.println("O ENTRENADOR dirixe o entrenamento");
    }

    @Override
    public String toString() {
        return "Entrenador{" + "idFederacion=" + idFederacion + '}';
    }
    @Override
     public void viaxar(){
        System.out.println("O ENTRENADOR viaxa en PRIMEIRA"); 
    }
}
