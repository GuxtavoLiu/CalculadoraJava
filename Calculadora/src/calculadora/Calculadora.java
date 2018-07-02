package calculadora;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import util.Dividir;
import util.Multiplicar;
import util.Somar;
import util.Subtrair;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField CampoValor1;
	private JTextField CampoValor2;
	private JTextField campoResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		CampoValor1 = new JTextField();
		CampoValor1.setBounds(12, 12, 114, 19);
		contentPane.add(CampoValor1);
		CampoValor1.setColumns(10);

		CampoValor2 = new JTextField();
		CampoValor2.setBounds(138, 12, 114, 19);
		contentPane.add(CampoValor2);
		CampoValor2.setColumns(10);

		JButton btnSomar = new JButton("+");
		btnSomar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Somar somar = new Somar();
				Double resultado = somar.somar(Double.parseDouble(CampoValor1.getText()),
						Double.parseDouble(CampoValor2.getText()));

				campoResultado.setText(resultado.toString());
			}
		});
		btnSomar.setBounds(12, 50, 50, 25);
		contentPane.add(btnSomar);

		JButton btnSubtrair = new JButton("-");
		btnSubtrair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Subtrair subtrair = new Subtrair();
				Double resultado = subtrair.subtrair(Double.parseDouble(CampoValor1.getText()),
						Double.parseDouble(CampoValor2.getText()));

				campoResultado.setText(resultado.toString());
			}
		});
		btnSubtrair.setBounds(12, 79, 50, 25);
		contentPane.add(btnSubtrair);

		JButton btnDividir = new JButton("/");
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dividir dividir = new Dividir();
				Double resultado = dividir.dividir(Double.parseDouble(CampoValor1.getText()),
						Double.parseDouble(CampoValor2.getText()));
				campoResultado.setText(resultado.toString());
			}
		});
		btnDividir.setBounds(12, 116, 50, 25);
		contentPane.add(btnDividir);

		JButton btnMultiplicar = new JButton("*");
		btnMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Multiplicar multiplicar = new Multiplicar();

				Double resultado = multiplicar.multiplicar(Double.parseDouble(CampoValor1.getText()),
						Double.parseDouble(CampoValor2.getText()));
				campoResultado.setText(resultado.toString());
			}
		});
		btnMultiplicar.setBounds(12, 156, 50, 25);
		contentPane.add(btnMultiplicar);

		campoResultado = new JTextField();
		campoResultado.setBounds(12, 193, 136, 67);
		contentPane.add(campoResultado);
		campoResultado.setColumns(10);
	}
}
