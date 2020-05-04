package aplicacao_swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import fachada.Fachada;

public class TelaCadastroVeiculos {

	private JFrame frmCadastroDeVeiculo;
	private JLabel label1;
	private JTextField textField;
	private JButton button2;
	private JLabel label2;
	private JLabel lblNumero;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					TelaCadastroPessoa window = new TelaCadastroPessoa();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public TelaCadastroVeiculos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCadastroDeVeiculo = new JFrame();
		frmCadastroDeVeiculo.setTitle("Cadastro de Veiculo");
		frmCadastroDeVeiculo.setBounds(100, 100, 309, 175);
		frmCadastroDeVeiculo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmCadastroDeVeiculo.getContentPane().setLayout(null);
		
		label1 = new JLabel("Placa:");
		label1.setBounds(25, 11, 46, 14);
		frmCadastroDeVeiculo.getContentPane().add(label1);
		
		textField = new JTextField();
		textField.setBounds(65, 11, 86, 14);
		frmCadastroDeVeiculo.getContentPane().add(textField);
		textField.setColumns(10);
		
		lblNumero = new JLabel("Marca:");
		lblNumero.setBounds(25, 39, 78, 14);
		frmCadastroDeVeiculo.getContentPane().add(lblNumero);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(65, 36, 86, 14);
		frmCadastroDeVeiculo.getContentPane().add(textField_1);
		
		JLabel lblModelo = new JLabel("Modelo:");
		lblModelo.setBounds(25, 65, 46, 14);
		frmCadastroDeVeiculo.getContentPane().add(lblModelo);
		
		textField_2 = new JTextField();
		textField_2.setBounds(65, 62, 86, 14);
		frmCadastroDeVeiculo.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblAno = new JLabel("Ano:");
		lblAno.setBounds(25, 90, 46, 14);
		frmCadastroDeVeiculo.getContentPane().add(lblAno);
		
		textField_3 = new JTextField();
		textField_3.setBounds(65, 87, 86, 14);
		frmCadastroDeVeiculo.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		button2 = new JButton("Cadastrar Veiculo");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String placa = textField.getText();
					String marca = textField_1.getText();
					String modelo = textField_2.getText();
					Integer ano = Integer.parseInt(textField_3.getText());
					Fachada.cadastrarVeiculo(placa, marca, modelo, ano);
					
				}
				catch(Exception e) {
					label2.setText(e.getMessage());
				}
			}
		});
		button2.setBounds(75, 112, 145, 23);
		frmCadastroDeVeiculo.getContentPane().add(button2);
		
	
	
	//mostrar a janela
			frmCadastroDeVeiculo.setVisible(true);
	}
}
