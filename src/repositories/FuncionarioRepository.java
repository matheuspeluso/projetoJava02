package repositories;

import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

import entities.Funcionario;

//classe para acesssar e manipular arquivos ou banco de dados para armazenar registros dos registros 
public class FuncionarioRepository {
	public void exportarDados(Funcionario funcionario) {
		try {
			//criando um arquivo txt , para gravação em modo append
			//append -> o arquivo nunca será substituido mas sim terá o conteudo adicionado!
			var fileWrite = new FileWriter("c:\\temp\\funcionarios.txt",true);// true = boolean append
			var printWrite = new PrintWriter(fileWrite);
			
			//escrevendo no arquivo
			printWrite.write("\nId do funcionário...:" + funcionario.getId());
			printWrite.write("\nNome...:" + funcionario.getNome());
			printWrite.write("\nMatrícula...:" + funcionario.getMatricula());
			printWrite.write("\nTipo de admissão...:" + funcionario.getDataAdmissao());
			printWrite.write("\nTipo de contratação...:" + funcionario.getTipoContratacao());
			printWrite.write("\n");
			
			//fechando arquivo
			printWrite.close();
			
			JOptionPane.showMessageDialog(null, "Dados gravados com sucesso!");
			
		}
		catch(Exception e) {
			System.out.println("Falha em gravar o arquivo " + e.getMessage());
		}
	}
}
