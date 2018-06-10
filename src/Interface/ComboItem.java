/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.sql.*;
import javax.swing.*;

/**
 * /**
 *
 * @author Asanka
 */
public class ComboItem {

    private String name;
    private int id;
    

  

    public ComboItem(String a, int b) {
        this.name = a;
        this.id = b;
    }

   
    

    public String getname() {

        return name;
    }

    public int getid() {

        return id;
    }

}
