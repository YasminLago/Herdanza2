package exemploherdanza;
public class EquipoFutbol {
    private int id,idade;//so visible na clase
    protected String nome,apelido;//visible tamen nas subclases
    
    public EquipoFutbol(){
        
    }
    
    public EquipoFutbol(int id,int idade,String nome,String apelido){
        this.id=id;
        this.idade=idade;
        this.nome=nome;
        this.apelido=apelido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void concentrarse(){
        System.out.println("Concentrase o EQUIPO DE FUTBOL");
    }
    public void viaxar(){
        System.out.println("Viaxa o EQUIPO DE FUTBOL"); 
    }

    @Override
    public String toString() {
        return "EquipoFutbol{" + "id=" + id + ", idade=" + idade + ", nome=" + nome + ", apelido=" + apelido + '}';
    }
    
}
