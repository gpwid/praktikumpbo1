package com.kelompok2.prakviii;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author user
 */

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.ActionEvent;


public class Kalkulator extends JFrame {
    private String operatorSaatIni = "";
    private double nilaiPertama = 0;
    private boolean inputBerikutnya = true;
    
    // Komponen UI
    private JLabel tampilanUtama, labelOperator;
    private JPanel panelTombol;
    private Color warnaBackground = new Color(30, 30, 45);
    private Color warnaTampilan = new Color(20, 20, 30);
    private Color warnaTombol = new Color(50, 50, 70);
    private Color warnaOperator = new Color(0, 150, 255);
    private Color warnaSamaDengan = new Color(255, 105, 97);
    
    public Kalkulator() {
        inisialisasiAntarmuka();
        setTitle("Kalkulator Premium 🚀");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(400, 550);
        setLocationRelativeTo(null);
    }
    
    private void inisialisasiAntarmuka() {
        // Panel utama dengan gradient
        JPanel panelUtama = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D graphics2d = (Graphics2D) g;
                graphics2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                GradientPaint gradient = new GradientPaint(0, 0, new Color(25, 25, 40), 0, getHeight(), new Color(35, 35, 55));
                graphics2d.setPaint(gradient);
                graphics2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        panelUtama.setLayout(new BorderLayout(15, 15));
        panelUtama.setBorder(new EmptyBorder(25, 25, 25, 25));
        
        // Area tampilan
        JPanel panelTampilan = new JPanel(new BorderLayout(10, 10));
        panelTampilan.setOpaque(false);
        panelTampilan.setPreferredSize(new Dimension(350, 120));
        
        // Label operator
        labelOperator = buatLabelTertata(" ", new Color(150, 150, 180), 16);
        labelOperator.setHorizontalAlignment(SwingConstants.RIGHT);
        
        // Tampilan utama
        tampilanUtama = buatLabelTertata("0", Color.WHITE, 40);
        tampilanUtama.setHorizontalAlignment(SwingConstants.RIGHT);
        tampilanUtama.setBackground(warnaTampilan);
        tampilanUtama.setOpaque(true);
        tampilanUtama.setBorder(new CompoundBorder(
            new LineBorder(new Color(60, 60, 80), 3, true),
            new EmptyBorder(15, 20, 15, 20)
        ));
        tampilanUtama.setPreferredSize(new Dimension(350, 80));
        
        panelTampilan.add(labelOperator, BorderLayout.NORTH);
        panelTampilan.add(tampilanUtama, BorderLayout.CENTER);
        
        // Panel tombol
        panelTombol = new JPanel(new GridLayout(5, 4, 12, 12));
        panelTombol.setOpaque(false);
        panelTombol.setPreferredSize(new Dimension(350, 350));
        
        String[] daftarTombol = {
            "C", "⌫", "÷", "×",
            "7", "8", "9", "-",
            "4", "5", "6", "+",
            "1", "2", "3", "=",
            "±", "0", ".", "√"
        };
        
        for (String teksTombol : daftarTombol) {
            JButton tombol = buatTombol(teksTombol);
            tombol.setPreferredSize(new Dimension(70, 70));
            panelTombol.add(tombol);
        }
        
        panelUtama.add(panelTampilan, BorderLayout.NORTH);
        panelUtama.add(panelTombol, BorderLayout.CENTER);
        
        add(panelUtama);
    }
    
    private JLabel buatLabelTertata(String teks, Color warna, int ukuranFont) {
        JLabel label = new JLabel(teks);
        label.setForeground(warna);
        label.setFont(new Font("Segoe UI", Font.BOLD, ukuranFont));
        return label;
    }
    
    private JButton buatTombol(String teksTombol) {
        JButton tombol = new JButton(teksTombol) {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D graphics2d = (Graphics2D) g;
                graphics2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                
                // Gradient background berdasarkan jenis tombol
                if (teksTombol.equals("=")) {
                    GradientPaint gradient = new GradientPaint(0, 0, warnaSamaDengan, 0, getHeight(), new Color(255, 80, 80));
                    graphics2d.setPaint(gradient);
                } else if ("÷×+-".contains(teksTombol)) {
                    GradientPaint gradient = new GradientPaint(0, 0, warnaOperator, 0, getHeight(), new Color(0, 130, 220));
                    graphics2d.setPaint(gradient);
                } else if ("C⌫±√".contains(teksTombol)) {
                    GradientPaint gradient = new GradientPaint(0, 0, new Color(70, 70, 100), 0, getHeight(), new Color(60, 60, 90));
                    graphics2d.setPaint(gradient);
                } else {
                    GradientPaint gradient = new GradientPaint(0, 0, warnaTombol, 0, getHeight(), new Color(45, 45, 65));
                    graphics2d.setPaint(gradient);
                }
                
                graphics2d.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
                
                super.paintComponent(g);
            }
        };
        
        tombol.setFont(new Font("Segoe UI", Font.BOLD, 22));
        tombol.setForeground(Color.WHITE);
        tombol.setBorder(new CompoundBorder(
            new LineBorder(new Color(80, 80, 100), 2),
            new EmptyBorder(12, 12, 12, 12)
        ));
        tombol.setContentAreaFilled(false);
        tombol.setFocusPainted(false);
        tombol.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        // Efek hover
        tombol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tombol.setBorder(new CompoundBorder(
                    new LineBorder(new Color(100, 100, 150), 3),
                    new EmptyBorder(12, 12, 12, 12)
                ));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tombol.setBorder(new CompoundBorder(
                    new LineBorder(new Color(80, 80, 100), 2),
                    new EmptyBorder(12, 12, 12, 12)
                ));
            }
        });
        
        tombol.addActionListener(this::tombolDitekan);
        return tombol;
    }
    
    private void tombolDitekan(ActionEvent e) {
        String perintah = ((JButton) e.getSource()).getText();
        
        if ("0123456789".contains(perintah)) {
            masukkanAngka(perintah);
        } else if (perintah.equals(".")) {
            masukkanTitikDesimal();
        } else if (perintah.equals("C")) {
            hapusSemua();
        } else if (perintah.equals("⌫")) {
            hapusSatu();
        } else if (perintah.equals("±")) {
            ubahTanda();
        } else if (perintah.equals("√")) {
            akarKuadrat();
        } else if (perintah.equals("=")) {
            hitung();
        } else {
            aturOperator(perintah);
        }
    }
    
    private void masukkanAngka(String angka) {
        if (inputBerikutnya || tampilanUtama.getText().equals("0")) {
            tampilanUtama.setText(angka);
            inputBerikutnya = false;
        } else {
            tampilanUtama.setText(tampilanUtama.getText() + angka);
        }
    }
    
    private void masukkanTitikDesimal() {
        if (inputBerikutnya) {
            tampilanUtama.setText("0.");
            inputBerikutnya = false;
        } else if (!tampilanUtama.getText().contains(".")) {
            tampilanUtama.setText(tampilanUtama.getText() + ".");
        }
    }
    
    private void hapusSemua() {
        tampilanUtama.setText("0");
        labelOperator.setText(" ");
        operatorSaatIni = "";
        nilaiPertama = 0;
        inputBerikutnya = true;
    }
    
    private void hapusSatu() {
        String teksSaatIni = tampilanUtama.getText();
        if (teksSaatIni.length() > 1 && !inputBerikutnya) {
            tampilanUtama.setText(teksSaatIni.substring(0, teksSaatIni.length() - 1));
        } else {
            tampilanUtama.setText("0");
            inputBerikutnya = true;
        }
    }
    
    private void ubahTanda() {
        double nilaiSaatIni = Double.parseDouble(tampilanUtama.getText());
        tampilanUtama.setText(formatNilai(-nilaiSaatIni));
        inputBerikutnya = true;
    }
    
    private void akarKuadrat() {
        double nilaiSaatIni = Double.parseDouble(tampilanUtama.getText());
        if (nilaiSaatIni >= 0) {
            tampilanUtama.setText(formatNilai(Math.sqrt(nilaiSaatIni)));
        } else {
            tampilanUtama.setText("Error");
        }
        inputBerikutnya = true;
    }
    
    private void aturOperator(String operatorBaru) {
        if (!operatorSaatIni.isEmpty()) {
            hitung();
        }
        nilaiPertama = Double.parseDouble(tampilanUtama.getText());
        operatorSaatIni = operatorBaru.equals("÷") ? "/" : operatorBaru.equals("×") ? "*" : operatorBaru;
        labelOperator.setText(formatNilai(nilaiPertama) + " " + operatorBaru);
        inputBerikutnya = true;
    }
    
    private void hitung() {
        if (operatorSaatIni.isEmpty()) return;
        
        double nilaiKedua = Double.parseDouble(tampilanUtama.getText());
        double hasil = 0;
        
        try {
            switch (operatorSaatIni) {
                case "+": hasil = nilaiPertama + nilaiKedua; break;
                case "-": hasil = nilaiPertama - nilaiKedua; break;
                case "*": hasil = nilaiPertama * nilaiKedua; break;
                case "/": 
                    if (nilaiKedua == 0) throw new ArithmeticException();
                    hasil = nilaiPertama / nilaiKedua; 
                    break;
            }
            tampilanUtama.setText(formatNilai(hasil));
            labelOperator.setText(" ");
            operatorSaatIni = "";
            inputBerikutnya = true;
        } catch (ArithmeticException ex) {
            tampilanUtama.setText("Error");
            labelOperator.setText(" ");
            operatorSaatIni = "";
            inputBerikutnya = true;
        }
    }
    
    private String formatNilai(double nilai) {
        if (nilai == (long) nilai) {
            return String.format("%d", (long) nilai);
        } else {
            return String.format("%s", nilai).replaceAll("\\.?0+$", "");
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Kalkulator kalkulator = new Kalkulator();
            kalkulator.setVisible(true);
        });
    }
}