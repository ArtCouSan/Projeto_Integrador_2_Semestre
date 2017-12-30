package br.com.Grupo07.verificacoes;

/**
 * Classe com verificacoes para relatorios.
 *
 * @author Grupo 07
 */
public class VerificacoesCamposRelatorio {

    /**
     * Fucano que verifica campo de fim.
     * @param dataF
     * @return true se nao preenchido.
     */
    public boolean verificarFim(String dataF) {

        if (dataF.endsWith(" ")) {

            return true;

        } else {

            return false;

        }

    }

    /**
     * Funcao que verifica se inicio foi preenchdi.
     * @param dataI
     * @return true se nao foi preenchido.
     */
    public boolean verificarInicio(String dataI) {

        if (dataI.endsWith(" ")) {

            return true;

        } else {

            return false;

        }

    }

}
