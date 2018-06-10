/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author Kavindu
 */
public class settingslocale {
    ResourceBundle rb;
settingslocale(){};

    /**
     *
     * @param Bundle
     * @param locale
     */
    public void resourcesetup(String Bundle,Locale locale){
     rb=ResourceBundle.getBundle(Bundle,locale );
  //return rb;
}

}
