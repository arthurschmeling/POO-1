
package circulo;

import javax.swing.JOptionPane;

public class circulo {
private double raio;
public circulo(){
this.raio=1;
    }
public circulo (double raio){
    this.raio=raio;
}
public void setraio (double raio){
    this.raio= raio;
}
public double getraio(){
    return raio;
}
public void calcularPerimetro(){
   JOptionPane.showMessageDialog(null,"o resultado do perimetro é: " +(2*3.14*raio));
}
public void calcularArea(){
   JOptionPane.showMessageDialog(null,"o resultado da area é: " +(3.14*raio*raio));
}
public void calcularDiametro(){
    
    JOptionPane.showMessageDialog(null,"o resultado do diametro é: " +(2*raio));
}
public String calcularP(){
    return "o resultado do perimetro é " + (2*3.14*raio);
}
public String calcularA(){
    return "o resultado da area é: " +(3.14*raio*raio);
}
public String calcularD(){
    return "o resultado do diametro é: " +(2*raio);
}
}

