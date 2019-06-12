import controlador1.CtlrDueñoMascota;
import modelo.ConsultasDueñoMascota;
import modelo.DueñoMascota;
import vista.frmHappyPet2;

public class CRUDMVC {

    public static void main(String[] args) {
        DueñoMascota mod = new DueñoMascota();
        ConsultasDueñoMascota modC = new ConsultasDueñoMascota();
        frmHappyPet2 frm = new frmHappyPet2();    
        CtlrDueñoMascota ctrl = new CtlrDueñoMascota(mod, modC, frm);
        frm.setVisible(true);     
    }   
}