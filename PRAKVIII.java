/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.kelompok2.prakviii;

/**
 *
 * @author user
 */

import javax.swing.SwingUtilities;

public class PRAKVIII {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFramePBO frame = new JFramePBO();
                frame.setTitle("Form Login PBO"); 
                frame.setLocationRelativeTo(null); 
                frame.setVisible(true); 
            }
        });
    }
}
