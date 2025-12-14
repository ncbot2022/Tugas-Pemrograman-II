# UTS SEMSETER 3 MATA KULIAH PEMROGARAM 2 (TEMA INVENTTARIS PRODUK GUDANG A DAN GUDANG B UNTUK UMKM)

<br>Project saya buat berdasarkan penugasan UTS, saya membuat project dengan tema iventaris gudang A dan gudang B. project ini  dibangun dengan menggunakan unsur pemrogaram OOP dan GUI java netbeans 8.2. struktur pemrogaram memiliki unsur :<br>

- **Containers**: tempat menampung komponen GUI  
  - `JFrame`, `JPanel`, `JDialog`  
- **Controls**: komponen interaksi pengguna  
  - `JButton`, `JLabel`, `JTextField`, `JCheckBox`  
- **Menus**: navigasi aplikasi  
  - `JMenuBar`, `JMenu`, `JMenuItem`  

**Contoh:**
```java
JFrame frame = new JFrame("GUI");
JPanel panel = new JPanel();
panel.add(new JButton("Klik"));
frame.add(panel);
frame.setSize(300,200);
frame.setVisible(true);
