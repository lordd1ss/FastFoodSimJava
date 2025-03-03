/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Fast_Food;

import java.awt.Component;
import static java.awt.PageAttributes.MediaType.C;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.io.FileNotFoundException;     
import java.lang.SecurityException;      

/**
 *
 * @author Dominic Doan
 */
public class FastFood extends javax.swing.JFrame { // Creds: Dominic Doan
    
    double Price_BottleofWater;
    double Price_CheeseSandwich;
    double Price_ChickenNuggets;
    double Price_ChickenSandwich;
    double Price_ChocolateMuffin;
    double Price_ChocolateShake;
    double Price_CocaCola;
    double Price_FishSandwich;
    double Price_FrenchFries;
    double Price_Hamburger;
    double Price_HashBrown;
    double Price_HotTea;
    double Price_OreoMcFlurry;
    double Price_OnionRings;
    double Price_OrangeJuice;
    double Price_PancakesSyrup;
    double Price_PineappleSticks;
    double Price_Salad;
    double Price_Sprite;
    double Price_StrawberryShake;
    double Price_ToastedBagels;
    double Price_VanillaShake;
    double Tax_Rate;
    
    double iTax, iTotal, iSubTotal, iChange, iCost;
    
    double[] itemcost = new double[22]; // Array to use for cost of items
    
    protected Employee[] emp = new Employee[5];
    
public void createFood(){
    
    // creds: Dominic Doan and Sean Ramia
    
    try (Scanner input = new Scanner(Paths.get("food.txt"))) {
            // read record from file
        while (input.hasNext()) { // while there is more to read
            // insert prices into each food item                  
           Price_BottleofWater = input.nextDouble();
           Price_CheeseSandwich = input.nextDouble();
           Price_ChickenNuggets = input.nextDouble();
           Price_ChickenSandwich = input.nextDouble();
           Price_ChocolateMuffin = input.nextDouble();
           Price_ChocolateShake = input.nextDouble();
           Price_CocaCola = input.nextDouble();
           Price_FishSandwich = input.nextDouble();
           Price_FrenchFries = input.nextDouble();
           Price_Hamburger = input.nextDouble();
           Price_HashBrown = input.nextDouble();
           Price_HotTea = input.nextDouble();
           Price_OreoMcFlurry = input.nextDouble();
           Price_OnionRings = input.nextDouble();
           Price_OrangeJuice = input.nextDouble();
           Price_PancakesSyrup = input.nextDouble();
           Price_PineappleSticks = input.nextDouble();
           Price_Salad = input.nextDouble();
           Price_Sprite = input.nextDouble();
           Price_StrawberryShake = input.nextDouble();
           Price_ToastedBagels = input.nextDouble();
           Price_VanillaShake = input.nextDouble();
           Tax_Rate = input.nextDouble();  
           
        }       
    } 
    catch (IOException | NoSuchElementException | 
            IllegalStateException e) {
            e.printStackTrace();
    } 
    
}   
   
    /**
     * Get and Set Methods for FastFood Class and create Employee class
     * Creds: Sean Ramia
     */
    
    public double getPrice_BottleofWater() {return Price_BottleofWater;}
    public double getPrice_CheeseSandwich() {return Price_CheeseSandwich;}
    public double getPrice_ChickenNuggets() {return Price_ChickenNuggets;}
    public double getPrice_ChickenSandwich() {return Price_ChickenSandwich;}
    public double getPrice_ChocolateMuffin() {return Price_ChocolateMuffin;}
    public double getPrice_ChocolateShake() {return Price_ChocolateShake;}
    public double getPrice_CocaCola() {return Price_CocaCola;}
    public double getPrice_FishSandwich() {return Price_FishSandwich;}
    public double getPrice_FrenchFries() {return Price_FrenchFries;}
    public double getPrice_Hamburger() {return Price_Hamburger;}
    public double getPrice_HashBrown() {return Price_HashBrown;}
    public double getPrice_HotTea() {return Price_HotTea;}
    public double getPrice_OreoMcFlurry() {return Price_OreoMcFlurry;}
    public double getPrice_OnionRings() {return Price_OnionRings;}
    public double getPrice_OrangeJuice() {return Price_OrangeJuice;}
    public double getPrice_PancakesSyrup() {return Price_PancakesSyrup;}
    public double getPrice_PineappleSticks() {return Price_PineappleSticks;}
    public double getPrice_Salad() {return Price_Salad;}
    public double getPrice_Sprite() {return Price_Sprite;}
    public double getPrice_StrawberryShake() {return Price_StrawberryShake;}
    public double getPrice_ToastedBagels() {return Price_ToastedBagels;}
    public double getPrice_VanillaShake() {return Price_VanillaShake;}
    public double getTax_Rate() {return Tax_Rate;}
    
    public void setPrice_BottleofWater(double c) {this.Price_BottleofWater = c;}
    public void setPrice_CheeseSandwich(double c) {this.Price_CheeseSandwich = c;}
    public void setPrice_ChickenNuggets(double c) {this.Price_ChickenNuggets = c;}
    public void setPrice_ChickenSandwich(double c) {this.Price_ChickenSandwich = c;}
    public void setPrice_ChocolateMuffin(double c) {this.Price_ChocolateMuffin = c;}
    public void setPrice_ChocolateShake(double c) {this.Price_ChocolateShake = c;}
    public void setPrice_CocaCola(double c) {this.Price_CocaCola = c;}
    public void setPrice_FishSandwich(double c) {this.Price_FishSandwich = c;}
    public void setPrice_FrenchFries(double c) {this.Price_FrenchFries = c;}
    public void setPrice_Hamburger(double c) {this.Price_Hamburger = c;}
    public void setPrice_HashBrown(double c) {this.Price_HashBrown = c;}
    public void setPrice_HotTea(double c) {this.Price_HotTea = c;}
    public void setPrice_OreoMcFlurry(double c) {this.Price_OreoMcFlurry = c;}
    public void setPrice_OnionRings(double c) {this.Price_OnionRings = c;}
    public void setPrice_OrangeJuice(double c) {this.Price_OrangeJuice = c;}
    public void setPrice_PancakesSyrup(double c) {this.Price_PancakesSyrup = c;}
    public void setPrice_PineappleSticks(double c) {this.Price_PineappleSticks = c;}
    public void setPrice_Salad(double c) {this.Price_Salad = c;}
    public void setPrice_Sprite(double c) {this.Price_Sprite = c;}
    public void setPrice_StrawberryShake(double c) {this.Price_StrawberryShake = c;}
    public void setPrice_ToastedBagels(double c) {this.Price_ToastedBagels = c;}
    public void setPrice_VanillaShake(double c) {this.Price_VanillaShake = c;}
    public void setTax_Rate(double t) {this.Tax_Rate = t;}
    
    /**
     * Creates new form FastFood
     */
    public FastFood() { // Creds: Dominic Doan
        initComponents();
        resetAllFields();
        createEmployees();
        createFood();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jpnlMCJ_CompanyName = new javax.swing.JPanel();
        SloganMCJ = new javax.swing.JLabel();
        TitleMCJ = new javax.swing.JLabel();
        LogoMCJ = new javax.swing.JLabel();
        jpnlUserMenu1 = new javax.swing.JPanel();
        jChkHBurgers = new javax.swing.JCheckBox();
        jChkOnionRings = new javax.swing.JCheckBox();
        jChkFrenchFries = new javax.swing.JCheckBox();
        jChkChickenNuggets = new javax.swing.JCheckBox();
        jChkSalad = new javax.swing.JCheckBox();
        jChkCheeseSandwich = new javax.swing.JCheckBox();
        jChkFishSandwich = new javax.swing.JCheckBox();
        jChkChickenSandwich = new javax.swing.JCheckBox();
        jtxtSalad = new javax.swing.JTextField();
        jtxtHBurgers = new javax.swing.JTextField();
        jtxtFrenchFries = new javax.swing.JTextField();
        jtxtChickenNuggets = new javax.swing.JTextField();
        jtxtOnionRings = new javax.swing.JTextField();
        jtxtCheeseSandwich = new javax.swing.JTextField();
        jtxtFishSandwich = new javax.swing.JTextField();
        jtxtChickenSandwich = new javax.swing.JTextField();
        jlblFMV = new javax.swing.JLabel();
        jlblSandwiches = new javax.swing.JLabel();
        jlblDesserts = new javax.swing.JLabel();
        jChkHashBrown = new javax.swing.JCheckBox();
        jtxtHashBrown = new javax.swing.JTextField();
        jChkToastedBagels = new javax.swing.JCheckBox();
        jChkPineappleSticks = new javax.swing.JCheckBox();
        jChkChocolateMuffin = new javax.swing.JCheckBox();
        jChkPancakesSyrup = new javax.swing.JCheckBox();
        jtxtToastedBagels = new javax.swing.JTextField();
        jtxtPineappleSticks = new javax.swing.JTextField();
        jtxtChocolateMuffin = new javax.swing.JTextField();
        jtxtPancakesSyrup = new javax.swing.JTextField();
        jpnlUserMenu2 = new javax.swing.JPanel();
        jChkHotTea = new javax.swing.JCheckBox();
        jChkCocaCola = new javax.swing.JCheckBox();
        jChkOrangeJuice = new javax.swing.JCheckBox();
        jChkSprite = new javax.swing.JCheckBox();
        jChkBottleofWater = new javax.swing.JCheckBox();
        jChkOreoMcFlurry = new javax.swing.JCheckBox();
        jChkChocolateShake = new javax.swing.JCheckBox();
        jChkStrawberryShake = new javax.swing.JCheckBox();
        jChkVanillaShake = new javax.swing.JCheckBox();
        jlblBevs = new javax.swing.JLabel();
        jlblShakes = new javax.swing.JLabel();
        jtxtSprite = new javax.swing.JTextField();
        jtxtHotTea = new javax.swing.JTextField();
        jtxtCocaCola = new javax.swing.JTextField();
        jtxtOrangeJuice = new javax.swing.JTextField();
        jtxtBottleofWater = new javax.swing.JTextField();
        jtxtVanillaShake = new javax.swing.JTextField();
        jtxtStrawberryShake = new javax.swing.JTextField();
        jtxtChocolateShake = new javax.swing.JTextField();
        jtxtOreoMcFlurry = new javax.swing.JTextField();
        jpnlPaymentMethod = new javax.swing.JPanel();
        jcmbPaymentMethod = new javax.swing.JComboBox<>();
        jlblPaymentMethod = new javax.swing.JLabel();
        jtxtPaymentMethod = new javax.swing.JTextField();
        jlblAmountEntered = new javax.swing.JLabel();
        jlblCashOnly = new javax.swing.JLabel();
        jpnlSelections = new javax.swing.JPanel();
        jbtnExit = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();
        jbtnPlaceOrder = new javax.swing.JButton();
        jpnlMainMenu = new javax.swing.JPanel();
        jlblFMV_Menu = new javax.swing.JLabel();
        jlblHBurgers_Display = new javax.swing.JLabel();
        jlblFrenchFries_Display = new javax.swing.JLabel();
        jlblOnionRings_Display = new javax.swing.JLabel();
        jlblSalad_Display = new javax.swing.JLabel();
        jlblChickenNuggets_Display = new javax.swing.JLabel();
        jlblSandwiches_Menu = new javax.swing.JLabel();
        jlblFishSandwich_Display = new javax.swing.JLabel();
        jlblCheeseSandwich_Display = new javax.swing.JLabel();
        jlblChickenSandwich_Display = new javax.swing.JLabel();
        jlblDesserts_Menu = new javax.swing.JLabel();
        jlblPancakes_Display = new javax.swing.JLabel();
        jlblChocolateMuffin_Display = new javax.swing.JLabel();
        jlblPASticks_Display = new javax.swing.JLabel();
        jlblToastedBagels_Display = new javax.swing.JLabel();
        jlblHashBrown_Display = new javax.swing.JLabel();
        jlblPancakes_Cost = new javax.swing.JLabel();
        jlblHashBrown_Cost = new javax.swing.JLabel();
        jlblToastedBagels_Cost = new javax.swing.JLabel();
        jlblPASticks_Cost = new javax.swing.JLabel();
        jlblChocolateMuffin_Cost = new javax.swing.JLabel();
        jlblChickenSandwich_Cost = new javax.swing.JLabel();
        jlblFishSandwich_Cost = new javax.swing.JLabel();
        jlblCheeseSandwich_Cost = new javax.swing.JLabel();
        jlblSalad_Cost = new javax.swing.JLabel();
        jlblOnionRings_Cost = new javax.swing.JLabel();
        jlblChickenNuggets_Cost = new javax.swing.JLabel();
        jlblFrenchFries_Cost = new javax.swing.JLabel();
        jlblHBurgers_Cost = new javax.swing.JLabel();
        jlblBevs_Menu = new javax.swing.JLabel();
        jlblHotTea_Display = new javax.swing.JLabel();
        jlblCocaCola_Display = new javax.swing.JLabel();
        jlblBottleOfWater_Display = new javax.swing.JLabel();
        jlblOJ_Display = new javax.swing.JLabel();
        jlblSprite_Display = new javax.swing.JLabel();
        jlblShakes_Menu = new javax.swing.JLabel();
        jlblMcFlurry_Display = new javax.swing.JLabel();
        jlblChocolateShake_Display = new javax.swing.JLabel();
        jlblStrawberryShake_Display = new javax.swing.JLabel();
        jlblSVanillaShake_Display = new javax.swing.JLabel();
        jlblMcFlurry_Cost = new javax.swing.JLabel();
        jlblStrawberryShake_Cost = new javax.swing.JLabel();
        jlblChocolateShake_Cost = new javax.swing.JLabel();
        jlblBottleOfWater_Cost = new javax.swing.JLabel();
        jlblVanillaShake_Cost = new javax.swing.JLabel();
        jlblHotTea_Cost = new javax.swing.JLabel();
        jlblCocaCola_Cost = new javax.swing.JLabel();
        jlblSprite_Cost = new javax.swing.JLabel();
        jlblOJ_Cost = new javax.swing.JLabel();
        jlblOreoMCF_Image = new javax.swing.JLabel();
        jlblOreoMCF_Number = new javax.swing.JLabel();
        jlblChickSandwich_Image = new javax.swing.JLabel();
        jlblChickSandwich_Number = new javax.swing.JLabel();
        jlblPAStick_Image = new javax.swing.JLabel();
        jlblPAStick_Number = new javax.swing.JLabel();
        jlblNuggs_Image = new javax.swing.JLabel();
        jlblNuggs_Number = new javax.swing.JLabel();
        jlblSprite_Image = new javax.swing.JLabel();
        jlblSprite_Number = new javax.swing.JLabel();
        jlblVS_Image = new javax.swing.JLabel();
        jlblVS_Number = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(240, 240, 240));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpnlMCJ_CompanyName.setBackground(new java.awt.Color(255, 0, 51));
        jpnlMCJ_CompanyName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 4));

        SloganMCJ.setBackground(new java.awt.Color(153, 153, 153));
        SloganMCJ.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SloganMCJ.setForeground(new java.awt.Color(255, 255, 255));
        SloganMCJ.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        SloganMCJ.setText("\"Have You Done Your Code Today?\"");

        TitleMCJ.setBackground(new java.awt.Color(153, 153, 153));
        TitleMCJ.setFont(new java.awt.Font("Tahoma", 1, 52)); // NOI18N
        TitleMCJ.setForeground(new java.awt.Color(255, 255, 255));
        TitleMCJ.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TitleMCJ.setText("Mc Java's");

        LogoMCJ.setIcon(new javax.swing.ImageIcon("/Fast_Food/20240403_162534 (2).jpg"));

        javax.swing.GroupLayout jpnlMCJ_CompanyNameLayout = new javax.swing.GroupLayout(jpnlMCJ_CompanyName);
        jpnlMCJ_CompanyName.setLayout(jpnlMCJ_CompanyNameLayout);
        jpnlMCJ_CompanyNameLayout.setHorizontalGroup(
            jpnlMCJ_CompanyNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlMCJ_CompanyNameLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogoMCJ, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnlMCJ_CompanyNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TitleMCJ)
                    .addComponent(SloganMCJ, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jpnlMCJ_CompanyNameLayout.setVerticalGroup(
            jpnlMCJ_CompanyNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlMCJ_CompanyNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitleMCJ, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SloganMCJ)
                .addContainerGap())
            .addGroup(jpnlMCJ_CompanyNameLayout.createSequentialGroup()
                .addComponent(LogoMCJ, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jpnlMCJ_CompanyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 510, 100));

        jpnlUserMenu1.setBackground(new java.awt.Color(204, 0, 51));
        jpnlUserMenu1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 4));

        jChkHBurgers.setBackground(new java.awt.Color(204, 0, 51));
        jChkHBurgers.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jChkHBurgers.setForeground(new java.awt.Color(255, 255, 255));
        jChkHBurgers.setText("Hamburgers");
        jChkHBurgers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChkHBurgersActionPerformed(evt);
            }
        });

        jChkOnionRings.setBackground(new java.awt.Color(204, 0, 51));
        jChkOnionRings.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jChkOnionRings.setForeground(new java.awt.Color(255, 255, 255));
        jChkOnionRings.setText("Onion Rings");
        jChkOnionRings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChkOnionRingsActionPerformed(evt);
            }
        });

        jChkFrenchFries.setBackground(new java.awt.Color(204, 0, 51));
        jChkFrenchFries.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jChkFrenchFries.setForeground(new java.awt.Color(255, 255, 255));
        jChkFrenchFries.setText("French Fries");
        jChkFrenchFries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChkFrenchFriesActionPerformed(evt);
            }
        });

        jChkChickenNuggets.setBackground(new java.awt.Color(204, 0, 51));
        jChkChickenNuggets.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jChkChickenNuggets.setForeground(new java.awt.Color(255, 255, 255));
        jChkChickenNuggets.setText("Chicken Nuggets");
        jChkChickenNuggets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChkChickenNuggetsActionPerformed(evt);
            }
        });

        jChkSalad.setBackground(new java.awt.Color(204, 0, 51));
        jChkSalad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jChkSalad.setForeground(new java.awt.Color(255, 255, 255));
        jChkSalad.setText("Salad");
        jChkSalad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChkSaladActionPerformed(evt);
            }
        });

        jChkCheeseSandwich.setBackground(new java.awt.Color(204, 0, 51));
        jChkCheeseSandwich.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jChkCheeseSandwich.setForeground(new java.awt.Color(255, 255, 255));
        jChkCheeseSandwich.setText("Cheese Sandwich");
        jChkCheeseSandwich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChkCheeseSandwichActionPerformed(evt);
            }
        });

        jChkFishSandwich.setBackground(new java.awt.Color(204, 0, 51));
        jChkFishSandwich.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jChkFishSandwich.setForeground(new java.awt.Color(255, 255, 255));
        jChkFishSandwich.setText("Fish Sandwich");
        jChkFishSandwich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChkFishSandwichActionPerformed(evt);
            }
        });

        jChkChickenSandwich.setBackground(new java.awt.Color(204, 0, 51));
        jChkChickenSandwich.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jChkChickenSandwich.setForeground(new java.awt.Color(255, 255, 255));
        jChkChickenSandwich.setText("Chicken Sandwich");
        jChkChickenSandwich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChkChickenSandwichActionPerformed(evt);
            }
        });

        jtxtSalad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtxtSalad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtSalad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtSaladActionPerformed(evt);
            }
        });
        jtxtSalad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtSaladKeyTyped(evt);
            }
        });

        jtxtHBurgers.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtxtHBurgers.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtHBurgers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtHBurgersActionPerformed(evt);
            }
        });
        jtxtHBurgers.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtHBurgersKeyTyped(evt);
            }
        });

        jtxtFrenchFries.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtxtFrenchFries.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtFrenchFries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtFrenchFriesActionPerformed(evt);
            }
        });
        jtxtFrenchFries.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtFrenchFriesKeyTyped(evt);
            }
        });

        jtxtChickenNuggets.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtxtChickenNuggets.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtChickenNuggets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtChickenNuggetsActionPerformed(evt);
            }
        });
        jtxtChickenNuggets.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtChickenNuggetsKeyTyped(evt);
            }
        });

        jtxtOnionRings.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtxtOnionRings.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtOnionRings.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtOnionRingsKeyTyped(evt);
            }
        });

        jtxtCheeseSandwich.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtxtCheeseSandwich.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtCheeseSandwich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCheeseSandwichActionPerformed(evt);
            }
        });
        jtxtCheeseSandwich.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtCheeseSandwichKeyTyped(evt);
            }
        });

        jtxtFishSandwich.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtxtFishSandwich.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtFishSandwich.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtFishSandwichKeyTyped(evt);
            }
        });

        jtxtChickenSandwich.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtxtChickenSandwich.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtChickenSandwich.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtChickenSandwichKeyTyped(evt);
            }
        });

        jlblFMV.setBackground(new java.awt.Color(204, 0, 51));
        jlblFMV.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jlblFMV.setForeground(new java.awt.Color(255, 242, 0));
        jlblFMV.setText("FAST MEAL & VEGETARIAN");

        jlblSandwiches.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jlblSandwiches.setForeground(new java.awt.Color(255, 242, 0));
        jlblSandwiches.setText("SANDWICHES");

        jlblDesserts.setBackground(new java.awt.Color(204, 0, 51));
        jlblDesserts.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jlblDesserts.setForeground(new java.awt.Color(255, 242, 0));
        jlblDesserts.setText("DESSERTS");

        jChkHashBrown.setBackground(new java.awt.Color(204, 0, 51));
        jChkHashBrown.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jChkHashBrown.setForeground(new java.awt.Color(255, 255, 255));
        jChkHashBrown.setText("Hash Brown");
        jChkHashBrown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChkHashBrownActionPerformed(evt);
            }
        });

        jtxtHashBrown.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtxtHashBrown.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtHashBrown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtHashBrownActionPerformed(evt);
            }
        });
        jtxtHashBrown.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtHashBrownKeyTyped(evt);
            }
        });

        jChkToastedBagels.setBackground(new java.awt.Color(204, 0, 51));
        jChkToastedBagels.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jChkToastedBagels.setForeground(new java.awt.Color(255, 255, 255));
        jChkToastedBagels.setText("Toasted Bagels");
        jChkToastedBagels.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChkToastedBagelsActionPerformed(evt);
            }
        });

        jChkPineappleSticks.setBackground(new java.awt.Color(204, 0, 51));
        jChkPineappleSticks.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jChkPineappleSticks.setForeground(new java.awt.Color(255, 255, 255));
        jChkPineappleSticks.setText("Pineapple Sticks");
        jChkPineappleSticks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChkPineappleSticksActionPerformed(evt);
            }
        });

        jChkChocolateMuffin.setBackground(new java.awt.Color(204, 0, 51));
        jChkChocolateMuffin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jChkChocolateMuffin.setForeground(new java.awt.Color(255, 255, 255));
        jChkChocolateMuffin.setText("Chocolate Muffin");
        jChkChocolateMuffin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChkChocolateMuffinActionPerformed(evt);
            }
        });

        jChkPancakesSyrup.setBackground(new java.awt.Color(204, 0, 51));
        jChkPancakesSyrup.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jChkPancakesSyrup.setForeground(new java.awt.Color(255, 255, 255));
        jChkPancakesSyrup.setText("Pancakes Syrup");
        jChkPancakesSyrup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChkPancakesSyrupActionPerformed(evt);
            }
        });

        jtxtToastedBagels.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtxtToastedBagels.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtToastedBagels.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtToastedBagelsActionPerformed(evt);
            }
        });
        jtxtToastedBagels.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtToastedBagelsKeyTyped(evt);
            }
        });

        jtxtPineappleSticks.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtxtPineappleSticks.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtPineappleSticks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtPineappleSticksActionPerformed(evt);
            }
        });
        jtxtPineappleSticks.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtPineappleSticksKeyTyped(evt);
            }
        });

        jtxtChocolateMuffin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtxtChocolateMuffin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtChocolateMuffin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtChocolateMuffinActionPerformed(evt);
            }
        });
        jtxtChocolateMuffin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtChocolateMuffinKeyTyped(evt);
            }
        });

        jtxtPancakesSyrup.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtxtPancakesSyrup.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtPancakesSyrup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtPancakesSyrupActionPerformed(evt);
            }
        });
        jtxtPancakesSyrup.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtPancakesSyrupKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jpnlUserMenu1Layout = new javax.swing.GroupLayout(jpnlUserMenu1);
        jpnlUserMenu1.setLayout(jpnlUserMenu1Layout);
        jpnlUserMenu1Layout.setHorizontalGroup(
            jpnlUserMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlUserMenu1Layout.createSequentialGroup()
                .addGroup(jpnlUserMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlUserMenu1Layout.createSequentialGroup()
                        .addComponent(jChkHashBrown)
                        .addGap(48, 48, 48)
                        .addComponent(jtxtHashBrown, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                    .addGroup(jpnlUserMenu1Layout.createSequentialGroup()
                        .addComponent(jChkChocolateMuffin)
                        .addGap(15, 15, 15)
                        .addComponent(jtxtChocolateMuffin))
                    .addGroup(jpnlUserMenu1Layout.createSequentialGroup()
                        .addComponent(jChkPancakesSyrup)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtxtPancakesSyrup, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnlUserMenu1Layout.createSequentialGroup()
                        .addGroup(jpnlUserMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnlUserMenu1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jpnlUserMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlblFMV)
                                    .addComponent(jlblSandwiches)
                                    .addComponent(jlblDesserts)))
                            .addComponent(jChkFishSandwich)
                            .addComponent(jChkSalad)
                            .addGroup(jpnlUserMenu1Layout.createSequentialGroup()
                                .addGroup(jpnlUserMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpnlUserMenu1Layout.createSequentialGroup()
                                        .addGroup(jpnlUserMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jChkHBurgers)
                                            .addComponent(jChkOnionRings)
                                            .addComponent(jChkCheeseSandwich)
                                            .addComponent(jChkFrenchFries)
                                            .addComponent(jChkChickenNuggets))
                                        .addGap(11, 11, 11))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlUserMenu1Layout.createSequentialGroup()
                                        .addComponent(jChkChickenSandwich)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jpnlUserMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtxtCheeseSandwich, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(jtxtFishSandwich)
                                    .addComponent(jtxtChickenSandwich)
                                    .addComponent(jtxtFrenchFries)
                                    .addComponent(jtxtChickenNuggets)
                                    .addComponent(jtxtOnionRings)
                                    .addComponent(jtxtSalad)
                                    .addComponent(jtxtHBurgers))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlUserMenu1Layout.createSequentialGroup()
                        .addGroup(jpnlUserMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jChkToastedBagels)
                            .addComponent(jChkPineappleSticks))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpnlUserMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxtPineappleSticks)
                            .addComponent(jtxtToastedBagels, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jpnlUserMenu1Layout.setVerticalGroup(
            jpnlUserMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlUserMenu1Layout.createSequentialGroup()
                .addComponent(jlblFMV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnlUserMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChkHBurgers)
                    .addComponent(jtxtHBurgers, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jpnlUserMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChkFrenchFries)
                    .addComponent(jtxtFrenchFries, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jpnlUserMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChkChickenNuggets)
                    .addComponent(jtxtChickenNuggets, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jpnlUserMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChkOnionRings)
                    .addComponent(jtxtOnionRings, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jpnlUserMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChkSalad)
                    .addComponent(jtxtSalad, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jlblSandwiches)
                .addGap(7, 7, 7)
                .addGroup(jpnlUserMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChkCheeseSandwich)
                    .addComponent(jtxtCheeseSandwich, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnlUserMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jChkFishSandwich)
                    .addComponent(jtxtFishSandwich, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnlUserMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChkChickenSandwich)
                    .addComponent(jtxtChickenSandwich))
                .addGap(25, 25, 25)
                .addComponent(jlblDesserts)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnlUserMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChkHashBrown)
                    .addComponent(jtxtHashBrown, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnlUserMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChkToastedBagels)
                    .addComponent(jtxtToastedBagels, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnlUserMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChkPineappleSticks)
                    .addComponent(jtxtPineappleSticks, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnlUserMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChkChocolateMuffin)
                    .addComponent(jtxtChocolateMuffin, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnlUserMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChkPancakesSyrup)
                    .addComponent(jtxtPancakesSyrup, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        getContentPane().add(jpnlUserMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 100, 250, 550));

        jpnlUserMenu2.setBackground(new java.awt.Color(204, 0, 51));
        jpnlUserMenu2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 4));
        jpnlUserMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jChkHotTea.setBackground(new java.awt.Color(204, 0, 51));
        jChkHotTea.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jChkHotTea.setForeground(new java.awt.Color(255, 255, 255));
        jChkHotTea.setText("Hot Tea");
        jChkHotTea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChkHotTeaActionPerformed(evt);
            }
        });

        jChkCocaCola.setBackground(new java.awt.Color(204, 0, 51));
        jChkCocaCola.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jChkCocaCola.setForeground(new java.awt.Color(255, 255, 255));
        jChkCocaCola.setText("Coca Cola");
        jChkCocaCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChkCocaColaActionPerformed(evt);
            }
        });

        jChkOrangeJuice.setBackground(new java.awt.Color(204, 0, 51));
        jChkOrangeJuice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jChkOrangeJuice.setForeground(new java.awt.Color(255, 255, 255));
        jChkOrangeJuice.setText("Orange Juice");
        jChkOrangeJuice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChkOrangeJuiceActionPerformed(evt);
            }
        });

        jChkSprite.setBackground(new java.awt.Color(204, 0, 51));
        jChkSprite.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jChkSprite.setForeground(new java.awt.Color(255, 255, 255));
        jChkSprite.setText("Sprite");
        jChkSprite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChkSpriteActionPerformed(evt);
            }
        });

        jChkBottleofWater.setBackground(new java.awt.Color(204, 0, 51));
        jChkBottleofWater.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jChkBottleofWater.setForeground(new java.awt.Color(255, 255, 255));
        jChkBottleofWater.setText("Bottle of Water");
        jChkBottleofWater.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChkBottleofWaterActionPerformed(evt);
            }
        });

        jChkOreoMcFlurry.setBackground(new java.awt.Color(204, 0, 51));
        jChkOreoMcFlurry.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jChkOreoMcFlurry.setForeground(new java.awt.Color(255, 255, 255));
        jChkOreoMcFlurry.setText("Oreo McFlurry");
        jChkOreoMcFlurry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChkOreoMcFlurryActionPerformed(evt);
            }
        });

        jChkChocolateShake.setBackground(new java.awt.Color(204, 0, 51));
        jChkChocolateShake.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jChkChocolateShake.setForeground(new java.awt.Color(255, 255, 255));
        jChkChocolateShake.setText("Chocolate Shake");
        jChkChocolateShake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChkChocolateShakeActionPerformed(evt);
            }
        });

        jChkStrawberryShake.setBackground(new java.awt.Color(204, 0, 51));
        jChkStrawberryShake.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jChkStrawberryShake.setForeground(new java.awt.Color(255, 255, 255));
        jChkStrawberryShake.setText("Strawberry Shake");
        jChkStrawberryShake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChkStrawberryShakeActionPerformed(evt);
            }
        });

        jChkVanillaShake.setBackground(new java.awt.Color(204, 0, 51));
        jChkVanillaShake.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jChkVanillaShake.setForeground(new java.awt.Color(255, 255, 255));
        jChkVanillaShake.setText("Vanilla Shake");
        jChkVanillaShake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChkVanillaShakeActionPerformed(evt);
            }
        });

        jlblBevs.setBackground(new java.awt.Color(204, 0, 51));
        jlblBevs.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jlblBevs.setForeground(new java.awt.Color(255, 242, 0));
        jlblBevs.setText("BEVERAGES");

        jlblShakes.setBackground(new java.awt.Color(204, 0, 51));
        jlblShakes.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jlblShakes.setForeground(new java.awt.Color(255, 242, 0));
        jlblShakes.setText("SHAKES");
        jlblShakes.setToolTipText("");

        jtxtSprite.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtxtSprite.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtSprite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtSpriteActionPerformed(evt);
            }
        });
        jtxtSprite.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtSpriteKeyTyped(evt);
            }
        });

        jtxtHotTea.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtxtHotTea.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtHotTea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtHotTeaActionPerformed(evt);
            }
        });
        jtxtHotTea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtHotTeaKeyTyped(evt);
            }
        });

        jtxtCocaCola.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtxtCocaCola.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtCocaCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCocaColaActionPerformed(evt);
            }
        });
        jtxtCocaCola.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtCocaColaKeyTyped(evt);
            }
        });

        jtxtOrangeJuice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtxtOrangeJuice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtOrangeJuice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtOrangeJuiceActionPerformed(evt);
            }
        });
        jtxtOrangeJuice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtOrangeJuiceKeyTyped(evt);
            }
        });

        jtxtBottleofWater.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtxtBottleofWater.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtBottleofWater.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtBottleofWaterActionPerformed(evt);
            }
        });
        jtxtBottleofWater.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtBottleofWaterKeyTyped(evt);
            }
        });

        jtxtVanillaShake.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtxtVanillaShake.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtVanillaShake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtVanillaShakeActionPerformed(evt);
            }
        });
        jtxtVanillaShake.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtVanillaShakeKeyTyped(evt);
            }
        });

        jtxtStrawberryShake.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtxtStrawberryShake.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtStrawberryShake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtStrawberryShakeActionPerformed(evt);
            }
        });
        jtxtStrawberryShake.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtStrawberryShakeKeyTyped(evt);
            }
        });

        jtxtChocolateShake.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtxtChocolateShake.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtChocolateShake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtChocolateShakeActionPerformed(evt);
            }
        });
        jtxtChocolateShake.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtChocolateShakeKeyTyped(evt);
            }
        });

        jtxtOreoMcFlurry.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtxtOreoMcFlurry.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtOreoMcFlurry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtOreoMcFlurryActionPerformed(evt);
            }
        });
        jtxtOreoMcFlurry.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtOreoMcFlurryKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jpnlUserMenu2Layout = new javax.swing.GroupLayout(jpnlUserMenu2);
        jpnlUserMenu2.setLayout(jpnlUserMenu2Layout);
        jpnlUserMenu2Layout.setHorizontalGroup(
            jpnlUserMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlUserMenu2Layout.createSequentialGroup()
                .addGroup(jpnlUserMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlUserMenu2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlblBevs))
                    .addComponent(jChkChocolateShake)
                    .addGroup(jpnlUserMenu2Layout.createSequentialGroup()
                        .addGroup(jpnlUserMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jChkOreoMcFlurry)
                            .addComponent(jChkVanillaShake)
                            .addGroup(jpnlUserMenu2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jlblShakes))
                            .addComponent(jChkHotTea)
                            .addComponent(jChkCocaCola)
                            .addComponent(jChkSprite)
                            .addComponent(jChkOrangeJuice)
                            .addComponent(jChkBottleofWater)
                            .addComponent(jChkStrawberryShake))
                        .addGap(12, 12, 12)
                        .addGroup(jpnlUserMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnlUserMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jtxtStrawberryShake, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jpnlUserMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jtxtSprite, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(jtxtOrangeJuice)
                                    .addComponent(jtxtCocaCola)
                                    .addComponent(jtxtHotTea)
                                    .addComponent(jtxtBottleofWater)
                                    .addComponent(jtxtOreoMcFlurry)
                                    .addComponent(jtxtChocolateShake)))
                            .addComponent(jtxtVanillaShake, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 12, Short.MAX_VALUE))
        );
        jpnlUserMenu2Layout.setVerticalGroup(
            jpnlUserMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlUserMenu2Layout.createSequentialGroup()
                .addComponent(jlblBevs)
                .addGroup(jpnlUserMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlUserMenu2Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jlblShakes))
                    .addGroup(jpnlUserMenu2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpnlUserMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jChkHotTea)
                            .addComponent(jtxtHotTea, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpnlUserMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jChkCocaCola)
                            .addComponent(jtxtCocaCola, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpnlUserMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jChkSprite)
                            .addComponent(jtxtSprite, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpnlUserMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jChkOrangeJuice)
                            .addComponent(jtxtOrangeJuice, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpnlUserMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jChkBottleofWater)
                            .addComponent(jtxtBottleofWater, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnlUserMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChkOreoMcFlurry)
                    .addComponent(jtxtOreoMcFlurry, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jpnlUserMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChkChocolateShake)
                    .addComponent(jtxtChocolateShake, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnlUserMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChkStrawberryShake)
                    .addComponent(jtxtStrawberryShake, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jpnlUserMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChkVanillaShake)
                    .addComponent(jtxtVanillaShake, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(jpnlUserMenu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 100, 260, 350));

        jpnlPaymentMethod.setBackground(new java.awt.Color(153, 0, 0));
        jpnlPaymentMethod.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 4));
        jpnlPaymentMethod.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jcmbPaymentMethod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcmbPaymentMethod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "Cash", "Debit Card", "Master Card", "Visa Card" }));
        jcmbPaymentMethod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbPaymentMethodActionPerformed(evt);
            }
        });

        jlblPaymentMethod.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblPaymentMethod.setForeground(new java.awt.Color(255, 255, 255));
        jlblPaymentMethod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPaymentMethod.setText("Payment Method");

        jtxtPaymentMethod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxtPaymentMethod.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtPaymentMethod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtPaymentMethodActionPerformed(evt);
            }
        });
        jtxtPaymentMethod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtPaymentMethodKeyTyped(evt);
            }
        });

        jlblAmountEntered.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblAmountEntered.setForeground(new java.awt.Color(255, 255, 255));
        jlblAmountEntered.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblAmountEntered.setText("Amount Entered");

        jlblCashOnly.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jlblCashOnly.setForeground(new java.awt.Color(255, 255, 255));
        jlblCashOnly.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblCashOnly.setText("(CASH ONLY)");

        javax.swing.GroupLayout jpnlPaymentMethodLayout = new javax.swing.GroupLayout(jpnlPaymentMethod);
        jpnlPaymentMethod.setLayout(jpnlPaymentMethodLayout);
        jpnlPaymentMethodLayout.setHorizontalGroup(
            jpnlPaymentMethodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlPaymentMethodLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnlPaymentMethodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtPaymentMethod)
                    .addComponent(jcmbPaymentMethod, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlblAmountEntered, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlblPaymentMethod, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(jlblCashOnly, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpnlPaymentMethodLayout.setVerticalGroup(
            jpnlPaymentMethodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlPaymentMethodLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblPaymentMethod)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcmbPaymentMethod, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jlblAmountEntered)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblCashOnly)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxtPaymentMethod, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        getContentPane().add(jpnlPaymentMethod, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 450, 140, 200));

        jpnlSelections.setBackground(new java.awt.Color(153, 0, 0));
        jpnlSelections.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 4));

        jbtnExit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });

        jbtnReset.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });

        jbtnPlaceOrder.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnPlaceOrder.setText("Place Order");
        jbtnPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPlaceOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnlSelectionsLayout = new javax.swing.GroupLayout(jpnlSelections);
        jpnlSelections.setLayout(jpnlSelectionsLayout);
        jpnlSelectionsLayout.setHorizontalGroup(
            jpnlSelectionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlSelectionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnlSelectionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnPlaceOrder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpnlSelectionsLayout.setVerticalGroup(
            jpnlSelectionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlSelectionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnPlaceOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jbtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jpnlSelections, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 450, 120, 200));

        jpnlMainMenu.setBackground(new java.awt.Color(102, 102, 102));
        jpnlMainMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 4));
        jpnlMainMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jlblFMV_Menu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlblFMV_Menu.setForeground(new java.awt.Color(255, 255, 0));
        jlblFMV_Menu.setText("FAST MEAL & VEGETARIAN");

        jlblHBurgers_Display.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblHBurgers_Display.setForeground(new java.awt.Color(255, 255, 255));
        jlblHBurgers_Display.setText("1) Hamburgers");

        jlblFrenchFries_Display.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblFrenchFries_Display.setForeground(new java.awt.Color(255, 255, 255));
        jlblFrenchFries_Display.setText("2) French Fries");

        jlblOnionRings_Display.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblOnionRings_Display.setForeground(new java.awt.Color(255, 255, 255));
        jlblOnionRings_Display.setText("4) Onion Rings");

        jlblSalad_Display.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblSalad_Display.setForeground(new java.awt.Color(255, 255, 255));
        jlblSalad_Display.setText("5) Salad");

        jlblChickenNuggets_Display.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblChickenNuggets_Display.setForeground(new java.awt.Color(255, 255, 255));
        jlblChickenNuggets_Display.setText("3) Chicken Nuggets");

        jlblSandwiches_Menu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlblSandwiches_Menu.setForeground(new java.awt.Color(255, 255, 0));
        jlblSandwiches_Menu.setText("SANDWICHES");

        jlblFishSandwich_Display.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblFishSandwich_Display.setForeground(new java.awt.Color(255, 255, 255));
        jlblFishSandwich_Display.setText("7) Fish Sandwich");

        jlblCheeseSandwich_Display.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblCheeseSandwich_Display.setForeground(new java.awt.Color(255, 255, 255));
        jlblCheeseSandwich_Display.setText("6) Cheese Sandwich");

        jlblChickenSandwich_Display.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblChickenSandwich_Display.setForeground(new java.awt.Color(255, 255, 255));
        jlblChickenSandwich_Display.setText("8) Chicken Sandwich");

        jlblDesserts_Menu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlblDesserts_Menu.setForeground(new java.awt.Color(255, 255, 0));
        jlblDesserts_Menu.setText("DESSERTS");

        jlblPancakes_Display.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblPancakes_Display.setForeground(new java.awt.Color(255, 255, 255));
        jlblPancakes_Display.setText("13) Pancakes w/ Syrup");

        jlblChocolateMuffin_Display.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblChocolateMuffin_Display.setForeground(new java.awt.Color(255, 255, 255));
        jlblChocolateMuffin_Display.setText("12) Chocolate Muffin");

        jlblPASticks_Display.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblPASticks_Display.setForeground(new java.awt.Color(255, 255, 255));
        jlblPASticks_Display.setText("11) Pineapple Sticks");

        jlblToastedBagels_Display.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblToastedBagels_Display.setForeground(new java.awt.Color(255, 255, 255));
        jlblToastedBagels_Display.setText("10) Toasted Bagels");

        jlblHashBrown_Display.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblHashBrown_Display.setForeground(new java.awt.Color(255, 255, 255));
        jlblHashBrown_Display.setText("9) Hash Brown");

        jlblPancakes_Cost.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblPancakes_Cost.setForeground(new java.awt.Color(255, 255, 255));
        jlblPancakes_Cost.setText("$4.50");

        jlblHashBrown_Cost.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblHashBrown_Cost.setForeground(new java.awt.Color(255, 255, 255));
        jlblHashBrown_Cost.setText("$1.25");

        jlblToastedBagels_Cost.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblToastedBagels_Cost.setForeground(new java.awt.Color(255, 255, 255));
        jlblToastedBagels_Cost.setText("$2.00");

        jlblPASticks_Cost.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblPASticks_Cost.setForeground(new java.awt.Color(255, 255, 255));
        jlblPASticks_Cost.setText("$1.75");

        jlblChocolateMuffin_Cost.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblChocolateMuffin_Cost.setForeground(new java.awt.Color(255, 255, 255));
        jlblChocolateMuffin_Cost.setText("$2.00");

        jlblChickenSandwich_Cost.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblChickenSandwich_Cost.setForeground(new java.awt.Color(255, 255, 255));
        jlblChickenSandwich_Cost.setText("$4.50");

        jlblFishSandwich_Cost.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblFishSandwich_Cost.setForeground(new java.awt.Color(255, 255, 255));
        jlblFishSandwich_Cost.setText("$4.00");

        jlblCheeseSandwich_Cost.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblCheeseSandwich_Cost.setForeground(new java.awt.Color(255, 255, 255));
        jlblCheeseSandwich_Cost.setText("$3.50");

        jlblSalad_Cost.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblSalad_Cost.setForeground(new java.awt.Color(255, 255, 255));
        jlblSalad_Cost.setText("$3.25");

        jlblOnionRings_Cost.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblOnionRings_Cost.setForeground(new java.awt.Color(255, 255, 255));
        jlblOnionRings_Cost.setText("$2.50");

        jlblChickenNuggets_Cost.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblChickenNuggets_Cost.setForeground(new java.awt.Color(255, 255, 255));
        jlblChickenNuggets_Cost.setText("$0.75");

        jlblFrenchFries_Cost.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblFrenchFries_Cost.setForeground(new java.awt.Color(255, 255, 255));
        jlblFrenchFries_Cost.setText("$2.00");

        jlblHBurgers_Cost.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblHBurgers_Cost.setForeground(new java.awt.Color(255, 255, 255));
        jlblHBurgers_Cost.setText("$3.00");

        jlblBevs_Menu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlblBevs_Menu.setForeground(new java.awt.Color(255, 255, 0));
        jlblBevs_Menu.setText("BEVERAGES");

        jlblHotTea_Display.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblHotTea_Display.setForeground(new java.awt.Color(255, 255, 255));
        jlblHotTea_Display.setText("14) Hot Tea");

        jlblCocaCola_Display.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblCocaCola_Display.setForeground(new java.awt.Color(255, 255, 255));
        jlblCocaCola_Display.setText("15) Coca Cola");

        jlblBottleOfWater_Display.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblBottleOfWater_Display.setForeground(new java.awt.Color(255, 255, 255));
        jlblBottleOfWater_Display.setText("18) Bottle of Water");

        jlblOJ_Display.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblOJ_Display.setForeground(new java.awt.Color(255, 255, 255));
        jlblOJ_Display.setText("17) Orange Juice");

        jlblSprite_Display.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblSprite_Display.setForeground(new java.awt.Color(255, 255, 255));
        jlblSprite_Display.setText("16) Sprite");

        jlblShakes_Menu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlblShakes_Menu.setForeground(new java.awt.Color(255, 255, 0));
        jlblShakes_Menu.setText("SHAKES");

        jlblMcFlurry_Display.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblMcFlurry_Display.setForeground(new java.awt.Color(255, 255, 255));
        jlblMcFlurry_Display.setText("19) McFlurry w/ Oreos");

        jlblChocolateShake_Display.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblChocolateShake_Display.setForeground(new java.awt.Color(255, 255, 255));
        jlblChocolateShake_Display.setText("20) Chocolate Shake");

        jlblStrawberryShake_Display.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblStrawberryShake_Display.setForeground(new java.awt.Color(255, 255, 255));
        jlblStrawberryShake_Display.setText("21) Strawberry Shake");

        jlblSVanillaShake_Display.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblSVanillaShake_Display.setForeground(new java.awt.Color(255, 255, 255));
        jlblSVanillaShake_Display.setText("22) Vanilla Shake");

        jlblMcFlurry_Cost.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblMcFlurry_Cost.setForeground(new java.awt.Color(255, 255, 255));
        jlblMcFlurry_Cost.setText("$3.75");

        jlblStrawberryShake_Cost.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblStrawberryShake_Cost.setForeground(new java.awt.Color(255, 255, 255));
        jlblStrawberryShake_Cost.setText("$3.50");

        jlblChocolateShake_Cost.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblChocolateShake_Cost.setForeground(new java.awt.Color(255, 255, 255));
        jlblChocolateShake_Cost.setText("$3.50");

        jlblBottleOfWater_Cost.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblBottleOfWater_Cost.setForeground(new java.awt.Color(255, 255, 255));
        jlblBottleOfWater_Cost.setText("$1.00");

        jlblVanillaShake_Cost.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblVanillaShake_Cost.setForeground(new java.awt.Color(255, 255, 255));
        jlblVanillaShake_Cost.setText("$3.50");

        jlblHotTea_Cost.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblHotTea_Cost.setForeground(new java.awt.Color(255, 255, 255));
        jlblHotTea_Cost.setText("$1.75");

        jlblCocaCola_Cost.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblCocaCola_Cost.setForeground(new java.awt.Color(255, 255, 255));
        jlblCocaCola_Cost.setText("$1.50");

        jlblSprite_Cost.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblSprite_Cost.setForeground(new java.awt.Color(255, 255, 255));
        jlblSprite_Cost.setText("$1.50");

        jlblOJ_Cost.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblOJ_Cost.setForeground(new java.awt.Color(255, 255, 255));
        jlblOJ_Cost.setText("$2.00");

        jlblOreoMCF_Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fast_Food/20240404_152047 (1).jpg"))); // NOI18N

        jlblOreoMCF_Number.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblOreoMCF_Number.setForeground(new java.awt.Color(255, 255, 255));
        jlblOreoMCF_Number.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblOreoMCF_Number.setText("#19");

        jlblChickSandwich_Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fast_Food/20240404_152148 (1).jpg"))); // NOI18N

        jlblChickSandwich_Number.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblChickSandwich_Number.setForeground(new java.awt.Color(255, 255, 255));
        jlblChickSandwich_Number.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblChickSandwich_Number.setText("#8");

        jlblPAStick_Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fast_Food/20240404_152302 (1).jpg"))); // NOI18N

        jlblPAStick_Number.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblPAStick_Number.setForeground(new java.awt.Color(255, 255, 255));
        jlblPAStick_Number.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPAStick_Number.setText("#11");

        jlblNuggs_Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fast_Food/20240404_152433 (1).jpg"))); // NOI18N

        jlblNuggs_Number.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblNuggs_Number.setForeground(new java.awt.Color(255, 255, 255));
        jlblNuggs_Number.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblNuggs_Number.setText("#3");

        jlblSprite_Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fast_Food/20240404_152542 (1).jpg"))); // NOI18N

        jlblSprite_Number.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblSprite_Number.setForeground(new java.awt.Color(255, 255, 255));
        jlblSprite_Number.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblSprite_Number.setText("#16");

        jlblVS_Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fast_Food/20240404_152625 (1).jpg"))); // NOI18N

        jlblVS_Number.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblVS_Number.setForeground(new java.awt.Color(255, 255, 255));
        jlblVS_Number.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblVS_Number.setText("#22");

        javax.swing.GroupLayout jpnlMainMenuLayout = new javax.swing.GroupLayout(jpnlMainMenu);
        jpnlMainMenu.setLayout(jpnlMainMenuLayout);
        jpnlMainMenuLayout.setHorizontalGroup(
            jpnlMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlMainMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnlMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnlMainMenuLayout.createSequentialGroup()
                            .addComponent(jlblHBurgers_Display)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlblHBurgers_Cost))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnlMainMenuLayout.createSequentialGroup()
                            .addComponent(jlblFrenchFries_Display)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlblFrenchFries_Cost))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnlMainMenuLayout.createSequentialGroup()
                            .addComponent(jlblChickenNuggets_Display)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlblChickenNuggets_Cost))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnlMainMenuLayout.createSequentialGroup()
                            .addComponent(jlblOnionRings_Display)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlblOnionRings_Cost))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnlMainMenuLayout.createSequentialGroup()
                            .addComponent(jlblSalad_Display)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlblSalad_Cost))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnlMainMenuLayout.createSequentialGroup()
                            .addComponent(jlblCheeseSandwich_Display)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlblCheeseSandwich_Cost))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnlMainMenuLayout.createSequentialGroup()
                            .addComponent(jlblFishSandwich_Display)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlblFishSandwich_Cost))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnlMainMenuLayout.createSequentialGroup()
                            .addComponent(jlblChickenSandwich_Display)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlblChickenSandwich_Cost))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnlMainMenuLayout.createSequentialGroup()
                            .addComponent(jlblHashBrown_Display)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlblHashBrown_Cost))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnlMainMenuLayout.createSequentialGroup()
                            .addComponent(jlblToastedBagels_Display)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlblToastedBagels_Cost))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnlMainMenuLayout.createSequentialGroup()
                            .addComponent(jlblPASticks_Display)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlblPASticks_Cost))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnlMainMenuLayout.createSequentialGroup()
                            .addComponent(jlblChocolateMuffin_Display)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlblChocolateMuffin_Cost))
                        .addComponent(jlblFMV_Menu)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnlMainMenuLayout.createSequentialGroup()
                            .addComponent(jlblPancakes_Display)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlblPancakes_Cost)))
                    .addComponent(jlblSandwiches_Menu)
                    .addComponent(jlblDesserts_Menu))
                .addGap(60, 60, 60)
                .addGroup(jpnlMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlMainMenuLayout.createSequentialGroup()
                        .addGroup(jpnlMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblShakes_Menu)
                            .addComponent(jlblBevs_Menu)
                            .addGroup(jpnlMainMenuLayout.createSequentialGroup()
                                .addGroup(jpnlMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpnlMainMenuLayout.createSequentialGroup()
                                        .addComponent(jlblOreoMCF_Image)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jlblOreoMCF_Number))
                                    .addGroup(jpnlMainMenuLayout.createSequentialGroup()
                                        .addComponent(jlblChickSandwich_Image)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jlblChickSandwich_Number)))
                                .addGap(76, 76, 76)
                                .addGroup(jpnlMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpnlMainMenuLayout.createSequentialGroup()
                                        .addComponent(jlblNuggs_Image)
                                        .addGap(18, 18, 18)
                                        .addComponent(jlblNuggs_Number))
                                    .addGroup(jpnlMainMenuLayout.createSequentialGroup()
                                        .addComponent(jlblPAStick_Image)
                                        .addGap(18, 18, 18)
                                        .addComponent(jlblPAStick_Number)))))
                        .addContainerGap())
                    .addGroup(jpnlMainMenuLayout.createSequentialGroup()
                        .addGroup(jpnlMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnlMainMenuLayout.createSequentialGroup()
                                .addComponent(jlblHotTea_Display)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlblHotTea_Cost))
                            .addGroup(jpnlMainMenuLayout.createSequentialGroup()
                                .addComponent(jlblCocaCola_Display)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlblCocaCola_Cost))
                            .addGroup(jpnlMainMenuLayout.createSequentialGroup()
                                .addComponent(jlblSprite_Display)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlblSprite_Cost))
                            .addGroup(jpnlMainMenuLayout.createSequentialGroup()
                                .addComponent(jlblOJ_Display)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlblOJ_Cost))
                            .addGroup(jpnlMainMenuLayout.createSequentialGroup()
                                .addComponent(jlblSVanillaShake_Display)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlblVanillaShake_Cost))
                            .addGroup(jpnlMainMenuLayout.createSequentialGroup()
                                .addComponent(jlblStrawberryShake_Display)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlblStrawberryShake_Cost))
                            .addGroup(jpnlMainMenuLayout.createSequentialGroup()
                                .addComponent(jlblChocolateShake_Display)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlblChocolateShake_Cost))
                            .addGroup(jpnlMainMenuLayout.createSequentialGroup()
                                .addComponent(jlblBottleOfWater_Display)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlblBottleOfWater_Cost))
                            .addGroup(jpnlMainMenuLayout.createSequentialGroup()
                                .addComponent(jlblMcFlurry_Display)
                                .addGap(65, 65, 65)
                                .addComponent(jlblMcFlurry_Cost)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addGroup(jpnlMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlMainMenuLayout.createSequentialGroup()
                                .addComponent(jlblSprite_Number)
                                .addGap(76, 76, 76))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlMainMenuLayout.createSequentialGroup()
                                .addGroup(jpnlMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlblVS_Image)
                                    .addComponent(jlblSprite_Image))
                                .addGap(42, 42, 42))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlMainMenuLayout.createSequentialGroup()
                                .addComponent(jlblVS_Number)
                                .addGap(77, 77, 77))))))
        );
        jpnlMainMenuLayout.setVerticalGroup(
            jpnlMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlMainMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnlMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblFMV_Menu)
                    .addComponent(jlblBevs_Menu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnlMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlMainMenuLayout.createSequentialGroup()
                        .addGroup(jpnlMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblHBurgers_Display)
                            .addComponent(jlblHBurgers_Cost)
                            .addComponent(jlblHotTea_Display)
                            .addComponent(jlblHotTea_Cost))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpnlMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblFrenchFries_Display)
                            .addComponent(jlblFrenchFries_Cost)
                            .addComponent(jlblCocaCola_Display)
                            .addComponent(jlblCocaCola_Cost))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpnlMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblChickenNuggets_Display)
                            .addComponent(jlblChickenNuggets_Cost)
                            .addComponent(jlblSprite_Display)
                            .addComponent(jlblSprite_Cost))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpnlMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblOnionRings_Display)
                            .addComponent(jlblOnionRings_Cost)
                            .addComponent(jlblOJ_Display)
                            .addComponent(jlblOJ_Cost)))
                    .addComponent(jlblSprite_Image))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnlMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblSprite_Number)
                    .addGroup(jpnlMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlblSalad_Display)
                        .addComponent(jlblSalad_Cost)
                        .addComponent(jlblBottleOfWater_Display)
                        .addComponent(jlblBottleOfWater_Cost)))
                .addGap(35, 35, 35)
                .addGroup(jpnlMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlMainMenuLayout.createSequentialGroup()
                        .addGroup(jpnlMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblSandwiches_Menu)
                            .addComponent(jlblShakes_Menu))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpnlMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblCheeseSandwich_Display)
                            .addComponent(jlblCheeseSandwich_Cost)
                            .addComponent(jlblMcFlurry_Display)
                            .addComponent(jlblMcFlurry_Cost))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpnlMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblFishSandwich_Display)
                            .addComponent(jlblFishSandwich_Cost)
                            .addComponent(jlblChocolateShake_Display)
                            .addComponent(jlblChocolateShake_Cost))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpnlMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblChickenSandwich_Display)
                            .addComponent(jlblChickenSandwich_Cost)
                            .addComponent(jlblStrawberryShake_Display)
                            .addComponent(jlblStrawberryShake_Cost)))
                    .addComponent(jlblVS_Image))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnlMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblSVanillaShake_Display)
                    .addComponent(jlblVanillaShake_Cost)
                    .addComponent(jlblVS_Number))
                .addGroup(jpnlMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlMainMenuLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpnlMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnlMainMenuLayout.createSequentialGroup()
                                .addComponent(jlblDesserts_Menu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jpnlMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpnlMainMenuLayout.createSequentialGroup()
                                        .addGroup(jpnlMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jlblHashBrown_Display)
                                            .addComponent(jlblHashBrown_Cost))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jpnlMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jlblToastedBagels_Display)
                                            .addComponent(jlblToastedBagels_Cost))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jpnlMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jlblPASticks_Display)
                                            .addComponent(jlblPASticks_Cost))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jpnlMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jlblChocolateMuffin_Display)
                                            .addComponent(jlblChocolateMuffin_Cost)))
                                    .addComponent(jlblOreoMCF_Image)
                                    .addComponent(jlblPAStick_Image))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlMainMenuLayout.createSequentialGroup()
                                .addComponent(jlblPAStick_Number)
                                .addGap(58, 58, 58)))
                        .addGroup(jpnlMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblChickSandwich_Image)
                            .addGroup(jpnlMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jlblPancakes_Display)
                                .addComponent(jlblPancakes_Cost))
                            .addComponent(jlblNuggs_Image)
                            .addGroup(jpnlMainMenuLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jlblNuggs_Number)))
                        .addContainerGap(40, Short.MAX_VALUE))
                    .addGroup(jpnlMainMenuLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jlblOreoMCF_Number)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlblChickSandwich_Number)
                        .addGap(79, 79, 79))))
        );

        getContentPane().add(jpnlMainMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 650));

        pack();
    }// </editor-fold>                        

    // Create employee and manager by inserting into Employee class from data file
    public void createEmployees(){
    
    try(Scanner input = new Scanner(Paths.get("employee.txt"))) {
            // read record from file
         int i = 1;
         while (input.hasNext()) { // while there is more to read
            // insert data into Employee class array                     
            emp[i] = new Employee(input.next(),
               input.next(), input.next(), Boolean.parseBoolean(input.next()), input.next());
            i++;
         }       
        } 
        catch (IOException | NoSuchElementException | 
            IllegalStateException e) {
            e.printStackTrace();
        } 
    }
    
    private void resetAllFields() {
        // Creds: Dominic Doan
        jtxtHBurgers.setText("0");
        jtxtFrenchFries.setText("0");
        jtxtChickenNuggets.setText("0");
        jtxtOnionRings.setText("0");
        jtxtSalad.setText("0");
        jtxtCheeseSandwich.setText("0");
        jtxtFishSandwich.setText("0");
        jtxtChickenSandwich.setText("0");
        jtxtHashBrown.setText("0");
        jtxtToastedBagels.setText("0");
        jtxtPineappleSticks.setText("0");
        jtxtChocolateMuffin.setText("0");
        jtxtPancakesSyrup.setText("0");
        jtxtHotTea.setText("0");
        jtxtCocaCola.setText("0");
        jtxtSprite.setText("0");
        jtxtOrangeJuice.setText("0");
        jtxtBottleofWater.setText("0");
        jtxtOreoMcFlurry.setText("0");
        jtxtChocolateShake.setText("0");
        jtxtStrawberryShake.setText("0");
        jtxtVanillaShake.setText("0");
        jtxtPaymentMethod.setText("");

        jtxtHBurgers.setEnabled(false);
        jtxtFrenchFries.setEnabled(false);
        jtxtChickenNuggets.setEnabled(false);
        jtxtOnionRings.setEnabled(false);
        jtxtSalad.setEnabled(false);
        jtxtCheeseSandwich.setEnabled(false);
        jtxtFishSandwich.setEnabled(false);
        jtxtChickenSandwich.setEnabled(false);
        jtxtHashBrown.setEnabled(false);
        jtxtToastedBagels.setEnabled(false);
        jtxtPineappleSticks.setEnabled(false);
        jtxtChocolateMuffin.setEnabled(false);
        jtxtPancakesSyrup.setEnabled(false);
        jtxtHotTea.setEnabled(false);
        jtxtCocaCola.setEnabled(false);
        jtxtSprite.setEnabled(false);
        jtxtOrangeJuice.setEnabled(false);
        jtxtBottleofWater.setEnabled(false);
        jtxtOreoMcFlurry.setEnabled(false);
        jtxtChocolateShake.setEnabled(false);
        jtxtStrawberryShake.setEnabled(false);
        jtxtVanillaShake.setEnabled(false);

        jChkHBurgers.setSelected(false);
        jChkFrenchFries.setSelected(false);
        jChkChickenNuggets.setSelected(false);
        jChkOnionRings.setSelected(false);
        jChkSalad.setSelected(false);
        jChkCheeseSandwich.setSelected(false);
        jChkFishSandwich.setSelected(false);
        jChkChickenSandwich.setSelected(false);
        jChkHashBrown.setSelected(false);
        jChkToastedBagels.setSelected(false);
        jChkPineappleSticks.setSelected(false);
        jChkChocolateMuffin.setSelected(false);
        jChkPancakesSyrup.setSelected(false);
        jChkHotTea.setSelected(false);
        jChkCocaCola.setSelected(false);
        jChkSprite.setSelected(false);
        jChkOrangeJuice.setSelected(false);
        jChkBottleofWater.setSelected(false);
        jChkOreoMcFlurry.setSelected(false);
        jChkChocolateShake.setSelected(false);
        jChkStrawberryShake.setSelected(false);
        jChkVanillaShake.setSelected(false);
    }
    
    private void jChkHBurgersActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // Creds: Dominic Doan
        if (jChkHBurgers.isSelected())
        {
            jtxtHBurgers.setEnabled(true);
            jtxtHBurgers.requestFocus();
            jtxtHBurgers.setText("");
        }
        else
        {
            jtxtHBurgers.setEnabled(false);
            jtxtHBurgers.setText("0");
        }
    }                                            

    private void jChkHashBrownActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // Creds: Dominic Doan
        if (jChkHashBrown.isSelected())
        {
            jtxtHashBrown.setEnabled(true);
            jtxtHashBrown.requestFocus();
            jtxtHashBrown.setText("");
        }
        else
        {
            jtxtHashBrown.setEnabled(false);
            jtxtHashBrown.setText("0");
        }
    }                                             

    private void jChkToastedBagelsActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // Creds: Dominic Doan
        if (jChkToastedBagels.isSelected())
        {
            jtxtToastedBagels.setEnabled(true);
            jtxtToastedBagels.requestFocus();
            jtxtToastedBagels.setText("");
        }
        else
        {
            jtxtToastedBagels.setEnabled(false);
            jtxtToastedBagels.setText("0");
        }
    }                                                 

    private void jChkPineappleSticksActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // Creds: Dominic Doan
        if (jChkPineappleSticks.isSelected())
        {
            jtxtPineappleSticks.setEnabled(true);
            jtxtPineappleSticks.requestFocus();
            jtxtPineappleSticks.setText("");
        }
        else
        {
            jtxtPineappleSticks.setEnabled(false);
            jtxtPineappleSticks.setText("0");
        }
    }                                                   

    private void jChkChocolateMuffinActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // Creds: Dominic Doan
        if (jChkChocolateMuffin.isSelected())
        {
            jtxtChocolateMuffin.setEnabled(true);
            jtxtChocolateMuffin.requestFocus();
            jtxtChocolateMuffin.setText("");
        }
        else
        {
            jtxtChocolateMuffin.setEnabled(false);
            jtxtChocolateMuffin.setText("0");
        }
    }                                                   

    private void jChkPancakesSyrupActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // Creds: Dominic Doan
        if (jChkPancakesSyrup.isSelected())
        {
            jtxtPancakesSyrup.setEnabled(true);
            jtxtPancakesSyrup.requestFocus();
            jtxtPancakesSyrup.setText("");
        }
        else
        {
            jtxtPancakesSyrup.setEnabled(false);
            jtxtPancakesSyrup.setText("0");
        }
    }                                                 

    private void jtxtSaladActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void jtxtFrenchFriesActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:

    }                                               

    private void jcmbPaymentMethodActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void jChkSaladActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // Creds: Dominic Doan
        if (jChkSalad.isSelected())
        {
            jtxtSalad.setEnabled(true);
            jtxtSalad.requestFocus();
            jtxtSalad.setText("");
        }
        else
        {
            jtxtSalad.setEnabled(false);
            jtxtSalad.setText("0");
        }
    }                                         

    private void jChkCheeseSandwichActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // Creds: Dominic Doan
        if (jChkCheeseSandwich.isSelected())
        {
            jtxtCheeseSandwich.setEnabled(true);
            jtxtCheeseSandwich.requestFocus();
            jtxtCheeseSandwich.setText("");
        }
        else
        {
            jtxtCheeseSandwich.setEnabled(false);
            jtxtCheeseSandwich.setText("0");
        }
    }                                                  

    private void jtxtHashBrownActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void jtxtToastedBagelsActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void jtxtPineappleSticksActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    }                                                   

    private void jtxtChocolateMuffinActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    }                                                   

    private void jtxtPancakesSyrupActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void jtxtSpriteActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void jtxtHotTeaActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void jtxtCocaColaActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void jtxtOrangeJuiceActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void jtxtBottleofWaterActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void jtxtVanillaShakeActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                

    private void jtxtStrawberryShakeActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    }                                                   

    private void jtxtChocolateShakeActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  

    private void jtxtOreoMcFlurryActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                

    private void jChkBottleofWaterActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // Creds: Dominic Doan
        if (jChkBottleofWater.isSelected())
        {
            jtxtBottleofWater.setEnabled(true);
            jtxtBottleofWater.requestFocus();
            jtxtBottleofWater.setText("");
        }
        else
        {
            jtxtBottleofWater.setEnabled(false);
            jtxtBottleofWater.setText("0");
        }
    }                                                 

    private void jChkOreoMcFlurryActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // Creds: Dominic Doan
        if (jChkOreoMcFlurry.isSelected())
        {
            jtxtOreoMcFlurry.setEnabled(true);
            jtxtOreoMcFlurry.requestFocus();
            jtxtOreoMcFlurry.setText("");
        }
        else
        {
            jtxtOreoMcFlurry.setEnabled(false);
            jtxtOreoMcFlurry.setText("0");
        }
    }                                                

    private void jChkChickenNuggetsActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // Creds: Dominic Doan
        if (jChkChickenNuggets.isSelected())
        {
            jtxtChickenNuggets.setEnabled(true);
            jtxtChickenNuggets.requestFocus();
            jtxtChickenNuggets.setText("");
        }
        else
        {
            jtxtChickenNuggets.setEnabled(false);
            jtxtChickenNuggets.setText("0");
        }
    }                                                  

    private void jbtnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // Creds: Dominic Doan
        
        itemcost[0] = Double.parseDouble(jtxtHBurgers.getText()) * Price_Hamburger;
        itemcost[1] = Double.parseDouble(jtxtFrenchFries.getText()) * Price_FrenchFries;
        itemcost[2] = Double.parseDouble(jtxtChickenNuggets.getText()) * Price_ChickenNuggets;
        itemcost[3] = Double.parseDouble(jtxtOnionRings.getText()) * Price_OnionRings;
        itemcost[4] = Double.parseDouble(jtxtSalad.getText()) * Price_Salad;
        itemcost[5] = Double.parseDouble(jtxtCheeseSandwich.getText()) * Price_CheeseSandwich;
        itemcost[6] = Double.parseDouble(jtxtFishSandwich.getText()) * Price_FishSandwich;
        itemcost[7] = Double.parseDouble(jtxtChickenSandwich.getText()) * Price_ChickenSandwich;
        itemcost[8] = Double.parseDouble(jtxtHashBrown.getText()) * Price_HashBrown;
        itemcost[9] = Double.parseDouble(jtxtToastedBagels.getText()) * Price_ToastedBagels;
        itemcost[10] = Double.parseDouble(jtxtPineappleSticks.getText()) * Price_PineappleSticks;
        itemcost[11] = Double.parseDouble(jtxtChocolateMuffin.getText()) * Price_ChocolateMuffin;
        itemcost[12] = Double.parseDouble(jtxtPancakesSyrup.getText()) * Price_PancakesSyrup;
        itemcost[13] = Double.parseDouble(jtxtHotTea.getText()) * Price_HotTea;
        itemcost[14] = Double.parseDouble(jtxtCocaCola.getText()) * Price_CocaCola;
        itemcost[15] = Double.parseDouble(jtxtSprite.getText()) * Price_Sprite;
        itemcost[16] = Double.parseDouble(jtxtOrangeJuice.getText()) * Price_OrangeJuice;
        itemcost[17] = Double.parseDouble(jtxtBottleofWater.getText()) * Price_BottleofWater;
        itemcost[18] = Double.parseDouble(jtxtOreoMcFlurry.getText()) * Price_OreoMcFlurry;
        itemcost[19] = Double.parseDouble(jtxtChocolateShake.getText()) * Price_ChocolateShake;
        itemcost[20] = Double.parseDouble(jtxtStrawberryShake.getText()) * Price_StrawberryShake;
        itemcost[21] = Double.parseDouble(jtxtVanillaShake.getText()) * Price_VanillaShake;

        iChange = Double.parseDouble(jtxtPaymentMethod.getText());
        String PaymentMethod = (String)jcmbPaymentMethod.getSelectedItem();

        // Summary of items ordered
        StringBuilder orderSummary = new StringBuilder();
        for (int i = 0; i < itemcost.length; i++) {
            if (itemcost[i] > 0) {
                orderSummary.append((int) (itemcost[i] / getItemPrice(i))).append(" ")
                        .append(getItemName(i)).append(" = $")
                        .append(String.format("%.2f", itemcost[i])).append("\n");
            }
        }

        if (PaymentMethod.equals("Cash")) {
            iSubTotal = 0;
            for (int i = 0; i < itemcost.length; i++) {
                iSubTotal += itemcost[i];
            }
            if (iChange >= iSubTotal) {
                iTax = (iSubTotal * Tax_Rate) / 100;

                String cTax = String.format("$%.2f", iTax);

                String cSubTotal = String.format("$%.2f", iSubTotal);

                String cTotal = String.format("$%.2f", iSubTotal + iTax);

                String cChange = String.format("$%.2f", iChange - (iSubTotal + iTax));

                String message = "ITEMS ORDERED:\n" + orderSummary.toString() + "\n"
                    + "Sub Total = " + cSubTotal + "\n"
                    + "Tax = " + cTax + "\n"
                    + "Total = " + cTotal + "\n"
                    + "Change = " + cChange + "\n\n"
                    + "Would you like to confirm your payment?";

                int option = JOptionPane.showConfirmDialog(this, message, 
                        "McJava's", JOptionPane.OK_OPTION);

                if (option == JOptionPane.OK_OPTION) {
                    resetAllFields();
                }

            } else {
                JOptionPane.showMessageDialog(null, "Please enter enough cash.", 
                        "McJava's", JOptionPane.OK_OPTION);
            }

        } else if (PaymentMethod.equals("Debit Card") || PaymentMethod.equals("Master Card") 
                || PaymentMethod.equals("Visa Card")) {
            iSubTotal = 0;
            for (int i = 0; i < itemcost.length; i++) {
                iSubTotal += itemcost[i];
            }
           
            iTax = (iSubTotal * Tax_Rate) / 100;

            String cTax = String.format("$%.2f", iTax);

            String cSubTotal = String.format("$%.2f", iSubTotal);

            String cTotal = String.format("$%.2f", iSubTotal + iTax);

            String message = "ITEMS ORDERED:\n" + orderSummary.toString() + "\n"
                + "Sub Total = " + cSubTotal + "\n"
                + "Tax = " + cTax + "\n"
                + "Total = " + cTotal + "\n\n"
                + "Would you like to confirm your payment?";

            int option = JOptionPane.showConfirmDialog(this, message, "McJava's", JOptionPane.OK_OPTION);
            if (option == JOptionPane.OK_OPTION) {
                System.exit(0);
            }
        }   
    }                                              

    private double getItemPrice(int index) { // Creds: Dominic Doan
        double[] prices = {Price_Hamburger, Price_FrenchFries, Price_ChickenNuggets, Price_OnionRings, Price_Salad, 
            Price_CheeseSandwich, Price_FishSandwich, Price_ChickenSandwich, Price_HashBrown, Price_ToastedBagels, 
            Price_PineappleSticks, Price_ChocolateMuffin, Price_PancakesSyrup, Price_HotTea, Price_CocaCola, 
            Price_Sprite, Price_OrangeJuice, Price_BottleofWater, Price_OreoMcFlurry, Price_ChocolateShake, 
            Price_StrawberryShake, Price_VanillaShake};
        return prices[index];
    }
    
    private String getItemName(int index) { // Creds: Dominic Doan
        String[] names = {"Hamburgers", "French Fries", "Chicken Nuggets", "Onion Rings", "Salad", 
            "Cheese Sandwich", "Fish Sandwich", "Chicken Sandwich", "Hash Brown", "Toasted Bagels", 
            "Pineapple Sticks", "Chocolate Muffin", "Pancakes Syrup", "Hot Tea", "Coca Cola", 
            "Sprite", "Orange Juice", "Bottle of Water", "Oreo McFlurry", "Chocolate Shake", 
            "Strawberry Shake", "Vanilla Shake"};
        return names[index];
    }
    
    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // Creds: Dominic Doan
        jtxtHBurgers.setText("0");
        jtxtFrenchFries.setText("0");
        jtxtChickenNuggets.setText("0");
        jtxtOnionRings.setText("0");
        jtxtSalad.setText("0");
        jtxtCheeseSandwich.setText("0");
        jtxtFishSandwich.setText("0");
        jtxtChickenSandwich.setText("0");
        jtxtHashBrown.setText("0");
        jtxtToastedBagels.setText("0");
        jtxtPineappleSticks.setText("0");
        jtxtChocolateMuffin.setText("0");
        jtxtPancakesSyrup.setText("0");
        jtxtHotTea.setText("0");
        jtxtCocaCola.setText("0");
        jtxtSprite.setText("0");
        jtxtOrangeJuice.setText("0");
        jtxtBottleofWater.setText("0");
        jtxtOreoMcFlurry.setText("0");
        jtxtChocolateShake.setText("0");
        jtxtStrawberryShake.setText("0");
        jtxtVanillaShake.setText("0");
        jtxtPaymentMethod.setText(" ");
        
        //========================
        
        jtxtHBurgers.setEnabled(false);
        jtxtFrenchFries.setEnabled(false);
        jtxtChickenNuggets.setEnabled(false);
        jtxtOnionRings.setEnabled(false);
        jtxtSalad.setEnabled(false);
        jtxtCheeseSandwich.setEnabled(false);
        jtxtFishSandwich.setEnabled(false);
        jtxtChickenSandwich.setEnabled(false);
        jtxtHashBrown.setEnabled(false);
        jtxtToastedBagels.setEnabled(false);
        jtxtPineappleSticks.setEnabled(false);
        jtxtChocolateMuffin.setEnabled(false);
        jtxtPancakesSyrup.setEnabled(false);
        jtxtHotTea.setEnabled(false);
        jtxtCocaCola.setEnabled(false);
        jtxtSprite.setEnabled(false);
        jtxtOrangeJuice.setEnabled(false);
        jtxtBottleofWater.setEnabled(false);
        jtxtOreoMcFlurry.setEnabled(false);
        jtxtChocolateShake.setEnabled(false);
        jtxtStrawberryShake.setEnabled(false);
        jtxtVanillaShake.setEnabled(false);
        
        //========================
        
        jChkHBurgers.setSelected(false);
        jChkFrenchFries.setSelected(false);
        jChkChickenNuggets.setSelected(false);
        jChkOnionRings.setSelected(false);
        jChkSalad.setSelected(false);
        jChkCheeseSandwich.setSelected(false);
        jChkFishSandwich.setSelected(false);
        jChkChickenSandwich.setSelected(false);
        jChkHashBrown.setSelected(false);
        jChkToastedBagels.setSelected(false);
        jChkPineappleSticks.setSelected(false);
        jChkChocolateMuffin.setSelected(false);
        jChkPancakesSyrup.setSelected(false);
        jChkHotTea.setSelected(false);
        jChkCocaCola.setSelected(false);
        jChkSprite.setSelected(false);
        jChkOrangeJuice.setSelected(false);
        jChkBottleofWater.setSelected(false);
        jChkOreoMcFlurry.setSelected(false);
        jChkChocolateShake.setSelected(false);
        jChkStrawberryShake.setSelected(false);
        jChkVanillaShake.setSelected(false);
    }                                         

private JFrame frame;
    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // Creds: Dominic Doan
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit?", 
                "McJava's", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            // System.exit(0);
            LoginScreen LGS = new LoginScreen();
            LGS.show(); // Opens the Login screen
                    
            dispose(); // Closes the Fast Food ordering screen
        }
    }                                        

    private void jtxtChickenNuggetsActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  

    private void jtxtSaladKeyTyped(java.awt.event.KeyEvent evt) {                                   
        // Creds: Dominic Doan
        char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
        || (iNumber ==KeyEvent.VK_BACK_SPACE)
        || (iNumber ==KeyEvent.VK_DELETE)){
        evt.consume();
    }
    }                                  

    private void jtxtHBurgersActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void jtxtHBurgersKeyTyped(java.awt.event.KeyEvent evt) {                                      
        // Creds: Dominic Doan
        char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
        || (iNumber ==KeyEvent.VK_BACK_SPACE)
        || (iNumber ==KeyEvent.VK_DELETE)){
        evt.consume();
    }
    }                                     

    private void jtxtFrenchFriesKeyTyped(java.awt.event.KeyEvent evt) {                                         
        // Creds: Dominic Doan
        char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
        || (iNumber ==KeyEvent.VK_BACK_SPACE)
        || (iNumber ==KeyEvent.VK_DELETE)){
        evt.consume();
    }
    }                                        

    private void jtxtChickenNuggetsKeyTyped(java.awt.event.KeyEvent evt) {                                            
        // Creds: Dominic Doan
        char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
        || (iNumber ==KeyEvent.VK_BACK_SPACE)
        || (iNumber ==KeyEvent.VK_DELETE)){
        evt.consume();
    }
    }                                           

    private void jtxtOnionRingsKeyTyped(java.awt.event.KeyEvent evt) {                                        
        // Creds: Dominic Doan
        char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
        || (iNumber ==KeyEvent.VK_BACK_SPACE)
        || (iNumber ==KeyEvent.VK_DELETE)){
        evt.consume();
    }
    }                                       

    private void jtxtCheeseSandwichKeyTyped(java.awt.event.KeyEvent evt) {                                            
        // Creds: Dominic Doan
        char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
        || (iNumber ==KeyEvent.VK_BACK_SPACE)
        || (iNumber ==KeyEvent.VK_DELETE)){
        evt.consume();
    }
    }                                           

    private void jtxtFishSandwichKeyTyped(java.awt.event.KeyEvent evt) {                                          
        // Creds: Dominic Doan
        char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
        || (iNumber ==KeyEvent.VK_BACK_SPACE)
        || (iNumber ==KeyEvent.VK_DELETE)){
        evt.consume();
    }
    }                                         

    private void jtxtChickenSandwichKeyTyped(java.awt.event.KeyEvent evt) {                                             
        // Creds: Dominic Doan
        char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
        || (iNumber ==KeyEvent.VK_BACK_SPACE)
        || (iNumber ==KeyEvent.VK_DELETE)){
        evt.consume();
    }
    }                                            

    private void jtxtHashBrownKeyTyped(java.awt.event.KeyEvent evt) {                                       
        // Creds: Dominic Doan
        char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
        || (iNumber ==KeyEvent.VK_BACK_SPACE)
        || (iNumber ==KeyEvent.VK_DELETE)){
        evt.consume();
    }
    }                                      

    private void jtxtToastedBagelsKeyTyped(java.awt.event.KeyEvent evt) {                                           
        // Creds: Dominic Doan
        char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
        || (iNumber ==KeyEvent.VK_BACK_SPACE)
        || (iNumber ==KeyEvent.VK_DELETE)){
        evt.consume();
    }
    }                                          

    private void jtxtPineappleSticksKeyTyped(java.awt.event.KeyEvent evt) {                                             
        // Creds: Dominic Doan
        char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
        || (iNumber ==KeyEvent.VK_BACK_SPACE)
        || (iNumber ==KeyEvent.VK_DELETE)){
        evt.consume();
    }
    }                                            

    private void jtxtChocolateMuffinKeyTyped(java.awt.event.KeyEvent evt) {                                             
        // Creds: Dominic Doan
        char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
        || (iNumber ==KeyEvent.VK_BACK_SPACE)
        || (iNumber ==KeyEvent.VK_DELETE)){
        evt.consume();
    }
    }                                            

    private void jtxtPancakesSyrupKeyTyped(java.awt.event.KeyEvent evt) {                                           
        // Creds: Dominic Doan
        char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
        || (iNumber ==KeyEvent.VK_BACK_SPACE)
        || (iNumber ==KeyEvent.VK_DELETE)){
        evt.consume();
    }
    }                                          

    private void jtxtHotTeaKeyTyped(java.awt.event.KeyEvent evt) {                                    
        // Creds: Dominic Doan
        char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
        || (iNumber ==KeyEvent.VK_BACK_SPACE)
        || (iNumber ==KeyEvent.VK_DELETE)){
        evt.consume();
    }
    }                                   

    private void jtxtCocaColaKeyTyped(java.awt.event.KeyEvent evt) {                                      
        // Creds: Dominic Doan
        char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
        || (iNumber ==KeyEvent.VK_BACK_SPACE)
        || (iNumber ==KeyEvent.VK_DELETE)){
        evt.consume();
    }
    }                                     

    private void jtxtSpriteKeyTyped(java.awt.event.KeyEvent evt) {                                    
        // Creds: Dominic Doan
        char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
        || (iNumber ==KeyEvent.VK_BACK_SPACE)
        || (iNumber ==KeyEvent.VK_DELETE)){
        evt.consume();
    }
    }                                   

    private void jtxtOrangeJuiceKeyTyped(java.awt.event.KeyEvent evt) {                                         
        // Creds: Dominic Doan
        char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
        || (iNumber ==KeyEvent.VK_BACK_SPACE)
        || (iNumber ==KeyEvent.VK_DELETE)){
        evt.consume();
    }
    }                                        

    private void jtxtBottleofWaterKeyTyped(java.awt.event.KeyEvent evt) {                                           
        // Creds: Dominic Doan
        char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
        || (iNumber ==KeyEvent.VK_BACK_SPACE)
        || (iNumber ==KeyEvent.VK_DELETE)){
        evt.consume();
    }
    }                                          

    private void jtxtOreoMcFlurryKeyTyped(java.awt.event.KeyEvent evt) {                                          
        // Creds: Dominic Doan
        char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
        || (iNumber ==KeyEvent.VK_BACK_SPACE)
        || (iNumber ==KeyEvent.VK_DELETE)){
        evt.consume();
    }
    }                                         

    private void jtxtChocolateShakeKeyTyped(java.awt.event.KeyEvent evt) {                                            
        // Creds: Dominic Doan
        char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
        || (iNumber ==KeyEvent.VK_BACK_SPACE)
        || (iNumber ==KeyEvent.VK_DELETE)){
        evt.consume();
    }
    }                                           

    private void jtxtStrawberryShakeKeyTyped(java.awt.event.KeyEvent evt) {                                             
        // Creds: Dominic Doan
        char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
        || (iNumber ==KeyEvent.VK_BACK_SPACE)
        || (iNumber ==KeyEvent.VK_DELETE)){
        evt.consume();
    }
    }                                            

    private void jtxtVanillaShakeKeyTyped(java.awt.event.KeyEvent evt) {                                          
        // Creds: Dominic Doan
        char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
        || (iNumber ==KeyEvent.VK_BACK_SPACE)
        || (iNumber ==KeyEvent.VK_DELETE)){
        evt.consume();
    }
    }                                         

    private void jChkOnionRingsActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // Creds: Dominic Doan
        if (jChkOnionRings.isSelected())
        {
            jtxtOnionRings.setEnabled(true);
            jtxtOnionRings.requestFocus();
            jtxtOnionRings.setText("");
        }
        else
        {
            jtxtOnionRings.setEnabled(false);
            jtxtOnionRings.setText("0");
        }
    }                                              

    private void jChkFrenchFriesActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // Creds: Dominic Doan
        if (jChkFrenchFries.isSelected())
        {
            jtxtFrenchFries.setEnabled(true);
            jtxtFrenchFries.requestFocus();
            jtxtFrenchFries.setText("");
        }
        else
        {
            jtxtFrenchFries.setEnabled(false);
            jtxtFrenchFries.setText("0");
        }
    }                                               

    private void jChkFishSandwichActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // Creds: Dominic Doan
        if (jChkFishSandwich.isSelected())
        {
            jtxtFishSandwich.setEnabled(true);
            jtxtFishSandwich.requestFocus();
            jtxtFishSandwich.setText("");
        }
        else
        {
            jtxtFishSandwich.setEnabled(false);
            jtxtFishSandwich.setText("0");
        }
    }                                                

    private void jChkChickenSandwichActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // Creds: Dominic Doan
        if (jChkChickenSandwich.isSelected())
        {
            jtxtChickenSandwich.setEnabled(true);
            jtxtChickenSandwich.requestFocus();
            jtxtChickenSandwich.setText("");
        }
        else
        {
            jtxtChickenSandwich.setEnabled(false);
            jtxtChickenSandwich.setText("0");
        }
    }                                                   

    private void jChkHotTeaActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // Creds: Dominic Doan
        if (jChkHotTea.isSelected())
        {
            jtxtHotTea.setEnabled(true);
            jtxtHotTea.requestFocus();
            jtxtHotTea.setText("");
        }
        else
        {
            jtxtHotTea.setEnabled(false);
            jtxtHotTea.setText("0");
        }
    }                                          

    private void jChkCocaColaActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // Creds: Dominic Doan
        if (jChkCocaCola.isSelected())
        {
            jtxtCocaCola.setEnabled(true);
            jtxtCocaCola.requestFocus();
            jtxtCocaCola.setText("");
        }
        else
        {
            jtxtCocaCola.setEnabled(false);
            jtxtCocaCola.setText("0");
        }
    }                                            

    private void jChkSpriteActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // Creds: Dominic Doan
        if (jChkSprite.isSelected())
        {
            jtxtSprite.setEnabled(true);
            jtxtSprite.requestFocus();
            jtxtSprite.setText("");
        }
        else
        {
            jtxtSprite.setEnabled(false);
            jtxtSprite.setText("0");
        }
    }                                          

    private void jChkOrangeJuiceActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // Creds: Dominic Doan
        if (jChkOrangeJuice.isSelected())
        {
            jtxtOrangeJuice.setEnabled(true);
            jtxtOrangeJuice.requestFocus();
            jtxtOrangeJuice.setText("");
        }
        else
        {
            jtxtOrangeJuice.setEnabled(false);
            jtxtOrangeJuice.setText("0");
        }
    }                                               

    private void jChkChocolateShakeActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // Creds: Dominic Doan
        if (jChkChocolateShake.isSelected())
        {
            jtxtChocolateShake.setEnabled(true);
            jtxtChocolateShake.requestFocus();
            jtxtChocolateShake.setText("");
        }
        else
        {
            jtxtChocolateShake.setEnabled(false);
            jtxtChocolateShake.setText("0");
        }
    }                                                  

    private void jChkStrawberryShakeActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // Creds: Dominic Doan
        if (jChkStrawberryShake.isSelected())
        {
            jtxtStrawberryShake.setEnabled(true);
            jtxtStrawberryShake.requestFocus();
            jtxtStrawberryShake.setText("");
        }
        else
        {
            jtxtStrawberryShake.setEnabled(false);
            jtxtStrawberryShake.setText("0");
        }
    }                                                   

    private void jChkVanillaShakeActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // Creds: Dominic Doan
        if (jChkVanillaShake.isSelected())
        {
            jtxtVanillaShake.setEnabled(true);
            jtxtVanillaShake.requestFocus();
            jtxtVanillaShake.setText("");
        }
        else
        {
            jtxtVanillaShake.setEnabled(false);
            jtxtVanillaShake.setText("0");
        }
    }                                                

    private void jtxtPaymentMethodActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void jtxtCheeseSandwichActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }
    
    private void jtxtPaymentMethodKeyTyped(java.awt.event.KeyEvent evt) {                                           
        // Creds: Dominic Doan
        char iNumber = evt.getKeyChar();
        if (!(Character.isDigit(iNumber))
                && (iNumber != KeyEvent.VK_BACK_SPACE)
                && (iNumber != KeyEvent.VK_DELETE)
                && (iNumber != '.')) {
            evt.consume();
        }
        
        // Allow only 1 decimal point
        if (iNumber == '.' && jtxtPaymentMethod.getText().contains(".")) {
            evt.consume();
        }
        
        // Allow only 2 digits after the decimal point
        if (jtxtPaymentMethod.getText().contains(".")) {
            String s = jtxtPaymentMethod.getText();
            int index = s.indexOf('.');
            if (s.length() - index > 2) {
                evt.consume();
            }
        }
    }                                          

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FastFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FastFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FastFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FastFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FastFood().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel LogoMCJ;
    private javax.swing.JLabel SloganMCJ;
    private javax.swing.JLabel TitleMCJ;
    private javax.swing.JCheckBox jChkBottleofWater;
    private javax.swing.JCheckBox jChkCheeseSandwich;
    private javax.swing.JCheckBox jChkChickenNuggets;
    private javax.swing.JCheckBox jChkChickenSandwich;
    private javax.swing.JCheckBox jChkChocolateMuffin;
    private javax.swing.JCheckBox jChkChocolateShake;
    private javax.swing.JCheckBox jChkCocaCola;
    private javax.swing.JCheckBox jChkFishSandwich;
    private javax.swing.JCheckBox jChkFrenchFries;
    private javax.swing.JCheckBox jChkHBurgers;
    private javax.swing.JCheckBox jChkHashBrown;
    private javax.swing.JCheckBox jChkHotTea;
    private javax.swing.JCheckBox jChkOnionRings;
    private javax.swing.JCheckBox jChkOrangeJuice;
    private javax.swing.JCheckBox jChkOreoMcFlurry;
    private javax.swing.JCheckBox jChkPancakesSyrup;
    private javax.swing.JCheckBox jChkPineappleSticks;
    private javax.swing.JCheckBox jChkSalad;
    private javax.swing.JCheckBox jChkSprite;
    private javax.swing.JCheckBox jChkStrawberryShake;
    private javax.swing.JCheckBox jChkToastedBagels;
    private javax.swing.JCheckBox jChkVanillaShake;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnPlaceOrder;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JComboBox<String> jcmbPaymentMethod;
    private javax.swing.JLabel jlblAmountEntered;
    private javax.swing.JLabel jlblBevs;
    private javax.swing.JLabel jlblBevs_Menu;
    private javax.swing.JLabel jlblBottleOfWater_Cost;
    private javax.swing.JLabel jlblBottleOfWater_Display;
    private javax.swing.JLabel jlblCashOnly;
    private javax.swing.JLabel jlblCheeseSandwich_Cost;
    private javax.swing.JLabel jlblCheeseSandwich_Display;
    private javax.swing.JLabel jlblChickSandwich_Image;
    private javax.swing.JLabel jlblChickSandwich_Number;
    private javax.swing.JLabel jlblChickenNuggets_Cost;
    private javax.swing.JLabel jlblChickenNuggets_Display;
    private javax.swing.JLabel jlblChickenSandwich_Cost;
    private javax.swing.JLabel jlblChickenSandwich_Display;
    private javax.swing.JLabel jlblChocolateMuffin_Cost;
    private javax.swing.JLabel jlblChocolateMuffin_Display;
    private javax.swing.JLabel jlblChocolateShake_Cost;
    private javax.swing.JLabel jlblChocolateShake_Display;
    private javax.swing.JLabel jlblCocaCola_Cost;
    private javax.swing.JLabel jlblCocaCola_Display;
    private javax.swing.JLabel jlblDesserts;
    private javax.swing.JLabel jlblDesserts_Menu;
    private javax.swing.JLabel jlblFMV;
    private javax.swing.JLabel jlblFMV_Menu;
    private javax.swing.JLabel jlblFishSandwich_Cost;
    private javax.swing.JLabel jlblFishSandwich_Display;
    private javax.swing.JLabel jlblFrenchFries_Cost;
    private javax.swing.JLabel jlblFrenchFries_Display;
    private javax.swing.JLabel jlblHBurgers_Cost;
    private javax.swing.JLabel jlblHBurgers_Display;
    private javax.swing.JLabel jlblHashBrown_Cost;
    private javax.swing.JLabel jlblHashBrown_Display;
    private javax.swing.JLabel jlblHotTea_Cost;
    private javax.swing.JLabel jlblHotTea_Display;
    private javax.swing.JLabel jlblMcFlurry_Cost;
    private javax.swing.JLabel jlblMcFlurry_Display;
    private javax.swing.JLabel jlblNuggs_Image;
    private javax.swing.JLabel jlblNuggs_Number;
    private javax.swing.JLabel jlblOJ_Cost;
    private javax.swing.JLabel jlblOJ_Display;
    private javax.swing.JLabel jlblOnionRings_Cost;
    private javax.swing.JLabel jlblOnionRings_Display;
    private javax.swing.JLabel jlblOreoMCF_Image;
    private javax.swing.JLabel jlblOreoMCF_Number;
    private javax.swing.JLabel jlblPAStick_Image;
    private javax.swing.JLabel jlblPAStick_Number;
    private javax.swing.JLabel jlblPASticks_Cost;
    private javax.swing.JLabel jlblPASticks_Display;
    private javax.swing.JLabel jlblPancakes_Cost;
    private javax.swing.JLabel jlblPancakes_Display;
    private javax.swing.JLabel jlblPaymentMethod;
    private javax.swing.JLabel jlblSVanillaShake_Display;
    private javax.swing.JLabel jlblSalad_Cost;
    private javax.swing.JLabel jlblSalad_Display;
    private javax.swing.JLabel jlblSandwiches;
    private javax.swing.JLabel jlblSandwiches_Menu;
    private javax.swing.JLabel jlblShakes;
    private javax.swing.JLabel jlblShakes_Menu;
    private javax.swing.JLabel jlblSprite_Cost;
    private javax.swing.JLabel jlblSprite_Display;
    private javax.swing.JLabel jlblSprite_Image;
    private javax.swing.JLabel jlblSprite_Number;
    private javax.swing.JLabel jlblStrawberryShake_Cost;
    private javax.swing.JLabel jlblStrawberryShake_Display;
    private javax.swing.JLabel jlblToastedBagels_Cost;
    private javax.swing.JLabel jlblToastedBagels_Display;
    private javax.swing.JLabel jlblVS_Image;
    private javax.swing.JLabel jlblVS_Number;
    private javax.swing.JLabel jlblVanillaShake_Cost;
    private javax.swing.JPanel jpnlMCJ_CompanyName;
    private javax.swing.JPanel jpnlMainMenu;
    private javax.swing.JPanel jpnlPaymentMethod;
    private javax.swing.JPanel jpnlSelections;
    private javax.swing.JPanel jpnlUserMenu1;
    private javax.swing.JPanel jpnlUserMenu2;
    private javax.swing.JTextField jtxtBottleofWater;
    private javax.swing.JTextField jtxtCheeseSandwich;
    private javax.swing.JTextField jtxtChickenNuggets;
    private javax.swing.JTextField jtxtChickenSandwich;
    private javax.swing.JTextField jtxtChocolateMuffin;
    private javax.swing.JTextField jtxtChocolateShake;
    private javax.swing.JTextField jtxtCocaCola;
    private javax.swing.JTextField jtxtFishSandwich;
    private javax.swing.JTextField jtxtFrenchFries;
    private javax.swing.JTextField jtxtHBurgers;
    private javax.swing.JTextField jtxtHashBrown;
    private javax.swing.JTextField jtxtHotTea;
    private javax.swing.JTextField jtxtOnionRings;
    private javax.swing.JTextField jtxtOrangeJuice;
    private javax.swing.JTextField jtxtOreoMcFlurry;
    private javax.swing.JTextField jtxtPancakesSyrup;
    private javax.swing.JTextField jtxtPaymentMethod;
    private javax.swing.JTextField jtxtPineappleSticks;
    private javax.swing.JTextField jtxtSalad;
    private javax.swing.JTextField jtxtSprite;
    private javax.swing.JTextField jtxtStrawberryShake;
    private javax.swing.JTextField jtxtToastedBagels;
    private javax.swing.JTextField jtxtVanillaShake;
    // End of variables declaration                   
}
