
package logica;

import javax.swing.JButton;

public class BotonImagen {
    
    private JButton boton ;
    private String url;

    public BotonImagen(JButton b, String url) {
        this.boton = b;
        this.url = url;
    }

    public BotonImagen() {
    }

    public JButton getBoton() {
        return boton;
    }

    public void setBoton(JButton boton) {
        this.boton = boton;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
  
}
