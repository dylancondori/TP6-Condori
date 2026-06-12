package tp6_actividad_1;

public class Residente {
    //Atributos:
    String nombre ;
    String apellido ;
    int Edad ;
    char Color_de_su_traje ;
    boolean Esta_en_su_puesto;
    //Metodos
    void MostrarInfo(){
        System.out.println("-----------");
        System.out.println(("| ")+this.nombre+(" |   "));
        System.out.println(("| ")+this.apellido+("  |"));
        System.out.println(("| ")+this.Edad+("      |"));
        System.out.println(("| ")+this.Color_de_su_traje+("       |"));
        System.out.println(("| ")+this.Esta_en_su_puesto+("   |"));
        System.out.println("-----------");
        
    }
}
