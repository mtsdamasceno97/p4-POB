package aplicacao_swing;
/**********************************
 * IFPB - Curso Superior de Tec. em Sist. para Internet
 * Programação Orientada a Objetos
 * Prof. Fausto Maranhão Ayres
 **********************************/

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import fachada.Fachada;

public class TelaPrincipal {

	private JFrame frame;
	private JMenuItem mntmCadastrar;
	private JMenuItem mntmListar;
	private JMenuItem mntmCriar;
	private JMenuItem mntmExcluir;
	private JLabel label;
	private JMenu mnConsulta;
	private JMenu mnVeiculo;
	private JMenu mnCliente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal window = new TelaPrincipal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();

		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent arg0) {
				Fachada.inicializar();
				//JOptionPane.showMessageDialog(null, "sistema inicializado !");
			}
			@Override
			public void windowClosing(WindowEvent e) {
				Fachada.finalizar();
				JOptionPane.showMessageDialog(null, "sistema finalizado !");
			}
		});
		frame.setTitle("ALUGA CAR");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		// imagem de fundo
		label = new JLabel("");
		label.setBounds(0, 0, frame.getWidth(), frame.getHeight());
		ImageIcon imagem = new ImageIcon(getClass().getResource("../imagens/alugacarro.jpg"));
		imagem = new ImageIcon(imagem.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
		label.setIcon(imagem);
		frame.getContentPane().add(label);
		frame.setResizable(true);

		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		mnCliente = new JMenu("Cliente");
		menuBar.add(mnCliente);

		mntmCadastrar = new JMenuItem("Cadastrar");
		mntmCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaCadastroCliente j = new TelaCadastroCliente();
			}

		});
		mnCliente.add(mntmCadastrar);

		mntmListar = new JMenuItem("Listar");
		mntmListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaListagem j = new TelaListagem();
				j.setVisible(true);
			}
		});
		mnCliente.add(mntmListar);


		mnVeiculo = new JMenu("Veiculo");
		menuBar.add(mnVeiculo);
		mntmCriar = new JMenuItem("Adicionar");
		mntmCriar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaCadastroVeiculos j = new TelaCadastroVeiculos();
			}
		});
		mnVeiculo.add(mntmCriar);

		JMenuItem mntmListar_1 = new JMenuItem("Listar");
		mntmListar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaListagem j = new TelaListagem();
				j.setVisible(true);
			}
		});
		mnVeiculo.add(mntmListar_1);

		mnConsulta = new JMenu("Consultas");
		mnConsulta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				TelaConsulta j = new TelaConsulta();
				j.setVisible(true);

			
			}
		});
		menuBar.add(mnConsulta);
	}
}
