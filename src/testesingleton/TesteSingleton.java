/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testesingleton;

/**
 *
 * @author rbabari
 */
public class TesteSingleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Singleton s1 = Singleton.getInstance();
     Singleton s2 = Singleton.getInstance();
        if (s1==s2) {
            System.out.println("same instance");
        }
    }
    
}
