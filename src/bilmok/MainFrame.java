
/*
 * MainFrame.java
 *
 * Created on 21.Şub.2011, 02:13:46
 */

package bilmok;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author Kadir YÜCEER
 */
public class MainFrame extends javax.swing.JFrame {

    //variables for votes
    private static short egeVotes;
    private static short hacettepeVotes;
    private static String last;
    public MainFrame() {
        initComponents();
        egeVotes = 0; hacettepeVotes = 0;
        last = new String();
        buttonGroup.add(egeRadioButton);
        buttonGroup.add(hacettepeRadioButton);
        buttonGroup.clearSelection();
        voteErrorLabel.setVisible(false);
        passwordErrorLabel.setVisible(false);
        passwordErrorLabel1.setVisible(false);
        passwordErrorLabel2.setVisible(false);
        confirmationDialog.pack();
        successDialog.pack();
        resultsDialog.pack();
        errorDialog.pack();
        reverseDialog.pack();
        closeDialog.pack();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        successDialog = new javax.swing.JDialog();
        successLabel = new javax.swing.JLabel();
        successCloseButton = new javax.swing.JButton();
        confirmationDialog = new javax.swing.JDialog();
        confirmationLabel = new javax.swing.JLabel();
        uniNameLabel = new javax.swing.JLabel();
        acceptButton = new javax.swing.JButton();
        declineButton = new javax.swing.JButton();
        resultsDialog = new javax.swing.JDialog();
        passwordLabel = new javax.swing.JLabel();
        passwordButton = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        egeLabel = new javax.swing.JLabel();
        hacettepeLabel = new javax.swing.JLabel();
        egeField = new javax.swing.JTextField();
        hacettepeField = new javax.swing.JTextField();
        resultsCloseButton = new javax.swing.JButton();
        passwordErrorLabel = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();
        totalField = new javax.swing.JTextField();
        errorDialog = new javax.swing.JDialog();
        errorField = new javax.swing.JLabel();
        errorCloseButton = new javax.swing.JButton();
        errorScrollPane = new javax.swing.JScrollPane();
        errorTextArea = new javax.swing.JTextArea();
        reverseDialog = new javax.swing.JDialog();
        reverseLabel = new javax.swing.JLabel();
        passwordField2 = new javax.swing.JPasswordField();
        reverseButton = new javax.swing.JButton();
        passwordErrorLabel1 = new javax.swing.JLabel();
        closeDialog = new javax.swing.JDialog();
        closelabel = new javax.swing.JLabel();
        passwordField3 = new javax.swing.JPasswordField();
        closeButton = new javax.swing.JButton();
        passwordErrorLabel2 = new javax.swing.JLabel();
        egeRadioButton = new javax.swing.JRadioButton();
        hacettepeRadioButton = new javax.swing.JRadioButton();
        voteButton = new javax.swing.JButton();
        voteLabel = new javax.swing.JLabel();
        voteErrorLabel = new javax.swing.JLabel();
        endVoteButton = new javax.swing.JButton();
        logoLabel = new javax.swing.JLabel();
        reverseDialogButton = new javax.swing.JButton();

        successDialog.setBounds(new java.awt.Rectangle(350, 350, 0, 0));
        successDialog.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        successDialog.setResizable(false);

        successLabel.setFont(new java.awt.Font("Tahoma", 0, 12));
        successLabel.setText("Oy verme işlemi başarıyla gerçekleştirildi.");

        successCloseButton.setFont(new java.awt.Font("Tahoma", 0, 12));
        successCloseButton.setText("Kapat");
        successCloseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                successCloseButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout successDialogLayout = new javax.swing.GroupLayout(successDialog.getContentPane());
        successDialog.getContentPane().setLayout(successDialogLayout);
        successDialogLayout.setHorizontalGroup(
            successDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(successDialogLayout.createSequentialGroup()
                .addGroup(successDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(successDialogLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(successLabel))
                    .addGroup(successDialogLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(successCloseButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        successDialogLayout.setVerticalGroup(
            successDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(successDialogLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(successLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(successCloseButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        confirmationDialog.setBounds(new java.awt.Rectangle(300, 300, 0, 0));
        confirmationDialog.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        confirmationDialog.setResizable(false);

        confirmationLabel.setFont(new java.awt.Font("Tahoma", 0, 12));
        confirmationLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        confirmationLabel.setText("Oy vermek istediğiniz üniversite:");

        uniNameLabel.setFont(new java.awt.Font("Tahoma", 1, 12));
        uniNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        acceptButton.setFont(new java.awt.Font("Tahoma", 0, 12));
        acceptButton.setText("Onaylıyorum");
        acceptButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                acceptButtonMouseClicked(evt);
            }
        });

        declineButton.setFont(new java.awt.Font("Tahoma", 0, 12));
        declineButton.setText("Oylama sayfasına geri dön");
        declineButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                declineButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout confirmationDialogLayout = new javax.swing.GroupLayout(confirmationDialog.getContentPane());
        confirmationDialog.getContentPane().setLayout(confirmationDialogLayout);
        confirmationDialogLayout.setHorizontalGroup(
            confirmationDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confirmationDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(acceptButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(declineButton)
                .addContainerGap())
            .addGroup(confirmationDialogLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(confirmationDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(uniNameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(confirmationLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(126, 126, 126))
        );
        confirmationDialogLayout.setVerticalGroup(
            confirmationDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confirmationDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(confirmationLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uniNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(confirmationDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acceptButton)
                    .addComponent(declineButton))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        resultsDialog.setBounds(new java.awt.Rectangle(300, 300, 0, 0));
        resultsDialog.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        resultsDialog.setResizable(false);

        passwordLabel.setFont(new java.awt.Font("Tahoma", 0, 12));
        passwordLabel.setText("Şifreyi giriniz:");

        passwordButton.setFont(new java.awt.Font("Tahoma", 0, 12));
        passwordButton.setText("Sonuçları göster");
        passwordButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordButtonMouseClicked(evt);
            }
        });

        passwordField.setFont(new java.awt.Font("Tahoma", 0, 12));
        passwordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFieldFocusGained(evt);
            }
        });
        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordFieldKeyPressed(evt);
            }
        });

        egeLabel.setFont(new java.awt.Font("Tahoma", 0, 24));
        egeLabel.setText("Ege Üniversitesi:");

        hacettepeLabel.setFont(new java.awt.Font("Tahoma", 0, 24));
        hacettepeLabel.setText("Hacettepe Üniversitesi:");

        egeField.setEditable(false);
        egeField.setFont(new java.awt.Font("Tahoma", 0, 24));
        egeField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        egeField.setText("00");

        hacettepeField.setEditable(false);
        hacettepeField.setFont(new java.awt.Font("Tahoma", 0, 24));
        hacettepeField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        hacettepeField.setText("00");

        resultsCloseButton.setFont(new java.awt.Font("Tahoma", 0, 12));
        resultsCloseButton.setText("Kapat");
        resultsCloseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resultsCloseButtonMouseClicked(evt);
            }
        });

        passwordErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 12));
        passwordErrorLabel.setText("Şifreyi hatalı girdiniz!");

        totalLabel.setFont(new java.awt.Font("Tahoma", 0, 24));
        totalLabel.setText("Toplam oy sayısı:");

        totalField.setEditable(false);
        totalField.setFont(new java.awt.Font("Tahoma", 0, 24));
        totalField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        totalField.setText("00");

        javax.swing.GroupLayout resultsDialogLayout = new javax.swing.GroupLayout(resultsDialog.getContentPane());
        resultsDialog.getContentPane().setLayout(resultsDialogLayout);
        resultsDialogLayout.setHorizontalGroup(
            resultsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultsDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(resultsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(resultsDialogLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(resultsCloseButton))
                    .addGroup(resultsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(passwordErrorLabel)
                        .addGroup(resultsDialogLayout.createSequentialGroup()
                            .addComponent(passwordLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(passwordField))
                        .addComponent(passwordButton))
                    .addGroup(resultsDialogLayout.createSequentialGroup()
                        .addGroup(resultsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hacettepeLabel)
                            .addComponent(egeLabel)
                            .addComponent(totalLabel))
                        .addGap(18, 18, 18)
                        .addGroup(resultsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(totalField)
                            .addComponent(hacettepeField)
                            .addComponent(egeField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        resultsDialogLayout.setVerticalGroup(
            resultsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultsDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(resultsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(resultsDialogLayout.createSequentialGroup()
                        .addComponent(egeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hacettepeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(resultsDialogLayout.createSequentialGroup()
                        .addGroup(resultsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordLabel)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(passwordButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordErrorLabel)
                        .addGap(24, 24, 24)
                        .addComponent(egeLabel)
                        .addGap(17, 17, 17)
                        .addComponent(hacettepeLabel)
                        .addGap(17, 17, 17)
                        .addComponent(totalLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resultsCloseButton)
                .addGap(25, 25, 25))
        );

        errorDialog.setBounds(new java.awt.Rectangle(350, 350, 0, 0));

        errorField.setFont(new java.awt.Font("Tahoma", 0, 12));
        errorField.setText("Dosyaya yazarken aşağıdaki hata ile karşılaşıldı!");

        errorCloseButton.setFont(new java.awt.Font("Tahoma", 0, 12));
        errorCloseButton.setText("Kapat");
        errorCloseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                errorCloseButtonMouseClicked(evt);
            }
        });

        errorTextArea.setColumns(20);
        errorTextArea.setRows(5);
        errorScrollPane.setViewportView(errorTextArea);

        javax.swing.GroupLayout errorDialogLayout = new javax.swing.GroupLayout(errorDialog.getContentPane());
        errorDialog.getContentPane().setLayout(errorDialogLayout);
        errorDialogLayout.setHorizontalGroup(
            errorDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(errorDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(errorDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(errorDialogLayout.createSequentialGroup()
                        .addComponent(errorField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, errorDialogLayout.createSequentialGroup()
                        .addComponent(errorCloseButton)
                        .addGap(96, 96, 96))
                    .addGroup(errorDialogLayout.createSequentialGroup()
                        .addComponent(errorScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        errorDialogLayout.setVerticalGroup(
            errorDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(errorDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(errorField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(errorCloseButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        reverseDialog.setBounds(new java.awt.Rectangle(350, 350, 0, 0));
        reverseDialog.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);

        reverseLabel.setFont(new java.awt.Font("Tahoma", 0, 12));
        reverseLabel.setText("Şifreyi giriniz:");

        passwordField2.setFont(new java.awt.Font("Tahoma", 0, 12));
        passwordField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordField2FocusGained(evt);
            }
        });
        passwordField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordField2KeyPressed(evt);
            }
        });

        reverseButton.setFont(new java.awt.Font("Tahoma", 0, 12));
        reverseButton.setText("Son oyu geri al");
        reverseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reverseButtonMouseClicked(evt);
            }
        });

        passwordErrorLabel1.setFont(new java.awt.Font("Tahoma", 1, 12));
        passwordErrorLabel1.setText("Şifreyi hatalı girdiniz!");

        javax.swing.GroupLayout reverseDialogLayout = new javax.swing.GroupLayout(reverseDialog.getContentPane());
        reverseDialog.getContentPane().setLayout(reverseDialogLayout);
        reverseDialogLayout.setHorizontalGroup(
            reverseDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reverseDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(reverseDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(reverseDialogLayout.createSequentialGroup()
                        .addComponent(reverseLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordField2, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                    .addComponent(reverseButton))
                .addContainerGap())
            .addGroup(reverseDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(reverseDialogLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(passwordErrorLabel1)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        reverseDialogLayout.setVerticalGroup(
            reverseDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reverseDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(reverseDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reverseLabel)
                    .addComponent(passwordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(reverseButton)
                .addContainerGap())
            .addGroup(reverseDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(reverseDialogLayout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(passwordErrorLabel1)
                    .addContainerGap(39, Short.MAX_VALUE)))
        );

        closeDialog.setBounds(new java.awt.Rectangle(350, 350, 0, 0));
        closeDialog.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);

        closelabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        closelabel.setText("Şifreyi giriniz:");

        passwordField3.setFont(new java.awt.Font("Tahoma", 0, 12));
        passwordField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordField3FocusGained(evt);
            }
        });
        passwordField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordField3KeyPressed(evt);
            }
        });

        closeButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        closeButton.setText("Programı kapat");
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
        });

        passwordErrorLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        passwordErrorLabel2.setText("Şifreyi hatalı girdiniz!");

        javax.swing.GroupLayout closeDialogLayout = new javax.swing.GroupLayout(closeDialog.getContentPane());
        closeDialog.getContentPane().setLayout(closeDialogLayout);
        closeDialogLayout.setHorizontalGroup(
            closeDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(closeDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(closeDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(closeDialogLayout.createSequentialGroup()
                        .addComponent(closelabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordField3, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                    .addComponent(closeButton))
                .addContainerGap())
            .addGroup(closeDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(closeDialogLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(passwordErrorLabel2)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        closeDialogLayout.setVerticalGroup(
            closeDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(closeDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(closeDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(closelabel)
                    .addComponent(passwordField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(closeButton)
                .addContainerGap())
            .addGroup(closeDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(closeDialogLayout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(passwordErrorLabel2)
                    .addContainerGap(39, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Bilmok7Tepe Oylama Programı");
        setBounds(new java.awt.Rectangle(200, 200, 0, 0));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        egeRadioButton.setFont(new java.awt.Font("Tahoma", 0, 12));
        egeRadioButton.setText("Ege Üniversitesi");
        egeRadioButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                egeRadioButtonMouseClicked(evt);
            }
        });

        hacettepeRadioButton.setFont(new java.awt.Font("Tahoma", 0, 12));
        hacettepeRadioButton.setText("Hacettepe Üniversitesi");
        hacettepeRadioButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hacettepeRadioButtonMouseClicked(evt);
            }
        });

        voteButton.setFont(new java.awt.Font("Tahoma", 0, 12));
        voteButton.setText("Oy Ver");
        voteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voteButtonMouseClicked(evt);
            }
        });

        voteLabel.setFont(new java.awt.Font("Tahoma", 0, 12));
        voteLabel.setText("Oy vermek istediğiniz üniversiteyi seçiniz:");

        voteErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 12));
        voteErrorLabel.setText("Lütfen bir seçim yapınız!");

        endVoteButton.setFont(new java.awt.Font("Tahoma", 0, 12));
        endVoteButton.setText("Oylamayı Sonlandır");
        endVoteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                endVoteButtonMouseClicked(evt);
            }
        });

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bilmok/resources/bilmok7logo.jpg"))); // NOI18N

        reverseDialogButton.setFont(new java.awt.Font("Tahoma", 0, 12));
        reverseDialogButton.setText("Son oyu geri al");
        reverseDialogButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reverseDialogButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hacettepeRadioButton)
                    .addComponent(egeRadioButton)
                    .addComponent(voteLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(voteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(voteErrorLabel))
                    .addComponent(logoLabel)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(reverseDialogButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                        .addComponent(endVoteButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(voteLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(egeRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hacettepeRadioButton)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voteButton)
                    .addComponent(voteErrorLabel))
                .addGap(18, 18, 18)
                .addComponent(logoLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(endVoteButton)
                    .addComponent(reverseDialogButton))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voteButtonMouseClicked
        if(buttonGroup.getSelection() == null) //the user selects none
            voteErrorLabel.setVisible(true);
        else{
            if(egeRadioButton.isSelected())
                uniNameLabel.setText("Ege Üniversitesi");
            else
                uniNameLabel.setText("Hacettepe Üniversitesi");
            confirmationDialog.setVisible(true); //ask for confirmation
        }
    }//GEN-LAST:event_voteButtonMouseClicked

    private void egeRadioButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_egeRadioButtonMouseClicked
        voteErrorLabel.setVisible(false);
    }//GEN-LAST:event_egeRadioButtonMouseClicked

    private void hacettepeRadioButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hacettepeRadioButtonMouseClicked
        voteErrorLabel.setVisible(false);
    }//GEN-LAST:event_hacettepeRadioButtonMouseClicked

    private void endVoteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_endVoteButtonMouseClicked
        resultsDialog.setVisible(true);
    }//GEN-LAST:event_endVoteButtonMouseClicked

    private void acceptButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acceptButtonMouseClicked
        if(uniNameLabel.getText().equals("Ege Üniversitesi")){
            egeVotes++;
            last = "ege";
        }
        else{
            hacettepeVotes++;
            last = "hacettepe";
        }
        InputStream in;
        try {
            in = new FileInputStream("1.wav");
        AudioStream as = new AudioStream(in);
        AudioPlayer.player.start(as);
        } catch (Exception ex) {
            System.out.println("Error reading audio file!\n");
        }
        successDialog.setVisible(true);
    }//GEN-LAST:event_acceptButtonMouseClicked

    private void declineButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_declineButtonMouseClicked
        confirmationDialog.setVisible(false);
    }//GEN-LAST:event_declineButtonMouseClicked

    private void successCloseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_successCloseButtonMouseClicked
        successDialog.setVisible(false);
        confirmationDialog.setVisible(false);
        buttonGroup.clearSelection();
    }//GEN-LAST:event_successCloseButtonMouseClicked

    private void passwordButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordButtonMouseClicked
        String pass = new String(passwordField.getPassword());
        if(pass.equals("123")){
            passwordField.setText("");
            try {
                FileWriter fw = new FileWriter("results.txt");
                fw.write("Ege Üniversitesi\t"+Short.toString(egeVotes)
                        +"\nHacettepe Üniversitesi\t"+Short.toString(hacettepeVotes));
                fw.flush();
                fw.close();
            } catch (IOException ex) {
                errorTextArea.setText(ex.toString());
                errorDialog.setVisible(true);
            }
            egeField.setText(Short.toString(egeVotes));
            hacettepeField.setText(Short.toString(hacettepeVotes));
            totalField.setText(Integer.toString(egeVotes+hacettepeVotes));
        }
        else
            passwordErrorLabel.setVisible(true);
    }//GEN-LAST:event_passwordButtonMouseClicked

    private void passwordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusGained
        passwordErrorLabel.setVisible(false);
    }//GEN-LAST:event_passwordFieldFocusGained

    private void resultsCloseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultsCloseButtonMouseClicked
        resultsDialog.setVisible(false);
    }//GEN-LAST:event_resultsCloseButtonMouseClicked

    private void errorCloseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_errorCloseButtonMouseClicked
        errorDialog.setVisible(false);
    }//GEN-LAST:event_errorCloseButtonMouseClicked

    private void passwordField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordField2FocusGained
        passwordErrorLabel1.setVisible(false);
    }//GEN-LAST:event_passwordField2FocusGained

    private void reverseDialogButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reverseDialogButtonMouseClicked
        reverseDialog.setVisible(true);
    }//GEN-LAST:event_reverseDialogButtonMouseClicked

    private void reverseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reverseButtonMouseClicked
        String pass = new String(passwordField2.getPassword());
        if(pass.equals("123")){
            passwordField2.setText("");
            if(last.equals("ege"))
                if(egeVotes > 0)
                    egeVotes--;
            else
                if(hacettepeVotes > 0)
                    hacettepeVotes--;
            reverseDialog.setVisible(false);
        }else{
            passwordErrorLabel1.setVisible(true);
        }
    }//GEN-LAST:event_reverseButtonMouseClicked

    private void passwordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyPressed
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
            String pass = new String(passwordField.getPassword());
            if(pass.equals("123")){
                passwordField.setText("");
                try {
                    FileWriter fw = new FileWriter("results.txt");
                    fw.write("Ege Üniversitesi\t"+Short.toString(egeVotes)
                            +"\r\nHacettepe Üniversitesi\t"+Short.toString(hacettepeVotes));
                    fw.flush();
                    fw.close();
                } catch (IOException ex) {
                    errorTextArea.setText(ex.toString());
                    errorDialog.setVisible(true);
                }
                egeField.setText(Short.toString(egeVotes));
                hacettepeField.setText(Short.toString(hacettepeVotes));
                totalField.setText(Integer.toString(egeVotes+hacettepeVotes));
            }
            else
                passwordErrorLabel.setVisible(true);
        }
    }//GEN-LAST:event_passwordFieldKeyPressed

    private void passwordField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordField2KeyPressed
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
            String pass = new String(passwordField2.getPassword());
            if(pass.equals("123")){
                passwordField2.setText("");
                if(last.equals("ege"))
                    if(egeVotes > 0)
                        egeVotes--;
                else
                    if(hacettepeVotes > 0)
                        hacettepeVotes--;
                reverseDialog.setVisible(false);
            }else{
                passwordErrorLabel1.setVisible(true);
            }
        }
    }//GEN-LAST:event_passwordField2KeyPressed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        closeDialog.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void passwordField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordField3FocusGained
        passwordErrorLabel2.setVisible(false);
    }//GEN-LAST:event_passwordField3FocusGained

    private void passwordField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordField3KeyPressed
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
            String pass = new String(passwordField3.getPassword());
            if(pass.equals("123")){
                System.exit(0);
            }else{
                passwordErrorLabel2.setVisible(true);
            }
        }
    }//GEN-LAST:event_passwordField3KeyPressed

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked
        String pass = new String(passwordField3.getPassword());
            if(pass.equals("123")){
                System.exit(0);
            }else{
                passwordErrorLabel2.setVisible(true);
            }
    }//GEN-LAST:event_closeButtonMouseClicked
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptButton;
    private static javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JButton closeButton;
    private javax.swing.JDialog closeDialog;
    private javax.swing.JLabel closelabel;
    private javax.swing.JDialog confirmationDialog;
    private javax.swing.JLabel confirmationLabel;
    private javax.swing.JButton declineButton;
    private javax.swing.JTextField egeField;
    private javax.swing.JLabel egeLabel;
    private static javax.swing.JRadioButton egeRadioButton;
    private javax.swing.JButton endVoteButton;
    private javax.swing.JButton errorCloseButton;
    private javax.swing.JDialog errorDialog;
    private javax.swing.JLabel errorField;
    private javax.swing.JScrollPane errorScrollPane;
    private javax.swing.JTextArea errorTextArea;
    private javax.swing.JTextField hacettepeField;
    private javax.swing.JLabel hacettepeLabel;
    private static javax.swing.JRadioButton hacettepeRadioButton;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JButton passwordButton;
    private javax.swing.JLabel passwordErrorLabel;
    private javax.swing.JLabel passwordErrorLabel1;
    private javax.swing.JLabel passwordErrorLabel2;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JPasswordField passwordField2;
    private javax.swing.JPasswordField passwordField3;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton resultsCloseButton;
    private javax.swing.JDialog resultsDialog;
    private javax.swing.JButton reverseButton;
    private javax.swing.JDialog reverseDialog;
    private javax.swing.JButton reverseDialogButton;
    private javax.swing.JLabel reverseLabel;
    private javax.swing.JButton successCloseButton;
    private javax.swing.JDialog successDialog;
    private javax.swing.JLabel successLabel;
    private javax.swing.JTextField totalField;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JLabel uniNameLabel;
    private javax.swing.JButton voteButton;
    private javax.swing.JLabel voteErrorLabel;
    private javax.swing.JLabel voteLabel;
    // End of variables declaration//GEN-END:variables
}
