import java.awt.Color;
import java.awt.Container;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//import java.sql.Array;
//import java.util.Arrays;
import java.util.Calendar;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class GUIBJS extends JApplet {
	public String urkunde;
	public static String sname;
	
	
	
	
	private static final long serialVersionUID = 1L;
	// Anfang Attribute
	
	private DefaultComboBoxModel<String> jComboBox1Model = new DefaultComboBoxModel<String>();
	private JComboBox<String> jComboBox1 = new JComboBox<String>(jComboBox1Model);
	
	private DefaultComboBoxModel<String> jComboBox2Model = new DefaultComboBoxModel<String>();
	private JComboBox<String> jComboBox2 = new JComboBox<String>(jComboBox2Model);
	
	private JLabel jLabel1 = new JLabel();
	private JLabel jLabel2 = new JLabel();
	private JLabel jLabel3 = new JLabel();
	private JLabel jLabel4 = new JLabel();
	private JLabel jLabel5 = new JLabel();
	private JLabel jLabel6 = new JLabel();
	private JLabel jLabel7 = new JLabel();
	private JLabel jLabel8 = new JLabel();
	private JLabel jLabel10 = new JLabel();
	private JLabel jLabel11 = new JLabel();
	private JLabel jLabel12 = new JLabel();
	private JLabel jLabel13 = new JLabel();
	private JLabel jLabel14 = new JLabel();
	private JLabel jLabel15 = new JLabel();
	
	private JTextField jTextField1 = new JTextField();
	private JTextField jTextField2 = new JTextField();
	private JTextField jTextField3 = new JTextField();
	private JTextField jTextField5 = new JTextField();
	private JTextField jTextField6 = new JTextField();
	private JTextField jTextField8 = new JTextField();
	
	private JButton jButton1 = new JButton();
	private JButton jButton2 = new JButton();
	private JButton jButton3 = new JButton();
	private JButton jButton4 = new JButton();
	private JButton jButton5 = new JButton();
	
	private JSeparator jSeparator1 = new JSeparator();
	private JSeparator jSeparator2 = new JSeparator();
	private JSeparator jSeparator3 = new JSeparator();
	
	// Ende Attribute

	public GUIBJS() {
		this.init();
	}

	public void init() {

		Container cp = getContentPane();
		cp.setLayout(null);
		cp.setBounds(0, 0, 934, 506);

		jComboBox1.setModel(jComboBox1Model);
		jComboBox1.setBounds(168, 104, 89, 25);
		cp.add(jComboBox1);
		
		jComboBox2.setModel(jComboBox2Model);
		jComboBox2.setBounds(168, 144, 209, 25);
		cp.add(jComboBox2);
		
		jLabel1.setBounds(24, 16, 634, 28);
		jLabel1.setText("Bundesjugendspiele Auswertung der Blüchergrundschule in Wiesbaden");
		jLabel1.setFont(new Font("Dialog", Font.BOLD, 18));
		cp.add(jLabel1);

		jLabel2.setBounds(16, 64, 180, 25);
		jLabel2.setText("Daten des/der Schüler/in");
		jLabel2.setFont(new Font("Dialog", Font.BOLD, 15));
		cp.add(jLabel2);

		jLabel3.setBounds(40, 104, 51, 25);
		jLabel3.setText("Klasse: ");
		cp.add(jLabel3);

		jLabel4.setBounds(40, 144, 122, 25);
		jLabel4.setText("Vor- und Nachname: ");
		cp.add(jLabel4);

		jLabel5.setBounds(16, 216, 83, 22);
		jLabel5.setText("Disziplinen");
		jLabel5.setFont(new Font("Dialog", Font.BOLD, 15));
		cp.add(jLabel5);

		jLabel6.setBounds(32, 256, 81, 25);
		jLabel6.setText("75 m (in sek):");
		cp.add(jLabel6);

		jLabel7.setBounds(32, 304, 155, 19);
		jLabel7.setText("Ballwurf 80 g (Weite in m): ");
		cp.add(jLabel7);

		jLabel8.setBounds(32, 344, 155, 25);
		jLabel8.setText("Weitsprung (in m):");
		cp.add(jLabel8);

		jLabel10.setBounds(264, 264, 62, 20);
		jLabel10.setText("Sekunden");
		cp.add(jLabel10);

		jLabel11.setBounds(264, 304, 35, 19);
		jLabel11.setText("Meter");
		cp.add(jLabel11);

		jLabel12.setBounds(264, 344, 35, 19);
		jLabel12.setText("Meter");
		cp.add(jLabel12);

		jLabel13.setBounds(424, 216, 123, 31);
		jLabel13.setText("erreichte Punkte");
		jLabel13.setFont(new Font("Dialog", Font.BOLD, 15));
		cp.add(jLabel13);

		jLabel14.setBounds(560, 264, 146, 31);
		jLabel14.setText("Gesamtpunktzahl");
		jLabel14.setOpaque(false);
		jLabel14.setFont(new Font("Dialog", Font.BOLD, 16));
		cp.add(jLabel14);
		
		jLabel15.setBounds(576, 304, 97, 40);
		jLabel15.setEnabled(true);
		cp.add(jLabel15);
		
		jTextField1.setBounds(448, 264, 62, 20);
		jTextField1.setEditable(false);
		cp.add(jTextField1);

		jTextField2.setBounds(448, 304, 62, 20);
		jTextField2.setEditable(false);
		cp.add(jTextField2);

		jTextField3.setBounds(448, 344, 62, 20);
		jTextField3.setEditable(false);
		cp.add(jTextField3);

		jTextField5.setBounds(192, 264, 62, 20);
		cp.add(jTextField5);

		jTextField6.setBounds(192, 304, 62, 20);
		cp.add(jTextField6);

		jTextField8.setBounds(192, 344, 62, 20);
		cp.add(jTextField8);
		
		jButton1.setBounds(728, 328, 153, 49);
		jButton1.setText("Auswerten der Urkunde");
		jButton1.setMargin(new Insets(2, 2, 2, 2));
		jButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton1_ActionPerformed(evt);
			}
		});
		jButton1.setBackground(new Color(0xEEEEEE));
		jButton1.setForeground(Color.GREEN);
		cp.add(jButton1);
		
		jButton2.setBounds(728, 256, 153, 49);
		jButton2.setText("Punktzahl berechnen ");
		jButton2.setMargin(new Insets(2, 2, 2, 2));
		jButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton2_ActionPerformed(evt);
			}
		});
		jButton2.setForeground(Color.GREEN);
		cp.add(jButton2);
		
		jButton3.setBounds(344, 264, 65, 25);
		jButton3.setText("Löschen");
		jButton3.setMargin(new Insets(2, 2, 2, 2));
		jButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton3_ActionPerformed(evt);
			}
		});
		jButton3.setBackground(new Color(0xEEEEEE));
		jButton3.setForeground(Color.RED);
		cp.add(jButton3);

		jButton4.setBounds(344, 304, 65, 25);
		jButton4.setText("Löschen");
		jButton4.setMargin(new Insets(2, 2, 2, 2));
		jButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton4_ActionPerformed(evt);
			}
		});
		jButton4.setBackground(new Color(0xEEEEEE));
		jButton4.setForeground(Color.RED);
		cp.add(jButton4);

		jButton5.setBounds(344, 344, 65, 25);
		jButton5.setText("Löschen");
		jButton5.setMargin(new Insets(2, 2, 2, 2));
		jButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton5_ActionPerformed(evt);
			}
		});
		jButton5.setBackground(new Color(0xEEEEEE));
		jButton5.setForeground(Color.RED);
		cp.add(jButton5);

		jSeparator3.setBounds(0, 40, 923, 2);
		cp.add(jSeparator3);

		jSeparator1.setBounds(0, 176, 923, 2);
		cp.add(jSeparator1);

		jSeparator2.setBounds(0, 424, 923, 2);
		cp.add(jSeparator2);
	}

	// Anfang Methoden
	public void jButton3_ActionPerformed(ActionEvent evt) {
		jTextField5.setText("");
		jTextField1.setText("");
		jLabel15.setText("");
	}

	public void jButton4_ActionPerformed(ActionEvent evt) {
		jTextField6.setText("");
		jTextField2.setText("");
		jLabel15.setText("");
	}

	public void jButton5_ActionPerformed(ActionEvent evt) {
		jTextField8.setText("");
		jTextField3.setText("");
		jLabel15.setText("");
	}

	public void jButton1_ActionPerformed(ActionEvent evt) {
//		JOptionPane.showMessageDialog(null, "Der/Die Schüler/in erhält eine " + urkunde + ".", "Urkundentyp",
//				JOptionPane.PLAIN_MESSAGE);
		Document doc = new Document();
		try {
			PdfWriter.getInstance(doc, new FileOutputStream("Report.pdf"));
			doc.open();
			doc.add(new Paragraph(jLabel15.getText().toString()));
			doc.close();
						
			try {
			     if (Desktop.isDesktopSupported()) {
			       Desktop.getDesktop().open(new File("D:\\Schule\\Eclipse\\Blücherschule\\bin\\Report.pdf"));

			     }
			   } catch (IOException ioe) {
			     ioe.printStackTrace();
			  }
		} catch (FileNotFoundException | DocumentException e) {
			e.printStackTrace();
		}
		
		
		
	}

	public void jButton2_ActionPerformed(ActionEvent evt) {
		boolean gJunge;
		int geschlecht = SQL_Abfragen.geschlecht;
		if (geschlecht == 1) {
			gJunge = true;
		} else {
			gJunge = false;
		}
		try {
			SQL_Abfragen.SQL_Abfrage();
			int year = SQL_Abfragen.jahrgang;
			int age = Calendar.getInstance().get(Calendar.YEAR) - year;

			double sekundenSprint, wurfDistanz, punkteSprint, sprungDistanz, punkteSprung, punkteWurf;
			
			sekundenSprint = Double.parseDouble(jTextField5.getText());
			sprungDistanz = Double.parseDouble(jTextField8.getText());
			wurfDistanz = Double.parseDouble(jTextField6.getText());
			
			double[] werte = Berechnung.berechnung(sekundenSprint,sprungDistanz,wurfDistanz,gJunge);
			
			punkteSprint = werte[0];  
			punkteSprung = werte[1];
			punkteWurf = werte[2];
			
			long longValue = Math.round(punkteSprint) + Math.round(punkteSprung) + Math.round(punkteWurf);
			int punkteGes = (int) longValue;
			
			jTextField1.setText(String.valueOf(Math.round(punkteSprint)));
			jTextField3.setText(String.valueOf(Math.round(punkteSprung)));
			jTextField2.setText(String.valueOf(Math.round(punkteWurf)));
			
			jLabel15.setText("Punkte: " + punkteGes);
			
			

			if (gJunge == true) {
				if (age == 8) {
					if (punkteGes >= 450 && punkteGes < 575) {
						urkunde = "Siegerurkunde";
					} else {
						if (punkteGes >= 575) {
							urkunde = "Ehrenurkunde";
						} else {
							urkunde = "Teilnehmerurkunde";
						}
					}
				} else if (age == 9) {
					if (punkteGes >= 525 && punkteGes < 675) {
						urkunde = "Siegerurkunde";
					} else {
						if (punkteGes >= 675) {
							urkunde = "Ehrenurkunde";
						} else {
							urkunde = "Teilnehmerurkunde";
						}
					}

				} else if (age == 10) {
					if (punkteGes >= 600 && punkteGes < 775) {
						urkunde = "Siegerurkunde";
					} else {
						if (punkteGes >= 775) {
							urkunde = "Ehrenurkunde";
						} else {
							urkunde = "Teilnehmerurkunde";
						}
					}

				} else if (age == 11) {
					if (punkteGes >= 675 && punkteGes < 875) {
						urkunde = "Siegerurkunde";
					} else {
						if (punkteGes >= 875) {
							urkunde = "Ehrenurkunde";
						} else {
							urkunde = "Teilnehmerurkunde";
						}
					}

				} else {
					JOptionPane.showMessageDialog(null, "Ungültiges Alter", "Achtung!", JOptionPane.PLAIN_MESSAGE);
				}
			} else {
				if (age == 8) {
					if (punkteGes >= 475 && punkteGes < 625) {
						urkunde = "Siegerurkunde";
					} else {
						if (punkteGes >= 625) {
							urkunde = "Ehrenurkunde";
						} else {
							urkunde = "Teilnehmerurkunde";
						}
					}
				} else if (age == 9) {
					if (punkteGes >= 550 && punkteGes < 725) {
						urkunde = "Siegerurkunde";
					} else {
						if (punkteGes >= 725) {
							urkunde = "Ehrenurkunde";
						} else {
							urkunde = "Teilnehmerurkunde";
						}
					}

				} else if (age == 10) {
					if (punkteGes >= 625 && punkteGes < 825) {
						urkunde = "Siegerurkunde";
					} else {
						if (punkteGes >= 825) {
							urkunde = "Ehrenurkunde";
						} else {
							urkunde = "Teilnehmerurkunde";
						}
					}

				} else if (age == 11) {
					if (punkteGes >= 700 && punkteGes < 900) {
						urkunde = "Siegerurkunde";
					} else {
						if (punkteGes >= 875) {
							urkunde = "Ehrenurkunde";
						} else {
							urkunde = "Teilnehmerurkunde";
						}
					}

				} else {
					JOptionPane.showMessageDialog(null, "Ungültiges Alter", "Achtung!", JOptionPane.PLAIN_MESSAGE);
				}
			}

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

	}

	// Ende Methoden

} // end of class GUIBJS1
