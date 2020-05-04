package aplicacao_swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import fachada.Fachada;

public class TelaCadastroCliente {

	private JFrame frmCadastroDeCliente;
	private JLabel label1;
	private JTextField textField;
	private JButton button2;
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
	public TelaCadastroCliente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCadastroDeCliente = new JFrame();
		frmCadastroDeCliente.setTitle("Cadastro de Pessoa");
		frmCadastroDeCliente.setBounds(100, 100, 321, 181);
		frmCadastroDeCliente.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmCadastroDeCliente.getContentPane().setLayout(null);
		
		label1 = new JLabel("nome:");
		label1.setBounds(26, 11, 46, 14);
		frmCadastroDeCliente.getContentPane().add(label1);
		
		textField = new JTextField();
		textField.setBounds(66, 11, 149, 14);
		frmCadastroDeCliente.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		JLabel lblCpf = new JLabel("cpf:");
		lblCpf.setBounds(36, 29, 46, 14);
		frmCadastroDeCliente.getContentPane().add(lblCpf);
		
		textField_1 = new JTextField();
		textField_1.setBounds(66, 29, 149, 14);
		frmCadastroDeCliente.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblIdade = new JLabel("idade:");
		lblIdade.setBounds(26, 49, 46, 14);
		frmCadastroDeCliente.getContentPane().add(lblIdade);
		
		textField_2 = new JTextField();
		textField_2.setBounds(66, 49, 149, 14);
		frmCadastroDeCliente.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblEndereco = new JLabel("endere\u00E7o:");
		lblEndereco.setBounds(10, 74, 54, 14);
		frmCadastroDeCliente.getContentPane().add(lblEndereco);
		
		textField_3 = new JTextField();
		textField_3.setBounds(66, 74, 149, 15);
		frmCadastroDeCliente.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		button2 = new JButton("Cadastrar Cliente");
		button2.setBounds(87, 108, 145, 23);
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String nome = textField.getText();
					String cpf = textField_1.getText();
					Integer idade = Integer.parseInt(textField_2.getText());
					String endereco = textField_3.getText();
					
					Fachada.cadastrarCliente(cpf, nome, endereco, idade);
					JOptionPane.showInternalMessageDialog(null, "Cliente cadastrado com sucesso.");
				}
				catch(Exception e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
			}
		});
		frmCadastroDeCliente.getContentPane().add(button2);
		
		
		//mostrar a janela
		frmCadastroDeCliente.setVisible(true);
	}
}
