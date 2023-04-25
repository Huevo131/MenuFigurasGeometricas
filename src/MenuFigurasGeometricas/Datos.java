/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuFigurasGeometricas;
import javax.swing.JOptionPane;

/**
 *
 * @author Yahir
 */
public class Datos {

    int opcion;
    double lado, base, altura, radio, arista;

    Figuras formulas = new Figuras();

    public void Menu() {
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opcion del siguiente menu:"
                + "\n\t" + "1) Area Circulo"
                + "\n\t" + "2) Area Cuadrado"
                + "\n\t" + "3) Area Triangulo"
                + "\n\t" + "4) Area Rectangulo"
                + "\n\t" + "5) Area Esfera"
                + "\n\t" + "6) Area Cubo"));
        switch (opcion) {
            case 1:
                radio = Double.parseDouble(JOptionPane.showInputDialog("\n¿Cual es el radio del circulo?"));
                formulas.AreaCirculo(radio);
                break;
            case 2:
                lado = Double.parseDouble(JOptionPane.showInputDialog("\n¿Cual es el lado del cuadrado?"));
                formulas.AreaCuadrado(lado);
                break;
            case 3:
                base = Double.parseDouble(JOptionPane.showInputDialog("\n¿Cual es la base del triangulo?"));
                altura = Double.parseDouble(JOptionPane.showInputDialog("¿Cual es la altura del triangulo?"));
                formulas.AreaTriangulo(base, altura);
                break;
            case 4:
                base = Double.parseDouble(JOptionPane.showInputDialog("\n¿Cual es el la base del rectangulo?"));
                altura = Double.parseDouble(JOptionPane.showInputDialog("¿Cual es la altura del rectangulo?"));
                formulas.AreaRectangulo(base, altura);
                break;
            case 5:
                radio = Double.parseDouble(JOptionPane.showInputDialog("\n¿Cual es el radio de la esfera?"));
                formulas.AreaEsfera(radio);
                break;
            case 6:
                arista = Double.parseDouble(JOptionPane.showInputDialog("\n¿Cual es la arista del cubo?"));
                formulas.AreaCubo(arista);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion no valida");

        }
        formulas.Resultado();

    }
}

