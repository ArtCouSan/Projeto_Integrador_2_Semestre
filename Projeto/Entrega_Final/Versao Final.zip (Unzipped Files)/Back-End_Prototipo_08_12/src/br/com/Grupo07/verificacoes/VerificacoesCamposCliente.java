package br.com.Grupo07.verificacoes;

// Importa pacote para servicos de cliente.
import br.com.Grupo07.servicos.ServicosCliente;
import java.awt.HeadlessException;

// Importa pacote para manipulacao SQL.
import java.sql.SQLException;
import java.text.ParseException;

// Importa pacote para manipulacao de data.
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

/**
 * Classe com as verificacoes para cliente.
 *
 * @author Grupo 07
 */
public class VerificacoesCamposCliente {

    /**
     * Funcao que verifica preenchimento dos campos.
     *
     * @param nome para verificacao.
     * @param cpf para verificacao.
     * @param genero para verificacao.
     * @param dataNasc para verificacao.
     * @param logradouro para verificacao.
     * @param bairro para verificacao.
     * @param complemento para verificacao.
     * @param numero para verificacao.
     * @param telefone para verificacao.
     * @param celular para verificacao.
     * @param CEP para verificacao.
     * @param DD_T para verificacao.
     * @param DD_C para verificacao.
     * @return true se estiver todos os campos preenchidos e false se nao
     * estiver
     * @throws java.sql.SQLException
     */
    public boolean verificarFormularios(String nome, String cpf, String genero, String dataNasc, String logradouro, String bairro, String complemento, String numero, String telefone, String celular, String CEP, String DD_T, String DD_C) throws SQLException {

        try {

            // Formata data para dd/MM/yyyy.
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

            // Formata data.
            Date data = new Date(formato.parse(dataNasc).getTime());

            // Recebe data atual.
            Date dataAtual = new Date();

            // Verifica data.
            if (!data.before(dataAtual)) {

                // Mensagem.
                JOptionPane.showMessageDialog(null, "Data apos o esperado", "Erro", JOptionPane.ERROR_MESSAGE);

                return false;

            }

            // Pega dia de nascimento.
            int diaN = Integer.parseInt((String) dataNasc.subSequence(0, 2));

            // Pega mes de nascimento.
            int mesN = Integer.parseInt((String) dataNasc.subSequence(3, 5));

            
            // Verifica dia.
            if (diaN > 31 || diaN <= 0) {

                JOptionPane.showMessageDialog(null, "Dia incorreto", "Erro", JOptionPane.ERROR_MESSAGE);

                return false;

                
            }    
            // Verifica mes.    
            if (mesN > 12 || mesN < 1) {

                JOptionPane.showMessageDialog(null, "Mes incorreto", "Erro", JOptionPane.ERROR_MESSAGE);

                return false;

            }

        } catch (ParseException | HeadlessException e) {

            JOptionPane.showMessageDialog(null, "Data incorreta", "Erro", JOptionPane.ERROR_MESSAGE);

            return false;
        }

        // Verifica nome se esta vazio.
        if (nome.isEmpty()) {

            JOptionPane.showMessageDialog(null, "Preencha o campo nome, por favor", "Erro", JOptionPane.ERROR_MESSAGE);

            return false;

            // Verifica cpf se esta vazio.    
        } else if (cpf.endsWith(" ")) {

            JOptionPane.showMessageDialog(null, "Preencha o campo CPF, por favor", "Erro", JOptionPane.ERROR_MESSAGE);

            return false;

            // Verifica CEP foi preenchido.   
        } else if (CEP.endsWith(" ")) {

            JOptionPane.showMessageDialog(null, "Preencha o CEP, por favor", "Erro", JOptionPane.ERROR_MESSAGE);

            return false;

            // Verifica genero foi selecionado.   
        } else if (genero.equals("Selecione")) {

            JOptionPane.showMessageDialog(null, "Selecione o genero, por favor", "Erro", JOptionPane.ERROR_MESSAGE);

            return false;

            // Verifica data de nascimento se esta vazio.      
        } else if (dataNasc.endsWith(" ")) {

            JOptionPane.showMessageDialog(null, "Preencha o campo de data de nascimento, por favor", "Erro", JOptionPane.ERROR_MESSAGE);

            return false;

            // Verifica logradouro se esta vazio.     
        } else if (logradouro.isEmpty()) {

            JOptionPane.showMessageDialog(null, "Preencha o campo logradouro, por favor", "Erro", JOptionPane.ERROR_MESSAGE);

            return false;

            // Verifica bairro se esta vazio.         
        } else if (bairro.isEmpty()) {

            JOptionPane.showMessageDialog(null, "Preencha o campo bairro, por favor", "Erro", JOptionPane.ERROR_MESSAGE);

            return false;

            // Verifica complemento se esta vazio.         
        } else if (complemento.isEmpty()) {

            JOptionPane.showMessageDialog(null, "Preencha o campo complemento, por favor", "Erro", JOptionPane.ERROR_MESSAGE);

            return false;

            // Verifica numero se esta vazio.     
        } else if (numero.isEmpty()) {

            JOptionPane.showMessageDialog(null, "Preencha o numero, por favor", "Erro", JOptionPane.ERROR_MESSAGE);

            return false;

            // Verifica se telefone e celular estao ambos vazios.     
        } else if (telefone.endsWith(" ") && celular.endsWith(" ")) {

            JOptionPane.showMessageDialog(null, "Preencha o campo de telefone ou celular", "Erro", JOptionPane.ERROR_MESSAGE);

            return false;

        } else {

            return true;

        }

    }

    /**
     * Funcao que verifica posse de cliente e integridade do cpf.
     *
     * @param cpf
     * @return true se nao condiz e false se sim.
     * @throws SQLException
     */
    public boolean verificarCPF(String cpf) throws SQLException {

        // Inicia variavel que verifica posse de cpf.
        boolean jaCadastrado = ServicosCliente.posseDeCliente(cpf);

        try {

            // Declara variavel auxiliar.
            String cpfM = "";

            // Loop para tira pontuacao.
            for (int i = 0; i < 14; i++) {

                if (cpf.charAt(i) != '.' && cpf.charAt(i) != '-') {

                    cpfM += cpf.charAt(i);

                }

            }

            // Declara variaveis.
            char dig1 = 0, dig2 = 0;

            int somar = 0, peso = 10, numero, resto;

            // Loop de verificacao do primerio digito.
            for (int i = 0; i < 9; i++) {

                numero = (int) (cpfM.charAt(i) - 48);

                somar = somar + (numero * peso);

                peso = peso - 1;

            }

            resto = 11 - (somar % 11);

            // Verifica para o digito 1.
            if ((resto == 10) || (resto == 11)) {

                dig1 = '0';

            } else {

                dig2 = (char) (resto + 48);

            }

            // Calculo do segundo digito.
            somar = 0;

            peso = 11;

            // Loop para o segundo digito.
            for (int i = 0; i < 10; i++) {

                numero = (int) (cpfM.charAt(i) - 48);

                somar = somar + (numero * peso);

                peso = peso - 1;

            }

            resto = 11 - (somar % 11);

            // Verifica para o digito 2.
            if ((resto == 10) || (resto == 11)) {

                dig2 = '0';

            } else {

                dig2 = (char) (resto + 48);

            }

            // Verifica validade.
            if (dig1 != cpfM.charAt(9) && dig2 != cpfM.charAt(10)) {

                JOptionPane.showMessageDialog(null, "CPF irregular", "Erro", JOptionPane.INFORMATION_MESSAGE);

                return false;

            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "CPF invalido", "Erro", JOptionPane.INFORMATION_MESSAGE);

            return false;

        }

        // Se ja tiver cadastro.
        if (jaCadastrado) {

            JOptionPane.showMessageDialog(null, "CPF já cadastrado", "Erro", JOptionPane.INFORMATION_MESSAGE);

            return false;

            // Verifica repeticao.    
        } else if (cpf.equalsIgnoreCase("000.000.000-00")
                || cpf.equalsIgnoreCase("111.111.111-11")
                || cpf.equalsIgnoreCase("222.222.222-22")
                || cpf.equalsIgnoreCase("333.333.333-33")
                || cpf.equalsIgnoreCase("444.444.444-44")
                || cpf.equalsIgnoreCase("555.555.555-55")
                || cpf.equalsIgnoreCase("666.666.666-66")
                || cpf.equalsIgnoreCase("777.777.777-77")
                || cpf.equalsIgnoreCase("888.888.888-88")
                || cpf.equalsIgnoreCase("999.999.999-99")) {

            JOptionPane.showMessageDialog(null, "CPF invalido, numeracao repetida", "Erro", JOptionPane.INFORMATION_MESSAGE);

            return false;

        } else {

            return true;

        }

    }

}
