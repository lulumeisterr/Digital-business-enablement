package br.com.fiap.window;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

import br.com.fiap.bo.EstoqueBOStub;
import br.com.fiap.bo.EstoqueBOStub.ConsultarProduto;
import br.com.fiap.bo.EstoqueBOStub.ConsultarProdutoResponse;
import br.com.fiap.bo.EstoqueBOStub.Produto;

public class Window {

	protected Shell shlCenter;
	private Text text;
	private Text text_1;
	private Table table;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Window window = new Window();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		while (!shlCenter.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlCenter = new Shell();
		shlCenter.setSize(397, 460);
		shlCenter.setImage(SWTResourceManager.getImage("C:\\Users\\logonrm\\Downloads\\hacks-mr-robot-elliot-fsociety-made-their-hack-evil-corp-untraceable.w1456.jpg"));
		shlCenter.setText("Exercicio");
		
		text = new Text(shlCenter, SWT.BORDER);
		text.setBounds(133, 57, 110, 21);
		
		Label lblNewLabel = new Label(shlCenter, SWT.NONE);
		lblNewLabel.setBounds(10, 60, 109, 21);
		lblNewLabel.setText("Codigo do produto");
		
		Button btnNewButton = new Button(shlCenter, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				EstoqueBOStub stub;
				
				try {
					
				 stub = new EstoqueBOStub();
				 
				 int recuperarCodigo = Integer.parseInt(btnNewButton.getText());
				 
				 ConsultarProduto consulta = new ConsultarProduto();
				 consulta.setCdProd(recuperarCodigo);
				 
				 ConsultarProdutoResponse response = stub.consultarProduto(consulta);
				 
				 Produto produto = response.get_return();
				 
				 
				} catch (AxisFault e1) {
					e1.printStackTrace();
				} catch (RemoteException e1) {
					
					e1.printStackTrace();
				}
	
				
			}
		});
		btnNewButton.setBounds(249, 55, 110, 25);
		btnNewButton.setText("Consultar Produto");
		
		Menu menu = new Menu(shlCenter, SWT.BAR);
		menu.setLocation(new Point(13, 0));
		shlCenter.setMenuBar(menu);
		
		MenuItem mntmNewItem = new MenuItem(menu, SWT.NONE);
		mntmNewItem.setText("Fechar");
		
		Label lblExercicioRefactoring = new Label(shlCenter, SWT.NONE);
		lblExercicioRefactoring.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.NORMAL));
		lblExercicioRefactoring.setAlignment(SWT.CENTER);
		lblExercicioRefactoring.setBounds(68, 10, 248, 41);
		lblExercicioRefactoring.setText("Exercicio Refactoring");
		
		Label lblQuantidade = new Label(shlCenter, SWT.NONE);
		lblQuantidade.setBounds(33, 95, 74, 15);
		lblQuantidade.setText("Quantidade");
		
		text_1 = new Text(shlCenter, SWT.BORDER);
		text_1.setBounds(133, 92, 91, 21);
		
		Button btnFechar = new Button(shlCenter, SWT.NONE);
		btnFechar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				MessageBox mb = new MessageBox(shlCenter, SWT.OK|SWT.CANCEL);
				
				mb.setMessage("Clique OK caso queira encerrar a aplica��o");
				
				int result = mb.open();
				
					if(result == SWT.OK){
						System.out.println("OK foi pressionado");
						System.exit(0); 
					}
					
					if (result == SWT.CANCEL)
						System.out.println("cancela foi pressionado");
					
				}
			});
		
		btnFechar.setBounds(149, 366, 75, 25);
		btnFechar.setText("Fechar");
		
		List list = new List(shlCenter, SWT.BORDER);
		list.setBounds(133, 133, 140, 21);
		
		Label lblProduto = new Label(shlCenter, SWT.NONE);
		lblProduto.setBounds(40, 137, 55, 15);
		lblProduto.setText("Produto");
		
		Button btnNewButton_1 = new Button(shlCenter, SWT.NONE);
		btnNewButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNewButton_1.setBounds(133, 172, 140, 25);
		btnNewButton_1.setText("Confirmar a compra");
		
		table = new Table(shlCenter, SWT.BORDER | SWT.FULL_SELECTION);
		table.setBounds(34, 221, 325, 127);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		TableColumn tblclmnCodigo = new TableColumn(table, SWT.NONE);
		tblclmnCodigo.setWidth(100);
		tblclmnCodigo.setText("Codigo");
		
		TableColumn tblclmnDescrio = new TableColumn(table, SWT.NONE);
		tblclmnDescrio.setWidth(73);
		tblclmnDescrio.setText("Descri\u00E7\u00E3o");

	}
}
