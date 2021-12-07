/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animais;

/**
 *
 * @author IFSC
 */
public class SerHumano extends Mamiferos{
    int nOlhos, nBraços, nPernas;
    
    
    public void impS (){
        System.out.println("Número de olhos: "+nOlhos);
        System.out.println("Número de braços: "+nBraços);
        System.out.println("Número de pernas: "+nPernas);
        System.out.println("Número de mamas: "+nMamas);
        System.out.println("Família do animal: "+fml);
        System.out.println("Idade: "+idade);
        System.out.println("Peso: "+peso);
        System.out.println("Altura: "+altura);
    }
    public SerHumano () {
        
    }

    public int getnOlhos() {
        return nOlhos;
    }

    public void setnOlhos(int nOlhos) {
        this.nOlhos = nOlhos;
    }

    public int getnBraços() {
        return nBraços;
    }

    public void setnBraços(int nBraços) {
        this.nBraços = nBraços;
    }

    public int getnPernas() {
        return nPernas;
    }

    public void setnPernas(int nPernas) {
        this.nPernas = nPernas;
    }
}
