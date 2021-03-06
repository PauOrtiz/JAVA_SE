package controlador1; 

import modelo.ConsultasDueñoMascota;
import modelo.DueñoMascota;
import vista.frmHappyPet2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class CtlrDueñoMascota implements ActionListener {

    private DueñoMascota mod;
    private ConsultasDueñoMascota modC;
    private frmHappyPet2 frm;

    public CtlrDueñoMascota(DueñoMascota mod, ConsultasDueñoMascota modC, frmHappyPet2 frm) {
        this.mod = mod;
        this.modC = modC;
        this.frm = frm;
        this.frm. botonIn1.addActionListener(this);
        this.frm. botonIn2.addActionListener(this);
        this.frm. botonIn3.addActionListener(this);
        this.frm. botonIn4.addActionListener(this);
        this.frm. botonIn5.addActionListener(this);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == frm.botonIn1) {
        	mod.setId(Integer.parseInt(frm.textoCampo0.getText()));
        	//a partir de los setters
        	mod.setNomMascota(frm.textoCampo.getText());
            mod.setNomDueño(frm.textoCampo2.getText());
            mod.setApDueño(frm.textoCampo3.getText());
            mod.setTel(Integer.parseInt(frm.textoCampo4.getText()));
            mod.setObservaciones(frm.textoCampo5.getText());
            
            
            if(modC.registrar(mod))
            {
                JOptionPane.showMessageDialog(null, "Registro Guardado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Guardar");
                limpiar();
            }
        }
        
        if (e.getSource() == frm.botonIn3) {
        	mod.setId(Integer.parseInt(frm.textoCampo0.getText()));
        	//a partir de los setters
        	mod.setNomMascota(frm.textoCampo.getText());
            mod.setNomDueño(frm.textoCampo2.getText());
            mod.setApDueño(frm.textoCampo3.getText());
            mod.setTel(Integer.parseInt(frm.textoCampo4.getText()));
            mod.setObservaciones(frm.textoCampo5.getText());
            
            if(modC.modificar(mod))
            {
                JOptionPane.showMessageDialog(null, "Registro Modificado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Modificar");
                limpiar();
            }
        }
        
        if (e.getSource() == frm.botonIn4) {
        	mod.setId(Integer.parseInt(frm.textoCampo0.getText()));
            
            if(modC.eliminar(mod))
            {
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Eliminar");
                limpiar();
            }
          
        }
        
        if (e.getSource() == frm.botonIn4) {
            mod.setId(Integer.parseInt(frm.textoCampo0.getText()));
            
            if(modC.buscar(mod))
            {
                frm.textoCampo0.setText(String.valueOf(mod.getId()));
                frm.textoCampo.setText(mod.getNomMascota());
                frm.textoCampo2.setText(mod.getNomDueño());
                frm.textoCampo3.setText(mod.getApDueño());
                frm.textoCampo4.setText(String.valueOf(mod.getTel()));
                frm.textoCampo5.setText(mod.getObservaciones());

            } else {
                JOptionPane.showMessageDialog(null, "No se encontro registro");
                limpiar();
            }
        }
        
        if (e.getSource() == frm.botonIn2) {
            limpiar();
        }
    }
    
    public void limpiar()
    {
        frm.textoCampo0.setText(null);
        frm.textoCampo.setText(null);
        frm.textoCampo2.setText(null);
        frm.textoCampo3.setText(null);
        frm.textoCampo4.setText(null);
        frm.textoCampo5.setText(null);
    }    
}
