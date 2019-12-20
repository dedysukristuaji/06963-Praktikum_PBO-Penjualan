package eslilin;
import javax.swing.*;
import hargaeslilin.hargaeslilin;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class menueslilin extends JFrame{
    
    String nama;
    JFrame gui = new JFrame();
    JLabel label = new JLabel("*************** ES LILIN DEJI *************** ");
    JLabel label1 = new JLabel( " 1. Jambu Biji " );
    JLabel label2 = new JLabel( " 2. Alpukat " );
    JLabel label3 = new JLabel( " 3. Mangga " );
    JLabel label4 = new JLabel( " 4. Buah Naga " );
    JLabel label5 = new JLabel( " 5. Susu Vanila " );
    JLabel label6 = new JLabel( " 6. Susu Coklat " );
    JLabel label7 = new JLabel( " 7. Jeruk ");
    
    JLabel label8 = new JLabel( " RP. 2.000,00 X " );
    JLabel label9 = new JLabel( " RP. 2.000,00 X " );
    JLabel label10 = new JLabel( " RP. 2.000,00 X " );
    JLabel label11 = new JLabel( " RP. 2.000,00 X " );
    JLabel label12 = new JLabel( " RP. 2.000,00 X " );
    JLabel label13 = new JLabel( " RP. 2.000,00 X " );
    JLabel label14 = new JLabel( " RP. 2.000,00 X " );
    
    JTextField text1 = new JTextField();
    JTextField text2 = new JTextField();
    JTextField text3 = new JTextField();
    JTextField text4 = new JTextField();
    JTextField text5 = new JTextField();
    JTextField text6 = new JTextField();
    JTextField text7 = new JTextField();
    
    JCheckBox check1 = new JCheckBox();
    JCheckBox check2 = new JCheckBox();
    JCheckBox check3 = new JCheckBox();
    JCheckBox check4 = new JCheckBox();
    JCheckBox check5 = new JCheckBox();
    JCheckBox check6 = new JCheckBox();
    JCheckBox check7 = new JCheckBox();
    
    JButton button1 = new JButton(" Beli ");
    JButton button2 = new JButton(" Hapus ");
    JButton button3 = new JButton(" Lihat Input ");
    JButton button4 = new JButton(" Cetak ");
    JButton button5 = new JButton(" Bahan-Bahan ");
    JButton button6 = new JButton(" Tahap Pembuatan ");
    

    hargaeslilin menu = new hargaeslilin();
    
    public menueslilin(){       
        gui.setTitle(" ************ ES LILIN DEJI ************ ");
        gui.setSize(700, 500);
        gui.setLayout(null);
        gui.setVisible(true);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setLayout(null);
        
        gui.add(label);
        gui.add(label1);
        gui.add(label2);
        gui.add(label3);
        gui.add(label4);
        gui.add(label5);
        gui.add(label6);
        gui.add(label7);
        gui.add(label8);
        gui.add(label9);
        gui.add(label10);
        gui.add(label11);
        gui.add(label12);
        gui.add(label13);
        gui.add(label14);
        
        gui.add(text1);
        gui.add(text2);
        gui.add(text3);
        gui.add(text4);
        gui.add(text5);
        gui.add(text6);
        gui.add(text7);
        
        gui.add(check1);
        gui.add(check2);
        gui.add(check3);
        gui.add(check4);
        gui.add(check5);
        gui.add(check6);
        gui.add(check7);
        
        gui.add(button1);
        gui.add(button2);
        gui.add(button3);
        gui.add(button4);
        gui.add(button5);

        label.setBounds(150, 20, 300, 50);
        label1.setBounds(20, 100, 100, 50);
        label2.setBounds(20, 140, 100, 50);
        label3.setBounds(20, 180, 100, 50);
        label4.setBounds(20, 220, 100, 50);
        label5.setBounds(20, 260, 100, 50);
        label6.setBounds(20, 300, 100, 50);
        label7.setBounds(20, 340, 100, 50);
        label8.setBounds(150, 100, 150,50);
        label9.setBounds(150, 140, 150, 50);
        label10.setBounds(150, 180, 150, 50);
        label11.setBounds(150, 220, 150, 50);
        label12.setBounds(150, 260, 150, 50);
        label13.setBounds(150, 300, 150, 50);
        label14.setBounds(150, 340, 150, 50);
        
        text1.setBounds(270, 120, 35, 20);
        text2.setBounds(270, 160, 35, 20);
        text3.setBounds(270, 200, 35, 20);
        text4.setBounds(270, 240, 35, 20);
        text5.setBounds(270, 280, 35, 20);
        text6.setBounds(270, 320, 35, 20);
        text7.setBounds(270, 360, 35, 20);
        
        check1.setBounds(320, 120, 20, 20);
        check2.setBounds(320, 160, 20, 20);
        check3.setBounds(320, 200, 20, 20);
        check4.setBounds(320, 240, 20, 20);
        check5.setBounds(320, 280, 20, 20);
        check6.setBounds(320, 320, 20, 20);
        check7.setBounds(320, 360, 20, 20);
        
        text1.setEditable(false);
        text2.setEditable(false);
        text3.setEditable(false);
        text4.setEditable(false);
        text5.setEditable(false);
        text6.setEditable(false);
        text7.setEditable(false);
        
        button1.setBounds(425, 100, 100, 30);
        button2.setBounds(425, 150, 100, 30);
        button3.setBounds(425, 200, 100, 30);
        button4.setBounds(425, 250, 100, 30);
        button5.setBounds(425, 300, 230, 30);
        
        check1.setText("Jambu Biji Rp. 2.000,00");
        check1.addActionListener(new java.awt.event.ActionListener() {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
        check1ActionPerformed(evt);
        }
        });
        
        check2.setText("");
        check2.addActionListener(new java.awt.event.ActionListener() {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
        check2ActionPerformed(evt);
        }
        });
        
        check3.setText("");
        check3.addActionListener(new java.awt.event.ActionListener() {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
        check3ActionPerformed(evt);
        }
        });
        
         check4.setText("");
        check4.addActionListener(new java.awt.event.ActionListener() {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
        check4ActionPerformed(evt);
        }
        });
        
         check5.setText("");
        check5.addActionListener(new java.awt.event.ActionListener() {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
        check5ActionPerformed(evt);
        }
        });
        
         check6.setText("");
        check6.addActionListener(new java.awt.event.ActionListener() {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
        check6ActionPerformed(evt);
        }
        });
        
         check7.setText("");
        check7.addActionListener(new java.awt.event.ActionListener() {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
        check7ActionPerformed(evt);
        }
        });
        
        button1.setText("Beli");
        button1.addActionListener(new java.awt.event.ActionListener() {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
        button1ActionPerformed(evt);
        }
        });
        
        button2.setText("Hapus");
        button2.addActionListener(new java.awt.event.ActionListener() {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
        button2ActionPerformed(evt);
        }
        });
        
        button3.setText("Lihat Input");
        button3.addActionListener(new java.awt.event.ActionListener() {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
        button3ActionPerformed(evt);
        }
        });
        
        button4.setText("Cetak");
        button4.addActionListener(new java.awt.event.ActionListener() {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
        button4ActionPerformed(evt);
        }
        });
        
        button5.setText("Bahan-Bahan & Tahap Pembuatan");
        button5.addActionListener(new java.awt.event.ActionListener() {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
        button5ActionPerformed(evt);
        }
        });
    }
    
    public void check1ActionPerformed(java.awt.event.ActionEvent evt){
        if (check1.isSelected() == true){
            text1.setEditable(true);
        }
        else {
            text1.setEditable(false);
            text1.setText("");
        }
    }
    
     public void check2ActionPerformed(java.awt.event.ActionEvent evt){
        if (check2.isSelected() == true){
            text2.setEditable(true);
        }
        else {
            text2.setEditable(false);
            text2.setText("");
        }
    }
     
     public void check3ActionPerformed(java.awt.event.ActionEvent evt){
        if (check3.isSelected() == true){
            text3.setEditable(true);
        }
        else {
            text3.setEditable(false);
            text3.setText(" ");
        }
    }
     
      public void check4ActionPerformed(java.awt.event.ActionEvent evt){
        if (check4.isSelected() == true){
            text4.setEditable(true);
        }
        else {
            text4.setEditable(false);
            text4.setText("");
        }
    }
      
       public void check5ActionPerformed(java.awt.event.ActionEvent evt){
        if (check5.isSelected() == true){
            text5.setEditable(true);
        }
        else {
            text5.setEditable(false);
            text5.setText("");
        }
    }
       
        public void check6ActionPerformed(java.awt.event.ActionEvent evt){
        if (check6.isSelected() == true){
            text6.setEditable(true);
        }
        else {
            text6.setEditable(false);
            text6.setText("");
        }
    }
        
         public void check7ActionPerformed(java.awt.event.ActionEvent evt){
        if (check7.isSelected() == true){
            text7.setEditable(true);
        }
        else {
            text7.setEditable(false);
            text7.setText("");
        }
    }
         
          public void button1ActionPerformed(java.awt.event.ActionEvent evt){
            nama = JOptionPane.showInputDialog("Nama Anda?");
            if(nama == null){
                System.out.println("CANCEL");
            }
            
      
    }
          
           public void button3ActionPerformed(java.awt.event.ActionEvent evt){
            int Tot = 0;  
            String beli="";
            
            try{
             if (check1.isSelected()){
            beli = beli + Integer.parseInt(text1.getText())+" Es Lilin Rasa Jambu Biji Seharga " + menu.getJambuBiji() + "\n" ;
            if(!text1.getText().equalsIgnoreCase("")){
            Tot+=Integer.parseInt(text1.getText())* menu.getJambuBiji();
            }else
            JOptionPane.showMessageDialog(null,"Maaf Belum anda Terisi","Error", JOptionPane.ERROR_MESSAGE);
            }
            
            if (check2.isSelected()){
            beli = beli + Integer.parseInt(text2.getText())+" Es Lilin Rasa Alpukat Seharga " + menu.getAlpukat() +"\n" ;
            if(!text2.getText().equalsIgnoreCase("")){
            Tot+=Integer.parseInt(text2.getText())* menu.getAlpukat();
            }else
            JOptionPane.showMessageDialog(null,"Maaf Belum anda Terisi","Error", JOptionPane.ERROR_MESSAGE);
            }
            
            if (check3.isSelected()){
            beli = beli + Integer.parseInt(text3.getText())+" Es Lilin Rasa Mangga Seharga " +  menu.getMangga() + "\n" ;
            if(!text3.getText().equalsIgnoreCase("")){
            Tot+=Integer.parseInt(text3.getText())* menu.getMangga();
            }else
            JOptionPane.showMessageDialog(null,"Maaf Belum anda Terisi","Error", JOptionPane.ERROR_MESSAGE);
            }
            
            if (check4.isSelected()){
            beli = beli + Integer.parseInt(text4.getText())+" Es Lilin Rasa Buah Naga Seharga " +  menu.getBuahNaga() + "\n" ;    
            if(!text4.getText().equalsIgnoreCase("")){
            Tot+=Integer.parseInt(text4.getText())* menu.getBuahNaga();
            }else
            JOptionPane.showMessageDialog(null,"Maaf Belum anda Terisi","Error", JOptionPane.ERROR_MESSAGE);
            }
            
            if (check5.isSelected()){
            beli = beli + Integer.parseInt(text5.getText())+" Es Lilin Rasa Susu Vanila Seharga " +  menu.getSusuVanila() + "\n" ;    
            if(!text5.getText().equalsIgnoreCase("")){
            Tot+=Integer.parseInt(text5.getText())* menu.getSusuVanila();
            }else
            JOptionPane.showMessageDialog(null,"Maaf Belum anda Terisi","Error", JOptionPane.ERROR_MESSAGE);
            }
            
            if (check6.isSelected()){
            beli = beli + Integer.parseInt(text6.getText())+" Es Lilin Rasa Susu Coklat Seharga " +  menu.getSusuCoklat() + "\n" ;
            if(!text6.getText().equalsIgnoreCase("")){
            Tot+=Integer.parseInt(text6.getText())* menu.getSusuCoklat();
            }else
            JOptionPane.showMessageDialog(null,"Maaf Belum anda Terisi","Error", JOptionPane.ERROR_MESSAGE);
            }
            
            if (check7.isSelected()){
            beli = beli + Integer.parseInt(text7.getText())+" Es Lilin Rasa Jeruk Seharga " +  menu.getJeruk() ;    
            if(!text7.getText().equalsIgnoreCase("")){
            Tot+=Integer.parseInt(text7.getText())* menu.getJeruk();
            }else
            JOptionPane.showMessageDialog(null,"Maaf Belum anda Terisi","Error", JOptionPane.ERROR_MESSAGE);
            }
                JOptionPane.showMessageDialog(null,"Pembelian Anda Berhasil" + "\n" + beli + "\n" +
                   "Total Bayar adalah" + " " + "RP" + " " + Tot + "\n" +
                    "Terima Kasih Atas Pembeliannya" + "\n" + "sdr" + " " + (nama));
            }catch (Exception t){
                JOptionPane.showMessageDialog(null, "Eror...");}
            }
            
          
          public void button2ActionPerformed(java.awt.event.ActionEvent evt){
              text1.setText("");
              text2.setText("");
              text3.setText("");
              text4.setText("");
              text5.setText("");
              text6.setText("");
              text7.setText("");
              check1.setSelected(false);
              check2.setSelected(false);
              check3.setSelected(false);
              check4.setSelected(false);
              check5.setSelected(false);
              check6.setSelected(false);
              check7.setSelected(false);
              text1.setEditable(false);
              text2.setEditable(false);
              text3.setEditable(false);
              text4.setEditable(false);
              text5.setEditable(false);
              text6.setEditable(false);
              text7.setEditable(false);
          }
          
          public void button4ActionPerformed(java.awt.event.ActionEvent evt){
            int Tot = 0;
            String beli="";
            
           try{
            if (check1.isSelected()){
            beli = beli + Integer.parseInt(text1.getText())+" Es Lilin Rasa Jambu Biji Dengan Harga " + menu.getJambuBiji() + "\n" ;
            if(!text1.getText().equalsIgnoreCase("")){
            Tot+=Integer.parseInt(text1.getText())* menu.getJambuBiji();
            }else{
            JOptionPane.showMessageDialog(null,"Maaf Belum anda isi","Error", JOptionPane.ERROR_MESSAGE);
            }
            }
//            else{
//                throw new IllegalArgumentException("erorr...");
//            }
//           }catch(IllegalArgumentException ex){
//               System.err.println(ex);
//           }
            if (check2.isSelected()){
            beli = beli + Integer.parseInt(text2.getText())+" Es Lilin Rasa Alpukat Dengan Harga " +  menu.getAlpukat() +"\n" ;
            if(!text2.getText().equalsIgnoreCase("")){
            Tot+=Integer.parseInt(text2.getText())* menu.getAlpukat();
            }else
            JOptionPane.showMessageDialog(null,"Maaf Belum anda isi","Error", JOptionPane.ERROR_MESSAGE);
            }
            
            if (check3.isSelected()){
            beli = beli + Integer.parseInt(text3.getText())+" Es Lilin Rasa Mangga Dengan Harga " +  menu.getMangga() + "\n" ;
            if(!text3.getText().equalsIgnoreCase("")){
            Tot+=Integer.parseInt(text3.getText())* menu.getMangga();
            }else
            JOptionPane.showMessageDialog(null,"Maaf Belum anda Terisi","Error", JOptionPane.ERROR_MESSAGE);
            }
            
            if (check4.isSelected()){
            beli = beli + Integer.parseInt(text4.getText())+" Es Lilin Rasa Buah Naga Dengan Harga " +  menu.getBuahNaga() + "\n" ;    
            if(!text4.getText().equalsIgnoreCase("")){
            Tot+=Integer.parseInt(text4.getText())* menu.getBuahNaga();
            }else
            JOptionPane.showMessageDialog(null,"Maaf Belum anda Terisi","Error", JOptionPane.ERROR_MESSAGE);
            }
            
            if (check5.isSelected()){
            beli = beli + Integer.parseInt(text5.getText())+" Es Lilin Rasa Susu Vanila Dengan Harga " +  menu.getSusuVanila() + "\n" ;    
            if(!text5.getText().equalsIgnoreCase("")){
            Tot+=Integer.parseInt(text5.getText())* menu.getSusuVanila();
            }else
            JOptionPane.showMessageDialog(null,"Maaf Belum anda Terisi","Error", JOptionPane.ERROR_MESSAGE);
            }
            
            if (check6.isSelected()){
            beli = beli + Integer.parseInt(text6.getText())+" Es Lilin Rasa Susu Coklat Dengan Harga " +  menu.getSusuCoklat() + "\n" ;
            if(!text6.getText().equalsIgnoreCase("")){
            Tot+=Integer.parseInt(text6.getText())* menu.getSusuCoklat();
            }else
            JOptionPane.showMessageDialog(null,"Maaf Belum anda Terisi","Error", JOptionPane.ERROR_MESSAGE);
            }
            
            if (check7.isSelected()){
            beli = beli + Integer.parseInt(text7.getText())+" Es Lilin Rasa Jeruk Dengan Harga " +  menu.getJeruk() ;    
            if(!text7.getText().equalsIgnoreCase("")){
            Tot+=Integer.parseInt(text7.getText())* menu.getJeruk();
            }else
            JOptionPane.showMessageDialog(null,"Maaf Belum anda Terisi","Error", JOptionPane.ERROR_MESSAGE);
            }
            
            Tanggalbeli tgl = new Tanggalbeli();
            
            JOptionPane.showMessageDialog(null," " + tgl.getTanggal() +" "+ tgl.getWaktu() + "\n" + beli + "\n" + "==============================" + "\n" +
                   "Total Bayar adalah" + " " + "RP" + " " + Tot + "\n" );
           }
           catch (Exception t){
               JOptionPane.showMessageDialog(null, "Eror..");
           }
}
           public void button5ActionPerformed(java.awt.event.ActionEvent evt){
               System.out.println(" Bahan-Bahan Membuat Es Lilin ");
               System.out.println(" 1. Jus favorit anda ");
               System.out.println(" 2. Susu vanila kaleng ");
               System.out.println(" 3. Gula ");
               System.out.println(" 4. Air ");
               System.out.println(" 5. Baskom ");
               System.out.println(" 6. Plastik berukuran kecil ");
               System.out.println(" 7. Corong ");
               System.out.println(" 8. Sendok ");
               System.out.println(" 9. Gelas ");
               System.out.println(" 10. Frezer ");
               System.out.println(" 11. Karet ");
               
               System.out.println(" Langkah-Langkah Pembuatan Es Lilin ");
               System.out.println(" 1. Siapkan jus beserta baskom terlebih dahulu ");
               System.out.println(" 2. Masukkan susu kaleng beserta gula secukupnya kedalam baskom ");
               System.out.println(" 3. Tuangkan air kedalam baskom secukupnya ");
               System.out.println(" 4. Aduk hingga merata ");
               System.out.println(" 5. Tuangkan jus kedalam baskom yang telah tercampur ");
               System.out.println(" 6. Aduk hingga merata ");
               System.out.println(" 7. Siapkan corong, gelas, beserta plastik berukuran kecil ");
               System.out.println(" 8. Ambil jus lalu tuang ke dalam plastik secukupnya ");
               System.out.println(" 9. Ikat dengan karet ");
               System.out.println(" 10. Masukkan ke dalam frezer, susun yang rata");
               System.out.println(" 11. Kita tunggu kurang lebih dari 12 jam hingga es lilin benar-benar membeku");
           }
           
        }