package exemploherdanza;

public class ExemploHerdanza {
    public static void main(String[] args) {
        EquipoFutbol equipo1=new EquipoFutbol(1,20,"equiA","equiA");
        Futbolista nolito=new Futbolista(2,29,"Nolito","Nolito",10,"Dianteiro");
        Entrenador berizzo=new Entrenador(3,40,"Berizzo","Berizzo","Primeira");
        Masaxista eva=new Masaxista(4,25,"Eva","Eva","Masaxista",15);
        Directiva direct=new Directiva(6,40,"direct","direct",5);
    
        System.out.println("atributo protected: "+nolito.nome);
        System.out.println("atributo private accedo pir un metodo: "+nolito.getIdade());
        berizzo.viaxar();
        eva.darMasaxes();
        eva.concentrarse();
        System.out.println(nolito);
    }
    
}
