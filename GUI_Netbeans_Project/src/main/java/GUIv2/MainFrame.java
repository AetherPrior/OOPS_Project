/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIv2;
import java.awt.CardLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.ImageIcon;
import javax.imageio.ImageIO;
/**
 *
 * @author shrey
 */
public class MainFrame extends javax.swing.JFrame {
    String prev="initPanel";
    boolean isInTrip=false;
    
    /*
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }
    private void callInitFrame()
    {
        CardLayout cards=(CardLayout)mainPanel.getLayout();
        cards.show(mainPanel, "initPanel");
    }
    private void callSignInPanel()
    {
        err_signin_label.setVisible(false);
        user_field.setText("");
        pass_field.setText("");
        CardLayout cards=(CardLayout)mainPanel.getLayout();
        cards.show(mainPanel, "signinPanel");
    }
    private void callRegisterPanel()
    {
        err_reg_label.setVisible(false);
        name_text.setText("");
        email_text.setText("");
        pass_reg_field.setText("");
        retypepass_reg_field.setText("");
        CardLayout cards=(CardLayout)mainPanel.getLayout();
        cards.show(mainPanel, "registerPanel");
    }
    private void callHomePanel()
    {
        username_label.setText(getUsername());
        wallet_status_label.setText(getWallet());
        int x=Integer.parseInt(getWallet());
        if(isInTrip())
        {
            deets_home_button.setVisible(true);
            home_book_button.setEnabled(false); 
            home_err_label.setText("Trip ongoing...");
            home_err_label.setVisible(true);
        }
        else if(x<=300)
        {
            deets_home_button.setVisible(false);
            home_book_button.setEnabled(false); 
            home_err_label.setText("Less Money in Wallet. Please Add Money...");
            home_err_label.setVisible(true);
        }
        else
        {
            deets_home_button.setVisible(false);
            home_book_button.setEnabled(true); 
            home_err_label.setVisible(false);            
        }
        CardLayout cards=(CardLayout)mainPanel.getLayout();
        cards.show(mainPanel, "homePanel");
    }
    private void callHomePanel(String msg)
    {
        username_label.setText(getUsername());
        wallet_status_label.setText(getWallet());
        int x=Integer.parseInt(getWallet());
        if(isInTrip())
        {
            deets_home_button.setVisible(true);
            home_book_button.setEnabled(false); 
            home_err_label.setText(msg);
            home_err_label.setVisible(true);
        }
        else if(x<=300)
        {
            deets_home_button.setVisible(false);
            home_book_button.setEnabled(false); 
            home_err_label.setText(msg);
            home_err_label.setVisible(true);
        }
        else
        {
            deets_home_button.setVisible(false);
            home_book_button.setEnabled(true); 
            home_err_label.setText(msg);
            home_err_label.setVisible(true);            
        }
        CardLayout cards=(CardLayout)mainPanel.getLayout();
        cards.show(mainPanel, "homePanel");
    }
    
    private void callWalletPanel()
    {
        err_wallet_label.setVisible(false);
        bal_wallet_field.setText(getWallet());
        toAdd_wallet_field.setText("0");
        pass_wallet_field.setText("");
        CardLayout cards=(CardLayout)mainPanel.getLayout();
        cards.show(mainPanel, "walletPanel");        
    }
    
    private void callCabBookPanel()
    {
        err_book_label.setVisible(false);
        CardLayout cards=(CardLayout)mainPanel.getLayout();
        cards.show(mainPanel, "cabBookPanel");        
    }
    
    private void callConfirmPanel()
    {
        if(isInTrip())
        {
            cabname_confirm_label.setVisible(true);
            cabname_confirm_field.setText("CABBI");
            cabname_confirm_field.setVisible(true);
            time_confirm_field.setText("80 days");
            cost_confirm_field.setText("10000000 USD");
            confirm_confirm_button.setVisible(false);
            err_confirm_label.setText("Tripping..");
            err_confirm_label.setVisible(true);
        }
        else
        {
            cabname_confirm_label.setVisible(false);
            cabname_confirm_field.setVisible(false);
            time_confirm_field.setText("80 days");
            cost_confirm_field.setText("10000000 USD");    
            confirm_confirm_button.setVisible(true);
            err_confirm_label.setVisible(false);
        }
        
//        cabname_confirm_field.setText("CABBI");
//        time_confirm_field.setText("180 days");
//        cost_confirm_field.setText("10000000 USD");
        CardLayout cards=(CardLayout)mainPanel.getLayout();
        cards.show(mainPanel, "confirmPanel");        
    }
    
    private boolean isInTrip()
    {
        return isInTrip;
    }
    private String getUsername()
    {
        return "Shreyam";
    }
    private String getWallet()
    {
        return "600";
    }
    private boolean isRegValid()
    {
        return true;
    }
    private boolean cabAvail()
    {
        return true;
    }
    private boolean canBook()
    {
        return true;
    }
    private String[] getPlaces()
    {
        String arr[]=new String[5];
        arr[0]="A";
        arr[1]="B";
        arr[2]="C";
        arr[3]="D";
        arr[4]="E";
        return arr;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        initPanel = new javax.swing.JPanel();
        ExistingUserButton = new javax.swing.JButton();
        NewUserButton = new javax.swing.JButton();
        img = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sideImg = new javax.swing.JLabel();
        BufferedImage i2=null;
        try{i2=ImageIO.read(new File("D:\\shrey\\Documents\\JavaProjs\\OOPS_Project\\GUI_Netbeans_Project\\src\\main\\java\\GUIv2\\bg1.png"));}catch(Exception e){System.out.println("Failed import");}
        Image scaled2=i2.getScaledInstance(700,700,Image.SCALE_SMOOTH);
        ImageIcon icon2=new ImageIcon(scaled2);
        sideImg.setIcon(icon2);
        sideImg.setVisible(true);
        signinPanel = new javax.swing.JPanel();
        user_field = new javax.swing.JTextField();
        user_label = new javax.swing.JLabel();
        pass_label = new javax.swing.JLabel();
        pass_field = new javax.swing.JPasswordField();
        signIn = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        err_signin_label = new javax.swing.JLabel();
        registerPanel = new javax.swing.JPanel();
        name_text = new javax.swing.JTextField();
        email_text = new javax.swing.JTextField();
        name_label = new javax.swing.JLabel();
        email_label = new javax.swing.JLabel();
        pass_reg_label = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pass_reg_field = new javax.swing.JPasswordField();
        retypepass_reg_field = new javax.swing.JPasswordField();
        reg_button = new javax.swing.JButton();
        reset_reg_button = new javax.swing.JButton();
        err_reg_label = new javax.swing.JLabel();
        confirmPanel = new javax.swing.JPanel();
        cabname_confirm_label = new javax.swing.JLabel();
        cabname_confirm_field = new javax.swing.JTextField();
        time_confirm_label = new javax.swing.JLabel();
        cost_confirm_label = new javax.swing.JLabel();
        time_confirm_field = new javax.swing.JTextField();
        cost_confirm_field = new javax.swing.JTextField();
        home_confirm_button = new javax.swing.JButton();
        wallet_confirm_button = new javax.swing.JButton();
        confirm_confirm_button = new javax.swing.JButton();
        bal_confirm_panel = new javax.swing.JLabel();
        bal_confirm_field = new javax.swing.JTextField();
        err_confirm_label = new javax.swing.JLabel();
        homePanel = new javax.swing.JPanel();
        home_book_button = new javax.swing.JButton();
        add_home_button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        username_label = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        wallet_status_label = new javax.swing.JTextField();
        home_err_label = new javax.swing.JLabel();
        deets_home_button = new javax.swing.JButton();
        walletPanel = new javax.swing.JPanel();
        bal_wallet_label = new javax.swing.JLabel();
        bal_wallet_field = new javax.swing.JTextField();
        toAdd_wallet_label = new javax.swing.JLabel();
        toAdd_wallet_field = new javax.swing.JTextField();
        pass_wallet_label = new javax.swing.JLabel();
        pass_wallet_field = new javax.swing.JPasswordField();
        add_wallet_button = new javax.swing.JButton();
        home_wallet_button = new javax.swing.JButton();
        err_wallet_label = new javax.swing.JLabel();
        cabBookPanel = new javax.swing.JPanel();
        from_combobox = new javax.swing.JComboBox<>();
        to_combobox = new javax.swing.JComboBox<>();
        from_book_label = new javax.swing.JLabel();
        to_book_label = new javax.swing.JLabel();
        book_book_button = new javax.swing.JButton();
        home_bookPanel_button = new javax.swing.JButton();
        err_book_label = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        sign_out_menuitem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(new java.awt.CardLayout());

        initPanel.setLayout(null);

        ExistingUserButton.setBackground(new java.awt.Color(0, 255, 255));
        ExistingUserButton.setForeground(new java.awt.Color(0, 0, 102));
        ExistingUserButton.setText("<html><b><font size=4 face=\"Comic Sans MS\">Existing User</font></b></html>");
        ExistingUserButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ExistingUserButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExistingUserButtonMouseClicked(evt);
            }
        });
        ExistingUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExistingUserButtonActionPerformed(evt);
            }
        });
        initPanel.add(ExistingUserButton);
        ExistingUserButton.setBounds(120, 100, 215, 80);

        NewUserButton.setBackground(new java.awt.Color(0, 255, 255));
        NewUserButton.setForeground(new java.awt.Color(0, 0, 102));
        NewUserButton.setText("<html><b><font size=4 face=\"Comic Sans MS\">New User</font></b></html>");
        NewUserButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NewUserButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NewUserButtonMouseClicked(evt);
            }
        });
        initPanel.add(NewUserButton);
        NewUserButton.setBounds(120, 200, 215, 80);

        img.setBackground(new java.awt.Color(255, 255, 255));
        img.setForeground(java.awt.SystemColor.controlHighlight);
        BufferedImage i=null;
        try{i=ImageIO.read(new File("D:\\shrey\\Documents\\JavaProjs\\OOPS_Project\\GUI_Netbeans_Project\\src\\main\\java\\GUIv2\\uberola.png"));}catch(Exception e){System.out.println("Failed import");}
        Image scaled=i.getScaledInstance(131,60,Image.SCALE_SMOOTH);
        ImageIcon icon=new ImageIcon(scaled);
        img.setIcon(icon);
        img.setVisible(true);
        initPanel.add(img);
        img.setBounds(10, 6, 131, 60);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("<html><b><font size=4 face=\"Bookman Old Style\" color=\"White\">Book a ride without breaking a stride!!!!!</font></b></html>");
        initPanel.add(jLabel3);
        jLabel3.setBounds(147, 0, 300, 66);

        sideImg.setFocusable(false);
        initPanel.add(sideImg);
        sideImg.setBounds(0, 1, 460, 340);

        mainPanel.add(initPanel, "initPanel");

        user_label.setText("Username");

        pass_label.setText("Password");

        signIn.setText("Sign in");
        signIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signInMouseClicked(evt);
            }
        });

        reset.setText("Reset");
        reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetMouseClicked(evt);
            }
        });

        err_signin_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        err_signin_label.setText("ERROR");
        err_signin_label.setVisible(false);

        javax.swing.GroupLayout signinPanelLayout = new javax.swing.GroupLayout(signinPanel);
        signinPanel.setLayout(signinPanelLayout);
        signinPanelLayout.setHorizontalGroup(
            signinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signinPanelLayout.createSequentialGroup()
                .addGroup(signinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(signinPanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(signinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(user_label)
                            .addComponent(pass_label))
                        .addGap(26, 26, 26)
                        .addGroup(signinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(user_field)
                            .addComponent(pass_field, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
                    .addGroup(signinPanelLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(signIn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(signinPanelLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(err_signin_label, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        signinPanelLayout.setVerticalGroup(
            signinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signinPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(signinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user_field, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user_label, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(signinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass_label, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pass_field, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(signinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signIn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(err_signin_label, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainPanel.add(signinPanel, "signinPanel");

        name_label.setText("Username");

        email_label.setText("Email");

        pass_reg_label.setText("Password");

        jLabel4.setText("Retype Password");

        reg_button.setText("Register");
        reg_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reg_buttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reg_buttonMouseEntered(evt);
            }
        });

        reset_reg_button.setText("Reset");
        reset_reg_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reset_reg_buttonMouseClicked(evt);
            }
        });

        err_reg_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        err_reg_label.setText("ERROR");
        err_reg_label.setVisible(false);

        javax.swing.GroupLayout registerPanelLayout = new javax.swing.GroupLayout(registerPanel);
        registerPanel.setLayout(registerPanelLayout);
        registerPanelLayout.setHorizontalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(email_label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(name_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                        .addComponent(pass_reg_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(28, 28, 28)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(err_reg_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pass_reg_field)
                    .addComponent(name_text)
                    .addComponent(email_text)
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addComponent(reg_button)
                        .addGap(18, 18, 18)
                        .addComponent(reset_reg_button)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(retypepass_reg_field))
                .addGap(68, 68, 68))
        );
        registerPanelLayout.setVerticalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name_label))
                .addGap(15, 15, 15)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email_label)
                    .addComponent(email_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass_reg_label)
                    .addComponent(pass_reg_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(retypepass_reg_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(reg_button, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(reset_reg_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(err_reg_label)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        mainPanel.add(registerPanel, "registerPanel");

        cabname_confirm_label.setText("Cabbie");

        cabname_confirm_field.setEditable(false);

        time_confirm_label.setText("Approx duration of trip");

        cost_confirm_label.setText("Cost of Trip");

        time_confirm_field.setEditable(false);

        cost_confirm_field.setEditable(false);

        home_confirm_button.setText("Home");
        home_confirm_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home_confirm_buttonMouseClicked(evt);
            }
        });

        wallet_confirm_button.setText("Wallet");
        wallet_confirm_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wallet_confirm_buttonMouseClicked(evt);
            }
        });

        confirm_confirm_button.setText("Confirm");
        confirm_confirm_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirm_confirm_buttonMouseClicked(evt);
            }
        });

        bal_confirm_panel.setText("Wallet Balance");
        bal_confirm_panel.setVisible(false);

        bal_confirm_field.setEditable(false);
        bal_confirm_field.setVisible(false);

        err_confirm_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        err_confirm_label.setText("ERROR");
        err_confirm_label.setVisible(false);

        javax.swing.GroupLayout confirmPanelLayout = new javax.swing.GroupLayout(confirmPanel);
        confirmPanel.setLayout(confirmPanelLayout);
        confirmPanelLayout.setHorizontalGroup(
            confirmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confirmPanelLayout.createSequentialGroup()
                .addGroup(confirmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(confirmPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(confirmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(confirmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(time_confirm_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cabname_confirm_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(cost_confirm_label, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(home_confirm_button, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bal_confirm_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(confirmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(confirmPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(confirmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(bal_confirm_field, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                    .addComponent(cabname_confirm_field, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(time_confirm_field, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cost_confirm_field, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(confirmPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(confirm_confirm_button, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(wallet_confirm_button, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(confirmPanelLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(err_confirm_label, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        confirmPanelLayout.setVerticalGroup(
            confirmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confirmPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(confirmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cabname_confirm_label, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cabname_confirm_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(confirmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(time_confirm_label, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(time_confirm_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(confirmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cost_confirm_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cost_confirm_label, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(confirmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bal_confirm_panel)
                    .addComponent(bal_confirm_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(confirmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(home_confirm_button)
                    .addComponent(confirm_confirm_button)
                    .addComponent(wallet_confirm_button))
                .addGap(35, 35, 35)
                .addComponent(err_confirm_label)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        mainPanel.add(confirmPanel, "confirmPanel");

        home_book_button.setText("Book Cab");
        home_book_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home_book_buttonMouseClicked(evt);
            }
        });
        home_book_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_book_buttonActionPerformed(evt);
            }
        });

        add_home_button.setText("Add Money");
        add_home_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_home_buttonMouseClicked(evt);
            }
        });

        jLabel1.setText("User");

        username_label.setEditable(false);

        jLabel2.setText("Wallet");

        wallet_status_label.setEditable(false);

        home_err_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home_err_label.setText("MoneyProblems");
        home_err_label.setVisible(false);

        deets_home_button.setText("Check Details");
        deets_home_button.setVisible(false);
        deets_home_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deets_home_buttonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deets_home_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(add_home_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(home_book_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homePanelLayout.createSequentialGroup()
                .addGap(0, 101, Short.MAX_VALUE)
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homePanelLayout.createSequentialGroup()
                        .addComponent(home_err_label, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homePanelLayout.createSequentialGroup()
                        .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(wallet_status_label, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(username_label, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(127, 127, 127))))
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username_label))
                .addGap(21, 21, 21)
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wallet_status_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(home_err_label)
                .addGap(18, 18, 18)
                .addComponent(home_book_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(add_home_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deets_home_button)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        mainPanel.add(homePanel, "homePanel");

        bal_wallet_label.setText("Balance");

        bal_wallet_field.setEditable(false);

        toAdd_wallet_label.setText("Money to add");

        toAdd_wallet_field.setText("0");

        pass_wallet_label.setText("Password");

        add_wallet_button.setText("Add Money");
        add_wallet_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_wallet_buttonMouseClicked(evt);
            }
        });

        home_wallet_button.setText("Home");
        home_wallet_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home_wallet_buttonMouseClicked(evt);
            }
        });

        err_wallet_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        err_wallet_label.setText("Error");
        err_wallet_label.setVisible(false);

        javax.swing.GroupLayout walletPanelLayout = new javax.swing.GroupLayout(walletPanel);
        walletPanel.setLayout(walletPanelLayout);
        walletPanelLayout.setHorizontalGroup(
            walletPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(walletPanelLayout.createSequentialGroup()
                .addGroup(walletPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(walletPanelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(walletPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(toAdd_wallet_label, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pass_wallet_label, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bal_wallet_label, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(walletPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bal_wallet_field, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(walletPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(toAdd_wallet_field, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(pass_wallet_field))))
                    .addGroup(walletPanelLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(add_wallet_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(home_wallet_button, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52))
            .addGroup(walletPanelLayout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(err_wallet_label, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        walletPanelLayout.setVerticalGroup(
            walletPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(walletPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(walletPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bal_wallet_label, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bal_wallet_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(walletPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toAdd_wallet_label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toAdd_wallet_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(walletPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass_wallet_label, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pass_wallet_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(walletPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(add_wallet_button, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(home_wallet_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(err_wallet_label, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        mainPanel.add(walletPanel, "walletPanel");

        from_combobox.setModel(new javax.swing.DefaultComboBoxModel(getPlaces()));
        from_combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                from_comboboxActionPerformed(evt);
            }
        });

        to_combobox.setModel(new javax.swing.DefaultComboBoxModel(getPlaces()));

        from_book_label.setText("From");

        to_book_label.setText("To");

        book_book_button.setText("Book");
        book_book_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                book_book_buttonMouseClicked(evt);
            }
        });

        home_bookPanel_button.setText("Home");
        home_bookPanel_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home_bookPanel_buttonMouseClicked(evt);
            }
        });

        err_book_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        err_book_label.setText("ERROR");
        err_book_label.setVisible(false);

        javax.swing.GroupLayout cabBookPanelLayout = new javax.swing.GroupLayout(cabBookPanel);
        cabBookPanel.setLayout(cabBookPanelLayout);
        cabBookPanelLayout.setHorizontalGroup(
            cabBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cabBookPanelLayout.createSequentialGroup()
                .addGroup(cabBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cabBookPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(cabBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(from_book_label, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(to_book_label, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(cabBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(to_combobox, 0, 106, Short.MAX_VALUE)
                            .addComponent(from_combobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(cabBookPanelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(book_book_button, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(home_bookPanel_button, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cabBookPanelLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(err_book_label, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        cabBookPanelLayout.setVerticalGroup(
            cabBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cabBookPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(cabBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(from_book_label, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(from_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cabBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(to_book_label, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(to_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(cabBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(home_bookPanel_button, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(book_book_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addComponent(err_book_label, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        mainPanel.add(cabBookPanel, "cabBookPanel");

        jMenuBar1.setBackground(java.awt.SystemColor.controlHighlight);
        jMenuBar1.setForeground(java.awt.SystemColor.controlShadow);

        jMenu1.setText("File");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });

        jMenuItem1.setText("Home");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem1MousePressed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        sign_out_menuitem.setText("Sign Out");
        sign_out_menuitem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sign_out_menuitemMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sign_out_menuitemMousePressed(evt);
            }
        });
        jMenu1.add(sign_out_menuitem);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sign_out_menuitemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sign_out_menuitemMouseClicked
//        
    }//GEN-LAST:event_sign_out_menuitemMouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1MouseClicked

    private void sign_out_menuitemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sign_out_menuitemMousePressed
        callInitFrame();
//        System.out.println("clicked");
//        CardLayout cards=(CardLayout)mainPanel.getLayout();
//        err_reg_label.setVisible(false);
//        err_signin_label.setVisible(false);
//        cards.show(mainPanel, "initPanel");
    }//GEN-LAST:event_sign_out_menuitemMousePressed

    private void reset_reg_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reset_reg_buttonMouseClicked
        name_text.setText("");
        email_text.setText("");
        pass_reg_field.setText("");
        retypepass_reg_field.setText("");
    }//GEN-LAST:event_reset_reg_buttonMouseClicked

    private void resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMouseClicked
        user_field.setText("");
        pass_field.setText("");
    }//GEN-LAST:event_resetMouseClicked

    private void signInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInMouseClicked
        String str=user_field.getText();
//        System.out.println("Clickedddddd");
//        callHomePanel();
//        System.out.println(str);
        if(!str.equals("Shreyam"))
        {
            err_signin_label.setText("Wrong user");
            err_signin_label.setVisible(true);
//            CardLayout cards=(CardLayout)mainPanel.getLayout();
//            errLabel.setText("Hiii !Shreyam");
//            prev="signinPanel";
//            cards.show(mainPanel, "errPanel");
        }
        else
        {
            callHomePanel("Welcome!!!!");            
        }
    }//GEN-LAST:event_signInMouseClicked

    private void reg_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reg_buttonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_reg_buttonMouseEntered

    
    private void reg_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reg_buttonMouseClicked

        if(!isRegValid())
        {
            err_reg_label.setText("Errorrrrr registering");
            err_reg_label.setVisible(true);            
        }
        else
        {
//            err_reg_label.setVisible(true);
//            err_reg_label.setText("Success Registering. Redirecting to Home...");
//            System.out.println("reg_button_clicked");
//            try{Thread.sleep(10000);}catch(Exception e){}
            
            callHomePanel("Registered You. Welcome!!!!");
        }
    }//GEN-LAST:event_reg_buttonMouseClicked

    private void jMenuItem1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MousePressed
        //if(User!=NULL)
        callHomePanel();
    }//GEN-LAST:event_jMenuItem1MousePressed

    private void add_wallet_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_wallet_buttonMouseClicked
        try{
            double toAdd = Double.parseDouble(toAdd_wallet_field.getText());
            if(toAdd<=0)
            {
                throw new Exception();
            }
            String pass=String.valueOf(pass_wallet_field.getPassword());
            if(pass.equals("password"))
            {
                callHomePanel("Money Added");
            }
            else
            {
                err_wallet_label.setText("PASSWORD WRONG");
                err_wallet_label.setVisible(true);
            }
        }
        catch(Exception e)
        {
            err_wallet_label.setText("Please enter valid money");  
            err_wallet_label.setVisible(true);
        }
    }//GEN-LAST:event_add_wallet_buttonMouseClicked

    private void home_wallet_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_wallet_buttonMouseClicked
        callHomePanel();
    }//GEN-LAST:event_home_wallet_buttonMouseClicked

    private void from_comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_from_comboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_from_comboboxActionPerformed

    private void add_home_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_home_buttonMouseClicked
        callWalletPanel();
    }//GEN-LAST:event_add_home_buttonMouseClicked

    private void home_book_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_book_buttonMouseClicked
        if(home_book_button.isEnabled())
        callCabBookPanel();
        else
        {
            
        }
    }//GEN-LAST:event_home_book_buttonMouseClicked

    private void deets_home_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deets_home_buttonMouseClicked
        callConfirmPanel();
    }//GEN-LAST:event_deets_home_buttonMouseClicked

    private void home_confirm_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_confirm_buttonMouseClicked
        callHomePanel();
    }//GEN-LAST:event_home_confirm_buttonMouseClicked

    private void wallet_confirm_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wallet_confirm_buttonMouseClicked
        callWalletPanel();
    }//GEN-LAST:event_wallet_confirm_buttonMouseClicked

    private void home_book_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_book_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_home_book_buttonActionPerformed

    private void home_bookPanel_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_bookPanel_buttonMouseClicked
        callHomePanel();
    }//GEN-LAST:event_home_bookPanel_buttonMouseClicked

    private void book_book_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_book_book_buttonMouseClicked
        String src=(String)from_combobox.getSelectedItem();
        String dest=(String)to_combobox.getSelectedItem();
        if(src.equals(dest))
        {
            err_book_label.setText("Please choose different src and dest!!");
            err_book_label.setVisible(true);
            return;
        }
        else
        {
            callConfirmPanel();
        }
    }//GEN-LAST:event_book_book_buttonMouseClicked

    private void confirm_confirm_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirm_confirm_buttonMouseClicked
        if(cabAvail())
        {
            callConfirmPanel();
        }
        else
        {
            err_confirm_label.setText("No cabs pls");
            err_confirm_label.setVisible(true);
            return;
        }
        if(canBook())
        {
            isInTrip=true;
            callConfirmPanel();
//            callHomePanel("Cab Booked. CHeck deets");
        }
        else
        {
            err_confirm_label.setText("Error");
            err_confirm_label.setVisible(true);
        }
    }//GEN-LAST:event_confirm_confirm_buttonMouseClicked

    private void NewUserButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewUserButtonMouseClicked
        callRegisterPanel();
        //        CardLayout cards=(CardLayout)mainPanel.getLayout();
        //        cards.show(mainPanel, "registerPanel");
    }//GEN-LAST:event_NewUserButtonMouseClicked

    private void ExistingUserButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExistingUserButtonMouseClicked
        callSignInPanel();
        //        CardLayout cards=(CardLayout)mainPanel.getLayout();
        //        cards.show(mainPanel, "signinPanel");
    }//GEN-LAST:event_ExistingUserButtonMouseClicked

    private void ExistingUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExistingUserButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExistingUserButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExistingUserButton;
    private javax.swing.JButton NewUserButton;
    private javax.swing.JButton add_home_button;
    private javax.swing.JButton add_wallet_button;
    private javax.swing.JTextField bal_confirm_field;
    private javax.swing.JLabel bal_confirm_panel;
    private javax.swing.JTextField bal_wallet_field;
    private javax.swing.JLabel bal_wallet_label;
    private javax.swing.JButton book_book_button;
    private javax.swing.JPanel cabBookPanel;
    private javax.swing.JTextField cabname_confirm_field;
    private javax.swing.JLabel cabname_confirm_label;
    private javax.swing.JPanel confirmPanel;
    private javax.swing.JButton confirm_confirm_button;
    private javax.swing.JTextField cost_confirm_field;
    private javax.swing.JLabel cost_confirm_label;
    private javax.swing.JButton deets_home_button;
    private javax.swing.JLabel email_label;
    private javax.swing.JTextField email_text;
    private javax.swing.JLabel err_book_label;
    private javax.swing.JLabel err_confirm_label;
    private javax.swing.JLabel err_reg_label;
    private javax.swing.JLabel err_signin_label;
    private javax.swing.JLabel err_wallet_label;
    private javax.swing.JLabel from_book_label;
    private javax.swing.JComboBox<String> from_combobox;
    private javax.swing.JPanel homePanel;
    private javax.swing.JButton home_bookPanel_button;
    private javax.swing.JButton home_book_button;
    private javax.swing.JButton home_confirm_button;
    private javax.swing.JLabel home_err_label;
    private javax.swing.JButton home_wallet_button;
    private javax.swing.JLabel img;
    private javax.swing.JPanel initPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel name_label;
    private javax.swing.JTextField name_text;
    private javax.swing.JPasswordField pass_field;
    private javax.swing.JLabel pass_label;
    private javax.swing.JPasswordField pass_reg_field;
    private javax.swing.JLabel pass_reg_label;
    private javax.swing.JPasswordField pass_wallet_field;
    private javax.swing.JLabel pass_wallet_label;
    private javax.swing.JButton reg_button;
    private javax.swing.JPanel registerPanel;
    private javax.swing.JButton reset;
    private javax.swing.JButton reset_reg_button;
    private javax.swing.JPasswordField retypepass_reg_field;
    private javax.swing.JLabel sideImg;
    private javax.swing.JButton signIn;
    private javax.swing.JMenuItem sign_out_menuitem;
    private javax.swing.JPanel signinPanel;
    private javax.swing.JTextField time_confirm_field;
    private javax.swing.JLabel time_confirm_label;
    private javax.swing.JTextField toAdd_wallet_field;
    private javax.swing.JLabel toAdd_wallet_label;
    private javax.swing.JLabel to_book_label;
    private javax.swing.JComboBox<String> to_combobox;
    private javax.swing.JTextField user_field;
    private javax.swing.JLabel user_label;
    private javax.swing.JTextField username_label;
    private javax.swing.JPanel walletPanel;
    private javax.swing.JButton wallet_confirm_button;
    private javax.swing.JTextField wallet_status_label;
    // End of variables declaration//GEN-END:variables
}
