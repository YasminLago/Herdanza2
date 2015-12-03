package exemploherdanza;
public class Masaxista extends EquipoFutbol{
    private String titulacion;
    private int anosExperiencia;
    
    public Masaxista(){
        super();
    }
    public Masaxista(int id,int idade,String nome,String apelido,String titulacion,int anosExperiencia){
        super(id,idade,nome,apelido);
        this.titulacion=titulacion;
        this.anosExperiencia=anosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }
    public void darMasaxes(){
        System.out.println("O MASAXISTA da masaxes");
    }

    @Override
    public String toString() {
        return "Masaxista{" + "titulacion=" + titulacion + ", anosExperiencia=" + anosExperiencia + '}';
    }
    
}
