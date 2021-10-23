import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.text.AttributeSet.ColorAttribute;


public class Juego extends JFrame implements ActionListener{
	
	//PANEL
	private JPanel panel;
	
	//BOTON PARA REINICIAR
	private JButton reiniciar;
	
	//NUETRA AREA DE ESCRIBIR
	private JTextPane pane;
	
	//LABEL PARA NUESTRAS IMAGENES;
	
	private JLabel l1;
	private JLabel l2;
	private JLabel l3;
	private JLabel l4;
	private JLabel l5;
	private JLabel l6;
	
	
	//BOTON DONDE SE ARMARA LA IMAGEN
	private JButton imagen;
	
	//BOTON PARA NUESTRAS LETRAS
	private JButton b0;
	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JButton b4;
	private JButton b5;
	private JButton b6;
	private JButton b7;
	private JButton b8;
	private JButton b9;
	private JButton b10;
	private JButton b11;
	private JButton b12;
	private JButton b13;
	private JButton b14;
	private JButton b15;
	private JButton b16;
	private JButton b17;
	private JButton b18;
	private JButton b19;
	private JButton b20;
	private JButton b21;
	private JButton b22;
	private JButton b23;
	private JButton b24;
	private JButton b25;
	
	//LINEAS PARA FORMA
	private JLabel linea1;
	private JLabel linea2;
	
	//ARRAY PARA NUESTRAS IMAGENES
	public ImageIcon imgs[];
	
	//ARRAY PARA NUESTRAS BOTONES
	public JButton btns[];
	//ARRAY PARA LAS PALABRAS A ADIVINAR
	public String msgs[];
	//VARIABLES PARA EL CONTEO DE DERROTAS Y PARTIDAS
	
	private int partidas=0;
	private int derrotas=0;
	
	//BOTON DE SALIR
	private JButton salir;
	
	//VRIABLE PARA LA PALABRA A ADIVINAR
	public int ran;
	//NUEMRO DE INTENTOS
	public int intentos;
	//NUESTRO ITERADOR
	public int iterador =5;
	//RESPUESTAS
	public String res[];
	
	//VARIABLE PARA EL NOMBRE DEL USUARIO
	public String nombre;
	
	public Juego() {
		imgs = new ImageIcon[6];
		btns= new JButton[27];
		msgs = new String[20];
		
		panel = new JPanel();
		panel.setLayout(null);
		setSize(700,650);
		setTitle("Bienvenido");
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panel= new JPanel();
		panel.setBackground(Color.black);
		panel.setLayout(null);
		this.getContentPane().add(pane);
		
		//CREACION DE LAS IMAGES
		ImageIcon im0= new ImageIcon("dorada.png");
		l1 = new JLabel();
		l1.setBounds(100,120,150,150);
		l1.setIcon(new ImageIcon(im0.getImage().getScaledInstance(l1.getWidth(),l1.getHeight(), Image.SCALE_SMOOTH)));
		
		ImageIcon im1= new ImageIcon("amebozo.png");
		l2 = new JLabel();
		l2.setBounds(30,30,200,300);
		l2.setIcon(new ImageIcon(im1.getImage().getScaledInstance(l2.getWidth(),l2.getHeight(), Image.SCALE_SMOOTH)));
		
		ImageIcon im2= new ImageIcon("pito.png");
		l3 = new JLabel();
		l3.setBounds(30,30,200,300);
		l3.setIcon(new ImageIcon(im2.getImage().getScaledInstance(l3.getWidth(),l3.getHeight(), Image.SCALE_SMOOTH)));
		
		ImageIcon im3= new ImageIcon("amebozo.png");
		l4 = new JLabel();
		l4.setBounds(30,30,200,300);
		l4.setIcon(new ImageIcon(im3.getImage().getScaledInstance(l4.getWidth(),l4.getHeight(), Image.SCALE_SMOOTH)));
		
		ImageIcon im4= new ImageIcon("dorada.png");
		l5 = new JLabel();
		l5.setBounds(30,30,200,300);
		l5.setIcon(new ImageIcon(im4.getImage().getScaledInstance(l5.getWidth(),l5.getHeight(), Image.SCALE_SMOOTH)));
		
		ImageIcon im5= new ImageIcon("dorada.png");
		l6 = new JLabel();
		l6.setBounds(30,30,200,300);
		l6.setIcon(new ImageIcon(im5.getImage().getScaledInstance(l6.getWidth(),l6.getHeight(), Image.SCALE_SMOOTH)));
		
		
		// IGUALAMOS NUESTRAS IMAGENES
		imgs[0]=im0;
		imgs[1]=im1;
		imgs[2]=im2;
		imgs[3]=im3;
		imgs[4]=im4;
		imgs[5]=im5;
		
		//BOTON DE REINICIAR
		ImageIcon clic= new ImageIcon("pito.png");
		reiniciar=new JButton();
		reiniciar.setBounds(50,200,150,80);
		reiniciar.setIcon(new ImageIcon(clic.getImage().getScaledInstance(reiniciar.getWidth(),reiniciar.getHeight(), Image.SCALE_SMOOTH)));
		panel.add(reiniciar);
		reiniciar.addActionListener(this);
		
		//BOTON SALIR
		ImageIcon clic1= new ImageIcon("salir.png");
		salir= new JButton();
		salir.setBounds(50,100,150,80);
		salir.setIcon(new ImageIcon(clic1.getImage().getScaledInstance(salir.getWidth(),salir.getHeight(), Image.SCALE_SMOOTH)));
		panel.add(salir);
		salir.addActionListener(this);
		
		//TEXTPANE PARA VERIFICAR LA LETRA
		pane = new JTextPane();
		pane.setBounds(250,330,200,50);
		pane.setFont(new Font("Arial",1,30));
		pane.setBackground(Color.black);
		pane.setEnabled(false);
		panel.add(pane);
		
		//BOTON QUE CONTENDRA LA IMAGEN
		imagen =new JButton();
		imagen.setBounds(250,80,215,250);
		panel.add(imagen);
		
		//IMAGEN DE ROBOT
		ImageIcon robot = new ImageIcon("chloropy.png");
		JLabel imgs= new JLabel();
		imgs.setBounds(490,70,150,150);
		imgs.setIcon(new ImageIcon(robot.getImage().getScaledInstance(imgs.getWidth(),imgs.getHeight(), Image.SCALE_SMOOTH)));
		
		//LINEAS PARA FORM
		ImageIcon lin1= new ImageIcon("basidios.png");
		linea1= new JLabel();
		imgs.setBounds(490,70,150,150);
		imgs.setIcon(new ImageIcon(lin1.getImage().getScaledInstance(linea1.getWidth(),linea1.getHeight(), Image.SCALE_SMOOTH)));
		
		ImageIcon lin2= new ImageIcon("basidios.png");
		linea2= new JLabel();
		imgs.setBounds(490,70,150,150);
		imgs.setIcon(new ImageIcon(lin2.getImage().getScaledInstance(linea2.getWidth(),linea2.getHeight(), Image.SCALE_SMOOTH)));
		
		
		
		//BOTONES PARA LAS LETRAS
		b0= new JButton("A");
		b0.setBounds(100,400,50,40);
		b0.setBackground(Color.white);
		b0.setFont(new Font("Cooper Black",2,19));
		panel.add(b0);
		
		b1= new JButton("B");
		b1.setBounds(150,400,50,40);
		b1.setBackground(Color.white);
		b1.setFont(new Font("Cooper Black",2,19));
		panel.add(b1);
		
		b2= new JButton("C");
		b2.setBounds(200,400,50,40);
		b2.setBackground(Color.white);
		b2.setFont(new Font("Cooper Black",2,19));
		panel.add(b2);
		
		b3= new JButton("D");
		b3.setBounds(250,400,50,40);
		b3.setBackground(Color.white);
		b3.setFont(new Font("Cooper Black",2,19));
		panel.add(b3);
		
		b4= new JButton("E");
		b4.setBounds(300,400,50,40);
		b4.setBackground(Color.white);
		b4.setFont(new Font("Cooper Black",2,19));
		panel.add(b4);
		
		b5= new JButton("F");
		b5.setBounds(350,400,50,40);
		b5.setBackground(Color.white);
		b5.setFont(new Font("Cooper Black",2,19));
		panel.add(b5);
		
		b6= new JButton("G");
		b6.setBounds(400,400,50,40);
		b6.setBackground(Color.white);
		b6.setFont(new Font("Cooper Black",2,19));
		panel.add(b6);
		
		b7= new JButton("H");
		b7.setBounds(450,400,50,40);
		b7.setBackground(Color.white);
		b7.setFont(new Font("Cooper Black",2,19));
		panel.add(b7);
		
		b8= new JButton("I");
		b8.setBounds(500,400,50,40);
		b8.setBackground(Color.white);
		b8.setFont(new Font("Cooper Black",2,19));
		panel.add(b8);
		
		b9= new JButton("J");
		b9.setBounds(550,400,50,40);
		b9.setBackground(Color.white);
		b9.setFont(new Font("Cooper Black",2,19));
		panel.add(b9);
		
		b10= new JButton("K");
		b10.setBounds(100,450,50,40);
		b10.setBackground(Color.white);
		b10.setFont(new Font("Cooper Black",2,19));
		panel.add(b10);
		
		b11= new JButton("L");
		b11.setBounds(150,450,50,40);
		b11.setBackground(Color.white);
		b11.setFont(new Font("Cooper Black",2,19));
		panel.add(b11);
		
		b12= new JButton("M");
		b12.setBounds(200,450,50,40);
		b12.setBackground(Color.white);
		b12.setFont(new Font("Cooper Black",2,19));
		panel.add(b12);
		
		b13= new JButton("N");
		b13.setBounds(250,450,50,40);
		b13.setBackground(Color.white);
		b13.setFont(new Font("Cooper Black",2,19));
		panel.add(b13);
		
		b14= new JButton("O");
		b14.setBounds(300,450,50,40);
		b14.setBackground(Color.white);
		b14.setFont(new Font("Cooper Black",2,19));
		panel.add(b14);
		
		b15= new JButton("P");
		b15.setBounds(350,450,50,40);
		b15.setBackground(Color.white);
		b15.setFont(new Font("Cooper Black",2,19));
		panel.add(b15);
		
		b16= new JButton("Q");
		b16.setBounds(400,450,50,40);
		b16.setBackground(Color.white);
		b16.setFont(new Font("Cooper Black",2,19));
		panel.add(b16);
		
		b17= new JButton("R");
		b17.setBounds(450,450,50,40);
		b17.setBackground(Color.white);
		b17.setFont(new Font("Cooper Black",2,19));
		panel.add(b17);
		
		b18= new JButton("S");
		b18.setBounds(500,450,50,40);
		b18.setBackground(Color.white);
		b18.setFont(new Font("Cooper Black",2,19));
		panel.add(b18);
		
		b19= new JButton("T");
		b19.setBounds(550,450,50,40);
		b19.setBackground(Color.white);
		b19.setFont(new Font("Cooper Black",2,19));
		panel.add(b19);
		
		b20= new JButton("U");
		b20.setBounds(200,500,50,40);
		b20.setBackground(Color.white);
		b20.setFont(new Font("Cooper Black",2,19));
		panel.add(b20);
		
		b21= new JButton("V");
		b21.setBounds(250,500,50,40);
		b21.setBackground(Color.white);
		b21.setFont(new Font("Cooper Black",2,19));
		panel.add(b21);
		
		b22= new JButton("W");
		b22.setBounds(300,500,50,40);
		b22.setBackground(Color.white);
		b22.setFont(new Font("Cooper Black",2,19));
		panel.add(b22);
		
		b23= new JButton("X");
		b23.setBounds(350,500,50,40);
		b23.setBackground(Color.white);
		b23.setFont(new Font("Cooper Black",2,19));
		panel.add(b23);
		
		b24= new JButton("Y");
		b24.setBounds(400,500,50,40);
		b24.setBackground(Color.white);
		b24.setFont(new Font("Cooper Black",2,19));
		panel.add(b24);
		
		b25= new JButton("Z");
		b25.setBounds(450,500,50,40);
		b25.setBackground(Color.white);
		b25.setFont(new Font("Cooper Black",2,19));
		panel.add(b25);
		
		//IGUALAMOS NUESTROS BLOQUES
		
		btns[0]=b0;
		btns[1]=b1;
		btns[2]=b2;
		btns[3]=b3;
		btns[4]=b4;
		btns[5]=b5;
		btns[6]=b6;
		btns[7]=b7;
		btns[8]=b8;
		btns[9]=b9;
		btns[10]=b10;
		btns[11]=b11;
		btns[12]=b12;
		btns[13]=b13;
		btns[14]=b14;
		btns[15]=b15;
		btns[16]=b16;
		btns[17]=b17;
		btns[18]=b18;
		btns[19]=b19;
		btns[20]=b20;
		btns[21]=b21;
		btns[22]=b22;
		btns[23]=b23;
		btns[24]=b24;
		btns[25]=b25;
		
		//PALABRAS POR ADIVINAR
		
		msgs[0]="COLOMBIA";
		msgs[1]="PERU";
		msgs[2]="ECUADOR";
		msgs[3]="VENEZUELA";
		msgs[4]="PANAMA";
		msgs[5]="NICARAGUA";
		msgs[6]="BOLIVIA";
		msgs[7]="ARGENTINA";
		msgs[8]="COSTARICA";
		msgs[9]="URUGUAY";
		msgs[10]="BRAZIL";
		msgs[11]="CHILE";
		msgs[12]="AITI";
		msgs[13]="MEXICO";
		msgs[14]="COSTARICA";
		msgs[15]="SALVADOR";
		msgs[16]="CUBA";
		msgs[17]="HONDURAS";
		msgs[18]="GALAPAGOS";
		msgs[19]="MADAGASCAR";
		
		//PEDIMOS UN NOMBRE
		nombre= JOptionPane.showInputDialog("ingrese su nombre");
		JOptionPane.showMessageDialog(null, "Es ahorcado e sun juego de adivinanza \n"+ "Empiece a JUGARRR");
		
		//SE ASIGNA UN EVENTO A CADA LETRA PARA COMPROBAR QUE EXISTA EN LA PALABRA ADIVINAR
		
		for (int i=1; i<27;i++) {
			btns[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					checarLetra(e);
				}
			});
		}
		
		iniciar();
		
		
	}
	

	//FUNCION PARA COMENZAR LOS PARAMETROS 
	//EL JUEGO O INICIAR UNA NUEVA PARTIDA
	public void iniciar() {
		//ERRORES EN 0
		intentos=0;
		imagen.setIcon(imgs[0]);
		pane.setText("");
		//PARA ACTIVAR LAS LETRAS DEL TABLERO
		for (int i=1;i<27; i++) {
			btns[i].setEnabled(true);
		}
		//PARA GENERAR UNA PALABRA ALEATORIAMENTE
		ran= (int) 0+(int)(Math.random()*((msgs.length-1)+1));
		//SEPARA EL  MENSAJE POR PALABRAS
		String pal[]= msgs[ran].split("");
		res= new String[msgs[ran].length()+1];
		int j=0;
		//seran los guiones que van debajo de las letras como una separacion
		for(String pal1:pal) {
			for (int i=0; i<pal1.length();i++) {
				pane.setText(pane.getText()+"\n");
				res[j++]="_";
			}
			pane.setText(pane.getText()+"\n");
			res[j++]="_";
		}
		
	}


	public void checarLetra(ActionEvent e) {
		JButton bt= (JButton) e.getSource();
		char c[];
		//BUSCAR LA LETRA EN LA PALABRA DESPUES DE HABER SIDO PRESIONADA
		for(int i=1; i<27;i++){
			if(bt==btns[i]) {
				//LA TECLA ES INICIALIZADA
				c= Character.toChars(64+i);
				//BUSCA SI LA LETRA ESTA EN LA FRASE
				boolean esta= false;
				for(int j=0; j< msgs[ran].length();j++) {
					if(c[0]==msgs[ran].charAt(j)) {
						res[j]=c[0]+"";
						esta=true;
					}
				}
			
				//SI LA LETRA ESTA EN EL MENSAJE SE MUESTRA EN EL TEXTPANE
				if(esta) {
					pane.setText("");
					for(String re: res) {
						if("".equals(re)) {
							pane.setText(pane.getText()+"\n");
						}
						else {
							pane.setText(pane.getText()+re+"");
						}
					}
					//HACE UNA COMP DE LAS LETRAS RESTANTES Y FALTANTES,...
					boolean gano= true;
					for(String re:res) {
						if(re.equals("_")) {
							gano=false;
							break;
						}
					}
					//AL SER CORRECTA SE MUESTRA MENSAJE Y REINICIA JEUGO
					if(gano) {
						JOptionPane.showMessageDialog(this, "FELICIDADES "+nombre+"\nVMos por mas");
						partidas++;
						iterador=5;
						iniciar();
						return;
					}
				}
				//SI LA LETRA NO ESTA EN EL MSM, SE INCREMETA EL ERROR
				else {
					imagen.setIcon(imgs[++intentos]);
					iterador--;
					JOptionPane.showMessageDialog(this, "Te quedan "+ intentos);
					
					//SI SE LLEGA A LOS 5 ERRORES ENTONCES E PIERDE EL JEUGPO
					
					if(intentos==5) {
						JOptionPane.showMessageDialog(this, "Perdiste la respuesta era "+ msgs[ran]);	
						derrotas++;
						iterador=5;
						iniciar();
						return;
					}
				}
				//ESTA ES LA LINEA QUE DESACTIVA LAS LETRAS DESPUES DE SER USADAS
				bt.setEnabled(false);
				break;
			}
			
		}
		
	}



	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==reiniciar) {
			iniciar();
		}
		
		if(e.getSource()==salir) {
			if(partidas==0 && derrotas==0) {
				JOptionPane.showMessageDialog(null, nombre + "No jugaste ninguna partida");
				System.exit(0);
			}else {
				JOptionPane.showMessageDialog(null, nombre + "Tus resultados fueron \n"
							+ "Ganaste"+partidas + "partidas.\n"
							+ "Perdiste: "+ derrotas+ "partidas\n"
							+ "VUELVE PRONTO");
				System.exit(0);
			}
		}
		
	} 

}
