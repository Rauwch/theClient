/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theclient;

import Labo2.StockManagerRemote;
import javax.ejb.EJB;
import remote.ProductManagerRemote;
import remote.SalesManagerRemote;

/**
 *
 * @author Anton
 */
public class Main {

    @EJB
    private static SalesManagerRemote salesManager;

    @EJB
    private static ProductManagerRemote productManager;
    
    @EJB
    private static StockManagerRemote stockManager;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        productManager.createCoffee("java", "jam jam", 10, 1, "Belgie", 10, true);
        productManager.createTea("black jasmine", "special", 50, "china", "eldertype");
        salesManager.createReseller("Douwe Egberts", "douwe@egberts.com", "koffiestraat", "koffiestad", 13, "koffieland", 32);
        salesManager.createFarmer("Jos", "Jos@bos.be", "Boerderijlaan", "Lier", 13, "Belgie");
    }
    
}
