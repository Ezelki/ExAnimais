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
public class Mamiferos extends Animais{
    protected int nMamas;
    protected String fml;
    
    public Mamiferos(){
        
    }

    public int getnMamas() {
        return nMamas;
    }

    public void setnMamas(int nMamas) {
        this.nMamas = nMamas;
    }

    public String getFml() {
        return fml;
    }

    public void setFml(String fml) {
        this.fml = fml;
    }
}
